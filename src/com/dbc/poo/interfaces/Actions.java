package com.dbc.poo.interfaces;

import com.dbc.poo.entities.User;

public interface Actions {
        void registerUser();
        void listCandidates();
        void updateUser(User user);
        void deleteUser(User user);
}
