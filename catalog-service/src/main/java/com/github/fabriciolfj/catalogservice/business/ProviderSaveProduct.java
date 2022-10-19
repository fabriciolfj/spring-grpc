package com.github.fabriciolfj.catalogservice.business;

import com.github.fabriciolfj.catalogservice.entities.Product;

public interface ProviderSaveProduct {

    Product process(final Product product);
}
