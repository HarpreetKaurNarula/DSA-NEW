package OOPS;

public class Cat {
    String name;
    String colour;
    String Breed;

    public Cat(){//default constructor
        this.name="Oreo";
        this.colour="Golden";
        this.Breed="chow chow";

    }

    public  Cat(String name,String colour,String Breed){
        this.name=name;
        this.colour=colour;
        this.Breed=Breed;
        
    }
    void call(){
    System.out.println(this.Breed+"retrivers");
    }
}

