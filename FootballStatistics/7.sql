SELECT "Player"."name", "Player"."surname", "Team"."name", "Country"."name" 
FROM "Player" 
INNER JOIN "Team" ON "Player"."id_team" = "Team"."id"
INNER JOIN "League" ON "Team"."id_league" = "League"."id"
INNER JOIN "Country" ON "League"."id_country" = "Country"."id"
WHERE "League"."name" = 'Süper Lig' ORDER BY "Player"."goals_scored" DESC LIMIT 1

