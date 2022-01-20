DROP TABLE IF EXISTS Stadiums;
CREATE TABLE Stadiums(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    city VARCHAR(255),
    state VARCHAR(64),
    capacity INTEGER
);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(1,'American Family Field', 'Milwaukee','Wisconsin',41900);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(2, 'Angel Stadium', 'Anaheim','California', 45517);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(3,'Bush Stadium','St. Louis', 'Missouri', 45494);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(4, 'Chase Field','Phoenix', 'Arizona', 48405);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(5, 'Citi Field', 'Queens','New York', 41922);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(6, 'Citizens Bank Park', 'Philadelphia', 'Pennsylvania', 42792);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(7, 'Comerica Park', 'Detroit', 'Michigan',41083);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(8, 'Coors Field', 'Denver','Colorado', 50144);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(9, 'Dodger Field', 'Los Angles', 'California',56000);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(10, 'Fenway Park', 'Boston', 'Massachusetts', 37755);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(11, 'Globe Life Field', 'Arlington','Texas',40300);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(12, 'Great American Ball Park', 'Cincinnati', 'Ohio', 42319);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(13, 'Guaranteed Rate Field', 'Chicago', 'Illinois',40615);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(14, 'Kauffman Stadium','Kansas City', 'Missouri', 37903);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(15, 'LoanDepot Park', 'Miami','Florida',36742);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(16, 'Minute Maid Park','Houston','Texas',41168);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(17, 'Nationals Park', 'Washington', 'D.C.', 41339);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(18, 'Oakland Coliseum','Oakland','California', 46847);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(19,'Oracle Park','San Francisco','California', 41264);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(20, 'Oriole Park at Camden Yards','Baltimore','Maryland',45971);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(21, 'Petco Park','SanDiego','California',40209);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(22, 'PNC Park','Pittsburgh','Pennsylvania',38747);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(23, 'Progressive Field','Cleveland','Ohio',34830);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(24, 'Rogers Centre','Toronto','Ontario',49286);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(25, 'T-Mobile Park','Seattle','Washington',47929);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(26, 'Target Field','Minneapolis','Minnasota', 38544);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(27, 'Tropicana Field', 'St. Petersburg','Florida',25,000);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(29, 'Truist Park','Cumberland','Georgia',41084);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(30, 'Wrigley Field','Chicago','Illinois',41649);
INSERT INTO Stadiums(id, name, city, state, capacity) VALUES(31, 'Yankee Stadium','Bronx','New York',46537);