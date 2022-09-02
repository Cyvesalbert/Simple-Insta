package com.example.simpleinsta.ui.login;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //initialize parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        //register your parse models
        ParseObject.registerSubclass(Post.class);

        //set applicationId, and server based on the values in the heroku settings
        //client key is not needed unless explicitly configured
        //any network interceptors must be added with the configuration builder
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("DhilN9JqoVuEYEzXFa2Ov2bL2ggOXWs4D2swOMIA") // should correspond to appID env variable
                .clientKey("awga1MvDasXKPlUuPmrB9Jl7eNmmrgO1p7YHRguC")  //set explicitly unless client key is e
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
