package com.minitwit.factory.page.keyboardUser;

import com.minitwit.factory.page.Page;

public class LoginPageKeyboardUser implements Page {

    String pageName = "keyboardUser/LoginPageKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
