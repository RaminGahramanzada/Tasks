package org.example.minifamily;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human parent1;
    private Human parent2;
    private List<Human> children;

    public Family(Human parent1,Human parent2){
        this.parent1 =parent1;
        this.parent2=parent2;
        this.children=new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Objects.equals(parent1, family.parent1) && Objects.equals(parent2, family.parent2) && Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, parent1, parent2, children);
    }

    public  void removeChildren(Family child){
        children.remove(child);
    }
}
