/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : aviation

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-10-19 14:56:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `interviewee`
-- ----------------------------
DROP TABLE IF EXISTS `interviewee`;
CREATE TABLE `interviewee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `phone` bigint(11) NOT NULL,
  `wx_name` varchar(200) DEFAULT NULL,
  `wx_avatar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interviewee
-- ----------------------------
INSERT INTO `interviewee` VALUES ('2', '13285322293', '测试', 'localhost');
INSERT INTO `interviewee` VALUES ('3', '15010163400', '开发', 'localhost');
INSERT INTO `interviewee` VALUES ('4', '18666018606', '木木', 'localhost');
