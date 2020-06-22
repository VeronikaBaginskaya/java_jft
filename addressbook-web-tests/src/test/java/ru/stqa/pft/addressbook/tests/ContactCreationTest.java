package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTest extends TestBase {



    @Test
    public void testContactCreation() {
        Contacts before = app.contact().all();
        File photo = new File("src/test/java/resources/photo.png");
        ContactData contact = new ContactData().withFirstName("test1").withLastName("test1").withGroup("test1").withPhoto(photo);
        app.contact().create(contact, true);
        app.goTo().homePage();
        Contacts after = app.contact().all();


        assertThat(after.size(), equalTo(before.size()+1));

        assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((c)-> c.getId()).max().getAsInt()))));
        }


}
