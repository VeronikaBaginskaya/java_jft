package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {



    @Test
    public void testContactCreation() {
        app.getContactHelper().contactCreate(new ContactData("test", "test1", "test2", "test3", "test4", "test5", "test6", "12345", "123456", "1234567", "12345678", "test7", "test1"), true);
        app.getNavigationHelper().returnToHomePage();
        }


}
