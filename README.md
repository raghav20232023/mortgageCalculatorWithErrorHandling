# mortgageCalculatorWithErrorHandling
It is a mortgage calculator with built in error handling. It is implemented using Java and has a command line terminal interface.

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/67b38ec6-6b4d-4910-875c-71cefd7976df)

the above statements creates a package com.example and imports two classes 
1. java.text.NumberFormat :- this class import is used later in the program to format the final obtained answer as a currency instance
   for better presentability of big numbers
2. java.util.Scanner :- this class import is used to create scanner object to take input values from the user

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/0baf3e80-abc2-43c7-a11f-b689cab77d5b)

creates a public class mortgageCalculatorWithErrorHandling. The name is self explanatory

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/bdf9b80f-68d7-4629-a1ee-4dcd5702f93c)

constants that are used later on are defined with self explanatory variable names so that no magic numbers appear later in the code

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/c6367218-3993-4ddc-b3e1-a26935472ffc)

variable definitions are defined outside loop scope so that they are accessible throughout the program

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/0ea36279-334f-4045-b929-9e38c0b46433)

creates a scanner object "scanner" using Scanner to take input from the user

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/eb294f9b-6583-4253-8ea3-382afc8ffa48)

this code block is used to take input from the user for the parameter principal 
it implements error handling with the help of while loop i.e.
if the value of principal is between 1,000 and 1,000,000 then only the control breaks out
of the while loop scope and the program proceeds further else a prompt is displayed to the user 
to enter the correct value between specified range. until this condition is met, the while loop 
keeps on executing and prompt is given again and again till the user enters value between specified range

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/f6e7deee-17b7-42b1-8e35-a7a635037216)

similar to above but just with reference to the parameter annual interest rate

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/da20ddb9-e8e6-4957-b851-441f35f5a402)

similar to above but just with reference to the parameter period (in years)

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/8cf4999f-5d5b-4530-a3de-8c3a986afaa5)

above is the code snippet of implementation of formula that is used to find the monthly payment i.e. the mortgage
this formula takes the parameters principal, annual interest rate (program converts this to monthly interest rate), and 
number of payments required to pay-off the complete mortgage to calculate the monthly payment
this formula can be found on the wikihow page of how to calculate mortgage :- https://www.wikihow.com/Calculate-Mortgage-Payments

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/676a5445-60fc-4705-8c1b-7a1ac4b1e51d)

![image](https://github.com/raghav20232023/mortgageCalculatorWithErrorHandling/assets/153320363/742938d6-3a54-4ee4-87b4-e91e82ec1799)

finally the above code snippet is used to format the answer obtained by the formula (monthly payment) into a currency instance by separating
every 3 digits to make the final number obtained more presentable
it is then printed to the terminal 

end





   

