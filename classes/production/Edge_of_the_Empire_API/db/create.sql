SET MODE PostgreSQL;

CREATE TABLE IF NOT EXISTS weapons (
 id int PRIMARY KEY auto_increment,
 name VARCHAR,
 skill VARCHAR,
 damage VARCHAR,
 critical VARCHAR,
 range VARCHAR,
 encumberance VARCHAR,
 hardpoint VARCHAR,
 rarity VARCHAR,
 price VARCHAR

);

CREATE TABLE IF NOT EXISTS armors (
 id int PRIMARY KEY auto_increment,
 armorName VARCHAR,
 defense VARCHAR,
 soak VARCHAR,
 armorPrice VARCHAR,
 armorEncumberance VARCHAR,
 armorHardpoint VARCHAR,
 armorRarity VARCHAR
);

CREATE TABLE IF NOT EXISTS adversaries (
 id int PRIMARY KEY auto_increment,
 adversaryName VARCHAR,
 level VARCHAR,
 index VARCHAR
);