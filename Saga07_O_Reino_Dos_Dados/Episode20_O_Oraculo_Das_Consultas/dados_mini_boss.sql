-- Mini-boss: A Torre dos Sinais

DROP TABLE IF EXISTS public.sinais_torre;

CREATE TABLE public.sinais_torre (
                                     codigo INTEGER PRIMARY KEY,
                                     titulo VARCHAR(70) NOT NULL,
                                     origem VARCHAR(30) NOT NULL,
                                     prioridade INTEGER NOT NULL,
                                     custo INTEGER NOT NULL,
                                     analista VARCHAR(40)
);

INSERT INTO public.sinais_torre
(codigo, titulo, origem, prioridade, custo, analista)
VALUES
    (1, 'Alerta Solar', 'Norte', 7, 400, 'Mira'),
    (2, 'Eco Profundo', 'Sul', 4, 180, NULL),
    (3, 'Portal Instavel', 'Leste', 8, 650, 'Taro'),
    (4, 'Sombra do Farol', 'Norte', 6, 400, NULL),
    (5, 'Alarme Antigo', 'Oeste', 9, 900, 'Sia'),
    (6, 'Sinal Carmesim', 'Sul', 5, 250, 'Luna'),
    (7, 'Eco da Muralha', 'Norte', 5, 250, 'Mira'),
    (8, 'Rastro Lunar', 'Oeste', 3, 120, NULL),
    (9, 'Portal de Gelo', 'Sul', 7, 450, NULL),
    (10, 'Alerta de Cinzas', 'Leste', 6, 400, 'Taro'),
    (11, 'Farol Silencioso', 'Norte', 6, 400, 'Mira'),
    (12, 'Alarme de Pedra', 'Sul', 2, 90, NULL);


-- Arquivo de protocolos para o experimento de índice.

DROP TABLE IF EXISTS public.protocolos_torre;

CREATE TABLE public.protocolos_torre (
                                         protocolo INTEGER NOT NULL,
                                         origem VARCHAR(30) NOT NULL,
                                         impacto INTEGER NOT NULL
);

INSERT INTO public.protocolos_torre
(protocolo, origem, impacto)
SELECT
    n,
    CASE
        WHEN n % 20 = 0 THEN 'Sul'
        ELSE 'Norte'
        END,
    10 + (n % 500)
FROM generate_series(1, 100000) AS serie(n);

ANALYZE public.protocolos_torre;