package tests.demoQA.frameTests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class FramesTests extends BaseTest {

    @Test
    public void testFrames() {
        pages.framesPage().open();

        pages.framesPage().assertFrameText();

        pages.framesPage().getRawSampleHeading("Lol");
    }
}
