package week7.task1;

public class Multiplication extends BinaryExpression {
    private Expression left;
    private  Expression right;
    public Multiplication(Expression left,Expression right)
    {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    @Override
    public int evaluate(){
        return left.evaluate()*right.evaluate();
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
}
