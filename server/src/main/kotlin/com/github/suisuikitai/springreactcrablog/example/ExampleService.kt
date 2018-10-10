package com.github.suisuikitai.springreactcrablog.example

import org.springframework.stereotype.Service

@Service
class ExampleService {
    data class ExampleResponse(val message: String)

    fun getSomeValue() = ExampleResponse("Hello World!")
}
