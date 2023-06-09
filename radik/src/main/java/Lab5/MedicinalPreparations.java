/*package Lab5;

import java.util.List;

public abstract class MedicinalPreparations implements Opportunities {
    String name;
    int concentration;
    Status statusSubstance;

    MedicinalPreparations() {
    }

    MedicinalPreparations(String name, int concentration, Status statusSubstance) {
        this.name = name;
        this.concentration = concentration;
        this.statusSubstance = statusSubstance;
    }

    @Override
    public MedicinalPreparations addMedicinalPreparations(List<Opportunities> substance) {
        
       substance.concentration = concentration;
        switch (statusSubstance){
            case 1:
             substance.statusSubstance = Status.FORBIDDEN;
               break;
            case 2:
               substance.statusSubstance = Status.BY_PRESCRIPTION;
                break;
            case 3:
              substance.statusSubstance = Status.ALLOWED;
                break;
        }
        return substance;
    }

    @Override
    public int calculateDosage(MedicinalPreparations substance,int weightBody) {
        int dosage = weightBody * substance.concentration;
        return dosage;
    }

    @Override
    public MedicinalPreparations changeStatus(MedicinalPreparations substance,int choice) {
        switch (choice){
            case 1:
                substance.statusSubstance = Status.BY_PRESCRIPTION;
                break;
            case 2:
                substance.statusSubstance = Status.ALLOWED;
                break;
            case 3:
                substance.statusSubstance = Status.FORBIDDEN;
                break;
        }
        return substance;
    }

    @Override
    public MedicinalPreparations changeInformation(MedicinalPreparations substance,String name,int concentration,int statusSubstance) {
        substance.name = name;
        substance.concentration = concentration;
        switch (statusSubstance){
            case 1:
                substance.statusSubstance = Status.FORBIDDEN;
                break;
            case 2:
                substance.statusSubstance = Status.BY_PRESCRIPTION;
                break;
            case 3:
                substance.statusSubstance = Status.ALLOWED;
                break;
        }
        return substance;
    }

    @Override
    public void toString(MedicinalPreparations substance) {
        System.out.println("Назввание: " + substance.name);
        System.out.println("Концентраиция: " + substance.concentration);
        System.out.println("Статсу вещества: " + substance.statusSubstance);
    }
    public static void setAllMedicinalsPreparationOnNumbers(List<Opportunities> substance) {
        int i = 1;
        System.out.println("===============================");
        for (Opportunities strArr : substance) {
            System.out.println(i + " -  Медецинский препарарат");
            strArr.toString((MedicinalPreparations) strArr);
            i += 1;
        }
        System.out.println("===============================");
        System.out.println();
    }
    @Override
    public MedicinalPreparations choiseMedicinalPreparations(List<Opportunities> arrayMedicinalPreparations, int numberPreparation) {
        Opportunities rightSubstance = arrayMedicinalPreparations.get(1);
        int i = 1;
        for (Opportunities substance : arrayMedicinalPreparations) {
            if (i == numberPreparation) {
                rightSubstance = substance;
            }
            i++;
        }
        return (MedicinalPreparations) rightSubstance;
    }
}*/