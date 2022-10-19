package com.github.fabriciolfj.catalogservice.entrypoint.controller;

import com.github.fabriciolfj.catalogservice.business.usercase.FindProduct;
import com.github.fabriciolfj.catalogservice.business.usercase.InitSaveProduct;
import com.github.fabriciolfj.catalogservice.business.usercase.SaveProduct;
import com.github.fabriciolfj.catalogservice.entrypoint.converter.ProductDtoConverter;
import com.github.fabriciolfj.catalogservice.entrypoint.dto.ProductRequest;
import com.github.fabriciolfj.catalogservice.entrypoint.dto.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final InitSaveProduct initSaveProduct;
    private final FindProduct findProduct;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final ProductRequest request) {
        initSaveProduct.execute(request.getCode());
    }

    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ProductResponse findProduct(@PathVariable("code") final String code) {
        var result = findProduct.execute(code);

        return ProductDtoConverter.toResponse(result);
    }
}
