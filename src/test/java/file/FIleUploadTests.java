package file;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FIleUploadTests extends BaseTests {

   @Test
    public void testFileUpload(){
       var uploadPage = homePage.clickFileUpload();
       uploadPage.uploadFile("/contoh");

       assertEquals(uploadPage.getUploadedFiles(), "files,xlsx", "Uploaded files incorrect");

   }
}
