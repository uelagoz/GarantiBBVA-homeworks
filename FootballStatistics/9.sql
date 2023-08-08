SELECT SUM("Player"."goals_scored"), "Team"."goals_scored"
FROM "Team"
INNER JOIN "Player" ON "Team"."id" = "Player"."id_team"
WHERE "Team"."name" = 'Galatasaray' 
GROUP BY "Team"."goals_scored"



