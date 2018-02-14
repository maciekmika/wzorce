package com.rssreader.factory.page.lowVision;

import com.rssreader.factory.page.Page;

public class AddChannelPageLowVision implements Page{

    String pageName = "lowVision/AddChannelPageLowVision.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
