package com.rssreader.factory.page;

public class MainPage implements Page {

    String pageName="timeline.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
