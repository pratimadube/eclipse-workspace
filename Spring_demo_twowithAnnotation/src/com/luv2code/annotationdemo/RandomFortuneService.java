package com.luv2code.annotationdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	public String[] Data = new String[] { "you will feel great today", "Travel is great Joy",
			"Smile is great curve to make everything straight", "Today is your Lucky Day" };

	private Random random = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = random.nextInt(Data.length);
		String theFortune = Data[index];
		return theFortune;
	}

}
