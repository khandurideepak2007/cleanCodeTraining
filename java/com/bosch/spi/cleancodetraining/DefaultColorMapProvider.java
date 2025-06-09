package com.bosch.spi.cleancodetraining;

public class DefaultColorMapProvider implements ColorMapProvider {
    private final String[] majorColors = {"White", "Red", "Black", "Yellow", "Violet"};
    private final String[] minorColors = {"Blue", "Orange", "Green", "Brown", "Slate"};

    public int getColorMap(ColorMapPrinter colorMapPrinter) {
        int index = 0;
        for (String major : majorColors) {
            for (String minor : minorColors) {
                colorMapPrinter.print(index + " | " + major + " | " + minor);
                index++;
            }
        }
        return index;
    }
}
