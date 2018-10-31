package week7.task1;

public class Numeral extends Expression {
    private int value;
    public Numeral()
    {
        value=0;
    }
    public Numeral(int value)
    {
        this.value=value;
    }

    @Override
    public String toString() {
        return "Numeral{" +
                "value=" + value +
                '}';
    }
    @Override
    public int evaluate()
    {
        return value;
    }


}
