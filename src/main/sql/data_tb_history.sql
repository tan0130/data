-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: 127.0.0.1    Database: data
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_history`
--

DROP TABLE IF EXISTS `tb_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_history` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vin` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `server_time` varchar(20) DEFAULT NULL,
  `code_time` varchar(20) DEFAULT NULL,
  `code_type` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code_check` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code_length` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code_origin` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code_vehicle` varchar(100) CHARACTER SET ujis COLLATE ujis_japanese_ci NOT NULL,
  `code_motor` varchar(100) DEFAULT NULL,
  `code_location` varchar(45) NOT NULL,
  `code_extreme` varchar(45) NOT NULL,
  `code_alert` varchar(45) NOT NULL,
  `code_voltage` varchar(1500) NOT NULL,
  `code_temperature` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_history`
--

LOCK TABLES `tb_history` WRITE;
/*!40000 ALTER TABLE `tb_history` DISABLE KEYS */;
INSERT INTO `tb_history` VALUES (1,'LA95C86H9G1LC0001','2018-09-05 12:00:00','2018-09-05 12:00:00','国标','成功','1000','2323777777777777777','23','23','23','23','23','23','23'),(2,'LA95C86H9G1LC0001','2018-09-06 12:00:00','2018-09-06 12:00:00','国标','成功','122','23231111','12','32','23','23','32','23','23'),(3,'LA95C86H9G1LC0001','2018-09-06 12:00:01','2018-09-06 12:00:01','国标','成功','233','232312222','12','12','12','12','12','12','12');
/*!40000 ALTER TABLE `tb_history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-11 15:28:15
