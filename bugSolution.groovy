```groovy
def methodWithClosureThrowingException(closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (Exception e) {
    println "Exception caught: "+ e.message
    //Added a return statement to explicitly exit the method after catching the exception
    return
  }
  println "After closure execution"
}

methodWithClosureThrowingException { throw new RuntimeException("Something went wrong") }
```