package Chapter8;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		
		hashSet.addMember(new Member("ฑ่มุ1"));
		hashSet.addMember(new Member("ฑ่มุ2"));
		hashSet.addMember(new Member("ฑ่มุ3"));
		hashSet.addMember(new Member("ฑ่มุ4"));
		hashSet.addMember(new Member("ฑ่มุ5"));
		hashSet.addMember(new Member("ฑ่มุ6"));
		hashSet.addMember(new Member("ฑ่มุ7"));
		hashSet.addMember(new Member("ฑ่มุ8"));
		
		hashSet.showAllMember();
		
		hashSet.removeMember(20210006);
		
		hashSet.showAllMember();

	}

}
