package task;

    public class Main {
        public static void main(String[] args) {

            MyStackInterface<Integer> m = new MyStack<>();


            m.pushElement(1);
            System.out.println(m.popElement());
            System.out.println(m.peekElement());

        }
    }

