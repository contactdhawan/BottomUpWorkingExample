package sf.crom.dao;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class PaymentProcessResponse {
	Boolean result;

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
}
