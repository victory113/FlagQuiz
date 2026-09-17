package com.example.flagquiz

class QuizHandler(private val fn: String, private val text: String) : Runnable {

    override fun run() {
        val imageView = MainActivity.flagImage
        val context = imageView.context

        // Drawable names have no file extension: "spain.bmp" becomes "spain"
        val resourceName = fn.substringBeforeLast(".")

        val resourceId = context.resources.getIdentifier(
            resourceName,
            "drawable",
            context.packageName
        )

        if (resourceId != 0) {
            imageView.setImageResource(resourceId)
        }

        MainActivity.questionText.text = text
    }
}

