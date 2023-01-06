Q.1)minumm and maximum program
class MinAndMax{
public static void main(String args[]){
int arr[]=[45,333,76,29,900,23,474,654,29,454];
        int minimum=a[0];
		int maximum=a[0];
		
		for(int index=1;index<a.length;index++) {
			if(a[index]>maximum) {
				maximum=a[index];
				
			}
			else if(a[index]<minimum) {
				minimum=a[index];
				
			}
		}
		System.out.println("The maximum number is "+ maximum);
		System.out.println("The minimum number is "+ minimum);
	}
	//public static void main(String args[]) {
		//int a[]= {34,56,78,89,108,566,4};
		 //findLargestAndSmallestNumber(a);
}
}

Q.2)
Ans:public class TestQuestion1{
	public static void main(String args[]){
		int petalNum;
		Scanner sc=new Scanner(System.in);
		int petalNumber=sc.nextInt();
		if(petalNumber %2==0){
			System.out.println("Both are in love");
			
			
		}else{
			System.out.println("Both are in not love");
		}
		
	}
}

Q.3)what are the generlised and specilised classes in java?`
Ans:*Generalised class is super classes,
    *Specialised classes is sub classes.

q.4)a.i dont want my class to be inherited by any other class.what should i do?
 Ans:By making a class constructor as a private .if we make class constructor private we will not able to create the object of this class from outside of this class.
 
    B.can you give a few examples of final classes defined in hava API?
 Ans:java.lang.String, java.lang.Math are the final classes.

    C.what are some alternatives to inheritance?
 Ans:*Deligation is an alternative.it is to inheritance.
     *delegation means that you include an instance of another class as an instance variable And forward msgs to a instance .
     *it is often safer than inheritance beacuse it forces you to think about each msg you forward,
       bcs the instance is of an known class,rather than a new class, and bcs it does'nt force you accept all the methods of the super class:
       you can provide onl=y the methods that really make sense.on the opther hand it makes you write more code,it harder to reuse.
 
 Q.5)which sorted collection have you used?
Ans: *To sort a list :use list and use collection.sort(),
     *To make sure elements in the list are unique and always sorted:use a SortedSet().

Q.6)Difference between LinkedList ArrayList?
Ans: LinkedList:
      *Dynamic in size.
	  *linkedList are not sorted in  contiquous  location..
	  *memory is allocated at runtime.
	  *uses more memory because its stores both data and address of next node.
	  *elements accessing  is requires thetraversed of the whole linkedlist.
      *insertion and deletion is fast.	  
     ArrayList:
      *fixed size
      *memory is allocated in compile time.
      *arrays are sorted in contiquous  location.
      *use less memory than linkedlist.
      *elements can be accessed easily.
      *insertion and deletion takes time.
Q.7)what is the difference between listIterator and Iterator in java?
Ans:ListIterator:
     *it to traverse list only,we cannot traverse Set using Listiterator.
	 *using this we can traverse the both the direction like forward and backword.
	 *we can add or remove elements at any point of time while traversing  a list using listiterator.
	 *we can add a new element to any position in the collection by using add(E e)me5hod.
	Iterator:
     *it is used for traversing list and Set.
     *we can traverse in only forward direction using iterator.
     *we cannot obtainindexing while using iterator.
     *we canot replace the existing element value when using iterator.	
Q.8)what is covariant method overriding in java?
Ans:The covariant method oerrideing is helps to remove the client-side typecasting
    by enabling you to return a subtype of the overriding methodactual return type.
    it when overriding a method in the child class,the return type may vary.
	
Q.9)what is memory leakage in java?
Ans:A memory leakage is a where there are objects present in the heap that are no longer used,
    but the garbage collector is unable to remove them from memory,and therefore,they're unnecessarily maintained.
    A memory leak is bad bcz it blocks memory resources and degrades system performance over time.

Q.10)Explain static polymorphism and dynamic polymorphism?	
Ans:static Polymorphism:
    *it is a type of polymorphism that collects the information to call a method during compile time.
    Dynamic polymorphism:
    *it is a type of polymorphism that collects the information to call a method At run time.	
	
Q.11)Hema created a class called personal information and she want to give security for the properties how can she achieve.?
Ans:Encapsulation.	
	
	 
    	 
