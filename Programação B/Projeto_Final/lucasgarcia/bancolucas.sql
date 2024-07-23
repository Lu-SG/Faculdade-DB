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

-- Copiando estrutura para tabela prob2022_2.artur_estoque
DROP TABLE IF EXISTS `artur_estoque`;
CREATE TABLE IF NOT EXISTS `artur_estoque` (
  `alimento` varchar(100) DEFAULT NULL,
  `fornecedor` varchar(200) DEFAULT NULL,
  `tipo` int(1) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `validadeM` int(2) DEFAULT NULL,
  `validadeA` int(4) DEFAULT NULL,
  `codigo` int(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_estoque: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.artur_mesa
DROP TABLE IF EXISTS `artur_mesa`;
CREATE TABLE IF NOT EXISTS `artur_mesa` (
  `pedido` varchar(200) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `vlrConta` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_mesa: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.artur_pedido
DROP TABLE IF EXISTS `artur_pedido`;
CREATE TABLE IF NOT EXISTS `artur_pedido` (
  `codigo` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_pedido: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.artur_produto
DROP TABLE IF EXISTS `artur_produto`;
CREATE TABLE IF NOT EXISTS `artur_produto` (
  `nome` varchar(50) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `ingredientes` varchar(50) DEFAULT NULL,
  `preco` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_produto: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.artur_usuario
DROP TABLE IF EXISTS `artur_usuario`;
CREATE TABLE IF NOT EXISTS `artur_usuario` (
  `nome` varchar(200) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  `senhaConfirm` varchar(50) DEFAULT NULL,
  `tipo` int(11) DEFAULT NULL,
  `ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_usuario: ~1 rows (aproximadamente)
REPLACE INTO `artur_usuario` (`nome`, `senha`, `senhaConfirm`, `tipo`, `ID`) VALUES
	('Artur', '1234', '1234', 1, 1),
	('Jorge', NULL, NULL, NULL, NULL),
	('Arturzinho', NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.artur_venda
DROP TABLE IF EXISTS `artur_venda`;
CREATE TABLE IF NOT EXISTS `artur_venda` (
  `mesa` int(11) DEFAULT NULL,
  `metodPag` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.artur_venda: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.bernardo_categoria
DROP TABLE IF EXISTS `bernardo_categoria`;
CREATE TABLE IF NOT EXISTS `bernardo_categoria` (
  `soma` int(50) DEFAULT NULL,
  `subtracao` int(50) DEFAULT NULL,
  `multiplicacao` int(50) DEFAULT NULL,
  `divisao` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.bernardo_categoria: ~1 rows (aproximadamente)
REPLACE INTO `bernardo_categoria` (`soma`, `subtracao`, `multiplicacao`, `divisao`) VALUES
	(10, 20, 30, 40),
	(10, 20, 30, 40),
	(10, 20, 30, 40);

-- Copiando estrutura para tabela prob2022_2.bernardo_certificados
DROP TABLE IF EXISTS `bernardo_certificados`;
CREATE TABLE IF NOT EXISTS `bernardo_certificados` (
  `nota` int(50) DEFAULT NULL,
  `dataconclusao` int(50) DEFAULT NULL,
  `modulo` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.bernardo_certificados: ~0 rows (aproximadamente)
REPLACE INTO `bernardo_certificados` (`nota`, `dataconclusao`, `modulo`) VALUES
	(9, 221190, 5),
	(9, 221190, 5);

-- Copiando estrutura para tabela prob2022_2.bernardo_modulos
DROP TABLE IF EXISTS `bernardo_modulos`;
CREATE TABLE IF NOT EXISTS `bernardo_modulos` (
  `iniciante` varchar(50) DEFAULT NULL,
  `intermediario` varchar(50) DEFAULT NULL,
  `avancado` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.bernardo_modulos: ~0 rows (aproximadamente)
REPLACE INTO `bernardo_modulos` (`iniciante`, `intermediario`, `avancado`) VALUES
	('t2', 't2', 't2'),
	('t2', 't2', 't2');

-- Copiando estrutura para tabela prob2022_2.bernardo_pessoa
DROP TABLE IF EXISTS `bernardo_pessoa`;
CREATE TABLE IF NOT EXISTS `bernardo_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `sobrenome` varchar(200) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `estadocivil` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefone` varchar(50) DEFAULT NULL,
  `tipodocumento` varchar(10) DEFAULT NULL,
  `numdocumento` varchar(50) DEFAULT NULL,
  `dianasc` varchar(2) DEFAULT NULL,
  `mesnasc` varchar(2) DEFAULT NULL,
  `anonasc` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.bernardo_pessoa: ~8 rows (aproximadamente)
REPLACE INTO `bernardo_pessoa` (`nome`, `sobrenome`, `endereco`, `sexo`, `estadocivil`, `email`, `telefone`, `tipodocumento`, `numdocumento`, `dianasc`, `mesnasc`, `anonasc`) VALUES
	('bernardo', 'oliveira', NULL, 'masculino', 'casado', 'teste@teste.com', '519918941', NULL, NULL, NULL, NULL, NULL),
	('teste banco dados', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('teste1', 'de oliveira', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('teste1', 'teste1', NULL, 'teste1', 'teste1', 'teste1', 'teste1', 'teste1', 'teste1', 't1', 't1', 't1'),
	('teste2', 'teste2', NULL, 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 't2', 't2', 't2'),
	('Lianderson ', 'teste2', NULL, 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 't2', 't2', 't2'),
	('BernardoDiretoCodigo ', 'teste2', NULL, 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 't2', 't2', 't2'),
	('BernardoDiretoCodigo ', 'teste2', NULL, 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 't2', 't2', 't2'),
	('BernardoDiretoCodigo ', 'teste2', NULL, 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 't2', 't2', 't2'),
	('BernardoJOption', 'teste2', NULL, 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 'teste2', 't2', 't2', 't2');

-- Copiando estrutura para tabela prob2022_2.bernardo_venda
DROP TABLE IF EXISTS `bernardo_venda`;
CREATE TABLE IF NOT EXISTS `bernardo_venda` (
  `valor` int(50) DEFAULT NULL,
  `formapgto` int(50) DEFAULT NULL,
  `tipo` int(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.bernardo_venda: ~1 rows (aproximadamente)
REPLACE INTO `bernardo_venda` (`valor`, `formapgto`, `tipo`) VALUES
	(10, 20, 30),
	(10, 20, 30),
	(10, 20, 30);

-- Copiando estrutura para tabela prob2022_2.claudio_estoque
DROP TABLE IF EXISTS `claudio_estoque`;
CREATE TABLE IF NOT EXISTS `claudio_estoque` (
  `marca` varchar(50) DEFAULT NULL,
  `codigo` varchar(50) DEFAULT NULL,
  `cor` varchar(50) DEFAULT NULL,
  `nSerie` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.claudio_estoque: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.claudio_modelo
DROP TABLE IF EXISTS `claudio_modelo`;
CREATE TABLE IF NOT EXISTS `claudio_modelo` (
  `nomeP` varchar(50) DEFAULT NULL,
  `corP` varchar(50) DEFAULT NULL,
  `sistemaP` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.claudio_modelo: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.claudio_notafiscal
DROP TABLE IF EXISTS `claudio_notafiscal`;
CREATE TABLE IF NOT EXISTS `claudio_notafiscal` (
  `valorP` varchar(50) DEFAULT NULL,
  `valorVenda` varchar(50) DEFAULT NULL,
  `cnpj` varchar(50) DEFAULT NULL,
  `endereco` varchar(50) DEFAULT NULL,
  `tipo_pessoa` varchar(50) DEFAULT NULL COMMENT '1 - Juridico 2 - fisico'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.claudio_notafiscal: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.claudio_pessoa
DROP TABLE IF EXISTS `claudio_pessoa`;
CREATE TABLE IF NOT EXISTS `claudio_pessoa` (
  `Nome` varchar(50) DEFAULT NULL,
  `CPF` varchar(50) DEFAULT NULL,
  `RG` varchar(50) DEFAULT NULL,
  `CEP` varchar(50) DEFAULT NULL,
  `Data_Nascimento` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.claudio_pessoa: ~1 rows (aproximadamente)
REPLACE INTO `claudio_pessoa` (`Nome`, `CPF`, `RG`, `CEP`, `Data_Nascimento`) VALUES
	('lo', 'a', NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.claudio_status
DROP TABLE IF EXISTS `claudio_status`;
CREATE TABLE IF NOT EXISTS `claudio_status` (
  `estado` varchar(50) DEFAULT NULL,
  `possuiMDU` varchar(50) DEFAULT NULL,
  `possuiD` varchar(50) DEFAULT NULL,
  `tempoUso` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.claudio_status: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.Douglas_pessoa
DROP TABLE IF EXISTS `Douglas_pessoa`;
CREATE TABLE IF NOT EXISTS `Douglas_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `endereco` varchar(100) DEFAULT NULL,
  `Cep` varchar(10) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.Douglas_pessoa: ~6 rows (aproximadamente)
REPLACE INTO `Douglas_pessoa` (`nome`, `endereco`, `Cep`, `email`) VALUES
	('Douglas', 'Rua General 666\r\n', '92360431', 'douglasmadruga@22gmail.com'),
	('Eu', NULL, NULL, NULL),
	('Eu', 'Minha casa', NULL, NULL),
	('douglas o melhor ', NULL, NULL, NULL),
	('pandora', 'rua dog 44', NULL, 'pandora@gamil.com'),
	('Eu', 'Minha casa', NULL, NULL),
	('Eu', 'Minha casa', NULL, NULL),
	('Eu', 'Minha casa', NULL, NULL),
	('doulas', NULL, NULL, NULL),
	('Eu', 'Minha casa', NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.eder_pessoa
DROP TABLE IF EXISTS `eder_pessoa`;
CREATE TABLE IF NOT EXISTS `eder_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `cpf` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.eder_pessoa: ~0 rows (aproximadamente)
REPLACE INTO `eder_pessoa` (`nome`, `email`, `endereco`, `cpf`) VALUES
	('eder', 'ederzanievicz98@outlook.com', 'rua ospa', '60006313086'),
	('natan', 'sdnsdjndjd@jnjdnsj', 'alvorada', '5156156');

-- Copiando estrutura para tabela prob2022_2.filiperibeiro_pessoa
DROP TABLE IF EXISTS `filiperibeiro_pessoa`;
CREATE TABLE IF NOT EXISTS `filiperibeiro_pessoa` (
  `endereco` varchar(50) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `Coluna 3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.filiperibeiro_pessoa: ~1 rows (aproximadamente)
REPLACE INTO `filiperibeiro_pessoa` (`endereco`, `cep`, `Coluna 3`) VALUES
	('rua do dombosco', NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.filipe_pessoa
DROP TABLE IF EXISTS `filipe_pessoa`;
CREATE TABLE IF NOT EXISTS `filipe_pessoa` (
  `cpf` varchar(50) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.filipe_pessoa: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.gabriel_veiculos
DROP TABLE IF EXISTS `gabriel_veiculos`;
CREATE TABLE IF NOT EXISTS `gabriel_veiculos` (
  `Modelo` varchar(50) DEFAULT NULL,
  `Cor` varchar(50) DEFAULT NULL,
  `Placa` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.gabriel_veiculos: ~6 rows (aproximadamente)
REPLACE INTO `gabriel_veiculos` (`Modelo`, `Cor`, `Placa`) VALUES
	('Vectra', 'Branco', '12121'),
	('Onix', 'Vermelha', 'IX021'),
	('HB20', 'Preto', 'IX022'),
	('Ford KA', 'Cinza', 'Ix044'),
	('Voyage', 'Preto', 'Ix021'),
	('Polo', 'Azul', 'Iz014');

-- Copiando estrutura para tabela prob2022_2.giovanna_pessoa
DROP TABLE IF EXISTS `giovanna_pessoa`;
CREATE TABLE IF NOT EXISTS `giovanna_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `idade` varchar(200) DEFAULT NULL,
  `endereco` varchar(150) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.giovanna_pessoa: ~0 rows (aproximadamente)
REPLACE INTO `giovanna_pessoa` (`nome`, `idade`, `endereco`, `cep`) VALUES
	('giovanna', '18', 'rua taltaltal', '95555000');

-- Copiando estrutura para tabela prob2022_2.gustavo_pessoa
DROP TABLE IF EXISTS `gustavo_pessoa`;
CREATE TABLE IF NOT EXISTS `gustavo_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `telefone` float DEFAULT NULL,
  `endereço` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.gustavo_pessoa: ~2 rows (aproximadamente)
REPLACE INTO `gustavo_pessoa` (`nome`, `telefone`, `endereço`) VALUES
	('gustavo', 40028900, 'rua caju'),
	('gustavo', 40028900, 'rua caju');

-- Copiando estrutura para tabela prob2022_2.lianderson_pessoa
DROP TABLE IF EXISTS `lianderson_pessoa`;
CREATE TABLE IF NOT EXISTS `lianderson_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela prob2022_2.lianderson_pessoa: ~11 rows (aproximadamente)
REPLACE INTO `lianderson_pessoa` (`nome`, `endereco`, `cep`) VALUES
	('Lianderson Franco Brum', 'Rua blallalaa', '912505588'),
	('Lianderson ', NULL, NULL),
	('lili carabina', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('lili for all', NULL, NULL),
	('Arturzinho', NULL, NULL),
	('lili for all', NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.lucasgarcia_compra
DROP TABLE IF EXISTS `lucasgarcia_compra`;
CREATE TABLE IF NOT EXISTS `lucasgarcia_compra` (
  `ValorFinal` double DEFAULT NULL,
  `ValorParcial` double DEFAULT NULL,
  `OpcaoPagamento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.lucasgarcia_compra: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.lucasgarcia_estoque
DROP TABLE IF EXISTS `lucasgarcia_estoque`;
CREATE TABLE IF NOT EXISTS `lucasgarcia_estoque` (
  `Nome` varchar(50) DEFAULT NULL,
  `Quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.lucasgarcia_estoque: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.lucasgarcia_financeiro
DROP TABLE IF EXISTS `lucasgarcia_financeiro`;
CREATE TABLE IF NOT EXISTS `lucasgarcia_financeiro` (
  `Saldo` float DEFAULT NULL,
  `Receita` float DEFAULT NULL,
  `Despesas` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.lucasgarcia_financeiro: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.lucasgarcia_pessoas
DROP TABLE IF EXISTS `lucasgarcia_pessoas`;
CREATE TABLE IF NOT EXISTS `lucasgarcia_pessoas` (
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

-- Copiando dados para a tabela prob2022_2.lucasgarcia_pessoas: ~5 rows (aproximadamente)
REPLACE INTO `lucasgarcia_pessoas` (`Nome`, `Cpf`, `Rg`, `Cep`, `Endereco`, `Data`, `Email`, `Celular`, `Idade`, `TipoPessoa`) VALUES
	('Lucas Silva Garcia', NULL, NULL, '111', 'Rua José 401', NULL, NULL, NULL, NULL, NULL),
	('lili for all', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('lili for all', '051', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('lili for all', 'Lianderson ', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('lili for all', 'Lucas', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.lucasgarcia_produtos
DROP TABLE IF EXISTS `lucasgarcia_produtos`;
CREATE TABLE IF NOT EXISTS `lucasgarcia_produtos` (
  `NomeProdutos` varchar(50) DEFAULT NULL,
  `Quantidade` int(11) DEFAULT NULL,
  `Preco` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.lucasgarcia_produtos: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.maldonado_caracteristica
DROP TABLE IF EXISTS `maldonado_caracteristica`;
CREATE TABLE IF NOT EXISTS `maldonado_caracteristica` (
  `nome` varchar(100) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.maldonado_caracteristica: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.maldonado_pessoa
DROP TABLE IF EXISTS `maldonado_pessoa`;
CREATE TABLE IF NOT EXISTS `maldonado_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  `cpf` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.maldonado_pessoa: ~5 rows (aproximadamente)
REPLACE INTO `maldonado_pessoa` (`nome`, `idade`, `email`, `senha`, `cpf`) VALUES
	('Duda', 18, 'duda@', '123', '11111'),
	('maria', 19, 'maria@', '456', '22222'),
	('eduarda', 20, 'eduarda@', '789', '33333'),
	('lili for all', NULL, NULL, NULL, NULL),
	('lili for all', NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.maldonado_produto
DROP TABLE IF EXISTS `maldonado_produto`;
CREATE TABLE IF NOT EXISTS `maldonado_produto` (
  `nome` varchar(50) DEFAULT NULL,
  `quantidade` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.maldonado_produto: ~14 rows (aproximadamente)
REPLACE INTO `maldonado_produto` (`nome`, `quantidade`, `tipo`, `peso`, `descricao`) VALUES
	('lili for all', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	(NULL, NULL, 'passado', NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	('cafe', NULL, NULL, NULL, NULL),
	(NULL, '1 xicara', NULL, NULL, NULL),
	(NULL, NULL, 'passado', NULL, NULL),
	('mary', NULL, NULL, NULL, NULL),
	('mary', NULL, NULL, NULL, NULL),
	('cafe', '1 xicara', 'passado', NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.maldonado_receita
DROP TABLE IF EXISTS `maldonado_receita`;
CREATE TABLE IF NOT EXISTS `maldonado_receita` (
  `rendimento` int(11) DEFAULT NULL,
  `preparo` float DEFAULT NULL,
  `tempo` float DEFAULT NULL,
  `ingredientes` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.maldonado_receita: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.maldonado_utensilios
DROP TABLE IF EXISTS `maldonado_utensilios`;
CREATE TABLE IF NOT EXISTS `maldonado_utensilios` (
  `nome` varchar(200) DEFAULT NULL,
  `tipo` varchar(100) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.maldonado_utensilios: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.mariafischer_critica
DROP TABLE IF EXISTS `mariafischer_critica`;
CREATE TABLE IF NOT EXISTS `mariafischer_critica` (
  `positivas` varchar(500) DEFAULT NULL,
  `negativas` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.mariafischer_critica: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.mariafischer_pessoa
DROP TABLE IF EXISTS `mariafischer_pessoa`;
CREATE TABLE IF NOT EXISTS `mariafischer_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `sobrenome` varchar(200) DEFAULT NULL,
  `tipo_pessoa` varchar(200) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `idade` int(3) DEFAULT NULL,
  `data_nascimento` int(8) DEFAULT NULL,
  `loggin` varchar(200) DEFAULT NULL,
  `senhaa` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.mariafischer_pessoa: ~4 rows (aproximadamente)
REPLACE INTO `mariafischer_pessoa` (`nome`, `sobrenome`, `tipo_pessoa`, `sexo`, `idade`, `data_nascimento`, `loggin`, `senhaa`) VALUES
	('Maria Eduarda ', 'Fischer ', 'Fisica', 'Femini', 19, 13, '22113003', 'Rosa45556*'),
	('LILI', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
	('maria for all', 'fischer', NULL, NULL, NULL, NULL, NULL, NULL),
	('lili for all', 'spnbre', NULL, NULL, NULL, NULL, NULL, NULL),
	('lili for all', 'spnbre', 'Juridico', NULL, NULL, NULL, NULL, NULL),
	('lili for all', 'spnbre', 'Juridico', NULL, NULL, NULL, NULL, NULL),
	('lili for all', 'spnbre', 'Juridico', NULL, NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.mariafischer_premiacao
DROP TABLE IF EXISTS `mariafischer_premiacao`;
CREATE TABLE IF NOT EXISTS `mariafischer_premiacao` (
  `ano` int(5) DEFAULT NULL,
  `indicacoes` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.mariafischer_premiacao: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.mariafischer_tipogenero
DROP TABLE IF EXISTS `mariafischer_tipogenero`;
CREATE TABLE IF NOT EXISTS `mariafischer_tipogenero` (
  `id` varchar(200) DEFAULT NULL,
  `nomeg` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.mariafischer_tipogenero: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.mariafischer_valores
DROP TABLE IF EXISTS `mariafischer_valores`;
CREATE TABLE IF NOT EXISTS `mariafischer_valores` (
  `custo_de_producao` int(11) DEFAULT NULL,
  `bilheteria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.mariafischer_valores: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.nata_pessoa
DROP TABLE IF EXISTS `nata_pessoa`;
CREATE TABLE IF NOT EXISTS `nata_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `contato` varchar(50) DEFAULT NULL,
  `cep` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.nata_pessoa: ~2 rows (aproximadamente)
REPLACE INTO `nata_pessoa` (`nome`, `tipo`, `endereco`, `contato`, `cep`) VALUES
	('Nata Arena Leites', '1', 'RUA CRUZ ALTA', '998292157', '92714560'),
	('alemao', '3', 'rua goiaba caida', '34013881', '92500000'),
	('alemao bergamoteiro', '3', 'rua goiaba caida', '34013881', '92500000');

-- Copiando estrutura para tabela prob2022_2.nata_usuario
DROP TABLE IF EXISTS `nata_usuario`;
CREATE TABLE IF NOT EXISTS `nata_usuario` (
  `usuario` varchar(50) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.nata_usuario: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.pedro_comissao
DROP TABLE IF EXISTS `pedro_comissao`;
CREATE TABLE IF NOT EXISTS `pedro_comissao` (
  `matricula` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.pedro_comissao: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.pedro_controle_de_estoque
DROP TABLE IF EXISTS `pedro_controle_de_estoque`;
CREATE TABLE IF NOT EXISTS `pedro_controle_de_estoque` (
  `id_produto` varchar(50) DEFAULT NULL,
  `nome_produto` varchar(50) DEFAULT NULL,
  `entradas` varchar(50) DEFAULT NULL,
  `saidas` varchar(50) DEFAULT NULL,
  `estoque_atual` varchar(50) DEFAULT NULL,
  `estoque_minimo` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `preco_unitario` varchar(50) DEFAULT NULL,
  `receita_total` varchar(50) DEFAULT NULL,
  `custo_total` varchar(50) DEFAULT NULL,
  `lucro_prejuizo_total` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.pedro_controle_de_estoque: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.pedro_pessoa
DROP TABLE IF EXISTS `pedro_pessoa`;
CREATE TABLE IF NOT EXISTS `pedro_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `cpf` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `telefone` varchar(200) DEFAULT NULL,
  `rg` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.pedro_pessoa: ~6 rows (aproximadamente)
REPLACE INTO `pedro_pessoa` (`nome`, `cpf`, `email`, `telefone`, `rg`, `cep`) VALUES
	('Pedro', NULL, NULL, NULL, NULL, NULL),
	('pedro pires', NULL, NULL, NULL, NULL, NULL),
	('pedro pires', '56739821523', NULL, NULL, NULL, NULL),
	('pedro', NULL, NULL, NULL, NULL, NULL),
	('julia', NULL, NULL, NULL, NULL, NULL),
	('pedro pires', '56739821523', NULL, NULL, NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.pedro_produtos
DROP TABLE IF EXISTS `pedro_produtos`;
CREATE TABLE IF NOT EXISTS `pedro_produtos` (
  `categoria` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL,
  `precocusto` varchar(50) DEFAULT NULL,
  `precovenda` varchar(50) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `qnt` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.pedro_produtos: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.rafael_agenda
DROP TABLE IF EXISTS `rafael_agenda`;
CREATE TABLE IF NOT EXISTS `rafael_agenda` (
  `Dia` int(31) DEFAULT NULL,
  `Horas` int(24) DEFAULT NULL,
  `Minutos` int(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.rafael_agenda: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.rafael_localizacao
DROP TABLE IF EXISTS `rafael_localizacao`;
CREATE TABLE IF NOT EXISTS `rafael_localizacao` (
  `Sul` varchar(50) DEFAULT NULL,
  `Sudeste` varchar(50) DEFAULT NULL,
  `Centro-oeste` varchar(50) DEFAULT NULL,
  `Norte` varchar(50) DEFAULT NULL,
  `Nordeste` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.rafael_localizacao: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.rafael_pessoa
DROP TABLE IF EXISTS `rafael_pessoa`;
CREATE TABLE IF NOT EXISTS `rafael_pessoa` (
  `nome` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.rafael_pessoa: ~4 rows (aproximadamente)
REPLACE INTO `rafael_pessoa` (`nome`, `cep`, `email`) VALUES
	('rafael pires', '937478', 'ragdhsfh@hdih.com'),
	('rafael pires', NULL, NULL),
	('rafael pires', NULL, NULL),
	('rafael pires', NULL, NULL),
	('rafael ', NULL, NULL),
	('rafael ', NULL, NULL);

-- Copiando estrutura para tabela prob2022_2.rafael_previsao
DROP TABLE IF EXISTS `rafael_previsao`;
CREATE TABLE IF NOT EXISTS `rafael_previsao` (
  `Umidade` varchar(100) DEFAULT NULL,
  `Velocidade` varchar(100) DEFAULT NULL,
  `SensacaoTermica` varchar(100) DEFAULT NULL,
  `IndiceUV` varchar(10) DEFAULT NULL,
  `QntdChuva` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.rafael_previsao: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.rafael_tiposdeclima
DROP TABLE IF EXISTS `rafael_tiposdeclima`;
CREATE TABLE IF NOT EXISTS `rafael_tiposdeclima` (
  `Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.rafael_tiposdeclima: ~0 rows (aproximadamente)

-- Copiando estrutura para tabela prob2022_2.vinicius_pessoa
DROP TABLE IF EXISTS `vinicius_pessoa`;
CREATE TABLE IF NOT EXISTS `vinicius_pessoa` (
  `nome` varchar(150) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `Coluna 4` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela prob2022_2.vinicius_pessoa: ~0 rows (aproximadamente)
REPLACE INTO `vinicius_pessoa` (`nome`, `endereco`, `cep`, `Coluna 4`) VALUES
	('vinicius', 'rua blabla', '1234', 0);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
