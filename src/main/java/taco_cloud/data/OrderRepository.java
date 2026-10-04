package taco_cloud.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import taco_cloud.TacoOrder;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);
}
