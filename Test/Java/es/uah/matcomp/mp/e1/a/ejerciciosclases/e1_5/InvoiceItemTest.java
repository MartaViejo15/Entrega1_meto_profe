package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceItemTest {
    InvoiceItem ii = new InvoiceItem("A1","X",1,1);

    @Test
    void getId() {
        assertEquals("A1",ii.getId());
    }

    @Test
    void getDesc() {
        assertEquals("X",ii.getDesc());
    }

    @Test
    void getQty() {
        assertEquals(1,ii.getQty());
    }

    @Test
    void setQty() {
        ii.setQty(2);
        assertEquals(2,ii.getQty());
    }

    @Test
    void getUnitPrice() {
        assertEquals(1,ii.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        ii.setUnitPrice(2);
        assertEquals(2,ii.getUnitPrice());
    }

    @Test
    void getTotal() {
        assertEquals(1,ii.getTotal());
    }

    @Test
    void testToString() {
        assertEquals("InvoiceItem[id=A1, desc=X, qty=1, unitPrice=1.0]",ii.toString());
    }
}