package com.rssreader.factory.page.keyboardUser;

import com.rssreader.factory.page.Page;

public class AddChannelKeyboardUser implements Page {

    String pageName = "keyboardUser/AddChannelKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
