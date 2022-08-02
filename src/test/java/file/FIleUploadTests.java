package file;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FIleUploadTests extends BaseTests {

   @Test
    public void testFileUpload(){
       var uploadPage = homePage.clickFileUpload();
       uploadPage.uploadFile("/Users/jasmine/Documents/JASMINE/selenium/resources/chromedriver");

       assertEquals(uploadPage.getUploadedFiles(), "Scenario Bulk Upload - new.xlsx", "Uploaded files incorrect");

   }
}
