import kotlinx.coroutines.*

fun main() {
    println("Program execution will now block")
    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        GlobalScope.launch {
            delay(500L)
            println("Task from GlobalScope")
        }

        coroutineScope {
            launch {
                delay(3000L)
                println("Task from coroutineScope 1")
            }

            launch {
                delay(2000L)
                println("Task from coroutineScope 2")
            }

            launch {
                delay(1000L)
                println("Task from coroutineScope 3")
            }
        }
    }
    println("Program execution will now continue")
}