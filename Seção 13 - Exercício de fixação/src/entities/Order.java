package entities;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	public static DecimalFormat NUMBERFORMATTER = new DecimalFormat("R$###,###.00");
	
	private LocalDateTime moment;
	private Client client;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	public Order(Client client, OrderStatus status) {
		this.client = client;
		moment = LocalDateTime.now();
		this.status = status;
	}
	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: ");
		sb.append(moment.format(FORMATTER) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrderItem item : items) {
			sb.append(item.toString() + "\n");
		}
		sb.append("Total Price: ");
		sb.append(NUMBERFORMATTER.format(total()));
		
		return sb.toString();
	}
	
	
}
