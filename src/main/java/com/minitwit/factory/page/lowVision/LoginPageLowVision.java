package com.minitwit.factory.page.lowVision;

import com.minitwit.factory.page.Page;

public class LoginPageLowVision implements Page{

    String pageName = "lowVision/LoginPageLowVision.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
