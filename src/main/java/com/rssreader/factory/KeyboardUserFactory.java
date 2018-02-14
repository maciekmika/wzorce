package com.rssreader.factory;

import com.rssreader.factory.page.Page;
import com.rssreader.factory.page.keyboardUser.*;

public class KeyboardUserFactory implements PageFactory {


    @Override
    public Page createMainPage() {
        return new MainPageKeyboardUser();
    }

    @Override
    public Page createLoginPage() {
        return new LoginPageKeyboardUser();
    }

    @Override
    public Page createRegisterPage() {
        return new RegisterPageKeyboardUser();
    }

    @Override
    public Page createChannelPage() {
        return new ChannelKeyboardUser();
    }

    @Override
    public Page createAddChannelPage() {
        return new AddChannelKeyboardUser();
    }
}
