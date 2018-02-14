package com.rssreader.factory.page.keyboardUser;

import com.rssreader.factory.page.Page;

public class LoginPageKeyboardUser implements Page {

    String pageName = "keyboardUser/LoginPageKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
