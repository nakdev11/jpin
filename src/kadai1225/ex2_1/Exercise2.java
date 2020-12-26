package kadai1225.ex2_1;

public class Exercise2 {

	public static void main(String[] args) {

		Partner aPartner = new Partner();
		aPartner.modifyPartnerInfo("1125", "中田", "東京都", "03-0000-2222");
		System.out.println(aPartner.getPartnerString());

	}

}
