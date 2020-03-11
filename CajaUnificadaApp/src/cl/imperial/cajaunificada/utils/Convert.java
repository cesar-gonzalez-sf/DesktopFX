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

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implements methods that provide general convertions.
 *
 * @author Eduardo Ostertag
 */
public final class Convert
{
    /** Formatter used to format code values. */
    public static final NumberFormat CODE_FORMAT;
    static {
        CODE_FORMAT = NumberFormat.getNumberInstance();
        CODE_FORMAT.setGroupingUsed(false);
    }

    /** Formatter used to format currency values. */
    public static final NumberFormat CURRENCY_FORMAT;
    static {
        CURRENCY_FORMAT = NumberFormat.getCurrencyInstance();
        if (CURRENCY_FORMAT instanceof DecimalFormat) {
            final DecimalFormat df = (DecimalFormat) CURRENCY_FORMAT;
            final DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
            dfs.setCurrencySymbol("$");
            df.setDecimalFormatSymbols(dfs);
        }
    }

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Constructs a new {@code Convert} instance.
     */
    private Convert()
    {
        // Private constructor: prevent others from instantiating this class.
    }

    //--------------------------------------------------------------------------
    //-- String Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the trimmed version of the supplied string.
     *
     * @param  text the string to be trimmed (can be null).
     * @return a string or {@code ""} if {@code text} is {@code null}.
     */
    public static String trimOrEmpty(final String text)
    {
        return text == null ? "" : text.trim();
    }

    /**
     * Returns the trimmed version of the supplied string.
     *
     * @param  text the string to be trimmed (can be null).
     * @return a string or {@code null} if {@code text} is {@code null}.
     */
    public static String trimOrNull(final String text)
    {
        return text == null ? null : text.trim();
    }

    /**
     * Returns a string array with the "mantisa" and "digito" of a rut.
     *
     * @param  rut the rut value to be splitted into "mantisa" and "digito".
     * @return a string array with the "mantisa" and "digito" of a rut.
     * @throws NullPointerException if {@code rut} is {@code null}.
     * @throws IllegalArgumentException if {@code rut} is invalid.
     */
    public static String[] splitRut(final String rut)
    {
        // Check supplied arguments
        if (rut == null || rut.isEmpty())
            throw new NullPointerException("rut is null or empty");

        // Split rut on "-" and check for two fields
        final String[] fields = rut.split("-");
        if (fields == null || fields.length != 2)
            throw new IllegalArgumentException("Invalid RUT: " + rut);

        // Return the normalized the rut fields
        fields[0] = fields[0].trim().replace(".", "");
        fields[1] = fields[1].trim();
        return fields;
    }

    //--------------------------------------------------------------------------
    //-- Boolean Methods -------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Convert to supplied BigDecimal to a boolean value.
     *
     * @param  value the BigDecimal to be converted (can be null).
     * @return the boolean value of the supplied BigDecimal.
     */
    public static boolean decToBool(final BigDecimal value)
    {
        return value == null ? false : value.intValue() != 0;
    }

    /**
     * Convert to supplied String to a boolean value.
     *
     * @param  value the String to be converted (can be null).
     * @return the boolean value of the supplied String.
     */
    public static boolean strToBool(final String text)
    {
        return text == null || text.isEmpty() ? false : text.charAt(0) == 'S';
    }

    //--------------------------------------------------------------------------
    //-- Number Methods --------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Returns the supplied BigDecimal or {@code ZERO} if {@code null}.
     *
     * @param  value the BigDecimal to be converted (can be null).
     * @return the integer value of the supplied BigDecimal.
     * @throws ArithmeticException if value is not exact.
     */
    public static BigDecimal decOrZero(final BigDecimal value)
    {
        return value == null ? BigDecimal.ZERO : value;
    }

    /**
     * Convert to supplied BigDecimal to an exact integer value.
     *
     * @param  value the BigDecimal to be converted (can be null).
     * @return the integer value of the supplied BigDecimal.
     * @throws ArithmeticException if value is not exact.
     */
    public static int decToIntExact(final BigDecimal value)
    {
        return value == null ? 0 : value.intValueExact();
    }

    /**
     * Convert to supplied BigDecimal to a rounded integer value.
     *
     * @param  value the BigDecimal to be converted (can be null).
     * @return the integer value of the supplied BigDecimal.
     * @throws ArithmeticException if value is not exact.
     */
    public static int decToIntRound(final BigDecimal value)
    {
        return value == null ? 0 : value.intValue();
    }

    /**
     * Convert to supplied BigDecimal to a double value.
     *
     * @param  value the BigDecimal to be converted (can be null).
     * @return the double value of the supplied BigDecimal.
     */
    public static double decToDouble(final BigDecimal value)
    {
        return value == null ? 0 : value.doubleValue();
    }

    /**
     * Returns the string representation of the supplied currency value.
     *
     * @param  value the currency value to be converted (can be null).
     * @return a string or {@code null} if {@code value} is {@code null} .
     */
    public static String formatCurrency(final Number value)
    {
        return value == null ? null : CURRENCY_FORMAT.format(value);
    }

    /**
     * Attempts  to parse the supplied integer string. If {@code text} is not an
     * integer, or if the value is negative, this method returns {@code null}.
     *
     * @param  text the integer string to be parsed.
     * @return the Integer value or {@code null} if {@code text}.
     */
    public static Integer tryParseInt(final String text)
    {
        int value;
        try {
            value = Integer.parseInt(text);
        } catch (final Exception ex) {
            return null;
        }
        return value < 0 ? null : Integer.valueOf(value);
    }

    //--------------------------------------------------------------------------
    //-- RUT Methods -----------------------------------------------------------
    //--------------------------------------------------------------------------

    /** RUT pattern: {spaces}digits-parity{spaces}. */
    private static final Pattern RUT_PATTERN =
        Pattern.compile("^\\s*(\\d[\\d,.]*)-?([\\dKk])\\s*$");

    /** Date formatter used to parse RUT digits. */
    private static final DecimalFormat RUT_FORMAT =
        new DecimalFormat("#,##0");

    /**
     * Returns a normalized string representation of the supplied RUT.
     *
     * @param  value the Chilean RUT to be check and normalized.
     * @return a normalized RUT or {@code null} if {@code value} is invalid.
     */
    public static String normalizeRUT(final String value)
    {
        // Check supplied arguments
        if (value == null || value.isEmpty()) return null;

        // Match {spaces}digits-parity{spaces}
        final Matcher matcher = RUT_PATTERN.matcher(value);
        if (!matcher.matches()) return null;

        // Obtain and validate RUT digits
        final Number rutValue;
        try {
            rutValue = RUT_FORMAT.parse(matcher.group(1));
        } catch (final ParseException ex) {
            return null;
        }
        final String rutDigits = rutValue.toString();

        // Obtain and normalize RUT parity
        char rutParity = matcher.group(2).charAt(0);
        if (rutParity == 'k') rutParity = 'K';

        // Compute parity value (backwards)
        int parity = 0, factor = 2;
        final int rutDigitsLen = rutDigits.length();
        for (int i = rutDigitsLen - 1; i >= 0; i--) {
            final char chr = rutDigits.charAt(i);
            parity += (chr - '0') * factor;
            if (++factor > 7) factor = 2;
        }
        parity = 11 - (parity % 11);

        // Compute parity character
        final char realParity;
        if (parity == 11) {
            realParity = '0';
        } else if (parity == 10) {
            realParity = 'K';
        } else {
            realParity = (char) (parity + '0');
        }

        // Verify supplied parity is correct
        if (rutParity != realParity) return null;

        // Build and return normalized RUT text value
        return RUT_FORMAT.format(rutValue) + "-" + rutParity;
    }
}
