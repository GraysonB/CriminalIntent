package com.graysonbianco.criminalintent.database

import android.database.Cursor
import android.database.CursorWrapper
import com.graysonbianco.criminalintent.Crime
import com.graysonbianco.criminalintent.database.CrimeDbSchema.Companion.CrimeTable.Companion.Cols
import java.util.*

/**
 * Created by graysonbianco on 8/10/17.
 */
class CrimeCursorWrapper(cursor: Cursor): CursorWrapper(cursor) {
    fun getCrime(): Crime {
        val uuidString = getString(getColumnIndex(Cols.UUID))
        val title = getString(getColumnIndex(Cols.TITLE))
        val date = getLong(getColumnIndex(Cols.DATE))
        val isSolved = getInt(getColumnIndex(Cols.SOLVED))

        val crime = Crime(UUID.fromString(uuidString))
        crime.mTitle = title
        crime.mDate = Date(date)
        crime.mSolved = isSolved != 0

        return crime
    }
}