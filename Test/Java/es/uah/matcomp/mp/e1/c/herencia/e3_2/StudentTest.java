package es.uah.matcomp.mp.e1.c.herencia.e3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    Student s = new Student("Señor X","xxx.com","MatyComp",1,90);

    @Test
    void getProgram() {
        assertEquals("MatyComp",s.getProgram());
    }

    @Test
    void setProgram() {
        s.setProgram("Comp");
        assertEquals("Comp",s.getProgram());
    }

    @Test
    void getYear() {
        assertEquals(1,s.getYear());
    }

    @Test
    void setYear() {
        s.setYear(10);
        assertEquals(10,s.getYear());
    }

    @Test
    void getFee() {
        assertEquals(90,s.getFee());
    }

    @Test
    void setFee() {
        s.setFee(10);
        assertEquals(10,s.getFee());
    }

    @Test
    void testToString() {
        assertEquals("Student[Person [name=Señor X, address=xxx.com], program=MatyComp, year=1, fee=90.0]",s.toString());
    }
}