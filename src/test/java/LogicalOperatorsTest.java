import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicalOperatorsTest {

    @Test
    void shouldCheckBothConditionAndShouldTellMinimumNumber(){
        LogicalOperators logicalOperators=new LogicalOperators();
        int expectedOutput=45;
        int actualOutput = logicalOperators.logicalOperationsAnd(45,95,55);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldCheckAnyOneConditionAndShouldTellMinimumNumber(){
        LogicalOperators logicalOperators=new LogicalOperators();
        int expectedOutput=45;
        int actualOutput = logicalOperators.logicalOperationsOr(45,95,55);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldCheckWhenBothAreIncorrectAndShouldFirstNumberElseSecondNumber(){
        LogicalOperators logicalOperators=new LogicalOperators();
        int expectedOutput=45;
        int actualOutput = logicalOperators.logicalOperationsNot(45,95,55);
        assertEquals(expectedOutput, actualOutput);
    }
    }



