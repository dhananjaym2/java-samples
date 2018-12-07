public class AccessParentClassVariableFromChildClass {

    public static void main(String[] args) {

        Child b = new Child(10, 1);
        System.out.println(b.toString());
    }
}

class Parent {
    int i;
}

class Child extends Parent {
    int j;

    Child(int i, int j) {

        super.i = i; // assigning value to parent class variable (which is of default type)
        this.j = j;
    }

    public String toString() {
        return "i is " + this.i + " and j is " + this.j;
    }
}
