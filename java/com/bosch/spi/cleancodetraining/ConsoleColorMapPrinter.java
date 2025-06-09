package com.bosch.spi.cleancodetraining;

import android.util.Log;

public class ConsoleColorMapPrinter implements ColorMapPrinter{
    private static final String TAG =  ConsoleColorMapPrinter.class.getSimpleName();

    @Override
    public void print(String colorMap) {
        Log.d(TAG , colorMap);
    }
}
