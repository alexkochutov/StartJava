DROP DATABASE IF EXISTS Jaegers;
DROP TABLE IF EXISTS Jaegers;

CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE Jaegers (
    id SERIAL,
    modelName TEXT,
    mark TEXT,
    height REAL,
    weight INT,
    status TEXT,
    origin TEXT,
    launch DATE,
    kaijuKill INT
);

\ir init_db.sql;
\ir queries.sql;