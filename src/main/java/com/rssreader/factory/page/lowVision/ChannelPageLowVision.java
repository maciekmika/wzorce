package com.rssreader.factory.page.lowVision;

import com.rssreader.factory.page.Page;

public class ChannelPageLowVision implements Page{

    String pageName = "lowVision/ChannelPageLowVision.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
