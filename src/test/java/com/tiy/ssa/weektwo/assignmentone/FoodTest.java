package com.tiy.ssa.weektwo.assignmentone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import com.tiy.ssa.weektwo.assignmentone.Food.Brand;
import static com.tiy.ssa.weektwo.assignmentone.Food.Brand.*;
import static com.tiy.ssa.weektwo.assignmentone.Food.Type.*;
import static org.junit.Assert.*;

public class FoodTest {

    List<Food> food = new ArrayList<>();

    @Before
    public void setup() {
        this.food.add(new Food(UTZ, "Regular", CHIP));
        this.food.add(new Food(UTZ, "BBQ", CHIP));
        this.food.add(new Food(NABISCO, "OREO", COOKIE));
        this.food.add(new Food(NABISCO, "CHOCO", COOKIE));
        this.food.add(new Food(ROLD_GOLD, "SNYDER", PRETZEL));
        this.food.add(new Food(ROLD_GOLD, "STICKS", PRETZEL));
       
    }

    @Test
    public void noCookies() {

        List<Food> noCookies = new ArrayList<>();

        for (int i = 0; i < food.size(); i++) {
            if (this.food.get(i).getType() != COOKIE) {
                noCookies.add(this.food.get(i));
            }
        }
        for (int z = 0; z < noCookies.size(); z++) {
            assertTrue("", noCookies.get(z).getType() != COOKIE);
        }

        assertEquals("", 4, noCookies.size());

    }

    @Test
    public void onlyCookies() {

        List<Food> onlyCookies = new ArrayList<>();

        for (int i = 0; i < food.size(); i++) {
            if (this.food.get(i).getType() == COOKIE) {
                onlyCookies.add(this.food.get(i));
            }
        }
        for (int z = 0; z < onlyCookies.size(); z++) {
            assertTrue("", onlyCookies.get(z).getType() == COOKIE);
        }
    }

    @Test
    public void noUTZBrand() {
        for (Iterator<Food> iterator = food.iterator(); iterator.hasNext();) {
            Food food2 = (Food) iterator.next();
            if(food2.getBrand() == UTZ) {
                iterator.remove();
            }
            
        }
        
        for (Iterator<Food> iterator = food.iterator(); iterator.hasNext();) {
            Food food2 = (Food) iterator.next();
            assertTrue("", food2.getBrand() != UTZ);
        
        
        }
        
        assertEquals("", 4, food.size());
        
    }
    
    
    
    
    
//    @Test
//    public void noUTZ() {
//
//        for (int i = 0; i < food.size(); i++) {
//            if (this.food.get(i).getBrand() == UTZ) {
//                this.food.remove(i);
//            }
//        }
//
//        for (int z = 0; z < food.size(); z++) {
//            System.out.println(food.get(z).getBrand());
//            System.out.println(food.get(z).getName());
//            System.out.println(food.size());
//            assertTrue("", food.get(z).getBrand() != UTZ);
//        }
//
//    }

}
