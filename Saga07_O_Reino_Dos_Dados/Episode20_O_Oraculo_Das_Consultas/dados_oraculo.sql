-- Reconstrói somente a tabela deste laboratório.
DROP TABLE IF EXISTS public.missoes_oraculo;

CREATE TABLE public.missoes_oraculo (
                                        id INTEGER PRIMARY KEY,
                                        titulo VARCHAR(80) NOT NULL,
                                        regiao VARCHAR(30) NOT NULL,
                                        nivel_minimo INTEGER NOT NULL,
                                        recompensa INTEGER NOT NULL,
                                        responsavel VARCHAR(40)
);

INSERT INTO public.missoes_oraculo
(id, titulo, regiao, nivel_minimo, recompensa, responsavel)
VALUES
    (1, 'Rota das Dunas', 'Norte', 2, 120, 'Mira'),
    (2, 'Farol Partido', 'Leste', 5, 350, 'Taro'),
    (3, 'Arquivo de Pedra', 'Sul', 3, 180, NULL),
    (4, 'Caverna Coral', 'Leste', 7, 700, 'Luna'),
    (5, 'Muralha de Cinzas', 'Norte', 5, 400, 'Mira'),
    (6, 'Bosque do Eco', 'Oeste', 1, 90, NULL),
    (7, 'Templo Invertido', 'Sul', 5, 300, 'Sia'),
    (8, 'Ponte Sombria', 'Leste', 3, 210, 'Taro'),
    (9, 'Cripta Gelada', 'Oeste', 8, 800, 'Luna'),
    (10, 'Jardim Perdido', 'Norte', 3, 200, NULL);
