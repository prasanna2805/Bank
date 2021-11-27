package org.bank;

public class BankInfo {
	
	private void saving(int id) {
		System.out.println("saving"+id);

	}
	private void fixed(int num) {
	System.out.println("fixed"+num);

	}
	
	public void deposit(int percent) {
System.out.println("deposit"+percent);

	}
public static void main(String[] args) {
	BankInfo result=new BankInfo();
	result.fixed(776);
	result.saving(65);
	result.deposit(89);
	
	
	
	
	
	
}}