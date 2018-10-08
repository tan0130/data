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
-- Table structure for table `tb_log`
--

DROP TABLE IF EXISTS `tb_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(45) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `class` varchar(45) DEFAULT NULL,
  `method` varchar(45) DEFAULT NULL,
  `createtime` varchar(45) DEFAULT NULL,
  `loglevel` varchar(45) DEFAULT NULL,
  `message` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_log`
--

LOCK TABLES `tb_log` WRITE;
/*!40000 ALTER TABLE `tb_log` DISABLE KEYS */;
INSERT INTO `tb_log` VALUES (1,'1','明割','controller.UserController','check','2018-09-11 11:37:48','INFO ','用户登录成功'),(2,'1','明割','controller.UserController','check','2018-09-11 11:47:47','INFO ','用户登录成功'),(3,'1','明割','controller.UserController','check','2018-09-11 11:50:56','INFO ','用户登录成功'),(4,'1','明割','controller.UserController','check','2018-09-11 11:55:26','INFO ','用户登录成功'),(5,'1','明割','controller.UserController','check','2018-09-11 11:58:26','INFO ','用户登录成功'),(6,'1','明割','controller.UserController','check','2018-09-11 13:07:17','INFO ','用户登录成功'),(7,'1','明割','controller.UserController','check','2018-09-11 13:14:16','INFO ','用户登录成功'),(8,'1','明割','controller.UserController','check','2018-09-11 13:19:21','INFO ','用户登录成功'),(9,'1','明割','controller.UserController','check','2018-09-11 13:30:28','INFO ','用户登录成功'),(10,'1','明割','controller.UserController','check','2018-09-11 13:32:00','INFO ','用户登录成功'),(11,'1','明割','controller.UserController','updatePassword','2018-09-11 13:32:15','INFO ','用户密码修改成功'),(12,'1','明割','controller.UserController','check','2018-09-11 13:33:56','INFO ','用户登录成功'),(13,'1','明割','controller.UserController','updatePassword','2018-09-11 13:34:17','INFO ','用户密码修改成功'),(14,'1','明割','controller.UserController','check','2018-09-11 13:42:00','INFO ','用户登录成功'),(15,'1','明割','controller.UserController','updatePassword','2018-09-11 13:42:17','INFO ','用户密码修改成功'),(16,'1','明割','controller.UserController','check','2018-09-11 13:42:51','INFO ','用户登录成功'),(17,'1','明割','controller.UserController','updatePassword','2018-09-11 13:43:12','INFO ','用户密码修改成功'),(18,'1','明割','controller.UserController','check','2018-09-11 13:44:05','INFO ','用户登录成功'),(19,'1','明割','controller.UserController','updatePassword','2018-09-11 13:44:51','INFO ','用户密码修改成功'),(20,'1','明割','controller.UserController','check','2018-09-11 13:46:20','INFO ','用户登录成功'),(21,'1','明割','controller.UserController','updatePassword','2018-09-11 13:46:34','INFO ','用户密码修改成功'),(22,'1','明割','controller.UserController','updatePassword','2018-09-11 13:47:23','INFO ','用户密码修改成功'),(23,'1','明割','controller.UserController','check','2018-09-11 13:52:36','INFO ','用户登录成功'),(24,'1','明割','controller.UserController','updatePassword','2018-09-11 13:53:10','INFO ','用户密码修改成功'),(25,'1','明割','controller.UserController','check','2018-09-11 14:15:21','INFO ','用户登录成功'),(26,'1','明割','controller.UserController','check','2018-09-11 14:15:29','INFO ','用户登录成功'),(27,'1','明割','controller.UserController','check','2018-09-11 14:17:16','INFO ','用户登录成功'),(28,'1','明割','controller.UserController','check','2018-09-11 14:17:51','INFO ','用户登录成功'),(29,'1','明割','controller.UserController','check','2018-09-11 14:21:39','INFO ','用户登录成功'),(30,'1','明割','controller.UserController','updatePassword','2018-09-11 14:22:22','INFO ','用户密码修改成功'),(31,'1','明割','controller.UserController','check','2018-09-11 14:24:36','INFO ','用户登录成功'),(32,'1','明割','controller.UserController','updatePassword','2018-09-11 14:24:55','INFO ','用户密码修改成功'),(33,'1','明割','controller.UserController','check','2018-09-11 14:25:44','INFO ','用户登录成功'),(34,'1','明割','controller.UserController','updatePassword','2018-09-11 14:26:09','INFO ','用户密码修改成功'),(35,'1','明割','controller.UserController','check','2018-09-11 14:26:32','INFO ','用户登录成功'),(36,'1','明割','controller.UserController','check','2018-09-11 14:29:00','INFO ','用户登录成功'),(37,'1','明割','controller.UserController','updatePassword','2018-09-11 14:29:16','INFO ','用户密码修改成功'),(38,'1','明割','controller.UserController','check','2018-09-11 14:31:59','INFO ','用户登录成功'),(39,'1','明割','controller.UserController','updatePassword','2018-09-11 14:32:14','INFO ','用户密码修改成功'),(40,'1','明割','controller.UserController','check','2018-09-11 14:41:38','INFO ','用户登录成功');
/*!40000 ALTER TABLE `tb_log` ENABLE KEYS */;
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
