package com.bosch.spi.cleancodetraining;


import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


import org.junit.Test;
import org.mockito.ArgumentCaptor;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ColorMapUnitTest {
    private ColorMapPrinter mockPrinter;
    private DefaultColorMapProvider provider;

    @Test
   public void getColorMap_Test() {
        mockPrinter = mock(ColorMapPrinter.class);
        provider = new DefaultColorMapProvider();

        int count = provider.getColorMap(mockPrinter);
        assertEquals(25, count);

        verify(mockPrinter, times(25)).print(anyString());

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mockPrinter, times(25)).print(captor.capture());

        assertEquals("0 | White | Blue", captor.getAllValues().get(0));
        assertEquals("24 | Violet | Slate", captor.getAllValues().get(24));

    }
}