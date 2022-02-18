package com.example.wordleclone

import android.inputmethodservice.InputMethodService
import android.inputmethodservice.Keyboard
import android.inputmethodservice.KeyboardView
import android.view.View

class KeyboardInputMethodService
    : InputMethodService(),
        KeyboardView.OnKeyboardActionListener
{

    private lateinit var keyboardView: KeyboardView
    private lateinit var keyboard: Keyboard
    private val caps = true

    override fun onCreateInputView(): View {
        keyboardView = layoutInflater.inflate(R.layout.keyboard_view, null) as KeyboardView
        keyboard = Keyboard(this, R.xml.custom_keyboard)
        keyboardView.keyboard = keyboard
        keyboardView.setOnKeyboardActionListener(this)
        return keyboardView
    }

    override fun onPress(primaryCode: Int) {
        TODO("Not yet implemented")
    }

    override fun onRelease(primaryCode: Int) {
        TODO("Not yet implemented")
    }

    override fun onKey(primaryCode: Int, keyCodes: IntArray?) {
        TODO("Not yet implemented")
    }

    override fun onText(text: CharSequence?) {
        TODO("Not yet implemented")
    }

    override fun swipeLeft() {
        TODO("Not yet implemented")
    }

    override fun swipeRight() {
        TODO("Not yet implemented")
    }

    override fun swipeDown() {
        TODO("Not yet implemented")
    }

    override fun swipeUp() {
        TODO("Not yet implemented")
    }

}