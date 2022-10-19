package com.github.fabriciolfj.catalogservice.business.usercase;

import com.github.fabriciolfj.catalogservice.business.ProviderFindProduct;
import com.github.fabriciolfj.catalogservice.entities.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FindProduct {

    private final ProviderFindProduct provider;

    public Product execute(final String code) {
        var result = provider.process(code);

        log.info("Result reviews repository {}, to product {}", result.getReviews().size(), code);
        return result;
    }
}
