package Chapter8;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member("������1"));
		list.addMember(new Member("������2"));
		list.addMember(new Member("������3"));
		list.addMember(new Member("������4"));
		list.addMember(new Member("������5"));
		list.addMember(new Member("������6"));
		list.addMember(new Member("������7"));
		list.addMember(new Member("������8"));
		list.addMember(new Member("������9"));
		
		list.showAllMember();
		
		System.out.println("<������ Member ����>");
		list.removeMember(20210010);
		
		list.showAllMember();
		
		list.modifyMember(20210004, "��ȣ");
		
		list.showAllMember();
	}

}
