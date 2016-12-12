package sf.crom.services;

import sf.crom.dao.PaymentProcessRequest;

import sf.crom.dao.PaymentProcessResponse;

public class PaymentProcessImpl implements PaymentProcess {

	public PaymentProcessResponse processPayment(PaymentProcessRequest request) {
		// TODO Auto-generated method stub
		PaymentProcessResponse response = new PaymentProcessResponse();
		response.setResult(false);
		return response;
	}

}
