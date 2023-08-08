SELECT "Team"."name", "Team"."goals_scored", "Team"."goals_conceded"
FROM "Team"
INNER JOIN "League" ON "Team"."id_league" = "League"."id"
WHERE "Team"."goals_scored" < "Team"."goals_conceded"

