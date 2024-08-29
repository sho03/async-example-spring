# Async Sample
## Points

```kotlin

@SpringBootApplication
// this annotation enable to async function.
@EnableAsync
class AsyncdemoApplication

```

```kotlin
@Service
class SampleService {

    // @Async annotation makes a function asynchronously.
    @Async
    fun asyncFunction() {
        Thread.sleep(5000)
    }
}
```

@Async function can return result.
```kotlin
    // @Async annotation makes a function asynchronously.
    @Async
    fun asyncFunction(): CompletableFuture<String> {
        Thread.sleep(5000)
        return CompletableFuture.completedFuture("Task Completed.")
    }
```