package com.example.paytonchertude.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by paytonchertude on 9/20/16.
 */
public class Crime
{
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private String mSuspect;

    public Crime()
    {
        this(UUID.randomUUID());
    }

    public Crime(UUID id)
    {
        mId = id;
        mDate = new Date();
    }

    public UUID getId() { return mId; }

    public Date getDate() { return mDate; }

    public String getTitle() { return mTitle; }

    public boolean isSolved() { return mSolved; }

    public String getSuspect() { return mSuspect; }

    public void setDate(Date mDate) { this.mDate = mDate; }

    public void setTitle(String mTitle) { this.mTitle = mTitle; }

    public void setSolved(boolean solved) { this.mSolved = solved; }

    public void setSuspect(String suspect) {this.mSuspect = suspect; }

}
