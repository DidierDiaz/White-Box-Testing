# White-Box-Testing
In this project I have applied three white box techniques on the ATM system.

The focal points of this project is the withdrawal, the deposit, and the transfer operations.

Each of these operations has their own business logic for calculating banking fees for the given operation.

The business logic specification for calculating the fees for each of the given operations are provided:

**Withdrawal**

- If the client is a student and…

  o If the transaction is performed during the weekend, then there is no fee
  
  o Otherwise, the fee is 0.1% of the amount withdrawn

- If the client is not a student and…

  o If the balance of the account is less than $1,000, then the fee is 0.2% of the amount
withdrawn.

  o If, however, the balance is $1,000, or more, but less than $10,000, the fee is 0.1% of the
amount withdrawn.

  o If the balance is more than $10,000, then there is no fee
  
  
**Deposit**

- If the client is a student and…

  o If the amount withdrawn is more than $100 and…
  
    - If the balance of the account is more than $1,000, then the fee is 1% of the
amount withdrawn.
    - Otherwise, the fee is 0.5% of the amount withdrawn
  
  o If, however, the amount withdrawn is $100 or less and…
  
    - If the balance of the account is more than $5,000, then the fee is 0.5% of the
amount withdrawn.
    - Otherwise, there is no fee.

- If the client is not a student and…

  o If the amount withdrawn is more than $500 and…
  
    - If the balance of the account is more than $5,000, then the fee is 1% of the
amount withdrawn.

    - Otherwise, the fee is 0.5% of the amount withdrawn.
  
  o If, however, the amount withdrawn is $500 or less and…

    - If the balance of the account is more than $10,000, then the fee is 0.5% of the
amount withdrawn.

    - Otherwise, there is no fee
    
**Transfer**

- If the client is a student and…

  o If the amount withdrawn is less than $100 and…
  
    - If the balance of the account the money is coming from is less than $1,000 and…
    
      - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.1% of the amount withdrawn.

      - Otherwise, the fee is 0.05% of the amount withdrawn
      
   - If, however, the balance of the account the money is coming from is $1,000, or more and…
   
     - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.5% of the amount withdrawn.
  
     - Otherwise, the fee is 0.25% of the amount withdrawn.

  o If the amount withdrawn is $100, or more, and…
  
    - If the balance of the account the money is coming from is less than $1,000 and…
    
      - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.05% of the amount withdrawn.

      - Otherwise, the fee is 0.025% of the amount withdrawn.
    
    - If, however, the balance of the account the money is coming from is $1,000, or
more and…

      - If the balance of the account the money is going to is less than $1,000,
then the fee is 0.25% of the amount withdrawn

      - Otherwise, the fee is 0.125% of the amount withdrawn.
      
  - If the client is a not student and…
  
    o If the amount withdrawn is less than $100 and…
    
      - If the balance of the account the money is coming from is less than $1,000 and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 0.2% of the amount withdrawn.
        
        - Otherwise, the fee is 0.1% of the amount withdrawn.
        
      - If, however, the balance of the account the money is coming from is $1,000, or more and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 1% of the amount withdrawn.
        
        - Otherwise, the fee is 0.5% of the amount withdrawn.
        
    o If the amount withdrawn is $100, or more, and…
    
      - If the balance of the account the money is coming from is less than $1,000 and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 0.1% of the amount withdrawn.
        
        - Otherwise, the fee is 0.05% of the amount withdrawn.
        
      - If, however, the balance of the account the money is coming from is $1,000, or more and…
      
        - If the balance of the account the money is going to is less than $1,000, then the fee is 0.5% of the amount withdrawn.
        
        - Otherwise, the fee is 0.25% of the amount withdrawn
        
I have performed White box testing on the following class:
  
1) **Bank.FeesCalculator.java:** The focus here is to check for the correct calculation of fees while performing withdrawal, deposit, and transfer.

- For withdrawal: Compute the slice based on the criterion FinalUse(fee) (i.e the statement return(fee)), and develop test cases that perform statement coverage on the resulting set of the statements in the computed slice. For your analysis, you can ignore
the call to round function.

- For deposit: Compute the DU-Paths for the variable interestPercentage in the statement int interest = Math.round(amount * interestPercentage). For each such path create the test cases that perform statement coverage on the resulting set of the statements in each such DU-Path.

- For transfer: Compute and apply the test cases that result from basis path testing.

You can find 
