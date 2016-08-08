package com.tiy.ssa.weektwo.assignmentone;

public class Food {

   
    private final Brand brand;
    private final String name;
    private final Type type;

    
    public Food(Brand brand, String name, Type type) {
        this.brand = brand;
        this.name = name;
        this.type = type;
    }
    
    public enum Brand {
        NABISCO, UTZ, ROLD_GOLD
    }

    public enum Type {
        COOKIE, CHIP, PRETZEL

    }
    
    public Brand getBrand() {
        return this.brand;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Type getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Food other = (Food) obj;
        if (brand != other.brand)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
    

}
