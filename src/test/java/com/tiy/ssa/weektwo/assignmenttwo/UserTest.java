package com.tiy.ssa.weektwo.assignmenttwo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    List<User> users = new ArrayList<User>();
    List<Name> kidNames = new ArrayList<Name>();
    float expectedValue = 0;
    

    @Before
    public void setup() {
        expectedValue = (25 + 30 + 35 + 10 + 15 + 13) / 6;
        users.add(new User("Peter", "Choi", 25));
        users.add(new User("Alex", "Kang", 30));
        users.add(new User("John", "Doe", 35));
        users.add(new User("Michael", "Lee", 10));
        users.add(new User("Chris", "Park", 15));
        users.add(new User("Howard", "Chung", 13));
        kidNames.add(new Name("Michael", "Lee"));
        kidNames.add(new Name("Chris", "Park"));
        kidNames.add(new Name("Howard", "Chung"));

    }

    @Test
    public void testA() {

        //Collection<Name> childrenNames = UserTest.children(users);

    }

    @Test
    public void testB() {
        //assertEquals(true, false);
    }

    static Collection<Name> children(Collection<? extends User> users) {
        
        List<Name> temp = new ArrayList<>();
        
        for(User user: users) {
            
            if(user.getAge() < 16) {
                
                
                String firstName = user.getFirstName();
                String lastName = user.getLastName();
                
                Name k = new Name(firstName, lastName);
                temp.add(k);
               
                
                
            }
        }
        
        return temp;
        
    }

    static float adultAverageAge(Collection<? extends User> users) {
        
        float total = 0;
        
        for(User user: users){
            total += user.getAge();
        }
        return total;
    }

}
