# Groovy List Modification During Iteration
This example demonstrates a common issue in Groovy when modifying a list while iterating over it using `eachWithIndex`.  The code attempts to remove elements from the list based on a condition, but this leads to unexpected behavior due to the shifting of indices after element removal.  The solution provides a safer approach to modifying the list during iteration.

## Bug
The `myMethod` function iterates over a list of strings and removes elements that match "someValue". The problem is that removing elements shifts the indices, which may cause the function to skip elements or throw `IndexOutOfBoundsException`.

## Solution
The solution uses an iterator to safely remove elements from the list while iterating. This avoids issues with index shifting.