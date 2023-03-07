package ru.project.service;

import ru.project.model.cart.Cart;
import ru.project.persist.Product;
import ru.project.persist.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
@RequiredArgsConstructor
public class CartService {

    private final Cart cart;
    private final ProductRepository productRepository;

    public void addProductToCart(Long id) {
        Product product = productRepository.findProductById(id);
        if (product == null) return;
        cart.add(product);
    }

    public void removeProductFromCart(Long productId) {
        Product product = productRepository.findProductById(productId);
        if (product == null) return;
        cart.remove(product);
    }

    public List<Product> getCartProducts() {
        return cart.getAllProducts();
    }

}
