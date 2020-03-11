/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada.utils;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * Utility methods that perform general XML operations.
 *
 * @author Eduardo Ostertag
 */
public final class XmlUtil
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code XmlUtil} instance.
     */
    private XmlUtil()
    {
        // Private constructor: prevent others from instantiating this class.
    }

    //--------------------------------------------------------------------------
    //-- JAXB Methods ----------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the XML string representation of the supplied object.
     *
     * @param  object the object that will be converted to XML string.
     * @param  xmldecl if {@code true} the XML string will have a declaration.
     * @param  formatted if {@code true} the XML string will be formatted.
     * @return the XML string representation of the supplied object.
     * @throws NullPointerException if {@code object} is {@code null}.
     * @throws Exception if an error occurs while creating the XML string.
     */
    public static String objToXml(final Object object, final boolean xmldecl, final boolean formatted)
        throws Exception
    {
        // Check supplied arguments
        if (object == null)
            throw new NullPointerException("object is null");

        // Create and initialize a JAXB marshaller for object
        final Class<?> type = object.getClass();
        final JAXBContext jaxbContext = JAXBContext.newInstance(type);
        final Marshaller marshaller = jaxbContext.createMarshaller();

        // Do not generate the "xml declaration header" in output string
        if (!xmldecl) {
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        }

        // Specifiy whether the resulting XML must be formatted
        if (formatted) {
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        }

        // Marshall supplied object to an XML string
        try (final StringWriter writer = new StringWriter(1024)) {
            marshaller.marshal(object, writer);
            return writer.toString();
        }
    }

    /**
     * Converts an XML string to an object of the specified type.
     *
     * @param  xml the XML string to be converted to an object.
     * @param  type the type of the object to be unmarshall.
     * @return the object unmarshalled from the supplied XML string.
     * @throws NullPointerException if an argument is {@code null}.
     * @throws Exception if an error occurs while creating the XML string.
     */
    @SuppressWarnings("unchecked")
    public static <T> T xmlToObj(final String xml, final Class<T> type)
        throws Exception
    {
        // Check supplied arguments
        if (xml == null || xml.isEmpty())
            throw new NullPointerException("xml is null or empty");
        if (type == null)
            throw new NullPointerException("object type is null");

        // Create and initialize a JAXB unmarshaller for given type
        final JAXBContext jaxbContext = JAXBContext.newInstance(type);
        final Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        // Unmarshall XML string to an object of specified type
        try (final StringReader reader = new StringReader(xml)) {
            return (T) unmarshaller.unmarshal(reader);
        }
    }

    //--------------------------------------------------------------------------
    //-- XML Document Methods --------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Creates a new instance of a DOM Document.
     *
     * @return a new instance of a DOM Document.
     * @throws Exception if an error occurs while creating the document.
     */
    public static Document buildDocument()
        throws Exception
    {
        // Create and initialize a Document Builder Factory
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setIgnoringComments(true);
        factory.setCoalescing(true);

        // Create and initialize a Document Builder
        final DocumentBuilder builder = factory.newDocumentBuilder();
        builder.setErrorHandler(new XmlErrorHandler());

        // Create and return Document
        return builder.newDocument();
    }

    /**
     * Converts a XML Documento a XML string with no indentation.
     *
     * @param  document the document to be converted to a string.
     * @return an XML string with the contents of {@code document}.
     * @throws NullPointerException if {@code document} is {@code null}.
     * @throws Exception if another error occurs.
     */
    public static String xmlToStr(final Document document)
        throws Exception
    {
        // Create new XML Transformer with error listener
        final TransformerFactory traFactory = TransformerFactory.newInstance();
        final Transformer transformer = traFactory.newTransformer();
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setErrorListener(new XmlErrorListener());

        // Transform the Document into an XML string
        final StringWriter writer = new StringWriter();
        final DOMSource source = new DOMSource(document);
        final StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);
        return writer.toString();
    }

    /**
     * Converts a XML string to a XML document validating with a schema.
     *
     * @param  xmlString a string with a XML representation of the document.
     * @param  schemaSource the input stream of a XML schema (can be null).
     * @return the XML document obtained from supplied {@code xmlString}.
     * @throws Exception if another error occurs.
     */
    public static Document strToXml(final String xmlString)
        throws Exception
    {
        // Create a new "namespace-aware" XML Document builder
        final DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        docFactory.setIgnoringComments(true);
        docFactory.setCoalescing(true);

        // Create and initialize document builder with error handler
        final DocumentBuilder builder = docFactory.newDocumentBuilder();
        builder.setErrorHandler(new XmlErrorHandler());

        // Transform the XML string to a XML Document
        final StringReader reader = new StringReader(xmlString);
        final InputSource source = new InputSource(reader);
        return builder.parse(source);
    }

    /**
     * Appends a new element with name and value to the specified parent.
     *
     * @param  parent the XML parent element.
     * @param  name the name of the new element.
     * @param  value the value of the new element (can be null).
     * @return the new element that was created and appended.
     * @throws NullPointerException if an argument is {@code null}.
     */
    public static Element addChild(final Element parent, final String name, final String value)
    {
        // Check supplied arguments
        if (parent == null)
            throw new NullPointerException("XML parent is null");
        if (name == null || name.isEmpty())
            throw new NullPointerException("XML child name is null or empty");

        // Obtain parent document instance and validate
        final Document doc = parent.getOwnerDocument();
        if (doc == null)
            throw new NullPointerException("XML parent document is null");

        // Create new child element and append to parent
        final Element child = doc.createElement(name);
        if (value != null) child.appendChild(doc.createTextNode(value));
        parent.appendChild(child);

        // Return child
        return child;
    }

    /**
     * Appends a new element with name and value to the specified parent.
     *
     * @param  parent the XML parent element.
     * @param  name the name of the new element.
     * @param  value the value of the new element.
     * @return the new element that was created and appended.
     * @throws NullPointerException if an argument is {@code null}.
     */
    public static Element addChild(final Element parent, final String name, final int value)
    {
        return addChild(parent, name, Integer.toString(value));
    }

    //--------------------------------------------------------------------------
    //-- XmlErrorListener Class ------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * An {@link ErrorListener} that rethrows all {@link TransformerException}.
     *
     * @author Eduardo Ostertag
     */
    static final class XmlErrorListener implements ErrorListener
    {
        /**
         * Receive notification of a warning.
         */
        @Override
        public void warning(final TransformerException exception)
            throws TransformerException
        {
            throw exception;
        }

        /**
         * Receive notification of a recoverable error.
         */
        @Override
        public void error(final TransformerException exception)
            throws TransformerException
        {
            throw exception;
        }

        /**
         * Receive notification of a non-recoverable error.
         */
        @Override
        public void fatalError(final TransformerException exception)
            throws TransformerException
        {
            throw exception;
        }
    }

    //--------------------------------------------------------------------------
    //-- XmlErrorHandler Class -------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * An {@link ErrorHandler} that rethrows all {@link SAXException}.
     *
     * @author Eduardo Ostertag
     */
    static final class XmlErrorHandler implements ErrorHandler
    {
        /**
         * SAX  parsers  will  use this method to report conditions that are not
         * errors or fatal errors as defined  by  the  XML  recommendation.  The
         * default behaviour is to take no action.
         */
        @Override
        public void warning(final SAXParseException exception)
            throws SAXException
        {
            throw exception;
        }

        /**
         * This  corresponds  to the definition of "error" in section 1.2 of the
         * W3C XML 1.0 Recommendation. For example, a  validating  parser  would
         * use  this  callback to report the violation of a validity constraint.
         * The default behaviour is to take no action.
         */
        @Override
        public void error(final SAXParseException exception)
            throws SAXException
        {
            throw exception;
        }

        /**
         * This corresponds to the definition of "fatal error" in section 1.2 of
         * the  W3C XML 1.0 Recommendation. For example, a parser would use this
         * callback to report the violation of a well-formedness constraint.
         */
        @Override
        public void fatalError(final SAXParseException exception)
            throws SAXException
        {
            throw exception;
        }
    }
}
