package com.VyTrack.pages;

import com.VyTrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
