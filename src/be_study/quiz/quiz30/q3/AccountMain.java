package be_study.quiz.quiz30.q3;

public class AccountMain {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.setOwner("김사장");
		a1.setBalance(50000);

		System.out.println("잔액 :" + a1.getBalance());
		System.out.println(" 입금 잔액 : " + a1.deposit(2000));
		System.out.println("잔액 :" + a1.getBalance());
		System.out.println("출금 잔액 : " + a1.withdraw(8000));
		
		long result1 = a1.withdraw(70000);
		if(result1 == -99) {
			System.out.println("아 잔액부족");
		}else {
			System.out.println("70000출금후 잔액 :" + a1.withdraw(70000));
		}
		
		
		

		Account a2 = new Account("이회장", 30000);
		System.out.println("잔액 :" + a2.getBalance());
		System.out.println("5000원 입금합니다");
		System.out.println(" 입금 잔액 : " + a2.deposit(5000));
		
		
		System.out.println("잔액 :" + a2.getBalance());
		System.out.println("5000원 입금합니다");
		System.out.println(" 입금 잔액 : " + a2.deposit(5000));
		
		
		System.out.println("잔액 :" + a2.getBalance());
		System.out.println("3000원 출금합니다");
		System.out.println(" 입금 잔액 : " + a2.withdraw(3000));
		
		System.out.println("잔액 :" + a2.getBalance());
		System.out.println("50000원 출금합니다");
		System.out.println(" 입금 잔액 : " + a2.withdraw(50000));
	}

}
