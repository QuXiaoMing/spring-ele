/*
SQLyog Enterprise v12.09 (64 bit)
MySQL - 5.6.36 : Database - seller
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`manager` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `ele`;

/*Table structure for table `order_t` */

DROP TABLE IF EXISTS `dic`;

CREATE TABLE `dic` (
  `id` varchar(36) COLLATE utf8_unicode_ci NOT NULL COMMENT '字典ID',
  `key` varchar(10) COLLATE utf8_unicode_ci NOT NULL COMMENT '字段key',
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '字段名称',
  `value` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '字典value',
  `text` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '字典text',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
