package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import static java.lang.Thread.sleep;
public class ContactDeletionTest extends TestBase {

  @Test

  public void testContactDeletion() {
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitContactDeletion();
    app.getNavigationHelper().returnToHomePage();

//    try {
//      sleep(5000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }

  }

}
