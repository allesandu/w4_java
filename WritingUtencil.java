abstract public class WritingUtencil{
    protected int amount;
    protected int capacity;
    
    public WritingUtencil(int capacity) {
        this.amount = capacity;
        this.capacity = capacity;
    }
    
    public WritingUtencil() {
        this(4096);// call constructor Pen(4096) !!!
    }
    
    public int getAmount() {
        return this.amount;
    }
    public int getCapacity() {
        return this.capacity;
    }
    
    public void refill() {
        this.amount = this.capacity;
    }
    
    abstract public void write(Paper paper, String content) {
        throws WritingUtencilException
}