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
-- Table structure for table `tb_motor`
--

DROP TABLE IF EXISTS `tb_motor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_motor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `vin` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code_time` varchar(45) DEFAULT NULL,
  `code_valid` varchar(45) DEFAULT NULL,
  `motor_num` varchar(45) DEFAULT NULL,
  `motor_sid1` varchar(45) DEFAULT NULL,
  `motor_state1` varchar(45) DEFAULT NULL,
  `motor_voltage1` varchar(45) DEFAULT NULL,
  `motor_electricity1` varchar(45) DEFAULT NULL,
  `motor_temperature1` varchar(45) DEFAULT NULL,
  `controller_temperature1` varchar(45) DEFAULT NULL,
  `motor_speed1` varchar(45) DEFAULT NULL,
  `motor_torque1` varchar(45) DEFAULT NULL,
  `motor_sid2` varchar(45) DEFAULT NULL,
  `motor_state2` varchar(45) DEFAULT NULL,
  `motor_voltage2` varchar(45) DEFAULT NULL,
  `motor_electricity2` varchar(45) DEFAULT NULL,
  `motor_temperature2` varchar(45) DEFAULT NULL,
  `controller_temperature2` varchar(45) DEFAULT NULL,
  `motor_speed2` varchar(45) DEFAULT NULL,
  `motor_torque2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`,`vin`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_motor`
--

LOCK TABLES `tb_motor` WRITE;
/*!40000 ALTER TABLE `tb_motor` DISABLE KEYS */;
INSERT INTO `tb_motor` VALUES (1,'LA95C86H9G1LC0001','2018-09-06 12:00:00','有效','2','1','关闭','333','33','34','34','0','0','2','23','23','32','32','32','32','34'),(2,'LA95C86H9G1LC0002','2018-09-06 12:00:00','有效','1','1','关闭','333','33','34','34','0','0',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tb_motor` ENABLE KEYS */;
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
