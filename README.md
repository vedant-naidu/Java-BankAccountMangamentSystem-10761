# 🏦 Bank Account Management System

A Java-based console application built using **Object-Oriented Programming (OOP)** principles to simulate core banking operations — securely and efficiently.

> 📘 **Academic Project** | BTech CSE AI-ML with Google | Rungta International Skills University, Bhilai CG | Session 2025–26  
> 👨‍💻 **Author:** M Vedant Naidu (ERP No.: RU-25-10761)  
> 🎓 **Guide:** Mr. Soumik Karmakar

---

## 📌 About the Project

The **Bank Account Management System** is a menu-driven Java application that replicates essential banking operations such as depositing funds, withdrawing money, and viewing account balance. It is designed with a strong focus on **data security**, **input validation**, and clean **OOP architecture**.

The system ensures the account balance remains private and is accessible only through controlled public methods — demonstrating real-world encapsulation in practice.

---

## ✨ Features

- 💰 **Deposit** — Add money to the account with input validation
- 💸 **Withdrawal** — Withdraw funds with balance and validity checks
- 📊 **Balance Inquiry** — View current account balance at any time
- 🧾 **Bank Statement** — View total deposited and withdrawn amounts
- 🔒 **Secure Data Handling** — Private balance field accessible only through methods
- 🔁 **Menu-Driven Loop** — Continuous interaction until user opts to exit

---

## 🧠 OOP Concepts Used

| Concept | Implementation |
|---|---|
| **Encapsulation** | `balance` is a `private` field; accessed only via public methods |
| **Data Hiding** | Direct manipulation of balance is prevented from outside the class |
| **Classes & Objects** | `BankAccount` class instantiated as an object in `BankManagement` |
| **Constructors** | Used to initialize account state |
| **Method Design** | `deposit()`, `withdraw()`, `getBalance()` handle all operations |
| **Input Validation** | Prevents negative deposits and overdrafts |

---

## 🖥️ System Requirements

**Hardware:**
- Computer with minimum **4 GB RAM**

**Software:**
- **Java JDK** (8 or above recommended)
- IDE: **VS Code**, **Eclipse**, or **IntelliJ IDEA**
- Or simply use the **command line / terminal**

---

## 📁 Project Structure

```
BankManagementSystem/
│
├── BankAccount.java        # Core class — handles account balance & operations
├── BankManagement.java     # Main class — menu-driven interface & entry point
└── README.md
```

---

## 🏗️ Class Design

### `BankAccount`
Responsible for all account-level operations.

```java
class BankAccount {
    private double balance;          // Private — data hiding

    BankAccount(double initialBalance) { ... }  // Constructor

    void deposit(double amount) { ... }          // Validates & adds amount
    void withdraw(double amount) { ... }         // Validates & deducts amount
    double getBalance() { ... }                  // Returns current balance
}
```

### `BankManagement`
Acts as the entry point and user interface.

```java
class BankManagement {
    public static void main(String[] args) {
        // Creates BankAccount object
        // Displays menu in a loop
        // Calls appropriate methods based on user choice
    }
}
```

---

## ▶️ How to Run

**Step 1 — Clone the repository**
```bash
git clone https://github.com/your-username/bank-management-system.git
cd bank-management-system
```

**Step 2 — Compile the Java files**
```bash
javac BankAccount.java BankManagement.java
```

**Step 3 — Run the program**
```bash
java BankManagement
```

---

## 🖨️ Sample Output

```
===== Bank Account Management System =====
1. Deposit
2. Withdraw
3. View Balance
4. Bank Statement
5. Exit

Enter your choice: 1
Enter amount to deposit: 5000
✔ ₹5000.0 deposited successfully.
Current Balance: ₹5000.0

Enter your choice: 2
Enter amount to withdraw: 1500
✔ ₹1500.0 withdrawn successfully.
Current Balance: ₹3500.0

Enter your choice: 2
Enter amount to withdraw: 9000
✘ Insufficient balance!

Enter your choice: 5
Thank you for using the Bank Management System. Goodbye!
```

---

## 🔮 Future Enhancements

- [ ] Support for **multiple user accounts**
- [ ] Persistent **transaction history** log
- [ ] **Database integration** (MySQL / SQLite)
- [ ] **GUI interface** using Java Swing or JavaFX
- [ ] **PIN-based authentication** for secure login
- [ ] **Interest calculation** and account types (Savings, Current)

---

## 📚 References

- [Java Official Documentation](https://docs.oracle.com/en/java/)
- Core Java Volume I — Fundamentals by Cay S. Horstmann
- Academic course notes — Object Oriented Programming with Java (RU-100-01-00012)

---

## 📄 License

This project was developed as part of an academic submission at **Rungta International Skills University, Bhilai CG** for the course *Object Oriented Programming with Java* (Session 2025–26). It is intended for educational purposes only.

---

<p align="center">Made with ☕ Java & 💡 OOP by <b>M Vedant Naidu</b></p>
