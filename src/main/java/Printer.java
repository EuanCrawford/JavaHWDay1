public class Printer {

    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void print(int noOfPages, int noOfCopies) {
        if (this.sheetsLeft >= noOfCopies * noOfPages && this.toner >= 1) {
            this.sheetsLeft = this.sheetsLeft - (noOfCopies * noOfPages);
            this.toner = this.toner - 1;
        }
    }

    public int getToner() {
        return toner;
    }
}
