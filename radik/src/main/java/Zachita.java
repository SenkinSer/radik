import java.util.Scanner;

class Name {
    String name;

    Name() {
    }

    Name(String name) {
        this.name = name;
    }

    public Name setName(Name object) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя ");
        object.name = in.next();
        return object;
    }

    public boolean equals(Name object, Name inputName) {
        boolean output;
        output = object.name.equals(inputName.name);
        return output;
    }
}
    public class Zachita{
        public static void main(String[] args) {
            boolean output;
            Name firstObject = new Name("Сергей");
            Name secondObject = new Name();
            secondObject.setName(secondObject);
            System.out.println(firstObject.equals(firstObject,secondObject));
        }
    }

