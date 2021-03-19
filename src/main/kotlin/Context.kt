import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch(CoroutineName("jansCoroutine")) {
            println("This is run from ${coroutineContext[CoroutineName.Key]}")
        }

        GlobalScope.launch(CoroutineName("jansCoroutineGlobal")) {
            println("This is run from global scope ${coroutineContext[CoroutineName.Key]}")
        }
    }
}