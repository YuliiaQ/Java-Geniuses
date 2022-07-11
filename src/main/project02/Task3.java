package main.project02;

abstract class Marks {
    int mark1;
    int mark2;
    int mark3;
    int mark4;

    abstract int getAverage();
}

class A extends Marks {
    A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    int getAverage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}

class B extends Marks {
    B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    int getAverage() {
        return (mark1 + mark2 + mark3 + mark4) / 4;
    }
}

class Task3 {
    public static void main(String[] args) {
        Marks[] marks = {new A(60, 78, 90), new B(76, 99, 90, 59)};
        for (Marks mark : marks) {
            System.out.println(mark.getAverage());
        }
    }
}
