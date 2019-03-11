package com.codingnomads.javafundamentals.testuservalidation;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean validateUser(User user) {
        if (user == null) {
            return false;
        }
        if (user.getUsername() == null) {
            return false;
        }
        if (user.getPassword() == null) {
            return false;
        }

        boolean isValid = userRepository.validateUser(user);

        return isValid;
    }

}

