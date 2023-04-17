public class Projects_5 {

	public static void main(String[] args) {

		int a = 5;  // give a value to the variable (a)
		int b = a;  // give the variable (b) the value of (a)

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = 3;
		b = 4;

		int c = a + b; // c = 3 + 4 = 7

		System.out.println("c = " + c);
		// Unary-Plus
		a = 10;
		b = +a;  // b = +(10) = 10
		
		System.out.println("b = " + b);
		// Unary-Plus
		a = -10;
		b = +a;  // b = +(-10) = -10

		System.out.println("b = " + b);

		// Unary-Minus
		int d = 10;
		int e = -d;  // e = -(10) = -10

		System.out.println("e = " + e);

		//Unart-Minus
		d = -10;
		e = -d;  // e = -(-10) = 10

		System.out.println("e = " + e);
		
		// Increment Operator
		int f = 5;
		
		f++;  // f = 5 + 1 = 6

		System.out.println("f = " + f);

		// Decrement Operator
		int g = 5;

		g--;  // g = 5 - 1 = 4

		System.out.println("g = " + g);

		// (a == b) is a equal to b  -> if thay are equal return true, if not equal return false
		// (a != b) is a doesn't equal to b  -> if thay are equal return false, if not equal return true
		// (a > b), (a < b), (a >= b), (a <= b)
		
		// AND Operator -> && 
		// For example: (a && b)
		
		// OR Operator -> ||
		// For example: (a || b)
		
		// NOT Operator -> !
		// For example: !a  -> if a equal to true that mean !a equal to false, if a equal to false that mean !a true

		// Bitwise Operators
		// Bitwise AND -> &
		// For example: a & b (Count the common bits in (a) and (b))
		
		// Bitwise OR -> |
		// For example: a | b (Count the common and not common bits in (a) and (b))

		// Bitwise XOR -> ^
		// For example: a ^ b (Count the bits that aren't common in (a) and (b))

		// Bitwise Compliment OR
		// For example: ~a (The ~ operator convert the bits of 0 to 1 and the bits of 1 to 0, then it adds 1 to the bits andcalculates thir sum, then Multiplies the result by the factor (-) and then gives us a negative result.)

		// Left Shift -> <<
		// For example: a << 2 (Move the last 2 bits on the left to the beginning of the right)
		
		// Right Shift -> >>
		// For example: a >> 2 (Move the first 2 bits on the right to the end of the left)

		// Zero fill right shift -> >>>
		//For example: a >>> 2(Move the first 2 bits on the right to the end of the left, then convert these 2 bits to zeros)

		// Assignment Operators
		// Basic Assignment -> =
		// For example: a = b (Give a the value b)
		
		// Add AND Assignment -> +=
		// For example: a += b (Add a to b then store the result in a)
		
		// Subtract AND Assignment -> -=
		// For example: a -= b (Subtract b from a then store the result in a)
		
		// Multiply AND Assignment -> *=
		// For example: a *= b (Multiply a by b then store the result in a)

		//Divide AND Assignment -> /=
		//For example: a /= b (Divide a by b then store the result in a)

		// Modulo AND Assignment -> %=
		// For example: a %= b (Do a Mod b then store the result in a)

		// Left shift AND Assignment -> <<=
		// For example: a <<= 2 (Move the last 2 bits on the left to the beginning of the right, then store the result in a)

		// Right shift AND Assignment -> >>=
		// For example: a >>= 2 (Move the first 2 bits on the right to the end of the left, then store the result in a)

		// Bitwise(AND) AND Assignment -> &
		// For example: a &= b (Count the common bits in (a) and (b), then store the result in (a))
		
		// Bitwise exclusive OR and Assignment -> ^=
		// For example: a ^= b (Count the bits that aren't common in (a) and (b), then store the result in (a))

		// Bitwise Inexclusive -> |
		// For example: a |= b (Count the common and not common bits in (a) and (b), then store the result in (a))
		
		// Conditional(Also called Ternary Operator because it takes three elements to works) -> :?
		// It can be used in (if) and (else) statements when you want to give a value to a variable

		// Instance Of -> instanceof
		// Used to check if the Object is copy of class or not

	}

}
