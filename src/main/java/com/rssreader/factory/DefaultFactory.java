package com.rssreader.factory;

import com.rssreader.factory.page.MainPage;
import com.rssreader.factory.page.Page;

public class DefaultFactory implements PageFactory {
    @Override
    public Page createMainPage() {
        return new MainPage();
    }

    @Override
    public Page createLoginPage() {
        return null;
    }

    @Override
    public Page createRegisterPage() {
        return null;
    }

    @Override
    public Page createChannelPage() {
        return null;
    }

    @Override
    public Page createAddChannelPage() {
        return null;
    }
}
