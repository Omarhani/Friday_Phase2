package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

public class DropdownTests extends BaseTests {

    @Test
    public void testDropdown() {
        DropdownPage dropdownPage =homePage.clickOnDropDownLink();
        dropdownPage.selectFromDropdownList("Option 2");

    }
}
