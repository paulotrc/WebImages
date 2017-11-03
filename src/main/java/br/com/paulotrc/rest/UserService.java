package br.com.paulotrc.rest;

import br.com.paulotrc.domain.user.User;

public class UserService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("Paulo de Tarso");
        user.setLastName("Rolim Carneiro");
        return user;
    }
}
