package com.minitwit.factory;

import com.minitwit.factory.page.Page;
import com.minitwit.factory.page.colorBlind.*;
import com.minitwit.factory.page.lowVision.MainPageLowVision;

public class LowVisionFactory implements PageFactory {


    @Override
    public Page createMainPage() {
        return new MainPageLowVision();
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
