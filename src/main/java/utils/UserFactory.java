package utils;


import dto.User;
import net.datafaker.Faker;

public class UserFactory {
    static Faker faker = new Faker();

//    public static void main(String[] args){
//        String firstname = faker.name().firstName();
//        System.out.println(firstname);
//
//        String lastName = faker.name().lastName();
//        System.out.println(lastName);
//
//        String email = faker.internet().emailAddress();
//        System.out.println(email);
//    }
    public static User positiveUser(){
        User user = User.builder()
                .username(faker.internet().emailAddress())
                .password("gdtAh123!")
                .build();
        return user;
    }
}
