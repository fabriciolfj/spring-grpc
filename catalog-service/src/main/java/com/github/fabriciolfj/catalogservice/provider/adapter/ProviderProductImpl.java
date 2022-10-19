package com.github.fabriciolfj.catalogservice.provider.adapter;

import com.github.fabriciolfj.catalogservice.business.ProviderFindProduct;
import com.github.fabriciolfj.catalogservice.business.ProviderSaveProduct;
import com.github.fabriciolfj.catalogservice.entities.Product;
import com.github.fabriciolfj.catalogservice.provider.database.converter.ProductReviewDataConverter;
import com.github.fabriciolfj.catalogservice.provider.database.repository.ProductReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class ProviderProductImpl implements ProviderSaveProduct, ProviderFindProduct {

    private final ProductReviewRepository repository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Product process(final Product product) {
        var data = ProductReviewDataConverter.toData(product);

        data.stream().forEach(repository::save);
        return product;
    }

    @Override
    @Transactional(readOnly = true)
    public Product process(final String code) {
        var result = repository.findByCode(code);

        return ProductReviewDataConverter.toEntity(result, code);
    }
}
