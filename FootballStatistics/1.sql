CREATE TABLE "Country" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(255)
);

CREATE TABLE "League" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(255),
    "id_country" INT,
    FOREIGN KEY ("id_country") REFERENCES "Country"("id")
);

CREATE TABLE "Team" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(255),
    "id_league" INT,
    "foundation_year" INT,
    "goals_scored" INT,
    "goals_conceded" INT,
    "league_score" INT,
    "league_rank" INT,
    FOREIGN KEY ("id_league") REFERENCES "League"("id")
);

CREATE TABLE "Player" (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(255),
    "surname" VARCHAR(255),
    "id_team" INT,
    "id_country" INT,
    "goals_scored" INT,
    FOREIGN KEY ("id_team") REFERENCES "Team"("id"),
    FOREIGN KEY ("id_country") REFERENCES "Country"("id")
);
