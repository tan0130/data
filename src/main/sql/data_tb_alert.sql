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
-- Table structure for table `tb_alert`
--

DROP TABLE IF EXISTS `tb_alert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_alert` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vin` varchar(45) NOT NULL,
  `temp_differ_alert` varchar(45) DEFAULT NULL,
  `temp_high_alert` varchar(45) DEFAULT NULL,
  `type_high_alert` varchar(45) DEFAULT NULL,
  `type_low_alert` varchar(20) DEFAULT NULL,
  `soc_high_alert` varchar(45) DEFAULT NULL,
  `soc_low_alert` varchar(45) DEFAULT NULL,
  `battery_high_alert` varchar(45) DEFAULT NULL,
  `battery_low_alert` varchar(45) DEFAULT NULL,
  `soc_jump_alert` varchar(45) DEFAULT NULL,
  `insulation_alert` varchar(45) DEFAULT NULL,
  `sys_differ_alert` varchar(45) DEFAULT NULL,
  `battery_differ_alert` varchar(45) DEFAULT NULL,
  `DCDC_temp_alert` varchar(45) DEFAULT NULL,
  `DCDC_status_alert` varchar(45) DEFAULT NULL,
  `type_high_alert1` varchar(45) DEFAULT NULL,
  `controller_temperature_alert` varchar(45) DEFAULT NULL,
  `high_voltage_alert` varchar(45) DEFAULT NULL,
  `motor_temperature_alert` varchar(45) DEFAULT NULL,
  `brake_sys_alert` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`,`vin`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_alert`
--

LOCK TABLES `tb_alert` WRITE;
/*!40000 ALTER TABLE `tb_alert` DISABLE KEYS */;
INSERT INTO `tb_alert` VALUES (1,'LA95C86H9G1LC0001','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常','正常');
/*!40000 ALTER TABLE `tb_alert` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-11 15:28:16
