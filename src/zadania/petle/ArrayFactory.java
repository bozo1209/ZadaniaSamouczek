package zadania.petle;

import java.util.Arrays;

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

//    zad 9
    public int[][] macierzJednostkowa(){
        int[][] macierz = twoDimension();
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++){
                if (i == j){
                    macierz[i][j] = 1;
                }
            }
        }
        return macierz;
    }

    public void showMacierzJednostkowa(){
        for (int i = 0; i < macierzJednostkowa().length; i++){
            System.out.println(Arrays.toString(macierzJednostkowa()[i]));
        }
    }

}
