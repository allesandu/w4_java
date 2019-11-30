public class Paper {
    private StringBuffer content;
    private int maxSymbols;
    private int symbols;

    public Paper() {
        this.maxSymbols = 4096;
        this.symbols = 0;
        content = new StringBuffer();
    }

    public Paper(int maxSymbols) {
        this.maxSymbols = maxSymbols;
        this.symbols = 0;
        content = new StringBuffer();
    }

    public int getMaxSymbols() {
        return this.maxSymbols;
    }

    public int getSymbols() {
        return this.symbols;
    }

    public void addContent(String message) {
        content.append(message);
    }

    public void show() {
        System.out.println(content);
    }
}