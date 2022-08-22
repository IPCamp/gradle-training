package com.ipcamp.dsl

class TextLength {

    private String text

    def text(text) {
        this.text = text
        this
    }

    def length() {
        text.length()
    }

    static length(Closure closure) {
        def textLength = new TextLength()
//        textLength.with(closure)
        closure.delegate = textLength
        closure()
        textLength.length()
    }
}
