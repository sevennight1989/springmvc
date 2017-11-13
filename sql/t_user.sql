/*
Navicat MySQL Data Transfer

Source Server         : test001
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2017-11-13 11:13:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) NOT NULL,
  `user_age` varchar(20) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'Tom', '17');
INSERT INTO `t_user` VALUES ('2', 'Lily', '16');
INSERT INTO `t_user` VALUES ('3', 'Peter', '17');
INSERT INTO `t_user` VALUES ('4', 'xxxx', '19');
INSERT INTO `t_user` VALUES ('5', '张三', '20');
INSERT INTO `t_user` VALUES ('6', 'Vettel', '29');
INSERT INTO `t_user` VALUES ('7', 'Lisa', '22');
INSERT INTO `t_user` VALUES ('8', 'Labala', '47');
