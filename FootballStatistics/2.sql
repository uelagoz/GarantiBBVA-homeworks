DATABASE FootballStatistics;

INSERT INTO "Country" (id, name)
VALUES
    (1, 'Türkiye'),
	(2, 'Almanya'),
	(3, 'İtalya'),
	(4, 'İngiltere')    
;

INSERT INTO "League" (id, name, id_country)
VALUES
    (1, 'Süper Lig', 1),
	(2, 'TFF 2.Lig', 1),
	(3, 'Bundesliga', 2),
	(4, 'Serie A', 3),
	(5, 'Premier League', 4)
;

INSERT INTO "Team" (id, name, id_league, foundation_year, goals_scored, goals_conceded, league_score, league_rank)
VALUES
	(1, 'Galatasaray', 1, 1905, 10, 2, 12, 1),
	(2, 'Fenerbahçe', 1, 1907, 4, 8, 6, 3),
	(3, 'Beşiktaş', 1, 1903, 6, 5, 9, 2),
	(4, 'Adana Demirspor', 2 ,1940, 4, 1, 8, 2),
	(5, 'Dortmund', 3, 1909, 10, 2, 12, 1),
	(6, 'Inter', 4, 1908, 10, 2, 12, 1),
	(7, 'Milan', 4, 1899, 12, 4, 10, 2),
	(8, 'Manchester City', 5, 1880, 8, 4, 9, 3)
;

INSERT INTO "Player" (id, name, surname, id_team, id_country, goals_scored)
VALUES
	(1, 'Uğurcan', 'Elagöz', 1, 1, 8),
	(2, 'Hakan', 'Everdi', 2, 1, 2),
	(3, 'Ali Eray', 'Akgül', 3, 1, 5),
	(4, 'Marco', 'Reus', 5, 2, 6),
	(5, 'Hakan', 'Çalhanoğlu', 6, 1, 7),
	(6, 'Olivier', 'Giroud', 7, 3, 9),
	(7, 'Erling', 'Haaland', 8, 4, 6),
	(8, 'Kevin', 'de Bruyne', 8, 4, 2)		
;