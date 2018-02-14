package com.rssreader.factory.page.colorBlind;

import com.rssreader.factory.page.Page;

public class AddChannelPageColorBlind implements Page {

    String pageName = "colorBlind/AddChannelPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
