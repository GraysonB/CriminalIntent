package com.graysonbianco.criminalintent

import android.support.v4.app.Fragment

/**
 * Created by graysonbianco on 7/26/17.
 */
class CrimeListActivity: SingleFragmentActivity() {
    override fun createFragment(): Fragment? = CrimeListFragment()
}