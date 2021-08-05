package Chapter8;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet treeSet = new MemberTreeSet();
		
		treeSet.addMember(new Member("ฑ่มุ1"));
		treeSet.addMember(new Member("ฑ่มุ2"));
		treeSet.addMember(new Member("ฑ่มุ3"));
		treeSet.addMember(new Member("ฑ่มุ4"));
		treeSet.addMember(new Member("ฑ่มุ5"));
		treeSet.addMember(new Member("ฑ่มุ6"));
		treeSet.addMember(new Member("ฑ่มุ7"));
		
		treeSet.showAllMember();
		
		treeSet.removeMember(20210004);
		
		treeSet.showAllMember();

	}

}
