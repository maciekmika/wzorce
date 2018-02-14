package com.rssreader.state;

import com.rssreader.factory.DefaultFactory;
import com.rssreader.factory.page.Page;
import com.rssreader.factory.PageFactory;

public class MainState implements StateBase {

    PageFactory pageFactory = new DefaultFactory();

    @Override
    public Page getMainPage() {
        return pageFactory.createMainPage();
    }

    @Override
    public Page getLoginPage() {
        return null;
    }

    @Override
    public Page getRegisterPage() {
        return null;
    }

    @Override
    public Page getChannelPage() {
        return null;
    }

    @Override
    public Page getAddChannelPage() {
        return null;
    }
}
