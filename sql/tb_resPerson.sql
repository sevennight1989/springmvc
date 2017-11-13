/*
Navicat MySQL Data Transfer

Source Server         : test001
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-13 11:13:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_resperson`
-- ----------------------------
DROP TABLE IF EXISTS `tb_resperson`;
CREATE TABLE `tb_resperson` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(24) NOT NULL,
  `PHONE` varchar(24) NOT NULL,
  `TAG` varchar(24) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_resperson
-- ----------------------------
INSERT INTO `tb_resperson` VALUES ('1', '张三', '18913847525', '1');
INSERT INTO `tb_resperson` VALUES ('2', '李四', '13813851421', '1');
INSERT INTO `tb_resperson` VALUES ('3', '王五', '13851244458', '1');
INSERT INTO `tb_resperson` VALUES ('4', '赵四', '15385127962', '2');
INSERT INTO `tb_resperson` VALUES ('5', '刘能', '147581478965', '2');
INSERT INTO `tb_resperson` VALUES ('6', '谢广坤', '18569554122', '3');
INSERT INTO `tb_resperson` VALUES ('7', '刘志', '18915745962', '3');
INSERT INTO `tb_resperson` VALUES ('8', '刘一水', '18915745962', '4');
INSERT INTO `tb_resperson` VALUES ('9', '谢小梅', '18915745962', '4');
INSERT INTO `tb_resperson` VALUES ('10', '王大拿', '18915745962', '4');
INSERT INTO `tb_resperson` VALUES ('11', '杨小燕', '18915745962', '4');
INSERT INTO `tb_resperson` VALUES ('12', 'Tom', '18915745962', '5');
INSERT INTO `tb_resperson` VALUES ('13', 'Peter', '18915745962', '5');
INSERT INTO `tb_resperson` VALUES ('14', 'Vettel', '18915745962', '5');
