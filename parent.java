package garima;

abstract class Parent {
	abstract void message();

}
class child1 extends Parent{
	void message() {
		System.out.println("This is the first subclass.");
	}
}
class child2 extends Parent{
	void message() {
		System.out.println("This is the second subclass.");
	}
}