package com.example.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
        public  static  final String ORIGINAL_NOTE_COURSE_ID = "kj10dev@gmail.com, ORIGINAL COURSE ID";
        public  static  final String ORIGINAL_NOTE_TITLE = "kj10dev@gmail.com, ORIGINAL NOTE TITLE";
        public  static  final String ORIGINAL_NOTE_TEXT = "kj10dev@gmail.com, ORIGINAL NOTE TEXT";

        public String mOriginalNoteCourseId;
        public String mOriginalNoteTitle;
        public String mOriginalNoteText;
        public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);

    }

    public void restoreState(Bundle inState) {
        mOriginalNoteCourseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = inState.getString(ORIGINAL_NOTE_TEXT);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TITLE);
    }
}
