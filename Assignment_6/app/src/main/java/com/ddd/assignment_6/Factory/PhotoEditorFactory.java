package com.ddd.assignment_6.Factory;

import com.ddd.assignment_6.Domain.PhotoEditor;

/**
 * Created by 214162966 on 4/17/2016.
 */
public class PhotoEditorFactory {
    public static PhotoEditorFactory editor=null;
    public PhotoEditorFactory(){
    }
    public static PhotoEditorFactory getInstance(){
        if(editor==null){
            editor=new PhotoEditorFactory();
        }
        return editor;
    }
    public static PhotoEditor getEdit(String pEditorFirstName,String pEditorLastName){
        PhotoEditor myEdit=new PhotoEditor.Builder()
                .first(pEditorFirstName)
                .last(pEditorLastName)
                .build();

        return myEdit;
    }
}
