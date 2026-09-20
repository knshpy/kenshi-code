CREATE TABLE cars (
  brand VARCHAR(255),
  model VARCHAR(255),
  year INT
);

INSERT INTO cars (brand, model, year)
VALUES
  ('Ferrari',  'laferrari', 2016),
  ('Volvo', 'p1800', 1212),
  ('Nissan', 'gtr', 2016);

SELECT brand FROM cars; -- output brand

ALTER TABLE cars ADD color VARCHAR(255); 
UPDATE cars SET color = 'Red' WHERE brand = 'Ferrari';
UPDATE cars SET color = 'White', year = 1978 WHERE brand = 'Volvo'; -- set color & update year
UPDATE cars SET color = 'Black' WHERE brand = 'Nissan';


SELECT * FROM cars; -- output all
