INSERT INTO Stadium(name, city, state, capacity) VALUES('American Family Field', 'Milwaukee','Wisconsin',41900);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Angel Stadium', 'Anaheim','California', 45517);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Bush Stadium','St. Louis', 'Missouri', 45494);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Chase Field','Phoenix', 'Arizona', 48405);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Citi Field', 'Queens','New York', 41922);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Citizens Bank Park', 'Philadelphia', 'Pennsylvania', 42792);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Comerica Park', 'Detroit', 'Michigan',41083);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Coors Field', 'Denver','Colorado', 50144);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Dodger Field', 'Los Angles', 'California',56000);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Fenway Park', 'Boston', 'Massachusetts', 37755);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Globe Life Field', 'Arlington','Texas',40300);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Great American Ball Park', 'Cincinnati', 'Ohio', 42319);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Guaranteed Rate Field', 'Chicago', 'Illinois',40615);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Kauffman Stadium','Kansas City', 'Missouri', 37903);
INSERT INTO Stadium(name, city, state, capacity) VALUES('LoanDepot Park', 'Miami','Florida',36742);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Minute Maid Park','Houston','Texas',41168);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Nationals Park', 'Washington', 'D.C.', 41339);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Oakland Coliseum','Oakland','California', 46847);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Oracle Park','San Francisco','California', 41264);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Oriole Park at Camden Yards','Baltimore','Maryland',45971);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Petco Park','SanDiego','California',40209);
INSERT INTO Stadium(name, city, state, capacity) VALUES('PNC Park','Pittsburgh','Pennsylvania',38747);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Progressive Field','Cleveland','Ohio',34830);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Rogers Centre','Toronto','Ontario',49286);
INSERT INTO Stadium(name, city, state, capacity) VALUES('T-Mobile Park','Seattle','Washington',47929);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Target Field','Minneapolis','Minnasota', 38544);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Tropicana Field', 'St. Petersburg','Florida',25000);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Truist Park','Cumberland','Georgia',41084);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Wrigley Field','Chicago','Illinois',41649);
INSERT INTO Stadium(name, city, state, capacity) VALUES('Yankee Stadium','Bronx','New York',46537);

INSERT INTO Team_Info(stadium_id, name) VALUES(1, 'Brewers');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(2, 2, 'Angles');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(3, 3, 'Cardinals');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(4, 4, 'Diamond Backs');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(5, 5, 'Mets');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(6, 6, 'Phillies');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(7, 7, 'Tigers');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(8, 8, 'Rockies');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(9, 9, 'Dodgers');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(10, 10, 'Red Sox');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(11, 11, 'Rangers');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(12, 12, 'Reds');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(13, 13, 'White Sox');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(14, 14, 'Royals');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(15, 15, 'Marlins');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(16, 16, 'Astros');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(17, 17, 'Nationals');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(18, 18, 'As');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(19, 19, 'Giants');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(20, 20, 'Orioles');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(21, 21, 'Padres');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(22, 22, 'Pirates');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(23, 23, 'Indians');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(24, 24, 'Blue Jays');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(25, 25,'Mariners');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(26, 26,'Twins');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(27, 27,'Rays');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(28, 28, 'Braves');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(29, 29, 'Cubs');
INSERT INTO Team_Info(id, stadium_id, name) VALUES(30, 30, 'Yankees');

INSERT INTO Player_Info(first_name, last_name, age, position_id, team_id, handed) VALUES('Matthew','James',34,1,1,'Left');