package com.foodordering.backend;

import com.foodordering.backend.model.Product;
import com.foodordering.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        if (productRepository.count() == 0) {
            List<Product> products = Arrays.asList(
                new Product("01", "Chicken Burger", 24.0, "/images/product_01.jpg", "/images/product_01.1.jpg", "/images/product_01.3.jpg", "Burger", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("02", "Vegetarian Pizza", 120.0, "/images/product_2.1.jpg", "/images/product_2.2.jpg", "/images/product_2.3.jpg", "Pizza", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("03", "Double Cheese Margherita", 110.0, "/images/product_3.1.jpg", "/images/product_3.2.jpg", "/images/product_3.3.jpg", "Pizza", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("04", "Maxican Green Wave", 110.0, "/images/product_4.1.jpg", "/images/product_4.2.jpg", "/images/product_4.3.png", "Pizza", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("05", "Cheese Burger", 24.0, "/images/product_04.jpg", "/images/product_08.jpg", "/images/product_09.jpg", "Burger", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("06", "Royal Cheese Burger", 24.0, "/images/product_01.jpg", "/images/product_01.1.jpg", "/images/product_01.3.jpg", "Burger", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("07", "Seafood Pizza", 115.0, "/images/product_2.2.jpg", "/images/product_2.1.jpg", "/images/product_2.3.jpg", "Pizza", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("08", "Thin Cheese Pizza", 110.0, "/images/product_3.2.jpg", "/images/product_3.1.jpg", "/images/product_3.3.jpg", "Pizza", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("09", "Pizza With Mushroom", 110.0, "/images/product_4.2.jpg", "/images/product_4.1.jpg", "/images/product_4.3.png", "Pizza", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("10", "Classic Hamburger", 24.0, "/images/product_05.jpg", "/images/product_05.1.jpg", "/images/product_05.3.jpg", "Burger", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("11", "Crunchy Bread", 35.0, "/images/bread(1).png", "/images/bread(2).png", "/images/bread(3).png", "Bread", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("12", "Veg Burger", 22.0, "/images/product_04.jpg", "/images/product_08.jpg", "/images/product_09.jpg", "Burger", "Healthy and tasty veg burger."),
                new Product("13", "Loaf Bread", 35.0, "/images/bread(3).png", "/images/bread(2).png", "/images/bread(3).png", "Bread", "Lorem ipsum dolor sit amet consectetur adipisicing elit."),
                new Product("14", "Sandwich", 45.0, "/images/bread(1).png", "/images/bread(2).png", "/images/bread(3).png", "Bread", "Delicious sandwich with fresh ingredients."),
                new Product("15", "Roti", 15.0, "/images/bread(2).png", "/images/bread(1).png", "/images/bread(3).png", "Bread", "Freshly baked Roti."),
                new Product("16", "Paneer Butter Masala", 150.0, "/images/product_2.1.jpg", "/images/product_2.2.jpg", "/images/product_2.3.jpg", "Pizza", "Rich and creamy Paneer Butter Masala."),
                new Product("17", "Fried Potatoes", 60.0, "/images/fried-potatoes.png", "/images/fried-potatoes.png", "/images/fried-potatoes.png", "Sides", "Crispy fried potatoes."),
                new Product("18", "Chicken Sandwich", 65.0, "/images/bread(2).png", "/images/bread(1).png", "/images/bread(3).png", "Bread", "Delicious chicken sandwich."),
                new Product("19", "Aloo Paratha", 18.0, "/images/bread(1).png", "/images/bread(2).png", "/images/bread(3).png", "Bread", "Stuffed paratha with spiced potatoes."),
                new Product("20", "BBQ Pizza", 130.0, "/images/product_3.1.jpg", "/images/product_3.2.jpg", "/images/product_3.3.jpg", "Pizza", "Smoky BBQ chicken pizza.")
            );

            productRepository.saveAll(products);
            System.out.println("Database seeded with initial products.");
        }
    }
}
