import kotlinx.coroutines.*

fun main() {
    runBlocking {
        launch(CoroutineName("myCoroutine")) {
            println("This is run from $coroutineContext")

            withContext(Dispatchers.IO){
                println("Second context: $coroutineContext")
            }

            println("Third context $coroutineContext")
        }
    }
}