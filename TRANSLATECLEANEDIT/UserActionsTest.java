package com.dbc.poo.TRANSLATECLEANEDIT;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UserActionsTest {

    @Test
    public void mustRegisterUser() {

        //SETUP
        UserActions userAct = new UserActions();
        User user = new FreeUser();
        user.setUsername("luiz");
        user.setPassword("1234");
        PersoInfo persoInfo = new PersoInfo("Luiz", 19, "luiz@mail.com");
        user.setPersoInfo(persoInfo);
        user.setAddress(new Address("Rua A", 123, "Gravataí"));
        user.setProgLangs(ProgLangs.JAVA);
        user.setGender(Gender.MALE);
        user.setPref(Pref.WOMEN);

        // ACT
        userAct.userList.add(user);

        //ASSERT
        assertEquals("Luiz", user.getPersoInfo().getRealName());
        assertEquals(19, (int) user.getPersoInfo().getAge());
        assertEquals("luiz@mail.com", user.getPersoInfo().getEmail());
        assertEquals(ProgLangs.JAVA, user.getProgLangs());
        assertEquals(Gender.MALE, user.getGender());
        assertEquals(Pref.WOMEN, user.getPref());
    }
}

//this.username = username;
//        this.password = password;
//        this.persoInfo = persoInfo;
//        this.address = address;
//        this.progLangs = progLangs;
//        this.gender = gender;
//        this.pref = pref;