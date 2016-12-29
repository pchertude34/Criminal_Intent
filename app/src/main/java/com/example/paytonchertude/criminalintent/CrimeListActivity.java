package com.example.paytonchertude.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by paytonchertude on 9/21/16.
 */
public class CrimeListActivity extends SingleFragmentActivity
{
    @Override
    protected Fragment createFragment()
    {
        return new CrimeListFragment();
    }
}
