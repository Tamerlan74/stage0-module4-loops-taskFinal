package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    public void printPyramid(int cathetusLength) {

        for (int i = cathetusLength; i >= 1; --i) {
            for (int j = cathetusLength; j >= 1; --j) {
                if (i <= j) {
                    System.out.print(Math.abs(j));
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
