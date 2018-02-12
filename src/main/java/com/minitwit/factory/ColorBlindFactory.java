package com.minitwit.factory;

import com.minitwit.factory.page.*;
import com.minitwit.factory.page.colorBlind.*;

public class ColorBlindFactory implements PageFactory {


    @Override
    public Page createMainPage() {
        return new MainPageColorBlind();
    }

    @Override
    public Page createLoginPage() {
        return new LoginPageColorBlind();
    }

    @Override
    public Page createRegisterPage() {
        return new RegisterPageColorBlind();
    }

    @Override
    public Page createChannelPage() {
        return new ChannelPageColorBlind();
    }

    @Override
    public Page createAddChannelPage() {
        return new AddChannelPageColorBlind();
    }
}
