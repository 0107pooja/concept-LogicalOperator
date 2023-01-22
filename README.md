1. Logical ‘AND’ Operator (&&) = This operator returns true when both the conditions under consideration are satisfied or are true.
                                 If even one of the two yields false, the operator results false.
   Syntax: condition1 && condition2
    
eg=
       a = 10, b = 20, c = 20
       condition1: a < b
       condition2: b == c
       if(condition1 && condition2)
       d = a + b + c
       // Since both the conditions are true
       d = 50.

2. Logical ‘OR’ Operator (||) = This operator returns true when one of the two conditions under consideration is satisfied or 
                                is true. If even one of the two yields true, the operator results true.
                                To make the result false, both the constraints need to return false.
   Syntax: condition1 || condition2

eg=
       a = 10, b = 20, c = 20
       condition1: a < b
       condition2: b > c
       if(condition1 || condition2)
       d = a + b + c
       // Since one of the condition is true
       d = 50.

3. Logical ‘NOT’ Operator (!) = this is a unary operator and returns true when the condition under consideration is not satisfied
                                or is a false condition. Basically, if the condition is false, the operation returns true and 
                                when the condition is true, the operation returns false.
   Syntax: !(condition)

eg=
       a = 10, b = 20
       !(a<b) // returns false
       !(a>b) // returns true
