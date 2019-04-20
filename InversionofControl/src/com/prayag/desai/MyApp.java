package com.prayag.desai;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach coach = new TrackCoach();
		System.out.println(coach.getDailyWorkout());
		// The coach should be configurable and there is a need of such a configurable
		// Instead we could use an acual implementation from a config file rather than use a interface in code.
		// here comes the spring for addressing the problem
	}

}
