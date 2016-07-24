<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>
<%@ include  file="header.jsp"%>
  <!--banner图-->
  <div id="banner">
  	<div id="ifocus">
	<div id="ifocus_pic">
		<div id="ifocus_piclist" style="left:0; top:0;">
			<ul>
				<li><a href="#"><img src="images/01.jpg" alt="图库" width="402" height="260" /></a></li>
				<li><a href="#"><img src="images/02.jpg" alt="图库" width="402" height="260" /></a></li>
				<li><a href="#"><img src="images/03.jpg" alt="图库" width="402" height="260" /></a></li>
				<li><a href="#"><img src="images/04.jpg" alt="图库" width="402" height="260" /></a></li>
                <li><a href="#"><img src="images/05.jpg" alt="图库" width="402" height="260" /></a></li>
			</ul>
		</div>
		<div id="ifocus_opdiv"></div>
		<div id="ifocus_tx">
			<ul>
				<li class="current">政治局会议研究拟提请十七届七中全会讨论的文件</li>
				<li class="normal">政治局会议研究拟提请十七届七中全会讨论的文件</li>
				<li class="normal">政治局会议研究拟提请十七届七中全会讨论的文件</li>
				<li class="normal">政治局会议研究拟提请十七届七中全会讨论的文件</li>
				<li class="normal">政治局会议研究拟提请十七届七中全会讨论的文件</li>
			</ul>
		</div>
	</div>
	<div id="ifocus_btn">
		<ul>
			<li class="current"><img src="images/btn_01.jpg" alt="图库" width="90" height="47" /></li>
			<li class="normal"><img src="images/btn_02.jpg" alt="图库" width="90" height="47"  /></li>
			<li class="normal"><img src="images/btn_03.jpg" alt="图库" width="90" height="47"  /></li>
			<li class="normal"><img src="images/btn_04.jpg" alt="图库"  width="90" height="47" /></li>
            <li class="normal"><img src="images/btn_05.jpg" alt="图库" width="90" height="47" /></li>
		</ul>
	</div>
	</div>
  
   
    <div class="tab_right">
      <ul class="tab_right_top">
        <li onclick="tab_right(1)">聚焦国防生</li>
        <li onclick="tab_right(2)"> 全  军 </li>
        <li onclick="tab_right(3)">南京军区</li>
      </ul>
      <div style="display:block;" class="tab_right_bottom" id="tab_right_text1">
        <h1>政治局会议研究拟提请十七届七中全会讨论的文件</h1>
        <p><span> 新华社北京１０月２２日电中共中央政治局２２日召开会议，研究拟提请
十七届七中全会讨论的十七届中央委员会向中国共产党第十八...   <a href="#">[详细]</a></span></p>
        <ul class="tab_right_bottom_ul">
          <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
        </ul>
      </div>
      <div class="tab_right_bottom" id="tab_right_text2">
        <h1 style="color:#F00;">政治局会议研究拟提请十七届七中全会讨论的文件</h1>
        <p><span> 新华社北京１０月２２日电中共中央政治局２２日召开会议，研究拟提请
十七届七中全会讨论的十七届中央委员会向中国共产党第十八...   <a href="#">[详细]</a></span></p>
        <ul class="tab_right_bottom_ul">
          <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
        </ul>
      </div>
      <div class="tab_right_bottom" id="tab_right_text3">
        <h1 style="color:#FF0;">政治局会议研究拟提请十七届七中全会讨论的文件</h1>
        <p><span> 新华社北京１０月２２日电中共中央政治局２２日召开会议，研究拟提请
十七届七中全会讨论的十七届中央委员会向中国共产党第十八...   <a href="#">[详细]</a></span></p>
        <ul class="tab_right_bottom_ul">
          <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声子登台话使命...   <span>[2012-10-22]</span></a></li>
           <li><a href="#">广州军区163医院倾心为老红军老八路服务某分部3位...   <span>[2012-10-22]</span></a></li>
        </ul>
      </div>
    </div>
  </div>
  <!--main主体-->
  <div id="main">
    <div class="main_left">
      <h1>
       <p>>><span><a href="<%=path%>/NewFrontController?act=show_list_page&ncid=25&pageNow=1">更多>></a></span>政策法规</p>
      </h1>
      <ul class="clear"><!--清除浮动-->
       <c:forEach var="studynew" items="${studynews }">
       <li><a href="#">${studynew.nname }...</a></li>
       </c:forEach>
      </ul>
      <h1 class="main_left_left">
       <p>>><span><a href="#">更多>></a></span>学习教育</p>
      </h1>
      <ul class="clear"><!--清除浮动-->
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
      </ul>
      <h1 class="main_left_left">
       <p>>><span><a href="#">更多>></a></span>经验交流</p>
      </h1>
      <ul class="clear"><!--清除浮动-->
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
       <li><a href="#">总政干部部领导就基层军官管理规定...</a></li>
      </ul>
    </div>
    <div class="main_center">
      <h1><span class="float_right"><a href="#">更多>></a></span>国防生故事</h1>
      <h2>政治局会议研究拟提请十七届七中全会讨论的文件</h2>
      <ul>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
      </ul>
      <h1><span class="float_right"><a href="#">更多>></a></span>国防生达人</h1>
      <h2>政治局会议研究拟提请十七届七中全会讨论的文件</h2>
      <ul>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
      </ul>
      <h1><span class="float_right"><a href="#">更多>></a></span>国防生文学</h1>
      <h2>政治局会议研究拟提请十七届七中全会讨论的文件</h2>
      <ul>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
       <li><a href="#">在济南军区某旅网上大课堂聆听官兵心声网络思想骨干活跃基...</a></li>
      </ul>
    </div>
    <div class="main_right">
      <div class="main_right_first">
       <p><font>解疑释惑</font><br/><span>Answer the question</span></p>
       <ul>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
       </ul>
      </div>
      <div class="main_right_second">
       <p><font>建言献策</font><br/><span>Advice and suggestions</span></p>
       <ul>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
       </ul>
      </div>
      <div class="main_right_third">
       <p><font>网上调查</font><br/><span>Investigation of</span></p>
       <ul>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
       </ul>
      </div>
      <div class="main_right_fourth">
       <p><font>实名微博</font><br/><span>Micro-blog</span></p>
       <ul>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
         <li><a href="#">济南军区某机步旅网络思想基...</a></li>
       </ul>
      </div>
    </div>
  </div>
  <!--center_banner-->
  <div id="center_banner"><img src="images/center_banner.jpg" alt="十八大" width="951" height="109" /></div>
  <!--contract_school-->
  <div id="contract_school">
    <ul class="contract_school_top">
      <li onmouseover="contract_school(1)" class="introduce">签约高校</li>
      <li onmouseover="contract_school(2)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>同济大学国防生</span></li>
      <li onmouseover="contract_school(3)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>浙江大学国防生</span></li>
      <li onmouseover="contract_school(4)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>同济大学国防生</span></li>
      <li onmouseover="contract_school(5)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>浙江大学国防生</span></li>
      <li onmouseover="contract_school(6)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>同济大学国防生</span></li>
    </ul>
    <div class="contract_school_content" id="contract_school_content1" style="" class="disp">
      <ul>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
      </ul>
      <ul class="contract_school_center">
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
      </ul>
      <ul class="contract_school_right">
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
      </ul>
    </div>
    <div id="contract_school_content2"  class="disp">2</div>
    <div id="contract_school_content3"  class="disp">3</div>
    <div id="contract_school_content4" class="disp">4</div>
    <div id="contract_school_content5" class="disp">5</div>
    <div id="contract_school_content6" class="disp">6</div>
  </div>
  <div id="contract_school_xia">
    <ul class="contract_school_xia_top">
      <li onmouseover="contract_school_xi(1)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>浙江大学国防生</span></li>
      <li onmouseover="contract_school_xi(2)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>同济大学国防生</span></li>
      <li onmouseover="contract_school_xi(3)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>浙江大学国防生</span></li>
      <li onmouseover="contract_school_xi(4)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>同济大学国防生</span></li>
      <li onmouseover="contract_school_xi(5)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>浙江大学国防生</span></li>
      <li onmouseover="contract_school_xi(6)"><img src="images/little_logo.jpg" alt="小图标" width="42" height="35" />&nbsp;<span>同济大学国防生</span></li>
    </ul>
    <div class="contract_school_contentl" style="display:block;" id="contract_school_xi_content1" class="disp">
      <ul>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
      </ul>
      <ul class="contract_school_centerl">
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
      </ul>
      <ul class="contract_school_rightl">
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
        <li><a href="#">济南军区某机步旅：网络思想骨干活跃基层...</a></li>
      </ul>
    </div>
     <div id="contract_school_xi_content2" class="disp">a</div>
    <div id="contract_school_xi_content3" class="disp">b</div>
    <div id="contract_school_xi_content4" class="disp">c</div>
    <div id="contract_school_xi_content5" class="disp">d</div>
    <div id="contract_school_xi_content6" class="disp">e</div>
   </div>
   <div id="defense_T">
      <h1>
       <p>>><span class="float_right"><a href="#">更多>></a></span>国防生T型台</p>
      </h1>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="defense_T_dt"><img src="images/T-1.jpg" alt="国防生T型台" width="113" height="141" />
          <dd class="defense_T_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
   </div>
   
   
   <div id="school_DV">
      <h1>
       <p>>><span class="float_right"><a href="#">更多>></a></span>校园DV</p>
      </h1>
      <dl>
        <dt class="school_DV_dt"><img src="images/DV.jpg" alt="校园DV" width="145" height="163" />
          <dd class="school_DV_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="school_DV_dt"><img src="images/DV.jpg" alt="校园DV" width="145" height="163" />
          <dd class="school_DV_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="school_DV_dt"><img src="images/DV.jpg" alt="校园DV" width="145" height="163" />
          <dd class="school_DV_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="school_DV_dt"><img src="images/DV.jpg" alt="校园DV" width="145" height="163" />
          <dd class="school_DV_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="school_DV_dt"><img src="images/DV.jpg" alt="校园DV" width="145" height="163" />
          <dd class="school_DV_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
      <dl>
        <dt class="school_DV_dt"><img src="images/DV.jpg" alt="校园DV" width="145" height="163" />
          <dd class="school_DV_dd"><span>依托培养</span></dd>
        </dt>
      </dl>
    </div> 
    
    
    <div id="Red_Tour">
      <h1>
       <p>>><span class="float_right"><a href="#">更多>></a></span>红色之旅</p>
      </h1>
      <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
       <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
       <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
       <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
       <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
       <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
       <dl>
        <dt>
          <dd class="Red_Tour_dd"><img src="images/Red Tour.jpg" alt="Red_Tour" height="141" width="113" /></dd>
        </dt>
      </dl> 
    </div>
   <%@ include  file="footer.jsp"%>
</div>
</body>
</html>

