package com.minitwit.factory.page.colorBlind;

import com.minitwit.factory.page.Page;

public class LoginPageColorBlind implements Page {

    String pageName = "colorBlind/LoginPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
