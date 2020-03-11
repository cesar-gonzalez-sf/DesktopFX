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

/**
 * Signals that a general exception of some sort has occurred.
 *
 * @author Eduardo Ostertag
 */
public class CajaUnificadaException extends RuntimeException
{
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new {@code AutoAtencionException} instance.
     */
    public CajaUnificadaException()
    {
        super();
    }

    /**
     * Constructs a new {@code AutoAtencionException} with a {@code message}.
     *
     * @param message the detail message.
     */
    public CajaUnificadaException(final String message)
    {
        super(message);
    }

    /**
     * Constructs a new {@code AutoAtencionException} with a {@code cause}.
     *
     * @param cause the cause of this exception.
     */
    public CajaUnificadaException(final Throwable cause)
    {
        super(cause);
    }

    /**
     * Constructs a new {@code AutoAtencionException} with a {@code message} and
     * {@code cause}.
     *
     * @param message the detail message.
     * @param cause the cause of this exception.
     */
    public CajaUnificadaException(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
