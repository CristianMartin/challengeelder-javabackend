INSERT INTO CREDIT_CARD (CARD_TYPE, CARD_ID, BRAND, CARD_HOLDER, DUE_DATE, NUMBER)
VALUES
('visacard', 1, 'Visa', 'Cristian Aranguren', '2022-12-22', 123456789),
('naracard', 2, 'Nara', 'Cristian Aranguren', '2022-05-12', 123451234),
('amexcard', 3, 'Amex', 'Cristian Aranguren', '2022-06-10', 123451233);

INSERT INTO OPERATION (ID, CONSUMPTION, DATE, CARD_ID)
VALUES
(1, 500.0, '2022-12-22', 1),
(2, 700.0, '2022-05-12', 2);
