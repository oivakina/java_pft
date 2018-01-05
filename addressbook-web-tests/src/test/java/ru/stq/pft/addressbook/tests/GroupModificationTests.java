package ru.stq.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stq.pft.addressbook.model.GroupDate;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModification (){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupDate("test1","test2","test3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToTheGroup();

    }
}
