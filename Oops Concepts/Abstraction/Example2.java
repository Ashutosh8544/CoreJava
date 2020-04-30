public abstract class Example2		// CE: modifier static not allowed here
//	protected abstract Example3{}	// CE :  class, interface, or enum expected
//private abstract Exaample4()	// CED: class, interface, or enum expected
{
	abstract int as();
	public abstract void m1();
	protected abstract void m2();
//	private abstract void m3();	// CE:  illegal combination of modifiers: abstract and private
//	static abstract void m4();	//  illegal combination of modifiers: abstract and static
//	native abstract void m5();	// CE: illegal combination of modifiers: abstract and native
//	abstract abstract void m6();	//CE: repeated modifier
//	final abstract void m7();	//CE: illegal combination of modifiers: abstract and final
//	strictfp abstract void m8();	// CE: illegal combination of modifiers: abstract and strictfp
//	synchronized abstract void m9();	// CE: illegal combination of modifiers: abstract and synchronized
//	transient abstract void m10();	// CE: modifier transient not allowed here.
}
