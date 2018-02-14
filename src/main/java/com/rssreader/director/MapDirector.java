package com.rssreader.director;

import com.rssreader.builder.BuilderBase;

public class MapDirector {

    public void createMap(BuilderBase builderBase){
        builderBase.addPageTitle( );
        builderBase.addUser( );
        builderBase.addFeedList( );
        builderBase.addFeedMessages( );
        builderBase.addFeedName();
        builderBase.addPageNr( );
        builderBase.addPagesList( );
        builderBase.addPagesAmount( );
        builderBase.addLinkToCurrentPage();
        builderBase.addTextSize();
    }
}
