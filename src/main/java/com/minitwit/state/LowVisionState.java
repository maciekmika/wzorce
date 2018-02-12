package com.minitwit.state;

import com.minitwit.factory.ColorBlindFactory;
import com.minitwit.factory.LowVisionFactory;
import com.minitwit.factory.PageFactory;
import com.minitwit.factory.page.Page;

public class LowVisionState implements StateBase {


    PageFactory pageFactory = new LowVisionFactory();

    @Override
    public Page getMainPage() {
        return pageFactory.createMainPage();
    }

    @Override
    public Page getLoginPage() {
        return pageFactory.createLoginPage();
    }

    @Override
    public Page getRegisterPage() {
        return pageFactory.createRegisterPage();
    }

    @Override
    public Page getChannelPage() {
        return pageFactory.createChannelPage();
    }

    @Override
    public Page getAddChannelPage() {
        return pageFactory.createAddChannelPage();
    }
}
