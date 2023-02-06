CREATE TABLE `customer` (
  `customer_id` int NOT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `zip` varchar(255) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
);




insert into customer values (101, 'John', '123-468-1234', '101 Bell Rd', 'New York', 'NY', '19454', NOW(), 'SYSTEM', null, null);


select * from customer;
