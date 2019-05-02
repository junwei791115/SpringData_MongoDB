package tw.com.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.com.demo.entity.Item;
import tw.com.demo.entity.Order;
import tw.com.demo.repository.ItemRepository;
import tw.com.demo.repository.OrderRepository;



@Controller
public class WelcomeController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ItemRepository itemRepository;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		Order order = orderRepository.findByOrderNo("O001");
		System.out.println("price:"+order.getPrice());
		List<Item> items = itemRepository.findAll();
		for (Item item : items) {
			System.out.println("Item name :" + item.getItemName() + ", price :"+ item.getPrice());
		}
		return "welcome";
	}

}