package com.algaworks.insurance.service;

import com.algaworks.insurance.model.InsurableAsset;

public class InsuranceProposalService {

    public void issueProposal(InsurableAsset asset) {
        String description = asset.describe();
        double premium = asset.calculatePremium();

        System.out.println(description);
        System.out.printf("Prêmio: R$%.2f%n", premium);
    }
}
