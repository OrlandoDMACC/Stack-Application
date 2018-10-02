package stack;

//Orlando Winters
class postfix 
{ 
 // A utility function to return precedence of a given operator 
 // Higher returned value means higher precedence 
 static int Prec(char ch) 
 { 
     switch (ch) 
     { 
     case '+': 
     case '-': 
         return 1; 
    
     case '*': 
     case '/': 
         return 2; 
    
     case '^': 
         return 3; 
     } 
     return -1; 
 } 
    
 // The main method that converts given infix expression 
 // to postfix expression.  
 static String infixToPostfix(String exp) 
 { 
     // initializing empty String for result 
     String result = new String(""); 
       
     // initializing empty stack 
     ArrayStack stack = new ArrayStack(32);
       
     for (int i = 0; i<exp.length(); ++i) 
     { 
         char c = exp.charAt(i); 
           
          // If the scanned character is an operand, add it to output. 
         if (Character.isLetterOrDigit(c)) 
             result += c; 
            
         // If the scanned character is an '(', push it to the stack. 
         else if (c == '(') 
             stack.push(c); 
           
         //  If the scanned character is an ')', pop and output from the stack  
         // until an '(' is encountered. 
         else if (c == ')') 
         { 
             while (!stack.isEmpty() && stack.top() != '(') 
                 result += stack.pop(); 
               
             if (!stack.isEmpty() && stack.top() != '(') 
                 return "Invalid Expression"; // invalid expression                 
             else
                 stack.pop(); 
         } 
         else // an operator is encountered 
         { 
             while (!stack.isEmpty() && Prec(c) <= Prec(stack.top())) 
                 result += stack.pop(); 
             stack.push(c); 
         } 
    
     } 
    
     // pop all the operators from the stack 
     while (!stack.isEmpty()) 
         result += stack.pop(); 
    
     return result; 
 } 
 
 // Driver method  
 public static void main(String[] args)  
 { 
     String infix = "(1+2)*7"; 
     String postfix = infixToPostfix(infix);
     System.out.println("infix: " + infix);
     System.out.println("postfix: " + postfix); 
 } 
} 
