package POO_Java_I.PraticaIntegradora2;

import java.util.HashMap;

public class Challenge {
    private HashMap<Integer, Participant> participantsList = new HashMap<Integer, Participant>();
    private Integer counterId = 0;
    private HashMap<Integer, Subscription> subscriptionsList = new HashMap<Integer,Subscription>();


    private void incrementId() {
        counterId += 1;
    }

    public void createParticipant(String RG,String name,String lastName,int age,long mobile, long emergencyNumber, String bloodType) {
        Participant newParticipant = new Participant(RG, name, lastName, age, mobile,  emergencyNumber,  bloodType, counterId);
        participantsList.put(counterId, newParticipant);
        System.out.println(" foi criado o participante:"+ '\'' + participantsList.get(counterId) );
        incrementId();
    }

    public void createSubscription(Integer participantId, Category category) {
        int participantAge = participantsList.get(participantId).getAge();
        if (validateSubscription(participantId, participantAge, category)) {
            Subscription newSubscription = new Subscription(participantId, category,participantAge);
            subscriptionsList.put(participantId, newSubscription);
            System.out.println("A inscrição de "+ participantsList.get(participantId).getName() +
                    ", na categoria "+ category + " foi realizada com sucesso");
            System.out.println(subscriptionsList.get(participantId));
        } else {
            System.out.println("A inscrição não foi realizada");
        }
    }

    public void deleteSubscription(Integer participantId) {
        subscriptionsList.remove(participantId);
    }

    public void listCategoryParticipants(Category category) {
        subscriptionsList.forEach((participantId, subscription) -> {
            if (subscription.getCategory().equals(category)) {
                System.out.println(participantsList.get(participantId));
            }
        });
    }

    public void printParticipants() {
        participantsList.forEach(((integer, participant) -> System.out.println(participant)));
    }


    private boolean validateSubscription(Integer participantId, int participantAge, Category category) {
        boolean isValid = true;
        if (participantAge < 18 && category.equals(Category.ADVANCED)) {
            System.out.println("Não é permitido inscrever um participamente com menos de 18 anos na categoria avançada");
            isValid = false;
        }
        return isValid;
    }

    public void removeSubscription(Integer participantId) {

    }


}
