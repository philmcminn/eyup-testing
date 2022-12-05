# Materials for the EyUp Lecture on Java Testing, 7/12/22

The slides for the presentation can be found
[here](https://github.com/philmcminn/eyup-testing/blob/main/presentation/testing.pdf).

### Instructions for the Practical Part of the Lecture

Navigate to the `uk.ac.shef` package (in the `code` directory of this
repository) and open the `BuggyClass.java` class. 

The class contains three methods. Each method has a fault, and you will
need to write JUnit tests to establish the presence of the fault (by
producing a failure) and that, following fixing the fault, the method now
works. 

For each method:

(a) Identify the fault, and write a JUnit test that causes it to fail. (The
JUnit test should fail too.)

(b) Write a JUnit test that _does not_ execute the fault.

(c) Write a JUnit test that executes the fault but _does not_ cause a
failure.

(d) Fix the fault and add it to `FixedClass.java`. Change the test you
wrote in (a) to use the fixed method, and verify that it now passes. 

Add your tests for each method into a new JUnit test class.
