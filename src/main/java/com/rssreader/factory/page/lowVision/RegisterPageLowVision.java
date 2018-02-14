package com.rssreader.factory.page.lowVision;

import com.rssreader.factory.page.Page;

public class RegisterPageLowVision implements Page{

    String pageName = "lowVision/RegisterPageLowVision.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
