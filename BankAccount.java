/*Follow the given instructions and create an application using Java.
(i) Create a ‘BankAccount’ class with 3 data members, accountNo[use String],
accountName and balance.
(ii) Overload the BankAccount constructor to accept only accountNo and
accountName variables.
(iii) Initialize the balance with 1000.*/
//
package javaexercises;

public class BankAccount {
	String AccountNo;
	String AccountName;
	int balance=1000;
	public BankAccount(String AcNo,String AcName)
	{
		AccountNo=AcNo;
		AccountName=AcName;
	}
	public void setAccountNo(String AcNo)
	{
		AccountNo=AcNo;
	}
	public void setAccountName(String AcName)
	{
		AccountName=AcName;
	}
	String getAccountNo()
	{
		return AccountNo;
	}
	String getAccountName()
	{
		return AccountName;
	}
	int getbalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount b=new BankAccount("123456789","SavingsAccount");
    System.out.println("BankAccount:"+"\n"+"AccountNo:"+b.getAccountNo()+"\n"
    +"AccountName:"+b.getAccountName());
    System.out.println("Balance:"+b.getbalance());
	}

}
