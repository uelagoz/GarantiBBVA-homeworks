SELECT "Team"."name", "Team"."league_score" FROM "Team" 
INNER JOIN "League" ON "Team"."id_league" = "League"."id"
INNER JOIN "Country" ON "League"."id_country" = "Country"."id"
WHERE "Country"."name" = 'Türkiye' AND "Team"."id_league" = 1