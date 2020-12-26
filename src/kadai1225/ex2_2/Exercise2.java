package kadai1225.ex2_2;

public class Exercise2 {

	public static void main(String[] args) {

		Partner aPartner = new Partner();
		aPartner.modifyPartnerInfo(args[0], args[1], args[2], args[3]);
		System.out.println(aPartner.getPartnerString());

	}

}
