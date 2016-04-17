package com.ddd.assignment_6.Factory;

import com.ddd.assignment_6.Domain.Videos;

/**
 * Created by 214162966 on 4/17/2016.
 */
public class VideoFactory {
    public static VideoFactory video=null;
    public VideoFactory(){
    }

    public static VideoFactory getInstance(){
        if(video==null){
            video=new VideoFactory();
        }
        return video;
    }
    public static Videos getVideo(String vEditorFirstName,String vEditorLastName){
        Videos myVideo=new Videos.Builder()
                .first(vEditorFirstName)
                .last(vEditorLastName)
                .build();
        return myVideo;
    }
}