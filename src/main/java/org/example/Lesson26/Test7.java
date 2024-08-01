package org.example.Lesson26;



public class Test7 {
    public static void main(String[] args) {
        Lion a = new Lion();
    }
}
class Animal{
    Animal(){        System.out.println("Constructor of animal");    }
    static {        System.out.println("Static init Animal");    }
     {        System.out.println("NoN-Static init Animal");    }
}
class Mammal extends Animal{
    Mammal(){        System.out.println("Constructor of Mammal");    }
    static {        System.out.println("Static init Mammal");    }
    {        System.out.println("NoN-Static init Mammal");    }
}
class Lion extends Mammal{
    Lion(){        System.out.println("Constructor of Lion");    }
    static {        System.out.println("Static init Lion");    }
    {        System.out.println("NoN-Static init Lion");    }
}

