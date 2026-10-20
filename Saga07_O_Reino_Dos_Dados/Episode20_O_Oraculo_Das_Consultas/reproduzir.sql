-- Interrompe a execução do arquivo se ocorrer erro SQL.
\set ON_ERROR_STOP on

-- Reconstrói as duas tabelas do mini-boss.
\i 'Saga07_O_Reino_Dos_Dados/Episode20_O_Oraculo_Das_Consultas/dados_mini_boss.sql'

-- Executa as consultas autorais.
\i 'Saga07_O_Reino_Dos_Dados/Episode20_O_Oraculo_Das_Consultas/mini_boss.sql'