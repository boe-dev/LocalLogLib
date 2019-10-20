package dev.five_star.localloglibrary

import timber.log.Timber
import java.io.File

class LocalLog(private val filesDir: File, private val fileName: String = "log.txt") : Timber.DebugTree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        File(filesDir, fileName).appendText("$tag: $message\n")
        super.log(priority, tag, message, t)
    }
}