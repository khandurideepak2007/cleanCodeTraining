package com.bosch.spi.cleancodetraining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Hello");

        ColorMapPrinter printer = new ConsoleColorMapPrinter();
        ColorMapProvider provider = new DefaultColorMapProvider();
        provider.getColorMap(printer);

    }


}