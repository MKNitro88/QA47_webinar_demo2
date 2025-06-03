package tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;

public class PracticeForTests extends AppManager {
    @Test
    public void studentRegFormPositve(){
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnStudentRegForm();



    }
}
