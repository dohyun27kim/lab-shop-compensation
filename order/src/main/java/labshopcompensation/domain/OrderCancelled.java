package labshopcompensation.domain;

import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import java.util.*;
import lombok.*;


//<<< DDD / Domain Event
@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;

    public OrderCancelled(Order aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
//>>> DDD / Domain Event