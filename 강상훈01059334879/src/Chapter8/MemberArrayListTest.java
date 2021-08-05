package Chapter8;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		list.addMember(new Member("±Ë¡ÿ¿œ1"));
		list.addMember(new Member("±Ë¡ÿ¿œ2"));
		list.addMember(new Member("±Ë¡ÿ¿œ3"));
		list.addMember(new Member("±Ë¡ÿ¿œ4"));
		list.addMember(new Member("±Ë¡ÿ¿œ5"));
		list.addMember(new Member("±Ë¡ÿ¿œ6"));
		list.addMember(new Member("±Ë¡ÿ¿œ7"));
		list.addMember(new Member("±Ë¡ÿ¿œ8"));
		list.addMember(new Member("±Ë¡ÿ¿œ9"));
		
		list.showAllMember();
		
		System.out.println("<ªË¡¶«— Member ¡§∫∏>");
		list.removeMember(20210010);
		
		list.showAllMember();
		
		list.modifyMember(20210004, "±Ë»£");
		
		list.showAllMember();
	}

}
