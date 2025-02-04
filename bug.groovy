```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    if (item == "someValue") {
      list.remove(index) // This can cause an issue!
    }
  }
}

List<String> myList = ["value1", "someValue", "value2", "someValue"]
myMethod(myList)
println myList // Unexpected output
```