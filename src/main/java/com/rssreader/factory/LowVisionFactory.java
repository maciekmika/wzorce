package com.rssreader.factory;

import com.rssreader.factory.page.Page;
import com.rssreader.factory.page.lowVision.*;

public class LowVisionFactory implements PageFactory {


    @Override
    public Page createMainPage() {
        return new MainPageLowVision();
    }

    @Override
    public Page createLoginPage() {
        return new LoginPageLowVision();
    }

    @Override
    public Page createRegisterPage() {
        return new RegisterPageLowVision();
    }

    @Override
    public Page createChannelPage() {
        return new ChannelPageLowVision();
    }

    @Override
    public Page createAddChannelPage() {
        return new AddChannelPageLowVision();
    }
}
