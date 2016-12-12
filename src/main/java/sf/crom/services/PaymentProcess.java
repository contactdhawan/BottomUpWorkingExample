package sf.crom.services;

import javax.jws.WebService;

import sf.crom.dao.PaymentProcessRequest;
import sf.crom.dao.PaymentProcessResponse;

@WebService
public interface PaymentProcess {

	public PaymentProcessResponse processPayment(PaymentProcessRequest request);
}
