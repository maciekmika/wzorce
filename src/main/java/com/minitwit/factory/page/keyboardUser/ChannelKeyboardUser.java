package com.minitwit.factory.page.keyboardUser;

import com.minitwit.factory.page.Page;

public class ChannelKeyboardUser implements Page {

    String pageName = "keyboardUser/ChannelKeyboardUser.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
