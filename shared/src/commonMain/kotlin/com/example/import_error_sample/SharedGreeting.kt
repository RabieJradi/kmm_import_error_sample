package com.example.import_error_sample

class SharedGreeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}