package creation.builder.modernbuilder;

public class ModernBuilderMain {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("robert", "Jia")
                .age(31).phone("123456").address("郑州高新区").build();
        System.out.println(user1);

        User user2 = new User.UserBuilder("Jack", "Liu")
                .age(40).phone("789").build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Frank", "Han").build();
        System.out.println(user3);
    }

}
