package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cat1 {
    private String name;
    private List<Integer> jumps;

    public Cat1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // static nested class
    public static class Key {
        private int key;
        private int result;

        public int getKey() {
            return key;
        }

        public int getResult() {
            return result * key;
        }

        public Key(int key, int result) {
            this.key = key;
            this.result = result;
        }

    }

    public static Integer getKey(int x, int y) {

        return new Key(x, y).getResult();
    }


    // inner class Kitten
    public class Kitten {
        private String name;

        public Kitten(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private void printNameKitten() {
            System.out.println(name);
        }
    }


    public void printNameCat() {

        // anonymous class
        Print print = new Print() {
            @Override
            public void print() {
                System.out.println("Name cat :" + name);
            }
        };
        print.print();
    }


    public Kitten getKitten(String name) {

        if (name.equals("")) {
            return new Kitten("no name");
        }
        return new Kitten(name);
    }

    public void generateJump() {
        jumps = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            // local class
            class Jump {
                private Integer jump;

                Random random = new Random();

                public Jump() {
                    this.jump = random.nextInt(name.length()) + 1;
                }

                public Integer getJump() {
                    return jump;
                }
            }
            jumps.add(new Jump().getJump());
        }

        System.out.println("The cat jumps : " + jumps.toString());

    }
}
