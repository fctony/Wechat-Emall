/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.19 : Database - emall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`emall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `emall`;

/*Table structure for table `banner` */

DROP TABLE IF EXISTS `banner`;

CREATE TABLE `banner` (
  `business_id` int(11) DEFAULT '0',
  `date_add` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_update` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `link_url` varchar(255) DEFAULT NULL,
  `paixu` int(11) DEFAULT '0',
  `remark` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `status_str` varchar(50) DEFAULT '显示',
  `title` varchar(255) DEFAULT '0',
  `type` varchar(50) DEFAULT '0',
  `user_id` int(11) DEFAULT '51',
  `pic_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `banner` */

insert  into `banner`(`business_id`,`date_add`,`date_update`,`link_url`,`paixu`,`remark`,`status`,`status_str`,`title`,`type`,`user_id`,`pic_url`) values 
(0,'2017-12-04 00:00:00','2017-12-04 09:19:10',NULL,0,NULL,0,'显示','0','0',51,'http://localhost:8080/i/banner/5104f3493b232032fd06a7dede26571b_origin.png'),
(0,'2017-12-04 18:46:32','2017-12-04 18:46:32',NULL,0,NULL,0,'显示','0','0',51,'http://localhost:8080/i/banner/42a5a6755cc58f3b96cf1aedcd06a550_origin.png'),
(0,'2017-12-04 18:50:37','2017-12-04 18:50:37',NULL,0,NULL,0,'显示','0','0',51,'http://localhost:8080/i/banner/b9682f9ff31a79277fbd115509242b9a_origin.png');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `is_use` tinyint(1) DEFAULT NULL,
  `key` varchar(32) DEFAULT NULL,
  `level` int(11) DEFAULT '1',
  `name` varchar(50) DEFAULT NULL,
  `paixu` int(11) DEFAULT '0',
  `pid` int(11) DEFAULT '0',
  `type` varchar(32) DEFAULT NULL,
  `user_id` int(11) DEFAULT '51',
  `date_add` datetime DEFAULT CURRENT_TIMESTAMP,
  `icon` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `category` */

insert  into `category`(`id`,`is_use`,`key`,`level`,`name`,`paixu`,`pid`,`type`,`user_id`,`date_add`,`icon`) values 
(1,1,'rl',1,'肉类原料',0,0,'',51,'2017-12-04 08:25:51',''),
(2,1,'sc',1,'蔬菜原料',0,0,'',51,'2017-12-04 18:27:07',''),
(3,1,'qt',1,'其它',0,0,'',51,'2017-12-04 18:27:40','');

/*Table structure for table `coupons` */

DROP TABLE IF EXISTS `coupons`;

CREATE TABLE `coupons` (
  `id` int(11) NOT NULL,
  `date_end_days` int(11) DEFAULT NULL,
  `date_end_type` int(11) DEFAULT '1',
  `date_start_type` int(11) DEFAULT '1',
  `money_hreshold` int(11) DEFAULT NULL,
  `money_max` double DEFAULT NULL,
  `money_min` double DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `needScore` int(11) DEFAULT NULL,
  `number_git_number` int(11) DEFAULT NULL,
  `number_git` int(11) DEFAULT NULL,
  `number_left` int(11) DEFAULT NULL,
  `number_person_max` int(11) DEFAULT NULL,
  `number_total` int(11) DEFAULT NULL,
  `number_used` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `status_str` varchar(32) DEFAULT '正常',
  `type` varchar(32) DEFAULT '0',
  `date_add` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `coupons` */

insert  into `coupons`(`id`,`date_end_days`,`date_end_type`,`date_start_type`,`money_hreshold`,`money_max`,`money_min`,`name`,`needScore`,`number_git_number`,`number_git`,`number_left`,`number_person_max`,`number_total`,`number_used`,`status`,`status_str`,`type`,`date_add`) values 
(1,10,1,1,10,60,1,'春季大优惠',0,800,800,200,1,1000,24,0,'正常','shop','2017-12-04 18:36:28'),
(2,5,1,1,1,15,1,'全城送大礼',0,100,100,900,1,1000,50,0,'正常','shop','2017-12-04 18:37:53'),
(3,1,1,1,2,20,1,'当天通用',0,100,100,900,1,100,20,0,'正常','shop','2017-12-04 18:38:24');

/*Table structure for table `food` */

DROP TABLE IF EXISTS `food`;

CREATE TABLE `food` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bar_code` varchar(255) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `characteristic` varchar(255) DEFAULT NULL,
  `commission` double DEFAULT '10',
  `commission_type` int(11) DEFAULT '1',
  `date_add` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_start` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_update` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `logistics_id` int(11) DEFAULT '12',
  `min_price` double DEFAULT '10',
  `name` varchar(255) DEFAULT NULL,
  `number_fav` int(11) DEFAULT '0',
  `number_good_reputation` int(11) DEFAULT '5',
  `number_orders` int(11) DEFAULT '100',
  `original_price` double DEFAULT '12',
  `paixu` int(11) DEFAULT '0',
  `pic` varchar(255) DEFAULT 'http://localhost:8080/i/food/',
  `property_ids` varchar(255) DEFAULT ',11,',
  `recommend_status` int(11) DEFAULT '0',
  `recommend_status_str` varchar(32) DEFAULT '普通',
  `shop_id` int(11) DEFAULT '0',
  `status` int(11) DEFAULT '0',
  `status_str` varchar(32) DEFAULT '上架',
  `stores` int(11) DEFAULT '9999',
  `user_id` int(11) DEFAULT '51',
  `views` int(11) DEFAULT '1111',
  `weight` double DEFAULT '0',
  `icon` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `food` */

insert  into `food`(`id`,`bar_code`,`category_id`,`characteristic`,`commission`,`commission_type`,`date_add`,`date_start`,`date_update`,`logistics_id`,`min_price`,`name`,`number_fav`,`number_good_reputation`,`number_orders`,`original_price`,`paixu`,`pic`,`property_ids`,`recommend_status`,`recommend_status_str`,`shop_id`,`status`,`status_str`,`stores`,`user_id`,`views`,`weight`,`icon`) values 
(1,NULL,1,'好喝大补不上火',10,1,'2017-12-05 14:49:33','2017-12-05 14:49:42','2017-12-05 14:49:44',12,10,'玉米胡萝卜排骨汤',0,6,104,10,0,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg',',11，',0,'普通',0,0,'上架',9999,51,11148,0,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg_m'),
(2,NULL,1,'专注您的健康',10,1,'2017-12-05 14:56:05','2017-12-05 14:56:05','2017-12-05 14:56:05',12,10,'山药乌鸡汤',0,6,101,10,0,'http://localhost:8080/i/food/609b27be4c4077fa72036894feb16b46_origin.jpg',',11,',0,'普通',0,0,'上架',9999,51,111146,0,'http://localhost:8080/i/food/609b27be4c4077fa72036894feb16b46_origin.jpg_m'),
(3,NULL,1,'您的贴心小炖汤',10,1,'2017-12-05 14:58:43','2017-12-05 14:58:43','2017-12-05 14:58:43',12,10,'虫草花乌鸡汤',0,5,100,12,0,'http://localhost:8080/i/food/292599a6a19111211dd52bf74da8a8d3_origin.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/292599a6a19111211dd52bf74da8a8d3_origin.jpg_m'),
(4,NULL,2,'清甜大补',10,1,'2017-12-05 14:59:15','2017-12-05 14:59:15','2017-12-05 14:59:15',12,10,'玉竹白果排骨汤',0,5,100,12,0,'http://localhost:8080/i/food/1932974651daf173663ca34a44244517_origin.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/1932974651daf173663ca34a44244517_origin.jpg_m'),
(5,NULL,2,'最好喝的汤',10,1,'2017-12-05 15:00:26','2017-12-05 15:00:26','2017-12-05 15:00:26',12,10,'白果排骨汤',0,5,100,12,0,'http://localhost:8080/i/food/d2062fe2e702f1096dcef1d723300fd0_origin.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/d2062fe2e702f1096dcef1d723300fd0_origin.jpg_M'),
(6,NULL,2,'C汤',10,1,'2017-12-05 15:02:29','2017-12-05 15:02:29','2017-12-05 15:02:29',12,10,'老火汤',0,5,100,12,0,'http://localhost:8080/i/food/u10107029712954515907fm27.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/u10107029712954515907fm27.jpg'),
(7,NULL,3,'a汤',10,1,'2017-12-05 15:03:08','2017-12-05 15:03:08','2017-12-05 15:03:08',12,10,'阿妈靓汤',0,5,100,12,0,'http://localhost:8080/i/food/u27233031063932719367fm27gp0.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/u27233031063932719367fm27gp0.jpg'),
(8,NULL,3,'b',10,1,'2017-12-05 15:04:47','2017-12-05 15:04:47','2017-12-05 15:04:47',12,10,'鸡汤',0,5,100,12,0,'http://localhost:8080/i/food/u30760379463510241045&fm27gp0.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/u30760379463510241045&fm27gp0.jpg'),
(9,NULL,3,'cc',10,1,'2017-12-05 15:05:09','2017-12-05 15:05:09','2017-12-05 15:05:09',12,10,'叉烧骨汤',0,5,100,12,0,'http://localhost:8080/i/food/u3711216293469422092fm27gp0.jpg',',11,',0,'普通',0,0,'上架',9999,51,1111,0,'http://localhost:8080/i/food/u3711216293469422092fm27gp0.jpg');

/*Table structure for table `food_detail` */

DROP TABLE IF EXISTS `food_detail`;

CREATE TABLE `food_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `category_id` int(11) DEFAULT NULL,
  `food_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `food_detail` */

insert  into `food_detail`(`id`,`content`,`category_id`,`food_id`) values 
(1,'<span>味道好，好喝</span>',1,1),
(2,'<span>味道好，好喝</span>',1,2),
(3,'<span>味道好，好喝</span>',1,3),
(4,'<span>味道好</span>',2,4),
(5,'<span>味道好</span>',2,5),
(6,'<span>味道好</span>',2,6),
(7,'<span style=\'color:red\'>好喝</span>',3,7),
(8,'<span style=\'color:red\'>好喝</span>',3,8),
(9,'<span style=\'color:red\'>好喝</span>',3,9);

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `is_show` tinyint(1) DEFAULT '1',
  `title` varchar(255) DEFAULT NULL,
  `date_add` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `notice` */

insert  into `notice`(`id`,`is_show`,`title`,`date_add`) values 
(1,1,'“汤本味”推出老火靓汤！！！','2017-12-05 17:13:53'),
(2,1,'今日大优惠！！','2017-12-05 17:14:07'),
(3,1,'多喝汤，对身体好','2017-12-05 17:14:31');

/*Table structure for table `pics` */

DROP TABLE IF EXISTS `pics`;

CREATE TABLE `pics` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_id` int(11) DEFAULT NULL,
  `pic` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `pics` */

insert  into `pics`(`id`,`goods_id`,`pic`) values 
(1,1,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(2,2,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(3,3,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(4,4,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(5,5,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(6,6,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(7,7,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(8,8,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg'),
(9,9,'http://localhost:8080/i/food/05fa68ebe0af3b424efe8ea581606dd9_origin.jpg');

/*Table structure for table `reputation` */

DROP TABLE IF EXISTS `reputation`;

CREATE TABLE `reputation` (
  `date_reputation` datetime DEFAULT CURRENT_TIMESTAMP,
  `good_reputation` int(11) DEFAULT '2',
  `good_reputation_remark` varchar(255) DEFAULT '非常愉快的一次购物！',
  `good_reputation_str` varchar(20) DEFAULT '好评',
  `number` int(11) DEFAULT '1',
  `order_id` int(11) DEFAULT '666',
  `uid` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT '51',
  `goods_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reputation` */

insert  into `reputation`(`date_reputation`,`good_reputation`,`good_reputation_remark`,`good_reputation_str`,`number`,`order_id`,`uid`,`user_id`,`goods_id`) values 
('2017-12-05 15:14:47',2,'非常愉快的一次购物！','好评',1,666,1,51,1);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `avatar_url` varchar(255) DEFAULT NULL,
  `city` varchar(50) DEFAULT 'GuangZhou',
  `date_add` datetime DEFAULT CURRENT_TIMESTAMP,
  `date_login` datetime DEFAULT CURRENT_TIMESTAMP,
  `ip_add` varchar(50) DEFAULT NULL,
  `ip_login` varchar(50) DEFAULT NULL,
  `is_idcard_check` tinyint(1) DEFAULT '0',
  `mobile` varchar(32) DEFAULT '123456',
  `nick` varchar(32) DEFAULT '用户',
  `province` varchar(32) DEFAULT 'GuangDong',
  `source` int(11) DEFAULT '0',
  `source_str` varchar(32) DEFAULT '测试用户',
  `status` int(11) DEFAULT '0',
  `status_str` varchar(32) DEFAULT '默认',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`avatar_url`,`city`,`date_add`,`date_login`,`ip_add`,`ip_login`,`is_idcard_check`,`mobile`,`nick`,`province`,`source`,`source_str`,`status`,`status_str`) values 
(1,'http://localhost:8080/i/2012100413195471481.jpg_m','GuangZhou','2017-12-05 15:14:17','2017-12-05 15:14:17','127.0.0.1','127.0.0.1',0,'123456','用户','GuangDong',0,'测试用户',0,'默认');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
