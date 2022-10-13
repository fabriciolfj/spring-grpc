create table product_review(
id          bigserial not null,
code        varchar(255) not null,
message     varchar(255) not null,
rate        integer not null,
constraint pk_product_review primary key (id)
)