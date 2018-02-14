package com.rssreader.factory.page.lowVision;

import com.rssreader.factory.page.Page;

public class LoginPageLowVision implements Page{

    String pageName = "lowVision/LoginPageLowVision.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
