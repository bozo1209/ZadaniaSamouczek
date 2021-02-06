package zadania.petle;

//zad 3
public class ArrayFactory {
    public int x;

    public ArrayFactory(int x) {
        this.x = x;
    }

    public int[] oneDimension() {
        return new int[x];
    }

    public int[][] twoDimension() {
        return new int[x][x];
    }
}
