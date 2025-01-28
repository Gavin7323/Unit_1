package Section7

import java.util.concurrent.Executors
import java.util.concurrent.Future

fun main() {
    val executor = Executors.newSingleThreadExecutor()

    val initialNumber = 5

    val future1: Future<Int> = executor.submit {
        initialNumber * 2
    }

    val future2: Future<Int> = executor.submit {
        future1.get() + 10
    }

    val future3: Future<Int> = executor.submit {
        future2.get() - 5
    }

    executor.submit {
        println("Final result: ${future3.get()}")
        executor.shutdown()
    }
}
