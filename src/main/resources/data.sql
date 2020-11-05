-- Product
INSERT INTO product(id, name, price, description) VALUES (DEFAULT, 'Soda', 10, 'A sodary drink');
INSERT INTO product(id, name, price, description) VALUES (DEFAULT, 'Water', 5, 'A watery drink');
INSERT INTO product(id, name, price, description) VALUES (DEFAULT, 'Beer', 10, 'An alcoholically drink');

-- Company
INSERT INTO company(id, name) VALUES (DEFAULT, 'Coca Colary');
INSERT INTO company(id, name) VALUES (DEFAULT, 'Carlsberg');

-- Company_Description
INSERT INTO company_description VALUES (DEFAULT, 'Le Description of Soda', 1);
INSERT INTO company_description VALUES (DEFAULT, 'This is a description of water', 2);
INSERT INTO company_description VALUES (DEFAULT, 'This describes the description of Beer', 3);

-- Category
INSERT INTO category VALUES (DEFAULT, 'Soda');
INSERT INTO category VALUES (DEFAULT, 'Alcohol');
INSERT INTO category VALUES (DEFAULT, 'Water');

-- Product_categories
INSERT INTO product_categories VALUES (1, 1);
INSERT INTO product_categories VALUES (2, 3);
INSERT INTO product_categories VALUES (3, 2);


-- Product Foreign keys
UPDATE product SET company_id = 1, company_description_id = 1 WHERE id = 1;
UPDATE product SET company_id = 1, company_description_id = 2 WHERE id = 2;
UPDATE product SET company_id = 2, company_description_id = 3 WHERE id = 3;