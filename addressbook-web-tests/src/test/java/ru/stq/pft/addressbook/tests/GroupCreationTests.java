package ru.stq.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stq.pft.addressbook.model.GroupDate;


public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupDate("tests", "tests", "tests"));
        app.submitGroupCreation();
        app.returnToTheGroup();
    }

}
