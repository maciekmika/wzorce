package com.minitwit.state;

import com.minitwit.factory.MainPageFactory;
import com.minitwit.factory.Page;
import com.minitwit.factory.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MainState implements StateBase {

    PageFactory pageFactory = new MainPageFactory();

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
