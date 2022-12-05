package uk.ac.shef;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindLastTest {

    // (a) Identify the defect: i > 0 instead of i >= 0 in the loop header
    @Test
    public void findLast() {
        // anything where y is the first element in x and does not appear
        // later in the array
        int[] x = {1, 0};

        // note that this will fail!
        // assertThat(BuggyClass.findLast(x, 1), equalTo(0));

        assertThat(FixedClass.findLast(x, 1), equalTo(0));
    }

    // (b) A JUnit test case that does not execute the defect
    @Test
    public void findLast_DoesNotExecuteDefect() {
        // anything that does not execute the loop test,
        // so a null x (throws a NullPointerException before loop is executed)
        assertThrows(NullPointerException.class, () -> {
            BuggyClass.findLast(null, 1);
        });
    }

    // (c) A JUnit test that executes the defect but does not cause a failure
    @Test
    public void testFind_ExecutesDefectButNoFailure() {
        // anything where y is not in x
        // (e) the state is infected because the first index of x not considered.
        // However, because y is not in x anyway, the method behaves correctly
        int[] x = {0, 1};
        assertThat(BuggyClass.findLast(x, 2), equalTo(-1));
    }
}
