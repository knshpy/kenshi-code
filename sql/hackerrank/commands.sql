CREATE TABLE worker (
  name VARCHAR(255),
  dept VARCHAR(255),
  Id INT
);

INSERT INTO worker(name, dept, Id)
  VALUES
    ('Karl', 'IT', 6749),
    ('Zu Yi', 'IT', 7291),
    ('Mike', 'Finance', 6767),
    ('Clara', 'Marketing', 7777);

ALTER TABLE worker ADD country VARCHAR(255); -- added country column

UPDATE worker SET country = 'Vietnam' WHERE name = 'Karl';
UPDATE worker SET country = 'China' WHERE name = 'Zu Yi';
UPDATE worker SET country = 'United States' WHERE name = 'Mike';
UPDATE worker SET country = 'Germany' WHERE name = 'Clara';

SELECT * FROM worker; -- output all

ALTER TABLE worker DROP country; -- deletion of country column

SELECT * FROM worker; 

INSERT INTO worker(name, dept, Id)
  VALUES
    ('Keah', 'HR', 6574);

SELECT * FROM worker; -- output keah

DELETE FROM worker WHERE name = 'Keah';

SELECT * FROM worker; -- output deletion of keah

-- TRUNCATE TABLE worker;
-- SELECT * FROM worker;

-- TRUNCATE means to delete the whole table

DROP TABLE worker; -- drop table no longer existed



