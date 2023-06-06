import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 100);
    }

    @Test
    public void canPrint() {
        printer.print(2, 10);
        assertEquals(80, printer.getSheetsLeft());
    }

    @Test
    public void canNotPrint() {
        printer.print(6, 20);
        assertEquals(100, printer.getSheetsLeft() );
    }

    @Test
    public void canRemoveToner() {
        printer.print(2, 10);
        assertEquals(99, printer.getToner());
    }

    @Test
    public void canNotRemoveToner() {
        Printer noTonerPrinter = new Printer(100, 0);
        noTonerPrinter.print(2, 10);
        assertEquals(0, noTonerPrinter.getToner());
    }
}
