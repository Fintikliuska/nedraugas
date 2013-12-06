package com.igne;

import java.util.ArrayList;

public class BorisasLiepe {

	private static int instanceCount = 0;
	
	public BorisasLiepe() {
		instanceID = instanceCount;
		instanceCount++;
	}
	private int instanceID; 
	
	public static void main(String[] args) {
		ArrayList<BorisasLiepe> fui = new ArrayList<BorisasLiepe>();
		for (int i = 0; i < 5; i++) {
		BorisasLiepe a = new BorisasLiepe();
		fui.add(a);
		}


	}

}
