/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : purchasesys

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-01-17 20:55:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `equipcategory` varchar(255) NOT NULL,
  `equipcategoryname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`equipcategory`),
  KEY `equipcategoryname` (`equipcategoryname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('03', 'IT设备类');
INSERT INTO `category` VALUES ('07', '办公');
INSERT INTO `category` VALUES ('02', '加工设备类');
INSERT INTO `category` VALUES ('13', '厨具');
INSERT INTO `category` VALUES ('04', '器具类');
INSERT INTO `category` VALUES ('10', '图书');
INSERT INTO `category` VALUES ('11', '家居');
INSERT INTO `category` VALUES ('05', '家用电器');
INSERT INTO `category` VALUES ('01', '工具类');
INSERT INTO `category` VALUES ('06', '手机');
INSERT INTO `category` VALUES ('12', '文娱类');
INSERT INTO `category` VALUES ('08', '服装');
INSERT INTO `category` VALUES ('15', '运动器材');
INSERT INTO `category` VALUES ('14', '鞋靴');
INSERT INTO `category` VALUES ('09', '食品');

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `orgid` int(10) NOT NULL AUTO_INCREMENT,
  `orgname` varchar(30) DEFAULT NULL,
  `orgpeople` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`orgid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------
INSERT INTO `company` VALUES ('1', '001org', 'durant');
INSERT INTO `company` VALUES ('2', '002org', 'irving');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment` (
  `equipid` varchar(30) NOT NULL,
  `equipname` varchar(255) DEFAULT NULL,
  `equipspec` varchar(255) DEFAULT NULL COMMENT '设备规格',
  `equipmodel` varchar(255) DEFAULT NULL COMMENT '设备型号',
  `equiptext` varchar(255) DEFAULT NULL COMMENT '设备材质',
  `equipnum` int(11) DEFAULT NULL COMMENT '设备数量',
  `equipcategory` varchar(255) DEFAULT NULL COMMENT '设备类别',
  PRIMARY KEY (`equipid`),
  KEY `111` (`equipcategory`),
  CONSTRAINT `111` FOREIGN KEY (`equipcategory`) REFERENCES `category` (`equipcategory`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES ('213bd96f', '尚品宅配 榻榻米床定制 日式衣柜榻榻米 多功能储物收纳床 全屋家具定制 预付订金（非商品价格）', '100.0kg', 'C23833', '实木颗粒板', '23', '11');
INSERT INTO `equipment` VALUES ('25ba2ef0', '得力(deli) 多功能精密维修电子螺丝批组套33件螺丝刀套装 DL1033D', '商品毛重：250.00g', 'DL1033D', '铬钒钢', '288', '01');
INSERT INTO `equipment` VALUES ('3221493c', '韦德之道6', '高帮', '16514436440', '缓震胶,合成革', '2432', '14');
INSERT INTO `equipment` VALUES ('3b8fd88b', '计算机', '40cm', 'x007', '合成材料', '50', '03');
INSERT INTO `equipment` VALUES ('3b8vsdvs', '螺丝刀', '10cm', 'x001', '金属', '10', '01');
INSERT INTO `equipment` VALUES ('461e2966', '1/6哈达威Penny便士 NBA珍藏人偶兵人手办', '高度：12寸', '4897020280194', '含磁铁的1：6斯伯丁篮球 x1 - 附有尺码标签的NBA官方奥兰多', '3000', '12');
INSERT INTO `equipment` VALUES ('46e6f165', '暴雪Blizzard 守望先锋源氏D.Va猎空雕像手办守望周边源氏dva猎空手办模型暴雪官方授权 D.Va', '商品毛重：3.0kg', '1446006', '', '23', '12');
INSERT INTO `equipment` VALUES ('4a94786c', '金庸作品集套装', '包装：平装  开本：32开', '11263578', '胶版纸', '2424', '10');
INSERT INTO `equipment` VALUES ('53f98d61', '数显游标卡尺高精度 150mm电子数显卡尺', '测量方式 其它 测量距离 150mm 工作环境 安装工程；木工工程；水电工程；油漆工程；采购主材；隐蔽泥工工程；其它', 'SL01-22', '塑料碳纤维', '789', '01');
INSERT INTO `equipment` VALUES ('55980d17', '9件套加长型球头内六角扳手', '商品毛重：400.00g', 'S033-1G', '其它', '212', '01');
INSERT INTO `equipment` VALUES ('5a185a32', '家用室内磁控静音健身车自行车运动健身器材', '飞轮重量 6-8KG 阻力档位 8档 传动方式 皮带', 'G1LBLD-300', '碳纤维', '22', '15');
INSERT INTO `equipment` VALUES ('83e0ed27', '海尔E900T2S', '895*520*620', 'CXW-200-E900T2S', '钢化玻璃', '5278', '05');
INSERT INTO `equipment` VALUES ('9be74c9f', '四大名著 红楼梦 三国演义 水浒传 西游记', '开本：32开', '11095900', '胶版纸', '1423', '10');
INSERT INTO `equipment` VALUES ('bcc4f984', '手持式激光测距仪 红外线距离测量仪 量房仪电子尺', '测量方式 激光 测量距离 70米 工作环境 其它；隐蔽泥工工程；安装工程；木工工程；水电工程；采购主材', 'HT-307', '塑料外壳', '234', '01');
INSERT INTO `equipment` VALUES ('be96c95b', '钳子', '10cm', 'x006', '金属', '20', '01');
INSERT INTO `equipment` VALUES ('d15c650f', '电钻工具箱 工具套装 大型工具组套', '组套件数 128件套 表面处理 电镀防锈 产品净重(kg) 8', 'P14006A', '铬钒钢 碳钢', '324', '01');
INSERT INTO `equipment` VALUES ('d9af641a', '美的WBL25B36 多功能榨汁机商', '电源规格 额定电压 220v 额定频率 50hz 额定功率 200-500W', 'WBL25B36', '塑料', '323', '05');
INSERT INTO `equipment` VALUES ('ddsvddvd', '计量器', '30cm', 'x005', '合成材料', '19', '04');
INSERT INTO `equipment` VALUES ('e39b0dcb', '耐克 NIKE LEBRON XVI EP 詹姆斯 男子篮球运动鞋 BQ5970 BQ5970-900多色/金属银/冷灰 44', '商品毛重：1.0kg', 'BQ5970', '橡胶', '2000', '14');
INSERT INTO `equipment` VALUES ('ec78f45d', '飞利浦75PUF6393/T3', '1682*331*1031（mm）', '75PUF6393/T3', '金属底座', '600', '05');
INSERT INTO `equipment` VALUES ('sdadfsfs', '电钻', '50cm', 'x003', '合金', '5', '03');
INSERT INTO `equipment` VALUES ('vasfagsd', '扳手', '20cm', 'x002', '金属', '15', '01');

-- ----------------------------
-- Table structure for needs
-- ----------------------------
DROP TABLE IF EXISTS `needs`;
CREATE TABLE `needs` (
  `needsid` varchar(30) NOT NULL,
  `orgname` varchar(30) DEFAULT NULL,
  `submitdate` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `submiter` varchar(255) DEFAULT NULL COMMENT '需求提交人',
  `orgprincipal` varchar(255) DEFAULT NULL COMMENT '单位负责人',
  `equipid` varchar(30) DEFAULT NULL COMMENT '设备名称',
  `equipnum` int(11) DEFAULT NULL COMMENT '需求数量',
  `equipstate` varchar(255) DEFAULT NULL COMMENT '需求说明',
  `ispass` int(1) DEFAULT NULL,
  `supplier` varchar(255) DEFAULT '',
  PRIMARY KEY (`needsid`),
  KEY `aa` (`equipid`),
  KEY `ss` (`supplier`),
  CONSTRAINT `aa` FOREIGN KEY (`equipid`) REFERENCES `equipment` (`equipid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of needs
-- ----------------------------
INSERT INTO `needs` VALUES ('26634cf9', '1', '2018-12-21 21:08:54', '1', '1', '461e2966', '100', '1', '0', '005');
INSERT INTO `needs` VALUES ('48a181da', '1', '2018-12-19 00:31:13', '1', '1', '46e6f165', '1', '1', '1', '005');
INSERT INTO `needs` VALUES ('4b48369a', '001org', '2018-12-21 21:33:54', 'jack', 'durant', 'vasfagsd', '1', 'eefe', '0', '');
INSERT INTO `needs` VALUES ('77d37d57', 'ewf', '2018-12-18 23:28:51', 'wef', 'ewf', '4a94786c', '3', 'efw', '1', '');
INSERT INTO `needs` VALUES ('b8257d1d', 'qq', '2018-12-21 21:12:21', '2', '2', '3b8fd88b', '2', '2', '-1', '004供应商');
INSERT INTO `needs` VALUES ('befd6442', '海尔', '2018-12-24 20:26:32', '李小明', '孙红雷', '83e0ed27', '50', '海尔电冰箱', '1', '001供应商');
INSERT INTO `needs` VALUES ('c4e30c13', '837', '2018-12-18 23:55:13', '37', '387', '55980d17', '873', '387', '1', '001供应商');
INSERT INTO `needs` VALUES ('c8258585', '1111', '2018-12-16 15:22:17', 'sdf', 'dsf', '25ba2ef0', '11', 'fdfsf', '1', '001供应商');
INSERT INTO `needs` VALUES ('d6977d83', 'sc', '2018-12-21 21:12:17', 'sad', 'asd', 'ddsvddvd', '23', 'sda', '-1', '002供应商');
INSERT INTO `needs` VALUES ('dd0a59f0', '001org', '2018-12-24 20:55:17', 'wade', 'durant', '213bd96f', '44', '家居', '0', '');
INSERT INTO `needs` VALUES ('e530952a', '222', '2018-12-16 15:22:24', 'sdf', 'dsf', '3b8vsdvs', '11', 'fdfsf', '1', '001供应商');
INSERT INTO `needs` VALUES ('ea95476b', 'rt', '2018-12-21 21:09:03', 'et', 'et', '53f98d61', '4', 'et', '1', '001供应商');
INSERT INTO `needs` VALUES ('fd0eeef0', 'qq', '2018-12-13 22:33:36', '2', '2', 'be96c95b', '2', '2', '1', '001供应商');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderid` varchar(30) NOT NULL,
  `supplier` varchar(255) DEFAULT NULL,
  `orderpeople` varchar(255) DEFAULT NULL COMMENT '采购单生成人',
  `ordertime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `arrivaltime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `needsids` varchar(255) DEFAULT NULL COMMENT '存放多个需求单',
  PRIMARY KEY (`orderid`),
  KEY `w` (`supplier`),
  CONSTRAINT `w` FOREIGN KEY (`supplier`) REFERENCES `supplier` (`suppliername`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('111', '001供应商', '11', '2019-01-17 20:49:05', '2019-01-17 20:49:08', '111');

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `supplierid` varchar(30) NOT NULL,
  `suppliername` varchar(255) DEFAULT NULL,
  `supplieradd` varchar(255) DEFAULT NULL COMMENT '地址',
  `suppliercontacter` varchar(255) DEFAULT NULL COMMENT '联系人',
  `suppliertele` varchar(255) DEFAULT NULL,
  `supplierphone` varchar(255) DEFAULT NULL,
  `supplierfax` varchar(255) DEFAULT NULL,
  `suppliermail` varchar(255) DEFAULT NULL COMMENT 'email',
  `supplierzipcode` varchar(255) DEFAULT NULL COMMENT '邮政编码',
  `supplierbankaccount` varchar(255) DEFAULT NULL COMMENT '银行账户',
  `supplierequipcategory` varchar(255) DEFAULT NULL COMMENT '供应产品类别',
  PRIMARY KEY (`supplierid`),
  KEY `suppliername` (`suppliername`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('001', '001供应商', '北京', '张小明', '5445451', null, '6664595', '23523', '110055', '3252351111111111111', '工具类');
INSERT INTO `supplier` VALUES ('002', '002供应商', '黑龙江', '李小明', '6661235', null, '6661235', null, '150000', null, '器具类');
INSERT INTO `supplier` VALUES ('003', '003供应商', '吉林', '王老五', '2155456', null, '2155456', null, '130000', null, '加工设备类');
INSERT INTO `supplier` VALUES ('004', '004供应商', '北京', '赵老六', '2213546', null, '2213546', null, '100000', null, 'IT设备类');
INSERT INTO `supplier` VALUES ('26f5d19b', '006供应商', '黑龙江', '张伟', '6667595', null, '', '', '', '', '器具类');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `submit` tinyint(1) DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL,
  `orgid` int(10) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`username`),
  KEY `ss` (`orgid`),
  CONSTRAINT `ss` FOREIGN KEY (`orgid`) REFERENCES `company` (`orgid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('11111', '123456', '0', 'principal', '2', 'tom');
INSERT INTO `users` VALUES ('admin', 'admin', '0', 'admin', '1', 'jack');
INSERT INTO `users` VALUES ('user1', 'user', '0', 'purchaser', '1', 'james');
INSERT INTO `users` VALUES ('user2', 'user', '0', 'principal', '1', 'curry');
INSERT INTO `users` VALUES ('user3', 'user', '0', 'businessman', '1', 'wade');
INSERT INTO `users` VALUES ('user4', 'user', '0', 'purchaser', '1', '王小明');
