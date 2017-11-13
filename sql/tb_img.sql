/*
Navicat MySQL Data Transfer

Source Server         : test001
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-13 11:13:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tb_img`
-- ----------------------------
DROP TABLE IF EXISTS `tb_img`;
CREATE TABLE `tb_img` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `FILE_NAME` varchar(255) NOT NULL,
  `FILE_TYPEID` varchar(255) NOT NULL,
  `FORMAT` varchar(255) NOT NULL,
  `LOAN_ID` varchar(255) NOT NULL,
  `PADOC_ID` varchar(255) NOT NULL,
  `PAGE_NUM` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_img
-- ----------------------------
INSERT INTO `tb_img` VALUES ('1', '15101087699190.jpg', '381', 'jpg', '4053367', '91245b767e4eb644216ac3136c06c4e3ea2', '4');
INSERT INTO `tb_img` VALUES ('2', '{527B2DA3-66BA-40A2-9643-E79C4130B4CE}.jpg', '381', 'jpg', '4053367', '9121a9bb446ff474f2083612fc03377342a', '1');
INSERT INTO `tb_img` VALUES ('3', '{527B2DA3-66BA-40A2-9643-E79C4130B4CE}.jpg', '382', 'jpg', '4053367', '9124f236d6a33b144eba36af95d49c2ecb8', '3');
INSERT INTO `tb_img` VALUES ('4', '{527B2DA3-66BA-40A2-9643-E79C4130B4CE}.jpg', '380', 'jpg', '4053367', '9128f3b651a100d4b9db4cb78de51af4ce8', '2');
