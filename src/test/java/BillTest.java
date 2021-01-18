import org.junit.jupiter.api.BeforeAll;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    Bill bill;
    List<Item> itemsList;
    @BeforeAll
    public void setup() {
        bill = new Bill();
        itemsList.add(new item("test",10));
    }

    @Test
    public void test_bill_value(){
        assertEquals(10,bill.calculateBill(itemsList));
    }
}