class First2 {
    public void gaurav() {
        System.out.println("Number one chutiya");
    }

    public void anshu() {
        System.out.println("Radhe Radhe");
    }
}

// First3 inherits (extends) First2
class First3 extends First2 {
    public void anshu() {
        System.out.println("sudhar jaa re betiyachod");
    }

    public void piyush() {
        System.out.println("Sub moh maya hai");
    }
}

public class first {
    public static void main(String[] args) {
        First2 f2 = new First2();
        First3 f3 = new First3();

        // Methods from First2
        f2.gaurav();
        f2.anshu();

        // Methods from First3 (inherits gaurav from First2, overrides anshu)
        f3.gaurav();   // inherited from First2
        f3.anshu();    // overridden in First3
        f3.piyush();   // new method in First3
    }
}