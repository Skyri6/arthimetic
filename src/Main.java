public class Main {
    public static void main(String[] args) {
        Arithmetic firstObject = new Arithmetic(0, 0);

        System.out.println("summa chisel " + firstObject.first + " i " + firstObject.second
                + " ravnyaetsya " +  firstObject.sum());

        System.out.println("proizvedenie chisel " + firstObject.first + " i " + firstObject.second
                + " ravnyaetsya " +  firstObject.mus());

        System.out.println("bolshee chislo iz " + firstObject.first + " i " + firstObject.second
                + " ravnyaetsya " +  firstObject.big());

        System.out.println("menshee chislo iz " + firstObject.first + " i " + firstObject.second
                + " ravnyaetsya " +  firstObject.min());
    }
}
