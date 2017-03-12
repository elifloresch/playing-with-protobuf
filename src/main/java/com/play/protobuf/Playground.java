package com.play.protobuf;

import com.play.protobuf.gen.AddressBookProtos;
import com.play.protobuf.gen.AddressBookProtos.Person;
import com.play.protobuf.gen.AddressBookProtos.Person.PhoneNumber;
import com.play.protobuf.gen.AddressBookProtos.Person.PhoneType;

public class Playground {
    public static void main(String[] args) {
        Person john = AddressBookProtos.Person.newBuilder()
                .setId(1234)
                .setName("John Doe")
                .setEmail("jdoe@example.com")
                .addPhones(PhoneNumber.newBuilder()
                        .setNumber("555-4321")
                        .setType(PhoneType.HOME))
                .build();
        System.out.println(john.toString());
    }
}
