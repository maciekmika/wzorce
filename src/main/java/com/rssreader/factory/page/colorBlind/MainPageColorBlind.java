package com.rssreader.factory.page.colorBlind;

import com.rssreader.factory.page.Page;

public class MainPageColorBlind implements Page {

    String pageName = "colorBlind/MainPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
