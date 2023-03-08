package skim.springframework.msscssm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import skim.springframework.msscssm.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
