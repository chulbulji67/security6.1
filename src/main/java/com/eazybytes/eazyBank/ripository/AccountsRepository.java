package com.eazybytes.eazyBank.ripository;

import com.eazybytes.eazyBank.model.Accounts;
import com.eazybytes.eazyBank.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
