# insurance-company

Small Java project created for study purposes.

It models basic concepts related to insurance proposal emission, such as:

- A generic interface for insurable assets (`InsurableAsset`)
- Asset-specific logic for calculating insurance premiums
- Simple examples like ResidentialProperty, Truck, and InsuranceProposalService

---

## 🧱 What’s implemented

- Basic class structure in plain Java (no frameworks)
- Interface with two required methods: calculatePremium() and describe()
- Rules applied:
  - ResidentialProperty → 10% of market value + R$0.30 per m²
  - Truck → 2% of market value + R$50 per axle
- A service that prints a proposal for any InsurableAsset

---

## ⚠️ Notes

- This is not a complete system
- There’s no persistence, user input, or tests
- Just a study project made during my learning process

---

## 🛠️ Tech

- Java 17+

---

## 📄 License

Not licensed for real use. Educational only.
