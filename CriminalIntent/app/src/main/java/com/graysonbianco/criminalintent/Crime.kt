package com.graysonbianco.criminalintent

import java.util.*

/**
 * Created by graysonbianco on 7/24/17.
 */
class Crime(val mID: UUID = UUID.randomUUID(),
                 var mDate: Date = Date(),
                 var mTitle: String? = null,
                 var mSolved: Boolean = false) {

    constructor(id: UUID): this(id, Date(), null, false)
}