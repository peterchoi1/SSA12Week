package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tiy.ssa.weektwo.assignmentthree.SocialSecurityNumber;

public class SocialSecurityNumberTest {

    @Test
    public void last4() {
        assertEquals("","1234", new SocialSecurityNumber("000001234").last4Digits());
    }

}
