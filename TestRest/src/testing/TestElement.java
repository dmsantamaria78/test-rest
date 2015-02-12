package testing;

public abstract class TestElement {
	
	abstract boolean runTest();
	
	abstract void addElement(TestElement e);
	
	abstract void delElement(TestElement e);
	
	abstract void getElement(int pos);

}
