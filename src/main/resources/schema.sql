DROP TABLE IF EXISTS Stadium;
CREATE TABLE Stadium(
    id SERIAL PRIMARY KEY,
    name VARCHAR(128),
    city VARCHAR(255),
    state VARCHAR(64),
    capacity INTEGER
);

DROP TABLE IF EXISTS Team_Info;
CREATE TABLE Team_Info(
    id SERIAL PRIMARY KEY,
    stadium_id INTEGER,
    name VARCHAR(255)
);
DROP TABLE IF EXISTS Player_Info;
CREATE TABLE Player_Info(
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  age INTEGER,
  position_id INTEGER,
  team_id INTEGER,
  handed VARCHAR(16)
);