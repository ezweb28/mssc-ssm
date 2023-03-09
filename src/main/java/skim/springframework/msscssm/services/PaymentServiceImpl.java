package skim.springframework.msscssm.services;

import lombok.RequiredArgsConstructor;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;
import skim.springframework.msscssm.domain.Payment;
import skim.springframework.msscssm.domain.PaymentEvent;
import skim.springframework.msscssm.domain.PaymentState;
import skim.springframework.msscssm.repository.PaymentRepository;

@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;

    @Override
    public Payment newPayment(Payment payment) {
        payment.setPaymentState(PaymentState.NEW);
        return paymentRepository.save(payment);
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId) {
        return null;
    }
}
