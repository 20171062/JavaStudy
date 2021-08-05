package Chapter8;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap tm = new MemberTreeMap();
		
		tm.addMember(new Member("ฑ่มุ1"));
		tm.addMember(new Member("ฑ่มุ2"));
		tm.addMember(new Member("ฑ่มุ3"));
		tm.addMember(new Member("ฑ่มุ4"));
		tm.addMember(new Member("ฑ่มุ5"));
		tm.addMember(new Member("ฑ่มุ6"));
		
		tm.showAllMember();
		
		tm.removeMember(20210005);
		
		tm.showAllMember();

	}

}
