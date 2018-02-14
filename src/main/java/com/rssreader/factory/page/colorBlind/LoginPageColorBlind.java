package com.rssreader.factory.page.colorBlind;

import com.rssreader.factory.page.Page;

public class LoginPageColorBlind implements Page {

    String pageName = "colorBlind/LoginPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
