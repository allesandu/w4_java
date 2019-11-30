public class Pen extends WritingUtencil{
    protected int amount;
    protected int capacity;
    
    public Pen(int capacity) {
        this.amount = capacity;
        this.capacity = capacity;
    }
    
    public Pen() {
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
    
    public void write(Paper paper, String content) {
        throws WritingUtencilException
        {
            if ( this.amount == 0 ) {
                // throw new OutOfInkException();
            }
            if ( content.length() > this.amount ) {
                paper.addContent(content.substring(0,this.amount));
                return;
            }
            paper.addContent(content);
        }
    }
}