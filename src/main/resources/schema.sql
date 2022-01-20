DROP TABLE IF EXISTS Stadiums;
CREATE TABLE Stadiums(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    city VARCHAR(255),
    state VARCHAR(64),
    capacity INTEGER
);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('American Family Field', 'Milwaukee','Wisconsin',41900);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Angel Stadium', 'Anaheim','California', 45517);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Bush Stadium','St. Louis', 'Missouri', 45494);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Chase Field','Phoenix', 'Arizona', 48405);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Citi Field', 'Queens','New York', 41922);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Citizens Bank Park', 'Philadelphia', 'Pennsylvania', 42792);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Comerica Park', 'Detroit', 'Michigan',41083);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Coors Field', 'Denver','Colorado', 50144);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Dodger Field', 'Los Angles', 'California',56000);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Fenway Park', 'Boston', 'Massachusetts', 37755);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Globe Life Field', 'Arlington','Texas',40300);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Great American Ball Park', 'Cincinnati', 'Ohio', 42319);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Guaranteed Rate Field', 'Chicago', 'Illinois',40615);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Kauffman Stadium','Kansas City', 'Missouri', 37903);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('LoanDepot Park', 'Miami','Florida',36742);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Minute Maid Park','Houston','Texas',41168);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Nationals Park', 'Washington', 'D.C.', 41339);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Oakland Coliseum','Oakland','California', 46847);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Oracle Park','San Francisco','California', 41264);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Oriole Park at Camden Yards','Baltimore','Maryland',45971);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Petco Park','SanDiego','California',40209);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('PNC Park','Pittsburgh','Pennsylvania',38747);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Progressive Field','Cleveland','Ohio',34830);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Rogers Centre','Toronto','Ontario',49286);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('T-Mobile Park','Seattle','Washington',47929);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Target Field','Minneapolis','Minnasota', 38544);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Tropicana Field', 'St. Petersburg','Florida',25000);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Truist Park','Cumberland','Georgia',41084);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Wrigley Field','Chicago','Illinois',41649);
INSERT INTO Stadiums(name, city, state, capacity) VALUES('Yankee Stadium','Bronx','New York',46537);