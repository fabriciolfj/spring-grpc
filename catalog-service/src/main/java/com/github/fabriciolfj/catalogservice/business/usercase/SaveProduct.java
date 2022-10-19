package com.github.fabriciolfj.catalogservice.business.usercase;

import com.github.fabriciolfj.catalogservice.business.ProviderFindReview;
import com.github.fabriciolfj.catalogservice.business.ProviderSaveProduct;
import com.github.fabriciolfj.catalogservice.entities.Product;
import com.github.fabriciolfj.catalogservice.exception.ProductSaveException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.util.Optional.of;

@Service
@RequiredArgsConstructor
@Slf4j
public class SaveProduct {

    private final ProviderSaveProduct saveProduct;

    public void execute(final Product product) {
        log.info("Product received {}, size views {}", product.getCode(), product.getReviews().size());
        saveProduct.process(product);
    }
}
