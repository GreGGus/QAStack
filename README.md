# QAStack

## Assignment

* Write an implementation of a bounded stack (LIFO) of integers using an array of int. It should have a fixed size, determined
at instantiation. You must not use the Stack Java Class. Your own Stack class should include the following methods:
   + public int getSize();
   + public int getNumberOfElements();
   + public boolean isFull();
   + public boolean isEmpty();
   + public void push(int x) throws IllegalStateException;
   + public int head() throws IllegalStateException;
   + public void pop() throws IllegalStateException;
   + at leat one constructor
* Write the different unit tests for all the methods. Pay attention to the order of the tests.
* If you were to implement differently the Stack class, find and architecture that permits not to rewrite all of the methods.
Give the class diagram.
* Will you need to rewrite all the unit tests ? Which ones would you rewrite (if any) and why ?
* Give the architecture of the test classes that allows your previous answer (class diagram).
* Write an implementation of a queue (FIFO), using two stacks (that you already have implemented).
* Write the unit tests
* Will you nedd to rewrite all the unit tests ? Which one would you rewrite (if any) and why ?
* Give the architecture of the test clases that permits your previous answer (class diagram).
* Consider the code reuse you have done. In your opinion, how could we best implement the reuse in Java ?
* Implement the "Towers of Hanoi" game, using the Stack class you already implement. The number of disks is a variable value
given at instantiation. Your program should display the moves.
* Write the tests for the game.

## Build

```
$ mvn clean package
```

## Tests

Run the tests:

```
$ mvn test
```

Output:

```
Results :

Tests run: 13, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.445s
[INFO] Finished at: Mon Dec 07 23:12:09 CET 2015
[INFO] Final Memory: 9M/150M
[INFO] ------------------------------------------------------------------------
```



## Run

```
$ java -jar target/StackQA-1.0-SNAPSHOT.jar
```
