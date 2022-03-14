package Module2.PraticaIntegradora2;

public class Participant {
    private String RG;
    private String name;
    private String lastName;
    private int age;
    private long mobile;
    private long emergencyNumber;
    private String bloodType;
    private Integer participantId;

    public Participant (String RG,String name,String lastName,int age,long mobile, long emergencyNumber, String bloodType, Integer participantId) {
        this.RG = RG;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.mobile = mobile;
        this.emergencyNumber = emergencyNumber;
        this.bloodType = bloodType;
        this.participantId = participantId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "id:" + participantId +
                ", name:" + name +
                " " + lastName +
                ", idade:" + age +
                ", telefone:" + mobile +
                ", RG:" + RG +
                ", número para emergência:" + emergencyNumber +
                ", tipo sanguíneo:'" + bloodType;
    }

    public int getAge() {
        return age;
    }
}
