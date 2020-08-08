import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TraineeMain {


    Map<String, Trainee> traineemap = new HashMap<String, Trainee>();
    Set<CStrainee> cStraineeSet = new HashSet<>();
    Set<ECETrainee> eceTrainees = new HashSet<>();

    public static void main(String[] args) {
        TraineeMain Traineedemo = new TraineeMain();
        Traineedemo.runApp();
    }

    public void runApp() {
        Trainee trainee1 = new CStrainee("1", "vineel", 2);
        Trainee trainee2 = new CStrainee("2", "rudrapati", 3);
        Trainee trainee3 = new ECETrainee("3", "leo", "diode");
        Trainee trainee4 = new ECETrainee("4", "dave", "PI");
        traineemap.put(trainee1.getId(), trainee1);
        traineemap.put(trainee2.getId(), trainee2);
        traineemap.put(trainee3.getId(), trainee3);
        traineemap.put(trainee4.getId(), trainee4);
        for (Trainee trainee : traineemap.values()) {
            Trainee typeTrainee = (Trainee) trainee;
            boolean iscse = typeTrainee instanceof CStrainee;
            if (iscse) {
                cStraineeSet.add((CStrainee) typeTrainee);
            } else {
                eceTrainees.add((ECETrainee) typeTrainee);
            }
        }
        System.out.println("DISPLAYING CSE TRAINEES");
        for(CStrainee csset:cStraineeSet)
        {
            String id=csset.getId();
            int language=csset.getLanguages();
            String name=csset.getName();
        System.out.println("The name="+name+" Id="+id+" Languages="+language);
        }

        System.out.println("DISPLAYING ECE TRAINEES");
        for(ECETrainee eceset:eceTrainees)
        {
            String id=eceset.getId();
            String devices=eceset.getDevices();
            String name=eceset.getName();
            System.out.println("The name="+name+" Id="+id+" devices="+devices);
        }

    }
}
