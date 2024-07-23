-- --------------------------------------------------------
-- Servidor:                     193.123.108.138
-- Versão do servidor:           5.7.35 - MySQL Community Server (GPL)
-- OS do Servidor:               Linux
-- HeidiSQL Versão:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para prob2022_2
DROP DATABASE IF EXISTS `prob2022_2`;
CREATE DATABASE IF NOT EXISTS `prob2022_2` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `prob2022_2`;

-- Copiando estrutura para tabela prob2022_2.LucasGarcia_pessoas
DROP TABLE IF EXISTS `LucasGarcia_pessoas`;
CREATE TABLE IF NOT EXISTS `LucasGarcia_pessoas` (
  `Nome` varchar(200) DEFAULT NULL,
  `Cpf` varchar(20) DEFAULT NULL,
  `Rg` varchar(50) DEFAULT NULL,
  `Cep` varchar(9) DEFAULT NULL,
  `Endereco` varchar(200) DEFAULT NULL,
  `Data` varchar(200) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Celular` varchar(50) DEFAULT NULL,
  `Idade` varchar(50) DEFAULT NULL,
  `TipoPessoa` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.LucasGarcia_pessoas: ~1 rows (aproximadamente)
REPLACE INTO `LucasGarcia_pessoas` (`Nome`, `Cpf`, `Rg`, `Cep`, `Endereco`, `Data`, `Email`, `Celular`, `Idade`, `TipoPessoa`) VALUES
	('Lucas Silva Garcia', NULL, NULL, '111', 'Rua José 401', NULL, NULL, NULL, NULL, NULL);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
