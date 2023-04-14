package javaassigment;

public class armstrong {
	public static void main(String[] args) {

        int number = 245, firstNumber, remainder, result = 0;

        firstNumber = number;

        while (firstNumber != 0)
        {
            remainder = firstNumber % 10;
            
            result += Math.pow(remainder, 3);
            
            firstNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
// In numerical number theory, the Armstrong number is 
//the number in any given number base, 
//which forms the total of the same number,
//when each of its digits is raised to the power
//of the number of digits in the number.