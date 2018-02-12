package com.minitwit.factory;

import com.minitwit.factory.page.Page;

public interface PageFactory {

    public Page createMainPage();
    public Page createLoginPage();
    public Page createRegisterPage();
    public Page createChannelPage();
    public Page createAddChannelPage();
}
