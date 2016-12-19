package app.myrecipes.android.narena.com.criminalintent;

import java.util.UUID;

/**
 * Created by ibrisimovicnarena on 12/18/16.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId(){
        return  mId;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String title){
        mTitle = title;
    }



}


