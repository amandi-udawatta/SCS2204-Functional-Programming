class Account(initialBalance: Double) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
    } else {
      throw new IllegalArgumentException("Deposit amount must be positive")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
    } else {
      throw new IllegalArgumentException("Invalid withdrawal amount")
    }
  }

  def transfer(amount: Double, targetAccount: Account): Unit = {
    withdraw(amount)
    targetAccount.deposit(amount)
  }

  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05 // Deposit interest
    } else {
      balance += balance * 0.1 // Overdraft interest
    }
  }

  def getBalance: Double = balance
}

object Bank {
  def accountsWithNegativeBalances(accounts: List[Account]): List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def totalBalance(accounts: List[Account]): Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAccounts(accounts: List[Account]): Unit = {
    accounts.foreach(_.applyInterest())
  }

  def main(args: Array[String]): Unit = {
    val account1 = new Account(1000)
    val account2 = new Account(-500)
    val account3 = new Account(200)
    val account4 = new Account(-300)

    val bankAccounts = List(account1, account2, account3, account4)

    println("Accounts with negative balances:")
    val negativeBalances = accountsWithNegativeBalances(bankAccounts)
    negativeBalances.foreach(account => println(s"Account balance: ${account.getBalance}"))

    val totalBalances = totalBalance(bankAccounts)
    println(s"Total balance of all accounts: $totalBalances")

    applyInterestToAccounts(bankAccounts)
    println("Accounts after applying interest:")
    bankAccounts.foreach(account => println(s"Account balance: ${account.getBalance}"))
  }
}
