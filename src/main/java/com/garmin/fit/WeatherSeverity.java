////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Garmin Canada Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2021 Garmin International, Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.67Release
// Tag = production/akw/21.67.00-0-gd790f76b
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;


public enum WeatherSeverity  {
    UNKNOWN((short)0),
    WARNING((short)1),
    WATCH((short)2),
    ADVISORY((short)3),
    STATEMENT((short)4),
    INVALID((short)255);

    protected short value;

    private WeatherSeverity(short value) {
        this.value = value;
    }

    public static WeatherSeverity getByValue(final Short value) {
        for (final WeatherSeverity type : WeatherSeverity.values()) {
            if (value == type.value)
                return type;
        }

        return WeatherSeverity.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( WeatherSeverity value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
