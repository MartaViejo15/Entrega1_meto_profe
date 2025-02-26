package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    Account a = new Account("A1","a",10);
    Account b = new Account("A2", "es/uah/matcomp/mp/e1/composicionagregacion");
    @Test
    void getId() {
        assertEquals("A1",a.getId());
    }

    @Test
    void getName() {
        assertEquals("a",a.getName());
    }

    @Test
    void getBalance() {
        assertEquals(10,a.getBalance());
    }

    @Test
    void credit() {
        a.credit(20);
        assertEquals(30,a.getBalance());
    }

    @Test
    void debit() {
        a.debit(5);
        assertEquals(5,a.getBalance());
        b.debit(100);
        assertEquals(0,b.getBalance());
    }

    @Test
    void transferTo() {
        b.transferTo(a,1);
        assertEquals(10,a.getBalance());
        assertEquals(0,b.getBalance());
        a.transferTo(b,1);
        assertEquals(9,a.getBalance());
        assertEquals(1,b.getBalance());
    }

    @Test
    void testToString() {
        assertEquals("Account [id=A1, name=a, balance=10]",a.toString());
    }

}