public abstract class Animal implements Drawable, SoundProducable{

    private String  name;


    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }


}
