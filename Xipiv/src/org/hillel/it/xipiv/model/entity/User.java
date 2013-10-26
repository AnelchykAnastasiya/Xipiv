package org.hillel.it.xipiv.model.entity;

import java.util.*;

public class User {
	// Should I make fields private?
	String userName;
	// Do I need to store a password in the class?
	UserGroup userGroup;
	Calendar dateOfBirth;
	List<User> followingUsers = new ArrayList<User>(); // Should I use list or a simple array?
	
	// Which methods are going to be implemented here?
}
