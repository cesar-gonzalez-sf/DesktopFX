/*
 * Source: WebFaultInfo.java - Generated by OBCOM SQL Wizard 1.158
 * Author: Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 *
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 * 
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously authorized in writing by IMPERIAL S.A. In any event,  this  notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada.ws;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed information of a Web Service Fault.
 *
 * @author Nicolás Uribe Valenzuela (IMPERIAL S.A.)
 */
@XmlRootElement(name = "webFaultInfo")
@XmlType(name = "WebFaultInfo")
public class WebFaultInfo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String subject;
    private String sqlState;
    private Integer errorCode;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code WebFaultInfo} instance.
     */
    public WebFaultInfo()
    {
    }

    //--------------------------------------------------------------------------
    //-- Property Methods ------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the subject of this WebFaultInfo.
     *
     * @return the subject of this WebFaultInfo.
     */
    public String getSubject()
    {
        return subject;
    }

    /**
     * Changes the subject of this WebFaultInfo.
     *
     * @param subject the new value of the property.
     */
    public void setSubject(final String subject)
    {
        this.subject = subject;
    }

    /**
     * Returns the SQL state of this WebFaultInfo.
     *
     * @return the SQL state of this WebFaultInfo.
     */
    public String getSqlState()
    {
        return sqlState;
    }

    /**
     * Changes the SQL state of this WebFaultInfo.
     *
     * @param sqlState the new value of the property.
     */
    public void setSqlState(final String sqlState)
    {
        this.sqlState = sqlState;
    }

    /**
     * Returns the error code of this WebFaultInfo.
     *
     * @return the error code of this WebFaultInfo.
     */
    public Integer getErrorCode()
    {
        return errorCode;
    }

    /**
     * Changes the the error code of this WebFaultInfo.
     *
     * @param errorCode the new value of the property.
     */
    public void setErrorCode(final Integer errorCode)
    {
        this.errorCode = errorCode;
    }
}
