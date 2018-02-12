package com.minitwit.factory.page.colorBlind;

import com.minitwit.factory.page.Page;

public class MainPageColorBlind implements Page {

    String pageName = "colorBlind/MainPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
