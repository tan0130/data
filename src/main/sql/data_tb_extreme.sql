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
-- Table structure for table `tb_extreme`
--

DROP TABLE IF EXISTS `tb_extreme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_extreme` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vin` varchar(45) NOT NULL,
  `vol_max` varchar(45) DEFAULT NULL,
  `vol_max_code` varchar(45) DEFAULT NULL,
  `vol_max_value` varchar(45) DEFAULT NULL,
  `vol_min` varchar(45) DEFAULT NULL,
  `vol_min_code` varchar(45) DEFAULT NULL,
  `vol_min_value` varchar(45) DEFAULT NULL,
  `temperature_max` varchar(45) DEFAULT NULL,
  `temperature_max_code` varchar(20) DEFAULT NULL,
  `temperature_max_value` varchar(45) DEFAULT NULL,
  `temperature_min` varchar(45) DEFAULT NULL,
  `temperature_min_code` varchar(45) DEFAULT NULL,
  `temperature_min_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`,`vin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_extreme`
--

LOCK TABLES `tb_extreme` WRITE;
/*!40000 ALTER TABLE `tb_extreme` DISABLE KEYS */;
INSERT INTO `tb_extreme` VALUES (1,'LA95C86H9G1LC0001','1','23','3.5','1','20','3.1','2','23','45','2','34','35');
/*!40000 ALTER TABLE `tb_extreme` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-11 14:39:47
