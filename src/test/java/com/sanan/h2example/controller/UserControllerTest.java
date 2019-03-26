package com.sanan.h2example.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.sanan.h2example.entity.User;
import com.sanan.h2example.service.UserService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * UserControllerTest is the Unit Test class for UserController.
 * At this point we will mock our unit tests. Later we will bring
 * in the H2 in-memory database functionality to the tests and have a separate
 * database for the service part of the project.
 */
public class UserControllerTest {

    UserService mockUserService;

    @Before
    public void setup() {
        mockUserService = Mockito.mock(UserService.class);
    }

    @Test
    public void testGetUserById() {
        User expectedUser = setupDummyUser();
        Mockito.when(mockUserService.getUserById(10001)).thenReturn(expectedUser);
        User actualUser = mockUserService.getUserById(10001);

        assertNotNull(actualUser);
        assertEquals(expectedUser.getId(), actualUser.getId());
        assertEquals(expectedUser.getEmail(), actualUser.getEmail());
        assertEquals(expectedUser.getFirstName(), actualUser.getFirstName());
        assertEquals(expectedUser.getLastName(), actualUser.getLastName());
    }

    @After
    public void tearDown() {
        Mockito.reset(mockUserService);
    }

    private User setupDummyUser() {
        User user = new User();
        user.setId(10001);
        user.setEmail("email@email.com");
        user.setFirstName("John");
        user.setLastName("Doe");

        return user;
    }

}