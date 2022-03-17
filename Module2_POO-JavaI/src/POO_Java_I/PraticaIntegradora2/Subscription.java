package POO_Java_I.PraticaIntegradora2;

import java.math.BigDecimal;

public class Subscription {
    private Integer participantId;
    private Category category;
    private BigDecimal price;

    public Subscription (Integer participantId, Category category, int participantAge) {
        this.category = category;
        this.participantId = participantId;
        setPrice(participantAge, category);
    }

    public void setPrice(int participantAge, Category category) {
        switch (category) {
            case SMALL:
                if (participantAge < 18) {
                    price = new BigDecimal("1300.00");
                } else {
                    price = new BigDecimal("1500.00");
                }
                break;
            case MEDIUM:
                if (participantAge < 18) {
                    price = new BigDecimal("2000.00");
                } else {
                    price = new BigDecimal("2300.00");
                }
                break;
            default:
                price = new BigDecimal("2800.00");
                break;
        }
    }

    public boolean isConteined(Integer participantId) {
        return this.participantId.equals(participantId);
    }

    public void setParticipantId(Integer participantId) {
        this.participantId = participantId;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return  "participantId=" + participantId +
                ", category=" + category +
                ", price=" + price ;
    }
}
