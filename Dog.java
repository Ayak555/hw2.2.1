public class Dog extends Animal implements SoundProducable{

    public String draw() {
        return "\ud83d\udc29";
    }

    public Dog() {
        super("Пёсик");
    }

    @Override
    public String callSound() {
        return "Гав-гав";
    }
}
