package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase{

  @Test

  public void testContactModification() {
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("ttest", "ttest1", "ttest2", "ttest3", "ttest4", "test5", "ttest6", "t12345", "t123456", "t1234567", "t12345678", "ttest7", null), false);
    app.getNavigationHelper().returnToHomePage();


  }


}
