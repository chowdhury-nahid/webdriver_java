package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Nahid Chowdhury
 * Date: 4/19/2022
 * Time: 4:17 AM
 */

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropdownPage = homePage.clickDropdownPage();

        String option = "Option 1";

        dropdownPage.selectFromDropdown("Option 1");
        var selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect Number of selections");
        assertTrue(selectedOptions.contains(option),"Option not selected");
    }
}
