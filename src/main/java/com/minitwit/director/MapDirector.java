package com.minitwit.director;

import com.minitwit.builder.BuilderBase;
import com.minitwit.model.Feed;
import com.minitwit.model.FeedMessage;
import com.minitwit.model.User;

import java.util.List;

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
    }
}
