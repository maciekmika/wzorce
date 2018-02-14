package com.rssreader.factory.page.keyboardUser;

import com.rssreader.factory.page.Page;

public class ChannelKeyboardUser implements Page {

    String pageName = "keyboardUser/ChannelKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
