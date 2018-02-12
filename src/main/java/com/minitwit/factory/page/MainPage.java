package com.minitwit.factory.page;

import com.minitwit.factory.page.Page;

public class MainPage implements Page {

    String pageName="timeline.ftl";

    @Override
    public String getName() {
        return this.pageName;
    }
}
