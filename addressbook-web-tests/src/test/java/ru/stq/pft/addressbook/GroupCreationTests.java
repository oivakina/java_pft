package ru.stq.pft.addressbook;

import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("test", "test", "test"));
        submitGroupCreation();
        returnToTheGroup();
    }

}
