package zadania.obiekty;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Stefan", "m", 50, 174, 88);
        System.out.println(human.getImie());
        System.out.println(human.getPlec());
        System.out.println(human.getWiek());
        System.out.println(human.getWzrost());
        System.out.println(human.getWaga());

        Prostokat prostokat = new Prostokat(10,4);
        System.out.println(prostokat.przekatna());
        System.out.println(prostokat.obwod());
        System.out.println(prostokat.pole());

        MyNumber myNumber = new MyNumber(5);
        System.out.println("myNumber.isOdd()) = " + myNumber.isOdd());
        System.out.println("myNumber.isEven()) = " + myNumber.isEven());
        System.out.println("myNumber.sqrt()) = " + myNumber.sqrt());
        System.out.println("myNumber.pow(new zadania.obiekty.MyNumber(2))) = " + myNumber.pow(new MyNumber(2)));
        System.out.println("myNumber.add(new zadania.obiekty.MyNumber(2))) = " + myNumber.add(new MyNumber(2)));
        System.out.println("myNumber.subtract(new zadania.obiekty.MyNumber(2))) = " + myNumber.subtract(new MyNumber(2)));

    }
}
