package org.hillel.it.xipiv.model.entity;

import java.util.*;

public class User {
	String userName;
	UserGroup userGroup;
	Calendar dateOfBirth;
	List<User> followingUsers = new ArrayList<User>();
}
