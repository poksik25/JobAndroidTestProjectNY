package com.poklad.androidtestprojectny.utils

import kotlinx.coroutines.CoroutineDispatcher
interface CoroutineDispatchersProvider {
    fun getIO(): CoroutineDispatcher
    fun getMain(): CoroutineDispatcher
    fun getUnconfined(): CoroutineDispatcher
    fun getDefault(): CoroutineDispatcher
}