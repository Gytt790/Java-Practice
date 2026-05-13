//class - class ->extends
//interface - interface -> extends
//class - interface -> implements
interface computer {
    public abstract void code();
}

class desktop implements computer {
    public void code() {
        System.out.println("desktop is starting to code");
    }
}

class laptop implements computer {
    public void code() {
        System.out.println("laptop is starting to code");
    }
}

class Developer {
    public void code(computer desk) {
        desk.code();
    }
}

public class useofinterface {
    public static void main(String[] args) {
        computer lap = new laptop();
        computer desk = new desktop();

        Developer Naveen = new Developer();
        Naveen.code(lap);
        Naveen.code(desk);
    }
}
