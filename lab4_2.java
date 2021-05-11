public class lab4_2 {
    // Declare data member, or called member variable.
    private int i;
    private boolean b;

    // lab4_2 that takes no parameters
    public lab4_2() {
        // i = 100;
        // b = false;
    }

    // lab4_2 that takes parameter
    public lab4_2(int i, boolean b) {
        this.i = i;
        this.b = b;
    }

    // public access methods, getters and setters
    public void setI(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public boolean getB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    // my testing method for lab4_2 class
    public static void main(String[] args) {
        System.out.println("Instantiate an object using constructor without parameters");
        lab4_2 c = new lab4_2();
        c.setI(30);
        c.setB(false);
        System.out.println("c.i=" + c.getI() + " c.b=" + c.getB());
        System.out.println("\nInstantiate an object using constructor with parameters");
        lab4_2 d = new lab4_2(50, true);
        System.out.println("d.i=" + d.getI() + " d.b=" + d.getB());
    }
}