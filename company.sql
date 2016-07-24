/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50546
Source Host           : localhost:3306
Source Database       : company

Target Server Type    : MYSQL
Target Server Version : 50546
File Encoding         : 65001

Date: 2016-07-24 16:14:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `article`
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `typeid` int(5) NOT NULL,
  `title` varchar(100) NOT NULL,
  `contents` text NOT NULL,
  `author` varchar(100) NOT NULL,
  `publish_time` int(11) NOT NULL,
  `view_num` int(11) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', 'php');
INSERT INTO `class` VALUES ('2', 'java');
INSERT INTO `class` VALUES ('3', 'c#');

-- ----------------------------
-- Table structure for `marks`
-- ----------------------------
DROP TABLE IF EXISTS `marks`;
CREATE TABLE `marks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `marks` int(5) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sid` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of marks
-- ----------------------------
INSERT INTO `marks` VALUES ('1', '4', '1', '80');
INSERT INTO `marks` VALUES ('2', '4', '3', '70');
INSERT INTO `marks` VALUES ('3', '6', '2', '100');
INSERT INTO `marks` VALUES ('4', '8', '1', '100');
INSERT INTO `marks` VALUES ('5', '9', '3', '59');
INSERT INTO `marks` VALUES ('8', '0', '1', '90');
INSERT INTO `marks` VALUES ('9', '0', '1', '90');
INSERT INTO `marks` VALUES ('10', '0', '1', '90');
INSERT INTO `marks` VALUES ('11', '0', '1', '90');
INSERT INTO `marks` VALUES ('12', '0', '1', '90');
INSERT INTO `marks` VALUES ('13', '0', '1', '90');
INSERT INTO `marks` VALUES ('14', '0', '1', '90');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` smallint(3) NOT NULL,
  `sex` tinyint(1) NOT NULL,
  `addr` varchar(50) NOT NULL,
  `marks` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', 'lili', '10', '0', 'beijing', '100');
INSERT INTO `student` VALUES ('2', 'lucy', '20', '1', 'nanjing', '90');
INSERT INTO `student` VALUES ('3', 'tom', '20', '1', 'shanghai', '80');
INSERT INTO `student` VALUES ('4', 'jim', '30', '0', 'beijing', '78');
INSERT INTO `student` VALUES ('5', 'blue', '40', '1', 'nanjing', '69');
INSERT INTO `student` VALUES ('6', 'jimi', '40', '0', 'henan', '80');
INSERT INTO `student` VALUES ('10', 'lll', '1111', '1', 'ads', '46');
INSERT INTO `student` VALUES ('11', 'lll', '1111', '1', 'ads', '46');
INSERT INTO `student` VALUES ('13', 'aa', '11', '11', '111', '111');
INSERT INTO `student` VALUES ('14', 'aa', '11', '11', '111', '111');
INSERT INTO `student` VALUES ('15', '111', '122', '12', '阿斯顿的风格', '56');
INSERT INTO `student` VALUES ('16', '111', '122', '12', '阿斯顿的风格', '56');

-- ----------------------------
-- View structure for `stu`
-- ----------------------------
DROP VIEW IF EXISTS `stu`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `stu` AS select `s`.`id` AS `id`,`s`.`name` AS `name`,`s`.`age` AS `age`,`m`.`marks` AS `marks` from (`student` `s` join `marks` `m`) where (`s`.`id` = `m`.`sid`) ;
DROP TRIGGER IF EXISTS `t2`;
DELIMITER ;;
CREATE TRIGGER `t2` AFTER INSERT ON `student` FOR EACH ROW begin 
insert into marks(sid,cid,marks) values( id,1,90);
end
;;
DELIMITER ;
DROP TRIGGER IF EXISTS `t1`;
DELIMITER ;;
CREATE TRIGGER `t1` AFTER DELETE ON `student` FOR EACH ROW begin
delete from mark where sid=old.id;
end
;;
DELIMITER ;
