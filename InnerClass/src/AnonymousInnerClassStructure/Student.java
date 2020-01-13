package AnonymousInnerClassStructure;

abstract class Student {
         static class IDNumber {
            int value;
             IDNumber() {

                 this(0);
            }
             IDNumber(int v) {
                value = v;
            }
            public String toString() {
                return " Value = " + value ;

            }

        }

    }

