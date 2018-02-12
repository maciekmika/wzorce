package com.minitwit.factory.page.colorBlind;

import com.minitwit.factory.page.Page;

public class RegisterPageColorBlind implements Page {

    String pageName = "colorBlind/RegisterPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
