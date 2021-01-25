package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {
    private DataHelper(){}
    private static final Faker faker = new Faker(new Locale("ru"));

    public static String getCity(){
        return faker.address().cityName();
    }

    public static String getPhone(){
        return faker.phoneNumber().phoneNumber();
    }

    public static String getFirstDate(){
        return LocalDate.now().plusDays(4).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String getSecondDate(){
        return LocalDate.now().plusDays(8).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String getName(){
        return faker.name().fullName();
    }
}
