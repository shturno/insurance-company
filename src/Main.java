import com.algaworks.insurance.model.PrivateCar;
import com.algaworks.insurance.model.ResidentialProperty;
import com.algaworks.insurance.model.Truck;
import com.algaworks.insurance.service.InsuranceProposalService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InsuranceProposalService insuranceProposalService = new InsuranceProposalService();

        PrivateCar car = new PrivateCar("HR-V", 150000, 2002);
        Truck truck = new Truck("Actros", 200000, 2021, 4);
        ResidentialProperty property = new ResidentialProperty(2_300_000, 100);

        insuranceProposalService.issueProposal(car);
        insuranceProposalService.issueProposal(truck);
        insuranceProposalService.issueProposal(property);
    }
}