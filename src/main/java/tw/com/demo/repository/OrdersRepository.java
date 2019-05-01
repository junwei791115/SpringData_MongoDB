package tw.com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tw.com.demo.entity.Orders;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, Long> {
	Orders findByItem(String item);
}
