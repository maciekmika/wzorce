package com.minitwit.factory.page.colorBlind;

import com.minitwit.factory.page.Page;

public class ChannelPageColorBlind implements Page {

    String pageName = "colorBlind/ChannelPageColorBlind.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
