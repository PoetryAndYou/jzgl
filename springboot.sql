/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-06-10 18:49:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `announcement`
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `image` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES ('1', '起风了', '<h1>1.这是标题</h1>\r\n                                 \r\n                                从前初始这世间<br>\r\n                                万般流连<br>\r\n                                看着天边似在眼前<br>\r\n                                也甘愿赴汤蹈火去走他一遍<br>\r\n                                <h2>1.1这是标题</h2>\r\n                                如今走在这世间<br>\r\n                                万般流连<br>\r\n                                翻过岁月不同侧脸<br>\r\n                                措不及防闯入你的<font color=\"red\" size=\"13px\">笑颜^_^❀</font>\r\n                                <h3>1.1.1你瞅啥，瞅你咋地</h3>\r\n                                <img src=\"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586345096824&di=592f50766cca0f22a8d3de2483032f4c&imgtype=0&src=http%3A%2F%2Fpic.iask.cn%2Ffimg%2F8387452044_381.jpg\">\r\n                                <h3>1.1.2不服现实碰一碰</h3>\r\n                                到底了。。。。。', null, '2020-04-30 00:00:00');
INSERT INTO `announcement` VALUES ('2', '风停了', '你说呢', null, '2020-04-29 01:00:00');
INSERT INTO `announcement` VALUES ('8', '标题一', '这是内容', null, '2020-04-23 23:54:50');
INSERT INTO `announcement` VALUES ('10', '这是测试', '测试不会人', null, '2020-04-26 02:08:21');
INSERT INTO `announcement` VALUES ('14', '233333333', '23233232<br>\nsadsadsddasdasdasd', null, '2020-04-29 00:46:24');
INSERT INTO `announcement` VALUES ('16', '肿瘤科介绍', '　  妇科肿瘤科经过几代人的不懈努力，广泛吸收国内外先进经验，强调在妇科恶性肿瘤规范化治疗的基础上，在个体和综合治疗方面形成了自己鲜明的特色，尤其擅长难治性、复发性妇科恶性肿瘤的手术、化疗及综合治疗。作为一个传统的手术优势科室，对复杂卵巢癌肿瘤细胞减灭术、卵巢癌全面分期手术、保留神经的根治性子宫广泛切除术、外阴癌广泛切除术、腹膜后淋巴结清扫术、盆腔脏器廓清术等妇科肿瘤高难度手术有丰富的经验。我科率先在天津市开展早期宫颈癌保留生育功能的手术。腹腔镜、宫腔镜、“达芬奇”机器人等现代化技术的应用使患者术后创伤更小、恢复更快。科室成员对妇科恶性肿瘤的化疗有丰富的临床经验，特别是卵巢癌的二线、三线药物、靶向药物的选择和合理应用，取得了显著的临床效果。我科依托天津医科大学肿瘤医院强大的临床科研优势，开展妇科恶性肿瘤多专科协同治疗(MDT),与各相关科室密切合作，可为患者提供一期及后续临床试验、PET-CT检查、HPV基因检测、循环肿瘤细胞检测、肿瘤遗传咨询、子宫动脉介入化疗、骨转移同位素治疗、肿瘤粒子植入、近距离三维腔内放射治疗、体外适形调强放射治疗、射波刀、中医扶正调理等先进的治疗方案，大限度地延长了患者的生存时间并提高其生存质量，赢得了国内外同行和患者的广泛赞誉。<br><br>\n　  我科注重妇科肿瘤的基础及临床研究，密切关注国内外学科动态和新进展，积极开展对外交流与合作。近年来每年在全国核心期刊及SCI杂志发表论文10余篇，先后承担多项国家自然科学基金、天津市科委、教委、卫生局、天津医科大学等课题研究，取得了丰硕的研究成果。我科与多家研究机构达成合作关系，先后参与多项临床研究，参与编写《腹部肿瘤学》、《肿瘤手术学》和《简明肿瘤学》等专著，多次在国内外学术会议发表研究报告。科室承担天津医科大学本科生、研究生及留学生等多种教学任务。我科目前已拥有一个集医疗、教学和科研为一体、结构合理、梯队完善的团队。', null, '2020-05-25 12:16:36');
INSERT INTO `announcement` VALUES ('27', '我是你们的守门员', '“袁老师，袁老师，这样行吗？”“口罩戴得不行，护目镜这样戴有点卡，调整一下角度。”“伸伸胳膊、蜷蜷腿，感觉防护服穿得怎么样？”“袁老师您在这监督、把关，我特别有安全感。你就是我们的‘防护墙’。”在武汉大学人民医院东院区危重症病房坚持战斗的每一天，河南第十一批支援湖北医疗队内都会发生这样的对话。这名被称为“袁老师”的人就是医疗队队员、商丘市第一人民医院感染科主任袁斌。<br>\n\n  袁斌总笑称自己是医疗队员进入病房的“守门员”。他在医疗队中的最重要的一项职责就是帮值班医生护士做好防护，把他们安全送到岗位上。每次进入病区，医护人员必须严格按流程穿戴还防护用品，再由她查看大家的防护服有没有破损，口罩、帽子、护目镜、手套以及鞋套的穿戴是否合格。这是一项看似简单实则复杂、细致而且意义重要的工作。这项工作稍有疏忽，就可能使医护人员暴露在高度污染的危重症病房，其后果不言而喻。<br>\n\n  2月21日，袁斌作为商丘市第一人民医院支援湖北的63名医护人员中的一员随队出征。在大巴车上，医疗队总领队，商丘市第一人民医院党委书记、院长韩传恩说：“我把大家平平安安带出来，也要安安全全把大家带回家。”听到这句话时，袁斌默默说了一句：“院长，咱只有‘安全’才能平安回家啊。”袁斌告诉记者，那一刻说的话其实是一位从事院感工作20多年的老员工的第一反应。<br>\n\n  正是因为有了这份已经本能化的高度责任感，袁斌力求把每件工作都做到极致，以实现韩传恩提出的“要确保医务人员零感染”的目标。<br>', null, '2020-05-26 19:31:21');
INSERT INTO `announcement` VALUES ('28', '12312', '12313', null, '2020-06-10 09:12:41');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for `department_user`
-- ----------------------------
DROP TABLE IF EXISTS `department_user`;
CREATE TABLE `department_user` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `department_id` (`department_id`),
  CONSTRAINT `department_user_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `department_user_ibfk_2` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department_user
-- ----------------------------

-- ----------------------------
-- Table structure for `drug`
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `count` varchar(11) DEFAULT NULL,
  `money` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug
-- ----------------------------
INSERT INTO `drug` VALUES ('1', '999感冒康灵：每天3片', '1000', '13');
INSERT INTO `drug` VALUES ('2', '琵琶膏', '1000', '34');
INSERT INTO `drug` VALUES ('3', '云南白药', '222', '222');
INSERT INTO `drug` VALUES ('4', '清凉油', '22', '22');
INSERT INTO `drug` VALUES ('5', '头孢：每日三次，一次三片', '1000', '12');
INSERT INTO `drug` VALUES ('6', '12', '12', '12');

-- ----------------------------
-- Table structure for `icheck`
-- ----------------------------
DROP TABLE IF EXISTS `icheck`;
CREATE TABLE `icheck` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of icheck
-- ----------------------------
INSERT INTO `icheck` VALUES ('1', 'B超', '检查B超');
INSERT INTO `icheck` VALUES ('3', '彩超', '彩超');
INSERT INTO `icheck` VALUES ('4', '化验', '化验');
INSERT INTO `icheck` VALUES ('5', 'CT', 'CT');
INSERT INTO `icheck` VALUES ('6', '血糖', '血糖');
INSERT INTO `icheck` VALUES ('7', '视力', '检查视力情况');
INSERT INTO `icheck` VALUES ('8', '血压', '血压');

-- ----------------------------
-- Table structure for `imgs`
-- ----------------------------
DROP TABLE IF EXISTS `imgs`;
CREATE TABLE `imgs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of imgs
-- ----------------------------
INSERT INTO `imgs` VALUES ('2', '页面2', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586844899574&di=5b4bd14a373fc76b7623edd5bee5f9fb&imgtype=0&src=http%3A%2F%2Fe.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fca1349540923dd54ea2076a4d309b3de9d8248af.jpg');
INSERT INTO `imgs` VALUES ('10', 'download.jpg', 'http://www.yantumeijing.cn/Imgs/29b98f812e824f7ba266523a79b689aa.jpg');
INSERT INTO `imgs` VALUES ('11', 'e2db2bd6b3e6575539bcb308639cc815.jpg', 'http://www.yantumeijing.cn/Imgs/192f987a9ad44c5a98024e6ee5217cb9.jpg');

-- ----------------------------
-- Table structure for `medicalrecord`
-- ----------------------------
DROP TABLE IF EXISTS `medicalrecord`;
CREATE TABLE `medicalrecord` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `visittime` varchar(255) DEFAULT NULL,
  `conclusion` varchar(255) DEFAULT NULL,
  `symptom` varchar(255) DEFAULT NULL,
  `drug` varchar(225) DEFAULT NULL COMMENT '药物',
  `doctor` varchar(225) DEFAULT NULL,
  `drugnum` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medicalrecord
-- ----------------------------
INSERT INTO `medicalrecord` VALUES ('1', '2020-04-18', '发烧', '头痛流鼻涕', '999', '小王', '12', '0');
INSERT INTO `medicalrecord` VALUES ('2', '2020-04-19', '骨折', '大腿骨折', '龟苓膏', '小红', '233', '0');
INSERT INTO `medicalrecord` VALUES ('3', '2020-04-19', '2', '1', '琵琶膏3', 'admin', null, '1');
INSERT INTO `medicalrecord` VALUES ('4', null, '5', '4', '9996', 'admin', null, '1');
INSERT INTO `medicalrecord` VALUES ('5', null, '奥术大', '啥都', '琵琶膏3', '医生', null, '1');
INSERT INTO `medicalrecord` VALUES ('6', null, '234234', '324234', '99934', 'admin', null, '1');
INSERT INTO `medicalrecord` VALUES ('8', null, '而我', '猪猪猪', '9992', 'admin', null, '1');
INSERT INTO `medicalrecord` VALUES ('9', null, '流行性感冒', '恶心，头痛，发啥', '9993', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('10', '2020-04-20', '发烧', '发烧头晕上岛咖啡暖色', '琵琶膏19993', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('11', '2020-04-20', '', '', '琵琶膏2', '医生', null, '0');
INSERT INTO `medicalrecord` VALUES ('12', '2020-04-20', '', '', '琵琶膏2', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('13', '2020-04-20', '骨折', '大腿哦骨折，案首啊', '9994', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('14', '2020-04-20', '骨折', '', '9994', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('15', '2020-04-20', '骨折', '', '9994', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('16', '2020-04-20', '骨折', '', '9994', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('17', '2020-04-20', '流行性感冒', '流鼻涕，发烧，乏力', '9991', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('18', '2020-04-20', '', '', '22234', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('19', '2020-04-24', '神经病', '有病', '琵琶膏9999', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('20', '2020-04-28', '偏头', '有病啊', '琵琶膏:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('21', '2020-04-28', '偏头', null, '琵琶膏:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('22', '2020-04-29', '3434', '3434', '999:3天', '医生', null, '0');
INSERT INTO `medicalrecord` VALUES ('23', '2020-04-29', '23232', '231312', '999:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('24', '2020-05-06', '343434', '线程V型地方', '222:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('25', '2020-05-08', '发烧', null, '琵琶膏:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('26', '2020-05-09', '出血', '脚痛，发生的回复交话费', '999:3天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('27', '2020-05-25', '出血', null, '999:3天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('28', '2020-05-25', '中毒', '头痛恶心，体寒发虚', '头孢：每日三次，一次三片:2天', '医生', null, '0');
INSERT INTO `medicalrecord` VALUES ('29', '2020-06-07', '中毒', null, '头孢：每日三次，一次三片:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('30', '2020-06-07', '中毒', null, '头孢：每日三次，一次三片:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('31', '2020-06-07', '11111', '111', '琵琶膏:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('32', '2020-06-07', '2323', '11222', '头孢：每日三次，一次三片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('33', '2020-06-07', '2323', null, '头孢：每日三次，一次三片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('34', '2020-06-07', '2323', '123', '头孢：每日三次，一次三片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('35', '2020-06-07', '2323', '5555', '头孢：每日三次，一次三片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('36', '2020-06-07', '123', '123', '头孢：每日三次，一次三片:1天清凉油:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('37', '2020-06-07', '123', '666666666666666666', '头孢：每日三次，一次三片:1天清凉油:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('38', '2020-06-07', '123', '5555555', '头孢：每日三次，一次三片:1天清凉油:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('39', '2020-06-07', '123', null, '头孢：每日三次，一次三片:1天清凉油:2天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('40', '2020-06-08', '11111111111', '111111111', '999感冒康灵：每天3片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('41', '2020-06-08', '11111111111', null, '999感冒康灵：每天3片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('42', '2020-06-08', '11111111111', null, '999感冒康灵：每天3片:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('43', '2020-06-08', '11111111111', null, '', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('44', '2020-06-08', '', null, '', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('45', '2020-06-08', '', null, '', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('46', '2020-06-08', '', null, '琵琶膏:1天', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('47', '2020-06-08', '', null, '', 'admin', null, '0');
INSERT INTO `medicalrecord` VALUES ('48', '2020-06-08', '毕设', '这是一个测试', '云南白药:3天', '医生', null, '0');
INSERT INTO `medicalrecord` VALUES ('49', '2020-06-09', '流行性感冒', '头痛，四肢无力。', '999感冒康灵：每天3片:1天', 'admin', null, '1');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `decription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', 'registered', '挂号页面');
INSERT INTO `menu` VALUES ('2', 'view_doctor', '就诊界面');
INSERT INTO `menu` VALUES ('3', 'drug', '药品管理');
INSERT INTO `menu` VALUES ('4', 'system', '系统管理');

-- ----------------------------
-- Table structure for `patient`
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `number` varchar(255) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `idcard` varchar(255) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `sfcz` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('1', '维吾尔文', '23', '男', '23432423', '23', '1001', '内科', '2020-06-10 09:10:30', '1', '是');
INSERT INTO `patient` VALUES ('2', '小李子', '23', '女', '123123123123', '3432', '1002', '眼科', '2020-06-09 15:45:49', '1', '否');
INSERT INTO `patient` VALUES ('3', '小红', '18', '女', '23424', '4332', '1003', '骨科', '2020-06-09 15:45:55', '1', '是');
INSERT INTO `patient` VALUES ('4', '小花', '23', '女', '', '424', '1004', '骨科', '2020-06-09 15:46:06', '1', '否');
INSERT INTO `patient` VALUES ('5', '小华', '34', '女', '234234', '32', '1005', '神经科', '2020-06-09 15:46:15', '1', '是');
INSERT INTO `patient` VALUES ('6', '小子', '12', '男', '13164377282', '42', '1006', '内科', '2020-06-09 15:46:24', '2', '是');
INSERT INTO `patient` VALUES ('7', '小小', '32', '男', '242342', '34', '1007', '皮肤科', '2020-04-17 00:02:08', '3', null);
INSERT INTO `patient` VALUES ('8', '小鱼', '23', '男', '234', '2432', '1008', null, '2020-04-16', '3', null);
INSERT INTO `patient` VALUES ('9', '小云', '22', '女', '23423423', '4324', '1009', null, '2020-06-07 23:59:22', '3', null);
INSERT INTO `patient` VALUES ('10', '小豆', '34', '女', '2342', '342', '1010', '眼科', '2020-06-09 20:51:27', '1', '是');
INSERT INTO `patient` VALUES ('11', '1011', null, null, '101110111011', '234', '1011', '眼科', '2020-04-16', '3', null);
INSERT INTO `patient` VALUES ('12', '2121', null, null, '2121', '2121', '2121', '骨科', '2020-04-19 19:03:40', '3', null);
INSERT INTO `patient` VALUES ('13', '2123', null, null, '2123', '2123', '2123', '骨科', '2020-04-19 19:03:50', '3', null);
INSERT INTO `patient` VALUES ('14', '杨', '23', '男', '13164377', '123', '4114031996', '内科', '2020-06-08 00:01:59', '3', null);
INSERT INTO `patient` VALUES ('15', '离校', '23', '男', '2323232', '213', '4114031992', '内科', '2020-06-07 23:50:37', '3', '是');
INSERT INTO `patient` VALUES ('16', '2323', null, null, '3232', '232', '2322', 'yan', '2020-04-27 22:04:09', '3', null);
INSERT INTO `patient` VALUES ('18', '2323', '22', '男', '2323', '232', '3232', '内科', '2020-04-29 00:42:19', '3', null);
INSERT INTO `patient` VALUES ('19', '时代大厦', '23', '男', '12323213', '12', '231231231', '外科', '2020-05-06 20:11:46', '3', null);
INSERT INTO `patient` VALUES ('20', '2323', '34', '男', '2323', '232', '2323', '内科', '2020-05-08 22:26:06', '3', null);
INSERT INTO `patient` VALUES ('21', '123', null, null, '', '', '222', '内科', '2020-05-09 00:19:29', '3', null);
INSERT INTO `patient` VALUES ('22', '22222', null, null, '2222', '22', '22222', '内科', '2020-05-09 00:09:57', '3', null);
INSERT INTO `patient` VALUES ('23', '123', '12', '女', '2222', '22', '333333', '内科', '2020-05-25 12:50:27', '3', '是');
INSERT INTO `patient` VALUES ('25', '343434', null, null, '3434', '3434', '333444', '外科', '2020-05-09 00:20:27', '3', null);
INSERT INTO `patient` VALUES ('26', '4545', null, null, '4545', '454', '4545', '外科', '2020-06-08 00:02:56', '3', null);
INSERT INTO `patient` VALUES ('27', '343', null, null, '34', '4', '343', '内科', '2020-05-09 00:22:20', '3', null);
INSERT INTO `patient` VALUES ('28', '红色高跟鞋', '23', '女', '13164377283', '23', '1231231231231231231123', '内科', '2020-05-09 00:43:33', '3', null);
INSERT INTO `patient` VALUES ('29', '小王八', '12', '男', '13164377282', '12', '12345567890', '内科', '2020-05-25 14:28:22', '3', '是');
INSERT INTO `patient` VALUES ('30', 'qin', null, null, '123123123', '12', '12312321', '内科', '2020-05-31 23:22:52', '3', '是');
INSERT INTO `patient` VALUES ('31', '小豆', null, null, '234234', '123', '123123213213', '外科', '2020-06-09 20:51:34', '1', '是');

-- ----------------------------
-- Table structure for `patient_med`
-- ----------------------------
DROP TABLE IF EXISTS `patient_med`;
CREATE TABLE `patient_med` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` int(11) DEFAULT NULL,
  `medicalrecord_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patient_id` (`patient_id`),
  KEY `medicalrecord_id` (`medicalrecord_id`),
  CONSTRAINT `patient_med_ibfk_1` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`),
  CONSTRAINT `patient_med_ibfk_2` FOREIGN KEY (`medicalrecord_id`) REFERENCES `medicalrecord` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of patient_med
-- ----------------------------
INSERT INTO `patient_med` VALUES ('1', '10', '1');
INSERT INTO `patient_med` VALUES ('2', '10', '2');
INSERT INTO `patient_med` VALUES ('8', '10', '9');
INSERT INTO `patient_med` VALUES ('9', '10', '10');
INSERT INTO `patient_med` VALUES ('10', '10', '11');
INSERT INTO `patient_med` VALUES ('11', '1', '12');
INSERT INTO `patient_med` VALUES ('12', '1', '13');
INSERT INTO `patient_med` VALUES ('13', '6', '14');
INSERT INTO `patient_med` VALUES ('14', '6', '15');
INSERT INTO `patient_med` VALUES ('15', '6', '16');
INSERT INTO `patient_med` VALUES ('16', '14', '17');
INSERT INTO `patient_med` VALUES ('17', '14', '18');
INSERT INTO `patient_med` VALUES ('18', '3', '19');
INSERT INTO `patient_med` VALUES ('19', '15', '20');
INSERT INTO `patient_med` VALUES ('20', '15', '21');
INSERT INTO `patient_med` VALUES ('21', '18', '22');
INSERT INTO `patient_med` VALUES ('22', '2', '23');
INSERT INTO `patient_med` VALUES ('23', '19', '24');
INSERT INTO `patient_med` VALUES ('24', '20', '25');
INSERT INTO `patient_med` VALUES ('25', '28', '26');
INSERT INTO `patient_med` VALUES ('26', '23', '27');
INSERT INTO `patient_med` VALUES ('27', '29', '28');
INSERT INTO `patient_med` VALUES ('28', '15', '29');
INSERT INTO `patient_med` VALUES ('29', '15', '30');
INSERT INTO `patient_med` VALUES ('30', '15', '31');
INSERT INTO `patient_med` VALUES ('31', '7', '32');
INSERT INTO `patient_med` VALUES ('32', '10', '33');
INSERT INTO `patient_med` VALUES ('33', '15', '34');
INSERT INTO `patient_med` VALUES ('34', '30', '35');
INSERT INTO `patient_med` VALUES ('35', '10', '36');
INSERT INTO `patient_med` VALUES ('36', '15', '37');
INSERT INTO `patient_med` VALUES ('37', '1', '38');
INSERT INTO `patient_med` VALUES ('38', '2', '39');
INSERT INTO `patient_med` VALUES ('39', '3', '40');
INSERT INTO `patient_med` VALUES ('40', '4', '41');
INSERT INTO `patient_med` VALUES ('41', '1', '42');
INSERT INTO `patient_med` VALUES ('42', '2', '43');
INSERT INTO `patient_med` VALUES ('43', '5', '44');
INSERT INTO `patient_med` VALUES ('44', '6', '45');
INSERT INTO `patient_med` VALUES ('45', '6', '46');
INSERT INTO `patient_med` VALUES ('46', '6', '47');
INSERT INTO `patient_med` VALUES ('47', '1', '48');
INSERT INTO `patient_med` VALUES ('48', '6', '49');

-- ----------------------------
-- Table structure for `pcheck`
-- ----------------------------
DROP TABLE IF EXISTS `pcheck`;
CREATE TABLE `pcheck` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcheck
-- ----------------------------
INSERT INTO `pcheck` VALUES ('1', '小子', 'B超');

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', 'registered_update', '/api/registered/update');
INSERT INTO `permission` VALUES ('2', 'registered_delete', '/api/registered/delete');
INSERT INTO `permission` VALUES ('3', 'registered_add', '/api/registered/add');
INSERT INTO `permission` VALUES ('5', 'user_list', '/api/user/list');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'admin', '超级管理员');
INSERT INTO `role` VALUES ('2', 'Registeredstaff', '挂号员');
INSERT INTO `role` VALUES ('3', 'doctor', '医生');
INSERT INTO `role` VALUES ('4', 'buyer', '采购员');

-- ----------------------------
-- Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `menu_id` (`menu_id`),
  CONSTRAINT `role_menu_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `role_menu_ibfk_2` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '2', '1');
INSERT INTO `role_menu` VALUES ('2', '3', '2');
INSERT INTO `role_menu` VALUES ('3', '4', '3');
INSERT INTO `role_menu` VALUES ('4', '1', '1');
INSERT INTO `role_menu` VALUES ('5', '1', '2');
INSERT INTO `role_menu` VALUES ('6', '1', '3');
INSERT INTO `role_menu` VALUES ('7', '1', '4');

-- ----------------------------
-- Table structure for `role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `permission_id` (`permission_id`),
  CONSTRAINT `role_permission_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `role_permission_ibfk_2` FOREIGN KEY (`permission_id`) REFERENCES `permission` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '2', '1');
INSERT INTO `role_permission` VALUES ('2', '2', '2');
INSERT INTO `role_permission` VALUES ('3', '2', '3');
INSERT INTO `role_permission` VALUES ('4', '1', '1');
INSERT INTO `role_permission` VALUES ('5', '1', '2');
INSERT INTO `role_permission` VALUES ('6', '1', '3');
INSERT INTO `role_permission` VALUES ('8', '1', '5');

-- ----------------------------
-- Table structure for `role_user`
-- ----------------------------
DROP TABLE IF EXISTS `role_user`;
CREATE TABLE `role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `role_id` (`role_id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `role_user_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `role_user_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_user
-- ----------------------------
INSERT INTO `role_user` VALUES ('1', '1', '1002');
INSERT INTO `role_user` VALUES ('2', '3', '1003');
INSERT INTO `role_user` VALUES ('4', '2', '1001');
INSERT INTO `role_user` VALUES ('8', '4', '1006');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(200) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `department_id` int(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `number` varchar(225) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1001', '挂号员', 'd022646351048ac0ba397d12dfafa304', '小王八', '1', '23', '13164377282', '12312321', '男', null, null);
INSERT INTO `user` VALUES ('1002', 'admin', '43442676c74ae59f219c2d87fd6bad52', '小红', '1', '18', '13164377123', '1111@qq.com', '女', null, null);
INSERT INTO `user` VALUES ('1003', '医生', 'd022646351048ac0ba397d12dfafa304', '小胖', '1', '33', '11111111111', '32131', '男', null, null);
INSERT INTO `user` VALUES ('1006', '药品管理员', 'd022646351048ac0ba397d12dfafa304', '小❀', null, '23', '23232323', '23232323', '女', null, null);

-- ----------------------------
-- Table structure for `viewdepartment`
-- ----------------------------
DROP TABLE IF EXISTS `viewdepartment`;
CREATE TABLE `viewdepartment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of viewdepartment
-- ----------------------------
INSERT INTO `viewdepartment` VALUES ('1', '内科', '5555嗯嗯');
INSERT INTO `viewdepartment` VALUES ('2', '外科', '跌打损伤');
INSERT INTO `viewdepartment` VALUES ('3', '皮肤科', '看皮肤的');
INSERT INTO `viewdepartment` VALUES ('4', '眼科', null);
INSERT INTO `viewdepartment` VALUES ('5', '化验', null);
INSERT INTO `viewdepartment` VALUES ('6', '骨科', null);
INSERT INTO `viewdepartment` VALUES ('7', '神经科', null);
INSERT INTO `viewdepartment` VALUES ('8', '妇科', '');
INSERT INTO `viewdepartment` VALUES ('9', '中医科', '');
INSERT INTO `viewdepartment` VALUES ('10', '儿科', '');
