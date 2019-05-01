package tw.com.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tw.com.demo.entity.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, Long>{
	List<Item> findAll();
}
