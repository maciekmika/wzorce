package com.rssreader.factory.page.lowVision;

import com.rssreader.factory.page.Page;

public class MainPageLowVision implements Page{

    String pageName = "lowVision/MainPageLowVision.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}