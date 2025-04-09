package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTest {

    @Test
    public void testFrames() {
        pages.framesPage().open();
        String text1 = pages.framesPage().getTextFromFrame("frame1");
        String text2 = pages.framesPage().getTextFromFrame("frame2");

        assertEquals(text1, "This is a sample page");
        assertEquals(text2, "This is a sample page");
    }
}
