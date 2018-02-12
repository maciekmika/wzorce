package com.minitwit.factory.page.keyboardUser;

import com.minitwit.factory.page.Page;

public class MainPageKeyboardUser implements Page {

    String pageName = "keyboardUser/MainPageKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
