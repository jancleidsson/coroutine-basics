import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

var functionsCalls = 0L

fun main() {
    GlobalScope.launch { completeMessage() }
    GlobalScope.launch { improveMessage() }
    println("Hello")
    Thread.sleep(2000L)
    println("There have been $functionsCalls function calls so far!")
}

suspend fun completeMessage() {
    delay(500L)
    println("World!")
    functionsCalls++
}

suspend fun improveMessage() {
    delay(1000L)
    println("Suspend functions are cool!")
    functionsCalls++
}