package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;

public class ContactModificationTest extends TestBase {

  @Test

  public void testContactModification() {
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().contactCreate(new ContactData("test", "test1", "test2", "test3", "test4", "test5", "test6", "12345", "123456", "1234567", "12345678", "test7", "test1"), true);
      app.getNavigationHelper().returnToHomePage();
    }
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().initContactModification(before.size() - 1);
    ContactData contact = new ContactData(before.get(before.size() - 1).getId(), "test9", "test", "test9", "test3", "test4", "test5", "test6", "12345", "123456", "1234567", "12345678", "test7", "test1");
    app.getContactHelper().fillContactForm(contact, false);
    app.getContactHelper().submitContactUpdate();
    app.getNavigationHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());

    before.remove(before.size() - 1);
    before.add(contact);
    Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }


}



