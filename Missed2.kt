// banking system
fun main() {
    var balance = 1000

    while (true) {
        println("Your current balance is: $balance")
        print("Enter the amount you want to withdraw: ")
        val amount = readLine()?.toIntOrNull()

        if (amount == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        if (amount > balance) {
            println("Insufficient funds.")
        } else {
            balance -= amount
            println("Withdrawal successful! New balance: $balance")
        }

        print("Do you want to make another withdrawal? (yes/no): ")
        val response = readLine()?.lowercase()

        if (response != "yes") {
            println("Thank you!")
            break
        }
    }
}
