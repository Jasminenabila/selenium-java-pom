package iframes;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FrameTests extends BaseTests {

    @Test
    public void testwysiwg(){
        var editorPage = homePage.clickWysiwyg();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "word ";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from Jasmine");
    }
}
