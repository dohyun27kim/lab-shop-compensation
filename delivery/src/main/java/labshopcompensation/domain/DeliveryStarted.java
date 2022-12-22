package labshopcompensation.domain;

import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import java.util.*;
import lombok.*;


//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String address;
    private String customerId;
    private Integer quantity;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
//>>> DDD / Domain Event