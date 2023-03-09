package skim.springframework.msscssm.services;

import org.springframework.statemachine.StateMachine;
import skim.springframework.msscssm.domain.Payment;
import skim.springframework.msscssm.domain.PaymentEvent;
import skim.springframework.msscssm.domain.PaymentState;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
