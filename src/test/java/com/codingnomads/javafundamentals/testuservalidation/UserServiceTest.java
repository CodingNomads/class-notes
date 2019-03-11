package com.codingnomads.javafundamentals.testuservalidation;


import com.codingnomads.javafundamentals.testuservalidation.User;
import com.codingnomads.javafundamentals.testuservalidation.UserRepository;
import com.codingnomads.javafundamentals.testuservalidation.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {


    private UserService userService;
    private UserRepository userRepositoryMock;

    @Before
    public void setUp() throws Exception {

        userRepositoryMock = mock(UserRepository.class);
        userService = new UserService(userRepositoryMock);
    }

    @Test
    public void shouldValidateUser_whenUserIsValid() {
        User validUser = new User();
        validUser.setUsername("VALID_USERNAME");
        validUser.setPassword("VALID_PASSWORD");

        when(userRepositoryMock.validateUser(validUser)).thenReturn(true);

        boolean isValid = userService.validateUser(validUser);

        assertThat(isValid).isTrue();
    }


    @Test
    public void shouldNotValidateUser_whenUsernameIsEmpty() {

        User inValidUser = new User();
        inValidUser.setUsername(null);
        inValidUser.setPassword("ANY_PASSWORD");

        boolean isNotValid = userService.validateUser(inValidUser);

        assertThat(isNotValid).isFalse();
    }
    @Test
    public void shouldNotValidateUser_whenPasswordIsEmpty() {

        User inValidUser = new User();
        inValidUser.setUsername("ANY_USERNAME");
        inValidUser.setPassword(null);

        boolean isNotValid = userService.validateUser(inValidUser);

        assertThat(isNotValid).isFalse();
    }






    @Test
    public void shouldNotValidateUser_whenUserIsEmpty() {
        boolean isValid = userService.validateUser(null);

        assertThat(isValid).isFalse();
    }
}