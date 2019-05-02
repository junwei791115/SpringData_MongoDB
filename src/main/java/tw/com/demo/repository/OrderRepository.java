package tw.com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tw.com.demo.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Long> {
	Order findByOrderNo(String orderNo);
}
