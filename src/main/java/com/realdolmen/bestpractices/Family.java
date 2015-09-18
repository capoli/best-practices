package com.realdolmen.bestpractices;

import java.util.Iterator;
import java.util.List;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
public class Family {
    private Person father;
    private Person mother;
    private List<Person> children;

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setFamilyName(String newLastName) {
        this.father.setLastName(newLastName);
        this.mother.setLastName(newLastName);

        for(Person person : getChildren()) {
            person.setLastName(newLastName);
        }
    }

    public void setMomsName(String herName) {
        this.mother.setFirstName(herName);
    }

    public void setDadsName(String hisName) {
        this.father.setFirstName(hisName);
    }

    public void setChildrenNames(String... names) {
        if(children.size() != names.length) throw new IllegalArgumentException();
        for(int i = 0; i < children.size(); i++) {
            children.get(i).setFirstName(names[i]);
        }
    }
}
