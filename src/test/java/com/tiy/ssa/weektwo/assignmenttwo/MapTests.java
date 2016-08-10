package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.tiy.ssa.weektwo.assignmentthree.SocialSecurityNumber;

public class MapTests {

    @Test
    public void initial() {
        Map<SocialSecurityNumber, User> map = new HashMap<>();
        User user = new User("FirstName", "LastName");
        map.put(new SocialSecurityNumber("123456789"), user);
        assertEquals("", user, map.get(new SocialSecurityNumber("123456789")));
        User removed = map.remove(new SocialSecurityNumber("123456789"));
        assertEquals("", user, removed);
        //assertEquals("", user, map.get(new SocialSecurityNumber("123456789")));
        
        
        map.put(new SocialSecurityNumber("000000000"), new User("Peter", "Choi"));
        assertEquals("", new User("Peter", "Choi"), map.get(new SocialSecurityNumber("000000000")));
        
        
        
//        for(Entry<K, V> entry : map.entrySet()) {
//            entry.getValue()
//        }
        
    }
        @Test
        public void stringshash() {
            System.err.println("abc".hashCode());
            System.err.println("bcd".hashCode());
        }
        
        
        
    

}
