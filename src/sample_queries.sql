DATABASE:
/*SQLyog Ultimate v9.02 
MySQL - 5.0.41-community-nt : Database - ensuring
*********************************************************************
*/ /*!40101 SET NAMES utf8 */;
/*!40101 SET SQL_MODE=''*/;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ensuring` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `ensuring`;
/*Table structure for table `login` */
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (  `username` varchar(50) default NULL,`password` varchar(50) default NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*Data for the table `login` */
insert  into `login`(`username`,`password`) values ('san','san');
/*Table structure for table `owner` */
DROP TABLE IF EXISTS `owner`;
CREATE TABLE `owner` (`username` varchar(50) default NULL,  `password` varchar(50)default NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*Data for the table `owner` */
insert  into `owner`(`username`,`password`) values ('san','san');
/*Table structure for table `validate` */
DROP TABLE IF EXISTS `validate`;
CREATE TABLE `validate` ( `bank` varchar(50) default NULL,`type` varchar(50) default NULL,`name` varchar(50) default NULL, `number` varchar(50) default NULL,`pin` varchar(50) default NULL) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*Data for the table `validate` */
    Insert  into validate`(`bank`,`type`,`name`,`number`,`pin`) values ('SBI','Visa','san','123456','1234');
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
