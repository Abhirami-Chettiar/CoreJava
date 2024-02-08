package com.edubridge.interfacedemo;

public class Learner implements Deletable{
//	it provides run time info about object
	public boolean delete(Object o) {
		if(o instanceof Deletable)
			return true;
		return false;
	}

}
