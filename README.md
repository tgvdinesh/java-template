### About
Java template for the [Mind sport IntelliJ plugin](https://plugins.jetbrains.com/plugin/10688-mind-sport)

### How does it work ?

#### Running with [competitive-companion](https://github.com/jmerle/competitive-companion) browser extension
Like a regular maven project. The plugin will replace the content of io.json file with the sample input and output available. This can be run with `AppTest.runTestCases`.
#### Running custom test case
In case if we want to test with custom input and assert it with custom output then we need to manually paste them in `src/test/resources/input.txt` and `src/test/resources/output.txt` respectively and the run `AppTest.runCustomTestCase`

### Sample question in this program

You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
#### Input
The only input line contains a string of n characters.
#### Output
Print one integer: the length of the longest repetition.
Constraints

1 <= n <= 10^6

#### Example
##### Input:
ATTCGGGA

##### Output:
3

# TODO
 - [ ] Implement [dynamic test](https://dzone.com/articles/junit-5-dynamic-tests-generate-tests-at-run-time)