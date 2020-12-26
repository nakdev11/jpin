package kadai1225.ex2_1;

public class Partner {

	String number;
	String name;
	String address;
	String tel;

	void modifyPartnerInfo(String paramNumber,
			String paramName,
			String paramAddress,
			String paramTel) {
		this.number = paramNumber;
		this.name = paramName;
		this.address = paramAddress;
		this.tel = paramTel;
	}

	String getPartnerString() {
		return "会員番号:" + this.number +
				" 氏名:" + this.name +
				" 住所:" + this.address +
				" 電話番号:" + this.tel;
	}

}
