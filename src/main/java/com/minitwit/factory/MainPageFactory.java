package com.minitwit.factory;

public class MainPageFactory implements PageFactory {
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
