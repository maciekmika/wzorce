package com.rssreader.factory.page.keyboardUser;

import com.rssreader.factory.page.Page;

public class MainPageKeyboardUser implements Page {

    String pageName = "keyboardUser/MainPageKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
