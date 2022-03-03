package com.SpringBoot.BE;

public class Main {

	public static void main(String[] args) {
		String []  args1= { "-gui -port 1097 ","agent2:agent2"};
		String []  args2= { "-container","agent1:agent1"};
		jade.Boot.main(args1);
		jade.Boot.main(args2);


	}



}
