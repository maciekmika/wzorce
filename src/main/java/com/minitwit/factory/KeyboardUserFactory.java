package com.minitwit.factory;

import com.minitwit.factory.page.Page;
import com.minitwit.factory.page.colorBlind.*;
import com.minitwit.factory.page.keyboardUser.*;
import com.minitwit.factory.page.lowVision.MainPageLowVision;

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
