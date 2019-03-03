# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table car_on_sale (
  id                            bigint auto_increment not null,
  make                          varchar(255),
  model                         varchar(255),
  year                          integer not null,
  fuel_type                     varchar(255),
  price                         integer not null,
  colour                        varchar(255),
  constraint pk_car_on_sale primary key (id)
);

create table item_on_sale (
  id                            bigint auto_increment not null,
  make                          varchar(255),
  model                         varchar(255),
  year                          integer not null,
  fuel_type                     varchar(255),
  price                         integer not null,
  colour                        varchar(255),
  constraint pk_item_on_sale primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  make                          varchar(255),
  model                         varchar(255),
  year                          integer not null,
  fuel_type                     varchar(255),
  price                         integer not null,
  colour                        varchar(255),
  constraint pk_product primary key (id)
);


# --- !Downs

drop table if exists car_on_sale;

drop table if exists item_on_sale;

drop table if exists product;

