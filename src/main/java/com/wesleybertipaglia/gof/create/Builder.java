package com.wesleybertipaglia.gof.create;

public class Builder {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("John", "Doe")
                .age(30)
                .city("New York")
                .build();

        Person person2 = new Person.Builder("Jane", "Smith")
                .build();

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}

class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String city;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.city = builder.city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    static class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String city;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
