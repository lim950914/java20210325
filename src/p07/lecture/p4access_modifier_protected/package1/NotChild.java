package p07.lecture.p4access_modifier_protected.package1;

public class NotChild {
	public void botChildMethod() {
		Parent p = new Parent();
		p.pubicMethod();
		p.protectedMethod();
		p.defaultMethod();
//		p.privateMethod();
	}
}
