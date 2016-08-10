package com.tiy.ssa.weektwo.assignmenttwo;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

public class FooTest {

    @Test
    public void fooTest() {
        Set<Foo> f = new HashSet<>();
        assertTrue(f.add(new Foo("Testing String")));
        assertTrue(f.add(new Foo("Testing String")));

    }

    @Test
    public void gooTest() {
        Set<Goo> g = new HashSet<>();
        assertTrue(g.add(new Goo("Testing String")));
        assertFalse(g.add(new Goo("Testing String")));
    }

}
