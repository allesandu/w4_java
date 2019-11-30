public class Autopen extends Pen {
    private boolean isOpen;
    
    
    public Autopen() {
        super(capacity);
        this.isOpen = false;
    }
    
    public void click() {
        this.isOpen = !this.isOpen;
    }
    
    public boolean open() {
        return this.isOpen;
    }
    
    @Override
    public void write(Paper paper, String content) {
        throws WritingUtencilException
    {
        if ( !this.open() ) {
            throw new ClosedPenException()
        }
        super.write(paper, content);
    }
}