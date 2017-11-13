/*
Navicat MySQL Data Transfer

Source Server         : test001
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-13 11:13:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_progress`
-- ----------------------------
DROP TABLE IF EXISTS `tb_progress`;
CREATE TABLE `tb_progress` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TITLE` varchar(24) NOT NULL,
  `APPROVECOMMENT` varchar(24) DEFAULT NULL,
  `OPERATETIME` datetime DEFAULT NULL,
  `RESPERSONTAG` varchar(24) NOT NULL,
  `STATUS` varchar(24) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_progress
-- ----------------------------
INSERT INTO `tb_progress` VALUES ('1', '提交申请', '同意', '2017-11-12 09:58:44', '1', '0');
INSERT INTO `tb_progress` VALUES ('2', '小组审核', '审核中', '2017-11-13 10:00:06', '2', '0');
INSERT INTO `tb_progress` VALUES ('3', '部门审核', null, null, '3', '1');
INSERT INTO `tb_progress` VALUES ('4', '总部审核', null, null, '4', '1');
INSERT INTO `tb_progress` VALUES ('5', '集团审核', null, null, '5', '1');
