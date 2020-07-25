package com.capg.commandline;

public class FindLength {
	public static void main(String[] args) {
		String temp="";
	for(int i=0;i<args.length;i++) {
		for(int j=1;j<(args.length-i);j++) {
			if(args[j-1].length()>args[j].length()) {
				temp=args[j-1];
				args[j-1]=args[j];
				args[j]=temp;
			}
		}
	}
	for(int i=0;i<args.length;i++) {
		System.out.println(args[i]);
	}
	}

}
