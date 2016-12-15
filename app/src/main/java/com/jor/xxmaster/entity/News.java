package com.jor.xxmaster.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/*
 * @Title:  News
 * @Description:  ${TODO}<新闻类>
 * @author:  Jorble
 * @data:  2016/12/13 14:58
 * @version:  V1.0
 */
public class News {


    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"title":"印度的一夫多妻制，男子过着神仙般的生活，女人干活养家！","date":"2016-12-14 07:01","author_name":"摄影趣闻","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214070125598.html?qid=juheshuju","uniquekey":"161214070125598","type":"头条","realtype":"国际"},{"title":"厉害了我的张一山！扎麻花辫儿变成熟妖男","date":"2016-12-14 09:45","author_name":"腾讯娱乐","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214094522_dde101b5df683106c1217a1e9049c801_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214094522_dde101b5df683106c1217a1e9049c801_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214094522_dde101b5df683106c1217a1e9049c801_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214094522242.html?qid=juheshuju","uniquekey":"161214094522242","type":"头条","realtype":"娱乐"},{"title":"中国歼20最担心的武器出现了！美国一行为彻底激怒中国了","date":"2016-12-14 05:53","author_name":"霹雳火军事","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214055323_fb8544513c9a25e489adf38cc89e52ca_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214055323_fb8544513c9a25e489adf38cc89e52ca_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214055323_fb8544513c9a25e489adf38cc89e52ca_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214055323296.html?qid=juheshuju","uniquekey":"161214055323296","type":"头条","realtype":"军事"},{"title":"日媒：安倍外交在国际上\u201c左右逢源\u201d 将迎来关键时期","date":"2016-12-14 09:42","author_name":"环球网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161214/20161214094200_e91cc1af8b914cd74bbaaa063ebfec2f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161214/20161214094200_e91cc1af8b914cd74bbaaa063ebfec2f_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161214/20161214094200_e91cc1af8b914cd74bbaaa063ebfec2f_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214094200419.html?qid=juheshuju","uniquekey":"161214094200419","type":"头条","realtype":"国际"},{"title":"戈尔巴乔夫接受采访怒斥苏联解体是\u201c政变\u201d 暗示与普京有分歧","date":"2016-12-14 09:07","author_name":"环球网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161214/20161214090720_42083278242343d43df1888dab774dd9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161214/20161214090720_42083278242343d43df1888dab774dd9_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161214/20161214090720_42083278242343d43df1888dab774dd9_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214090720627.html?qid=juheshuju","uniquekey":"161214090720627","type":"头条","realtype":"国际"},{"title":"市民怀疑被戴绿帽街头杀妻 庭审获女儿书面谅解","date":"2016-12-14 10:00","author_name":"环球网","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214100039_1263ac79d8b56cbbcb61b46c0e9252ff_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214100039_1263ac79d8b56cbbcb61b46c0e9252ff_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214100039_1263ac79d8b56cbbcb61b46c0e9252ff_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214100039739.html?qid=juheshuju","uniquekey":"161214100039739","type":"头条","realtype":"社会"},{"title":"皇帝死了！太后劝皇后做皮肉生意被拒绝，说了六个字！","date":"2016-12-14 03:07","author_name":"摸金上卫","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214030722_b34e28c74f8bac4353fcc64c27163e3b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214030722_b34e28c74f8bac4353fcc64c27163e3b_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214030722_b34e28c74f8bac4353fcc64c27163e3b_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214030722949.html?qid=juheshuju","uniquekey":"161214030722949","type":"头条","realtype":"历史"},{"title":"福原爱拍婚纱照仍在打球 大秀事业线幸福满溢","date":"2016-12-14 08:09","author_name":"腾讯娱乐","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214080902_888c37996779a443e792411aecd3972c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214080902_888c37996779a443e792411aecd3972c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214080902_888c37996779a443e792411aecd3972c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214080902571.html?qid=juheshuju","uniquekey":"161214080902571","type":"头条","realtype":"娱乐"},{"title":"唐嫣和杨幂同穿羽绒服，一个像大妈，一个像天使！","date":"2016-12-13 13:33","author_name":"娱乐信息抢先看","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161213/20161213133332_d250691bd8ff6524c200d829344021d0_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161213/20161213133332_d250691bd8ff6524c200d829344021d0_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161213/20161213133332_d250691bd8ff6524c200d829344021d0_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161213133332040.html?qid=juheshuju","uniquekey":"161213133332040","type":"头条","realtype":"娱乐"},{"title":"孙红雷获妻子吻脸颊大秀恩爱，罗志祥又躺枪了","date":"2016-12-14 07:31","author_name":"腾讯娱乐","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161214/20161214073130_bdb61f6de999b801f1ff818b4150e47c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161214/20161214073130_bdb61f6de999b801f1ff818b4150e47c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161214/20161214073130_bdb61f6de999b801f1ff818b4150e47c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214073130618.html?qid=juheshuju","uniquekey":"161214073130618","type":"头条","realtype":"娱乐"},{"title":"陕西府谷空中坠落不明物体 坠地自燃形成深坑","date":"2016-12-14 04:19","author_name":"中国青年网","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214041904_9b33dacd620b9fbdf961357c657a22f6_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214041904_9b33dacd620b9fbdf961357c657a22f6_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214041904_9b33dacd620b9fbdf961357c657a22f6_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214041904695.html?qid=juheshuju","uniquekey":"161214041904695","type":"头条","realtype":"社会"},{"title":"特朗普敲定普京哥们任美国务卿 被指联俄制华","date":"2016-12-14 07:32","author_name":"中国网","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214073242_21bb845e803924a81512dbd83a71c538_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214073242_21bb845e803924a81512dbd83a71c538_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214073242_21bb845e803924a81512dbd83a71c538_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214073242975.html?qid=juheshuju","uniquekey":"161214073242975","type":"头条","realtype":"国际"},{"title":"Selina前夫离婚后女人缘极好，六天会四位女伴","date":"2016-12-14 08:27","author_name":"腾讯娱乐","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214082749_f2adb994c4b84950ac9f077f2d728e68_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214082749_f2adb994c4b84950ac9f077f2d728e68_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214082749_f2adb994c4b84950ac9f077f2d728e68_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082749235.html?qid=juheshuju","uniquekey":"161214082749235","type":"头条","realtype":"娱乐"},{"title":"农村大叔在山中挖到\u201c人形\u201d物体，2万卖出，几天后被气哭！","date":"2016-12-13 20:56","author_name":"中国经济网","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161213/20161213205614_8dadfd755fdc5f3c8eb31e22bae8ec75_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161213/20161213205614_8dadfd755fdc5f3c8eb31e22bae8ec75_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161213/20161213205614_8dadfd755fdc5f3c8eb31e22bae8ec75_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161213205614015.html?qid=juheshuju","uniquekey":"161213205614015","type":"头条","realtype":"社会"},{"title":"企图抢警枪杀特朗普英国男子被判刑 被诊患精神病","date":"2016-12-14 09:37","author_name":"环球网","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214093727_30b731949a5b7d12337b983cba176ffe_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214093727_30b731949a5b7d12337b983cba176ffe_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214093727_30b731949a5b7d12337b983cba176ffe_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214093727766.html?qid=juheshuju","uniquekey":"161214093727766","type":"头条","realtype":"国际"},{"title":"影后周冬雨新剧化身白衣天使 见面就撩发太俏皮","date":"2016-12-14 06:57","author_name":"视觉中国","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161214/20161214065703_fb31927b275148db754b7723241b3a70_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161214/20161214065703_fb31927b275148db754b7723241b3a70_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161214/20161214065703_fb31927b275148db754b7723241b3a70_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214065703217.html?qid=juheshuju","uniquekey":"161214065703217","type":"头条","realtype":"娱乐"},{"title":"组图：新疆7旬老人养150匹野狼 伙食费一年花掉100多万","date":"2016-12-14 08:26","author_name":"中国新闻网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161214/20161214082618_09b36b88ed1de696233c36caf55bd237_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161214/20161214082618_09b36b88ed1de696233c36caf55bd237_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161214/20161214082618_09b36b88ed1de696233c36caf55bd237_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082618207.html?qid=juheshuju","uniquekey":"161214082618207","type":"头条","realtype":"社会"},{"title":"阿里、腾讯、百度、华为工资竟这么高 看完哭了","date":"2016-12-14 06:09","author_name":"凤凰网","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214060901_c21b94eb25b23c0f7600df5f484bf09d_1_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214060901_c21b94eb25b23c0f7600df5f484bf09d_1_mwpl_05500201.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214060901_c21b94eb25b23c0f7600df5f484bf09d_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214060901385.html?qid=juheshuju","uniquekey":"161214060901385","type":"头条","realtype":"科技"},{"title":"特朗普竟想赖掉20万亿美元债务：中国彻底愤怒了","date":"2016-12-14 01:24","author_name":"西陆军事","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214012437_b125133bebb8f179a976122e54bcaba5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214012437_b125133bebb8f179a976122e54bcaba5_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214012437_b125133bebb8f179a976122e54bcaba5_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214012437116.html?qid=juheshuju","uniquekey":"161214012437116","type":"头条","realtype":"军事"},{"title":"云南原官员自曝出轨搞大女孩肚子？家人这样解释","date":"2016-12-13 16:44","author_name":"封面","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161213/20161213164459_b96fe2d3f21f7a09de5f81db0f58b300_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161213/20161213164459_b96fe2d3f21f7a09de5f81db0f58b300_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161213/20161213164459_b96fe2d3f21f7a09de5f81db0f58b300_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161213164459210.html?qid=juheshuju","uniquekey":"161213164459210","type":"头条","realtype":"社会"},{"title":"赵丽颖现身机场卫衣图案亮了，随行保镖这个行为获网友大赞！","date":"2016-12-14 08:25","author_name":"九派新闻客户端","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214082528_36474c568d4638edf4dd7bb37906e296_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214082528_36474c568d4638edf4dd7bb37906e296_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214082528_36474c568d4638edf4dd7bb37906e296_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082528191.html?qid=juheshuju","uniquekey":"161214082528191","type":"头条","realtype":"娱乐"},{"title":"民航局：旅客可向民航部门申请确认航班延误取消原因","date":"2016-12-14 09:37","author_name":"中国新闻网","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214093748_539353ef3216b23b626bf7d7736194a6_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214093748_539353ef3216b23b626bf7d7736194a6_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214093748_539353ef3216b23b626bf7d7736194a6_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214093748102.html?qid=juheshuju","uniquekey":"161214093748102","type":"头条","realtype":"国内"},{"title":"马伊琍兑现承诺，放手文章，给他自由？","date":"2016-12-14 08:20","author_name":"东方网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161214/20161214082012_365abc60f413f818271422015c51ceda_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161214/20161214082012_365abc60f413f818271422015c51ceda_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161214/20161214082012_365abc60f413f818271422015c51ceda_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082012731.html?qid=juheshuju","uniquekey":"161214082012731","type":"头条","realtype":"社会"},{"title":"还记得萧淑慎吗？曾因吸毒入狱爆肥，如今消瘦","date":"2016-12-14 06:47","author_name":"腾讯娱乐","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161214/20161214064751_f20e189c7af79e23521c37307f3f5b85_1_mwpm_03200403.png","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161214/20161214064751_f20e189c7af79e23521c37307f3f5b85_1_mwpl_05500201.png","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161214/20161214064751_f20e189c7af79e23521c37307f3f5b85_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214064751298.html?qid=juheshuju","uniquekey":"161214064751298","type":"头条","realtype":"娱乐"},{"title":"古雷斯特就任联合国秘书长，谈及民粹主义和特朗普当选美总统","date":"2016-12-14 09:41","author_name":"澎湃新闻","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214094119_48b94c5adeb39deb56cc568701a8bf92_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214094119_48b94c5adeb39deb56cc568701a8bf92_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214094119_48b94c5adeb39deb56cc568701a8bf92_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214094119331.html?qid=juheshuju","uniquekey":"161214094119331","type":"头条","realtype":"国际"},{"title":"还记得春晚的小彩旗吗？曾恋上大自己14岁的大叔，如今沦为路人","date":"2016-12-14 03:37","author_name":"八卦驾到","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214033750_fcceace103f176fa8ec08b29bc3b85ba_1_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214033750_fcceace103f176fa8ec08b29bc3b85ba_1_mwpl_05500201.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214033750_fcceace103f176fa8ec08b29bc3b85ba_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214033750848.html?qid=juheshuju","uniquekey":"161214033750848","type":"头条","realtype":"娱乐"},{"title":"潘长江：春晚肯定搭蔡明，不上像鸡憋着不下蛋","date":"2016-12-14 09:24","author_name":"腾讯娱乐","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214092421_f7b99a6d21120f273bddd94f2628ead2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214092421_f7b99a6d21120f273bddd94f2628ead2_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214092421_f7b99a6d21120f273bddd94f2628ead2_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214092421222.html?qid=juheshuju","uniquekey":"161214092421222","type":"头条","realtype":"娱乐"},{"title":"东方观点：8岁小女孩被亲妈送进派出所，原因竟是...","date":"2016-12-13 18:31","author_name":"东方头条","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161213/20161213183140_7d2451842fd780bdfbf95b69aa1c154e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161213/20161213183140_7d2451842fd780bdfbf95b69aa1c154e_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161213/20161213183140_7d2451842fd780bdfbf95b69aa1c154e_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161213183140301.html?qid=juheshuju","uniquekey":"161213183140301","type":"头条","realtype":"社会"},{"title":"日本女人和服里的震撼秘密:女人们上下几千年都说不出口","date":"2016-12-14 07:30","author_name":"中国网","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161214/20161214073053_523837def650d9a74ddb5dd8443c91f9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161214/20161214073053_523837def650d9a74ddb5dd8443c91f9_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161214/20161214073053_523837def650d9a74ddb5dd8443c91f9_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214073053703.html?qid=juheshuju","uniquekey":"161214073053703","type":"头条","realtype":"社会"},{"title":"明道与秦岚因戏生情？深夜吃饭压马路亲密热聊","date":"2016-12-14 07:26","author_name":"视觉中国","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161214/20161214072631_35c3fb15d84b0b076670e0cc532e426e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161214/20161214072631_35c3fb15d84b0b076670e0cc532e426e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161214/20161214072631_35c3fb15d84b0b076670e0cc532e426e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214072631812.html?qid=juheshuju","uniquekey":"161214072631812","type":"头条","realtype":"娱乐"},{"title":"组图：西安有条路不堵车 堵的是国产大型军机","date":"2016-12-14 08:32","author_name":"阎良之窗","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214083205_578e940c3dec383ee017d119b26f8009_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214083205_578e940c3dec383ee017d119b26f8009_1_mwpl_05500201.png","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214083205_578e940c3dec383ee017d119b26f8009_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214083205307.html?qid=juheshuju","uniquekey":"161214083205307","type":"头条","realtype":"军事"}]}
     * error_code : 0
     */

    private String reason;
    /**
     * stat : 1
     * data : [{"title":"印度的一夫多妻制，男子过着神仙般的生活，女人干活养家！","date":"2016-12-14 07:01","author_name":"摄影趣闻","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214070125598.html?qid=juheshuju","uniquekey":"161214070125598","type":"头条","realtype":"国际"},{"title":"厉害了我的张一山！扎麻花辫儿变成熟妖男","date":"2016-12-14 09:45","author_name":"腾讯娱乐","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214094522_dde101b5df683106c1217a1e9049c801_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214094522_dde101b5df683106c1217a1e9049c801_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214094522_dde101b5df683106c1217a1e9049c801_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214094522242.html?qid=juheshuju","uniquekey":"161214094522242","type":"头条","realtype":"娱乐"},{"title":"中国歼20最担心的武器出现了！美国一行为彻底激怒中国了","date":"2016-12-14 05:53","author_name":"霹雳火军事","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214055323_fb8544513c9a25e489adf38cc89e52ca_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214055323_fb8544513c9a25e489adf38cc89e52ca_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214055323_fb8544513c9a25e489adf38cc89e52ca_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214055323296.html?qid=juheshuju","uniquekey":"161214055323296","type":"头条","realtype":"军事"},{"title":"日媒：安倍外交在国际上\u201c左右逢源\u201d 将迎来关键时期","date":"2016-12-14 09:42","author_name":"环球网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161214/20161214094200_e91cc1af8b914cd74bbaaa063ebfec2f_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161214/20161214094200_e91cc1af8b914cd74bbaaa063ebfec2f_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161214/20161214094200_e91cc1af8b914cd74bbaaa063ebfec2f_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214094200419.html?qid=juheshuju","uniquekey":"161214094200419","type":"头条","realtype":"国际"},{"title":"戈尔巴乔夫接受采访怒斥苏联解体是\u201c政变\u201d 暗示与普京有分歧","date":"2016-12-14 09:07","author_name":"环球网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161214/20161214090720_42083278242343d43df1888dab774dd9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161214/20161214090720_42083278242343d43df1888dab774dd9_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161214/20161214090720_42083278242343d43df1888dab774dd9_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214090720627.html?qid=juheshuju","uniquekey":"161214090720627","type":"头条","realtype":"国际"},{"title":"市民怀疑被戴绿帽街头杀妻 庭审获女儿书面谅解","date":"2016-12-14 10:00","author_name":"环球网","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214100039_1263ac79d8b56cbbcb61b46c0e9252ff_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214100039_1263ac79d8b56cbbcb61b46c0e9252ff_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214100039_1263ac79d8b56cbbcb61b46c0e9252ff_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214100039739.html?qid=juheshuju","uniquekey":"161214100039739","type":"头条","realtype":"社会"},{"title":"皇帝死了！太后劝皇后做皮肉生意被拒绝，说了六个字！","date":"2016-12-14 03:07","author_name":"摸金上卫","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214030722_b34e28c74f8bac4353fcc64c27163e3b_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214030722_b34e28c74f8bac4353fcc64c27163e3b_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214030722_b34e28c74f8bac4353fcc64c27163e3b_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214030722949.html?qid=juheshuju","uniquekey":"161214030722949","type":"头条","realtype":"历史"},{"title":"福原爱拍婚纱照仍在打球 大秀事业线幸福满溢","date":"2016-12-14 08:09","author_name":"腾讯娱乐","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214080902_888c37996779a443e792411aecd3972c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214080902_888c37996779a443e792411aecd3972c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214080902_888c37996779a443e792411aecd3972c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214080902571.html?qid=juheshuju","uniquekey":"161214080902571","type":"头条","realtype":"娱乐"},{"title":"唐嫣和杨幂同穿羽绒服，一个像大妈，一个像天使！","date":"2016-12-13 13:33","author_name":"娱乐信息抢先看","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161213/20161213133332_d250691bd8ff6524c200d829344021d0_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161213/20161213133332_d250691bd8ff6524c200d829344021d0_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161213/20161213133332_d250691bd8ff6524c200d829344021d0_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161213133332040.html?qid=juheshuju","uniquekey":"161213133332040","type":"头条","realtype":"娱乐"},{"title":"孙红雷获妻子吻脸颊大秀恩爱，罗志祥又躺枪了","date":"2016-12-14 07:31","author_name":"腾讯娱乐","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20161214/20161214073130_bdb61f6de999b801f1ff818b4150e47c_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20161214/20161214073130_bdb61f6de999b801f1ff818b4150e47c_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20161214/20161214073130_bdb61f6de999b801f1ff818b4150e47c_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214073130618.html?qid=juheshuju","uniquekey":"161214073130618","type":"头条","realtype":"娱乐"},{"title":"陕西府谷空中坠落不明物体 坠地自燃形成深坑","date":"2016-12-14 04:19","author_name":"中国青年网","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214041904_9b33dacd620b9fbdf961357c657a22f6_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214041904_9b33dacd620b9fbdf961357c657a22f6_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214041904_9b33dacd620b9fbdf961357c657a22f6_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214041904695.html?qid=juheshuju","uniquekey":"161214041904695","type":"头条","realtype":"社会"},{"title":"特朗普敲定普京哥们任美国务卿 被指联俄制华","date":"2016-12-14 07:32","author_name":"中国网","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214073242_21bb845e803924a81512dbd83a71c538_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214073242_21bb845e803924a81512dbd83a71c538_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214073242_21bb845e803924a81512dbd83a71c538_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214073242975.html?qid=juheshuju","uniquekey":"161214073242975","type":"头条","realtype":"国际"},{"title":"Selina前夫离婚后女人缘极好，六天会四位女伴","date":"2016-12-14 08:27","author_name":"腾讯娱乐","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214082749_f2adb994c4b84950ac9f077f2d728e68_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214082749_f2adb994c4b84950ac9f077f2d728e68_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214082749_f2adb994c4b84950ac9f077f2d728e68_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082749235.html?qid=juheshuju","uniquekey":"161214082749235","type":"头条","realtype":"娱乐"},{"title":"农村大叔在山中挖到\u201c人形\u201d物体，2万卖出，几天后被气哭！","date":"2016-12-13 20:56","author_name":"中国经济网","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161213/20161213205614_8dadfd755fdc5f3c8eb31e22bae8ec75_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161213/20161213205614_8dadfd755fdc5f3c8eb31e22bae8ec75_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161213/20161213205614_8dadfd755fdc5f3c8eb31e22bae8ec75_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161213205614015.html?qid=juheshuju","uniquekey":"161213205614015","type":"头条","realtype":"社会"},{"title":"企图抢警枪杀特朗普英国男子被判刑 被诊患精神病","date":"2016-12-14 09:37","author_name":"环球网","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214093727_30b731949a5b7d12337b983cba176ffe_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214093727_30b731949a5b7d12337b983cba176ffe_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214093727_30b731949a5b7d12337b983cba176ffe_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214093727766.html?qid=juheshuju","uniquekey":"161214093727766","type":"头条","realtype":"国际"},{"title":"影后周冬雨新剧化身白衣天使 见面就撩发太俏皮","date":"2016-12-14 06:57","author_name":"视觉中国","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161214/20161214065703_fb31927b275148db754b7723241b3a70_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161214/20161214065703_fb31927b275148db754b7723241b3a70_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161214/20161214065703_fb31927b275148db754b7723241b3a70_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214065703217.html?qid=juheshuju","uniquekey":"161214065703217","type":"头条","realtype":"娱乐"},{"title":"组图：新疆7旬老人养150匹野狼 伙食费一年花掉100多万","date":"2016-12-14 08:26","author_name":"中国新闻网","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20161214/20161214082618_09b36b88ed1de696233c36caf55bd237_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20161214/20161214082618_09b36b88ed1de696233c36caf55bd237_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20161214/20161214082618_09b36b88ed1de696233c36caf55bd237_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082618207.html?qid=juheshuju","uniquekey":"161214082618207","type":"头条","realtype":"社会"},{"title":"阿里、腾讯、百度、华为工资竟这么高 看完哭了","date":"2016-12-14 06:09","author_name":"凤凰网","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214060901_c21b94eb25b23c0f7600df5f484bf09d_1_mwpm_03200403.png","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214060901_c21b94eb25b23c0f7600df5f484bf09d_1_mwpl_05500201.png","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214060901_c21b94eb25b23c0f7600df5f484bf09d_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214060901385.html?qid=juheshuju","uniquekey":"161214060901385","type":"头条","realtype":"科技"},{"title":"特朗普竟想赖掉20万亿美元债务：中国彻底愤怒了","date":"2016-12-14 01:24","author_name":"西陆军事","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214012437_b125133bebb8f179a976122e54bcaba5_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214012437_b125133bebb8f179a976122e54bcaba5_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214012437_b125133bebb8f179a976122e54bcaba5_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214012437116.html?qid=juheshuju","uniquekey":"161214012437116","type":"头条","realtype":"军事"},{"title":"云南原官员自曝出轨搞大女孩肚子？家人这样解释","date":"2016-12-13 16:44","author_name":"封面","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20161213/20161213164459_b96fe2d3f21f7a09de5f81db0f58b300_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20161213/20161213164459_b96fe2d3f21f7a09de5f81db0f58b300_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20161213/20161213164459_b96fe2d3f21f7a09de5f81db0f58b300_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161213164459210.html?qid=juheshuju","uniquekey":"161213164459210","type":"头条","realtype":"社会"},{"title":"赵丽颖现身机场卫衣图案亮了，随行保镖这个行为获网友大赞！","date":"2016-12-14 08:25","author_name":"九派新闻客户端","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214082528_36474c568d4638edf4dd7bb37906e296_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214082528_36474c568d4638edf4dd7bb37906e296_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214082528_36474c568d4638edf4dd7bb37906e296_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082528191.html?qid=juheshuju","uniquekey":"161214082528191","type":"头条","realtype":"娱乐"},{"title":"民航局：旅客可向民航部门申请确认航班延误取消原因","date":"2016-12-14 09:37","author_name":"中国新闻网","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20161214/20161214093748_539353ef3216b23b626bf7d7736194a6_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20161214/20161214093748_539353ef3216b23b626bf7d7736194a6_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20161214/20161214093748_539353ef3216b23b626bf7d7736194a6_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214093748102.html?qid=juheshuju","uniquekey":"161214093748102","type":"头条","realtype":"国内"},{"title":"马伊琍兑现承诺，放手文章，给他自由？","date":"2016-12-14 08:20","author_name":"东方网","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20161214/20161214082012_365abc60f413f818271422015c51ceda_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20161214/20161214082012_365abc60f413f818271422015c51ceda_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20161214/20161214082012_365abc60f413f818271422015c51ceda_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214082012731.html?qid=juheshuju","uniquekey":"161214082012731","type":"头条","realtype":"社会"},{"title":"还记得萧淑慎吗？曾因吸毒入狱爆肥，如今消瘦","date":"2016-12-14 06:47","author_name":"腾讯娱乐","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161214/20161214064751_f20e189c7af79e23521c37307f3f5b85_1_mwpm_03200403.png","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161214/20161214064751_f20e189c7af79e23521c37307f3f5b85_1_mwpl_05500201.png","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161214/20161214064751_f20e189c7af79e23521c37307f3f5b85_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214064751298.html?qid=juheshuju","uniquekey":"161214064751298","type":"头条","realtype":"娱乐"},{"title":"古雷斯特就任联合国秘书长，谈及民粹主义和特朗普当选美总统","date":"2016-12-14 09:41","author_name":"澎湃新闻","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214094119_48b94c5adeb39deb56cc568701a8bf92_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214094119_48b94c5adeb39deb56cc568701a8bf92_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214094119_48b94c5adeb39deb56cc568701a8bf92_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214094119331.html?qid=juheshuju","uniquekey":"161214094119331","type":"头条","realtype":"国际"},{"title":"还记得春晚的小彩旗吗？曾恋上大自己14岁的大叔，如今沦为路人","date":"2016-12-14 03:37","author_name":"八卦驾到","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20161214/20161214033750_fcceace103f176fa8ec08b29bc3b85ba_1_mwpm_03200403.png","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20161214/20161214033750_fcceace103f176fa8ec08b29bc3b85ba_1_mwpl_05500201.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20161214/20161214033750_fcceace103f176fa8ec08b29bc3b85ba_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214033750848.html?qid=juheshuju","uniquekey":"161214033750848","type":"头条","realtype":"娱乐"},{"title":"潘长江：春晚肯定搭蔡明，不上像鸡憋着不下蛋","date":"2016-12-14 09:24","author_name":"腾讯娱乐","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20161214/20161214092421_f7b99a6d21120f273bddd94f2628ead2_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20161214/20161214092421_f7b99a6d21120f273bddd94f2628ead2_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20161214/20161214092421_f7b99a6d21120f273bddd94f2628ead2_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214092421222.html?qid=juheshuju","uniquekey":"161214092421222","type":"头条","realtype":"娱乐"},{"title":"东方观点：8岁小女孩被亲妈送进派出所，原因竟是...","date":"2016-12-13 18:31","author_name":"东方头条","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161213/20161213183140_7d2451842fd780bdfbf95b69aa1c154e_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161213/20161213183140_7d2451842fd780bdfbf95b69aa1c154e_1_mwpl_05500201.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161213/20161213183140_7d2451842fd780bdfbf95b69aa1c154e_1_mwpl_05500201.jpg","url":"http://mini.eastday.com/mobile/161213183140301.html?qid=juheshuju","uniquekey":"161213183140301","type":"头条","realtype":"社会"},{"title":"日本女人和服里的震撼秘密:女人们上下几千年都说不出口","date":"2016-12-14 07:30","author_name":"中国网","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161214/20161214073053_523837def650d9a74ddb5dd8443c91f9_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161214/20161214073053_523837def650d9a74ddb5dd8443c91f9_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161214/20161214073053_523837def650d9a74ddb5dd8443c91f9_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214073053703.html?qid=juheshuju","uniquekey":"161214073053703","type":"头条","realtype":"社会"},{"title":"明道与秦岚因戏生情？深夜吃饭压马路亲密热聊","date":"2016-12-14 07:26","author_name":"视觉中国","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20161214/20161214072631_35c3fb15d84b0b076670e0cc532e426e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20161214/20161214072631_35c3fb15d84b0b076670e0cc532e426e_1_mwpl_05500201.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20161214/20161214072631_35c3fb15d84b0b076670e0cc532e426e_1_mwpl_05500201.jpeg","url":"http://mini.eastday.com/mobile/161214072631812.html?qid=juheshuju","uniquekey":"161214072631812","type":"头条","realtype":"娱乐"},{"title":"组图：西安有条路不堵车 堵的是国产大型军机","date":"2016-12-14 08:32","author_name":"阎良之窗","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20161214/20161214083205_578e940c3dec383ee017d119b26f8009_1_mwpm_03200403.png","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20161214/20161214083205_578e940c3dec383ee017d119b26f8009_1_mwpl_05500201.png","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20161214/20161214083205_578e940c3dec383ee017d119b26f8009_1_mwpl_05500201.png","url":"http://mini.eastday.com/mobile/161214083205307.html?qid=juheshuju","uniquekey":"161214083205307","type":"头条","realtype":"军事"}]
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String stat;
        /**
         * title : 印度的一夫多妻制，男子过着神仙般的生活，女人干活养家！
         * date : 2016-12-14 07:01
         * author_name : 摄影趣闻
         * thumbnail_pic_s : http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpm_03200403.jpeg
         * thumbnail_pic_s02 : http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpl_05500201.jpeg
         * thumbnail_pic_s03 : http://08.imgmini.eastday.com/mobile/20161214/20161214070125_d20a491bf4763cfc711e3d7f21a5146d_1_mwpl_05500201.jpeg
         * url : http://mini.eastday.com/mobile/161214070125598.html?qid=juheshuju
         * uniquekey : 161214070125598
         * type : 头条
         * realtype : 国际
         */

        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements Parcelable{
            private String title;
            private String date;
            private String author_name;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;
            private String url;
            private String uniquekey;
            private String type;
            private String realtype;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getRealtype() {
                return realtype;
            }

            public void setRealtype(String realtype) {
                this.realtype = realtype;
            }

            /**
             * 注意：其中在写writeToParcel(...)方法和createFromParcel(...)方法中Parcel对象写入和读取的顺序要一致，
             * 不然会出现顺序异常和乱码。
             */
            public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
                public DataBean createFromParcel(Parcel source) {
                    DataBean mDataBean = new DataBean();
                    mDataBean.title = source.readString();
                    mDataBean.date = source.readString();
                    mDataBean.author_name = source.readString();
                    mDataBean.thumbnail_pic_s = source.readString();
                    mDataBean.thumbnail_pic_s02 = source.readString();
                    mDataBean.thumbnail_pic_s03 = source.readString();
                    mDataBean.url = source.readString();
                    mDataBean.uniquekey = source.readString();
                    mDataBean.type = source.readString();
                    mDataBean.realtype = source.readString();
                    return mDataBean;
                }
                public DataBean[] newArray(int size) {
                    return new DataBean[size];
                }
            };

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(title);
                dest.writeString(date);
                dest.writeString(author_name);
                dest.writeString(thumbnail_pic_s);
                dest.writeString(thumbnail_pic_s02);
                dest.writeString(thumbnail_pic_s03);
                dest.writeString(url);
                dest.writeString(uniquekey);
                dest.writeString(type);
                dest.writeString(realtype);
            }
        }
    }

    @Override
    public String toString() {
        return "News{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }
}
