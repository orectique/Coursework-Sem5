
public class navamiTemp {

static class parentClass {
    private void parentmethod() {
        System.out.println("This is parent class");
    }
}

static class childClass extends parentClass {
    public void childmethod() {
        System.out.println("This is child class");
    }
}


    public static void main(String[] args) {
        parentClass m = new parentClass();
        childClass n = new childClass();
        m.parentmethod();
        n.childmethod();
        /* n.parentmethod(); */
    }

}
