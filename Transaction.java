class Transaction
{
	int withdrawamt=8000,depositeamt=2000,balanceamt=20000;
	public void withdraw()
	{
		balanceamt=balanceamt-withdrawamt;
		System.out.println("After Withraw= "+balanceamt);
	}
	public void deposite()
	{
		balanceamt=balanceamt+depositeamt;
		System.out.println("After Deposite= "+balanceamt);
	}
}