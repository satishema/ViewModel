package com.android.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel(
    startingCount: Int
) : ViewModel() {

    private var count = startingCount

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return ++count
    }
}