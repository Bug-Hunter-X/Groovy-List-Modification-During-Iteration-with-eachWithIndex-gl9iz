```groovy
def myMethod(List<String> list) {
  Iterator<String> iterator = list.iterator()
  while (iterator.hasNext()) {
    String item = iterator.next()
    if (item == "someValue") {
      iterator.remove() // Use iterator.remove() for safe removal
    }
  }
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
println myList // Correct output
```