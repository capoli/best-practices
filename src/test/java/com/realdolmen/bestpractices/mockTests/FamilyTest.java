package com.realdolmen.bestpractices.mockTests;

import com.realdolmen.bestpractices.Family;
import com.realdolmen.bestpractices.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by OCPAX79 on 18/09/2015.
 */
@RunWith(MockitoJUnitRunner.class)
public class FamilyTest extends Assert {
    @InjectMocks
    private Family family = new Family();
    @Mock
    private Person father;
    @Mock
    private Person mother;
    private List<Person> children;
    @Mock
    private Person child;

    @Before
    public void before() {
        children = Arrays.asList(child, child, child);
        family.setFather(father);
        family.setMother(mother);
        family.setChildren(children);
    }

    @Test
    public void testSetFamilyName() {
        String lastname = "new";
        family.setFamilyName(lastname);
        Mockito.verify(father).setLastName(lastname);
        Mockito.verify(mother).setLastName(lastname);
        Mockito.verify(child, Mockito.times(children.size())).setLastName(lastname);
    }

    @Test
    public void testSetMomsName() {
        String name = "new";
        family.setMomsName(name);
        Mockito.verify(father, Mockito.never()).setFirstName(name);
        Mockito.verify(mother).setFirstName(name);
        Mockito.verify(child, Mockito.never()).setFirstName(name);
    }

    @Test
    public void testSetDadsName() {
        String name = "new";
        family.setDadsName(name);
        Mockito.verify(father).setFirstName(name);
        Mockito.verify(mother, Mockito.never()).setFirstName(name);
        Mockito.verify(child, Mockito.never()).setFirstName(name);
    }

    @Test
    public void testSetChildrenNames() {
        String name = "new";
        family.setChildrenNames(name, name, name);
        Mockito.verify(father, Mockito.never()).setFirstName(name);
        Mockito.verify(mother, Mockito.never()).setFirstName(name);
        Mockito.verify(child, Mockito.times(children.size())).setFirstName(name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetChildrenNamesSizeDoNotMatch() {
        String name = "new";
        family.setChildrenNames(name, name);
        Mockito.verify(father, Mockito.never()).setFirstName(name);
        Mockito.verify(mother, Mockito.never()).setFirstName(name);
        Mockito.verify(child, Mockito.times(children.size())).setFirstName(name);
    }
}
