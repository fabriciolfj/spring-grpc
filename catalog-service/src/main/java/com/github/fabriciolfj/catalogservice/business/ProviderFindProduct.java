package com.github.fabriciolfj.catalogservice.business;

import com.github.fabriciolfj.catalogservice.entities.Product;

public interface ProviderFindProduct {

    Product process(final String code);
}
