package ru.stqa.pft.addressbook.tests;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import java.util.Comparator;

import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactModificationTest extends TestBase {

  @BeforeMethod

  public void ensurePrecondition() {
    if (app.contact().all().size()==0) {
      app.contact().create(new ContactData().withFirstName("test1").withLastName("test1").withGroup("test1"), true);
      app.goTo().homePage();
    }

  }

  @Test

  public void testContactModification() {
    Contacts before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData().withId(modifiedContact.getId()).withFirstName("test1").withLastName("test1").withGroup("test1");
    app.contact().modify(contact);
    app.goTo().homePage();
    Contacts after = app.contact().all();
    assertThat(after.size(), equalTo(before.size()));

    before.remove(modifiedContact);
    before.add(contact);
    assertThat(after, equalTo(before));
//    assertThat(after, equalTo(before.withModified(contact)));
  }




}



