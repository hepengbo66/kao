package com.bw.Test;

import java.util.Date;

import com.bw.utils.Utils;

public class Test {
	
	public static void main(String[] args) {
		
		Utils u = new Utils();
		
		
		System.out.println(Utils.getDaysByFuture(new Date()));
		
		System.out.println(Utils.getDaysByDeparted(new Date()));
	}
	
}
