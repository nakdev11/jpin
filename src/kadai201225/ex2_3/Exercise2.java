package kadai201225.ex2_3;

public class Exercise2 {

	public static void main(String[] args) {

		Partner aPartner = new Partner();
		aPartner.modifyPartnerInfo("1125", "中田", "東京都", "03-0000-2222");
		System.out.println(aPartner.getPartnerString());

		if (args.length == 4) {
			aPartner.modifyPartnerInfo(args[0], args[1], args[2], args[3]);
			System.out.println(aPartner.getPartnerString());
		}

	}

}
