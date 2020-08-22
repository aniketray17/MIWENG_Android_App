package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;

    }

    public Word(String defaultTranslation,String miwokTranslation,int ImageResourceId,int audioResourceId)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }
}