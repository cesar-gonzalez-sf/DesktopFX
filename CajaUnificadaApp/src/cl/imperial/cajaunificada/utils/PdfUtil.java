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

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;

/**
 * Utility methods that perform general PDF operations.
 *
 * @author Eduardo Ostertag
 */
public final class PdfUtil
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code PdfUtil} instance.
     */
    private PdfUtil()
    {
        // Private constructor: prevent others from instantiating this class.
    }

    //--------------------------------------------------------------------------
    //-- PdfUtil Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the width of the a text written in specifiec font and size.
     *
     * @param  text the text to be measured (can be null).
     * @param  font the font used to write the {@code text}.
     * @param  fontSize the font size used to write the {@code text}.
     * @return the width of the a text written in specifiec font and size.
     * @throws NullPointerException if an argument is {@code null}.
     * @throws IllegalArgumentException if {@code fontSize} is negative.
     * @throws IOException if an unexpected error occurs.
     */
    public static float getTextWidth(final String text, final PDFont font, final float fontSize)
        throws IOException
    {
        // Check supplied arguments
        if (font == null)
            throw new NullPointerException("PDF font is null");
        if (fontSize < 0)
            throw new IllegalArgumentException("PDF font size is negative");

        // Compute and return the required text width
        if (text == null || text.isEmpty()) return 0f;
        return (font.getStringWidth(text) / 1000.0f) * fontSize;
    }

    /**
     * Writes supplied text in PDF content with font at coordinates.
     *
     * @param  text the text to be written in contents (can be null).
     * @param  content the PDF contents where the text will be written.
     * @param  font the PDF font used to write the {@code text}.
     * @param  fontSize the PDF font size used to write the {@code text}.
     * @param  xpos the X coordinate where to write the {@code text}.
     * @param  ypos the y coordinate where to write the {@code text}.
     * @throws NullPointerException if an argument is {@code null}.
     * @throws IllegalArgumentException if {@code fontSize} is negative.
     * @throws IOException if an unexpected error occurs.
     */
    public static void drawText(final String text, final PDPageContentStream content, final PDFont font, final float fontSize, final float xpos, final float ypos)
        throws IOException
    {
        // Check supplied arguments
        if (content == null)
            throw new NullPointerException("PDF content is null");
        if (font == null)
            throw new NullPointerException("PDF font is null");
        if (fontSize < 0)
            throw new IllegalArgumentException("PDF font size is negative");

        // Write text in content at coordinates with font
        if (text != null && !text.isEmpty()) {
            content.setFont(font, fontSize);
            content.beginText();
            content.newLineAtOffset(xpos, ypos);
            content.showText(text);
            content.endText();
        }
    }

    /**
     * Draw a line using the current stroking color and the current line width.
     *
     * @param  content the PDF contents where the line will be drawn.
     * @param  xStart the start x coordinate.
     * @param  yStart the start y coordinate.
     * @param  xEnd the end x coordinate.
     * @param  yEnd the end y coordinate.
     * @throws NullPointerException if {@code content} is {@code null}.
     * @throws IllegalStateException if method called within a text block.
     * @throws IOException if an unexpected error occurs.
     */
    public static void drawLine(final PDPageContentStream content, final float xStart, final float yStart, final float xEnd, final float yEnd)
        throws IOException
    {
        // Check supplied arguments
        if (content == null)
            throw new NullPointerException("PDF content is null");

        // Draw line from (xStart, yStart) to (xEnd, yEnd)
        content.moveTo(xStart, yStart);
        content.lineTo(xEnd, yEnd);
        content.stroke();
    }
}
