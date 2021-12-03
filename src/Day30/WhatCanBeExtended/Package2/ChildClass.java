package Day30.WhatCanBeExtended.Package2;

import Day30.WhatCanBeExtended.Package1.ParentClass;

public class ChildClass extends ParentClass {

    public void testMethod() {
//        super.defaultNumber = 10;
        super.protectedNumber = 10;
    }


}
