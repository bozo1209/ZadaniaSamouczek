public class Main {
    public static void main(String[] args) {
        Human human = new Human("Stefan", "m", 50, 174, 88);
        System.out.println(human.getImie());
        System.out.println(human.getWaga());

        Prostokat prostokat = new Prostokat(10,4);
        System.out.println(prostokat.przekatna());
    }
}
