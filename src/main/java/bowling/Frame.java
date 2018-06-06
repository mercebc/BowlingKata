package bowling;

public abstract class Frame {
    protected final boolean bonus;
    Frame next;

    public Frame(boolean bonus) {
        this.bonus = bonus;
    }

    public abstract int total();

    abstract int ball();

    abstract int twoBalls();

    public void setNext(Frame next) {
        this.next = next;
    }

    public int grandTotal() {

        if (bonus) {
            return 0;
        }

        if (next == null) {
            return this.total();
        }

        return this.total() + next.grandTotal();

    }
}
