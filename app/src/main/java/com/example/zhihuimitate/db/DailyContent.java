package com.example.zhihuimitate.db;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by pc on 2017/4/21.
 */

public class DailyContent extends DataSupport {

    /**
     * body : <div class="main-wrap content-wrap">
     <div class="headline">

     <div class="img-place-holder"></div>



     </div>

     <div class="content-inner">




     <div class="question">
     <h2 class="question-title">如何用通俗易懂的方式解释「智能信贷」？</h2>

     <div class="answer">

     <div class="meta">
     <img class="avatar" src="http://pic1.zhimg.com/v2-ee884bbe1dc19617c4108cbcbad14a1c_is.jpg">
     <span class="author">端茶倒水的程序员，</span><span class="bio">京东金融／风险管理部／程序员兼猎头</span>
     </div>

     <div class="content">
     <p>智能是个非常好的词，因为足够普适，什么都可以跟这个词组合。比如智能马桶、智能汽车、智能笔记本、智能手表，当然还包括智能信贷。让我们这帮做依靠技术手段做风控的人着实傲娇了一把，感谢哪些会起名字的人们，我等屌丝高大上了一回。</p>
     <p>不考虑吹牛的需求，目前行业中宣传智能信贷概念的公司，普遍向着用数据、算法、系统取代信贷业务中人工的部分的目标前进，持续的投入技术研发围绕数据技术不断提升信贷业务的自动化程度、精细化程度、个性化程度。通过数据、算法、系统相互促进，在整体业务流程中实现更丰富的数据采集点、实现更有节奏的风险管理、实现更优质的用户体验。比如我们采集了大量的用户行为数据，在数据脱敏的情况下使用 RNN 实现类似于围棋 AI 中的价值网络来判断用户整体的行为序列所可能产生的结果，来区分正常用户与非正常用户，保护正常用户的金融安全，从技术上讲我们团队产生了高昂的电费 - -！</p>
     <p>之所以行业会朝这个方向前进，其内因在于业务本身就非常适合技术在其中发挥作用。信贷行业是数据驱动的，整个业务周期会采集大量数据，并产生大量新的数据。信贷行业是低门槛的，只要你有钱有技术一个人都可以做，比如高利贷。信贷行业是流动性强的，因为交易的载体是现金啊。</p>
     <p>外因在于整个世界都在慢慢的变成技术驱动的。随着互联网行业的兴起，近 10 年来人类生产数据的量超过了人类历史的总和，海量的数据催生软件、硬件、算法的性能不断突破上线，便利的数据采集方式、廉价的计算环境、丰富的开源软件支撑着技术能力高速增值。而&ldquo;On line&rdquo;的形式使得国家与国家之间的界限变得模糊，知识的获取变得从未如此方便，为金融技术的进化提供了丰富的知识获取渠道与大量的技术从业者，具有高度流动性的金融业务在&ldquo;On line&rdquo;的环境下也导致各家机构间的业务壁垒变得更加模糊。最后加上大量资本的涌入，为科技的发展增加加足了燃料，只要创业者的故事能够支撑足够的投资回报率，就可以获得 10 年前想象不到的庞大资金，帮助建立技术、运营、产品红利，最终创业者们又会反馈给资本高额的汇报，然后再次发生资本对于新的故事的支持。</p>
     <p>这些原因使得信贷的业务的竞争从未像今天这样有趣，从技术上讲你所具有的技术别人一样能够具有，从客户上讲你所能碰触的客户别人也一样能够碰触，从资金上我是穷鬼不适合讲这个问题。于是每家机构都在围绕场景通过技术、运营、产品手段共同构建系统性的竞争优势。所以现在行业中的一些大神们提出，风险管理不是一门技术而是一门艺术。因为其需要紧密的链接信贷业务中每一个环节，包括客户挖掘、信贷评估、风险量化、运营管理，不良资产管理、宏观政策以及市场风险、技术研发以及吹牛，从根本上决定一家信贷机构场景的丰富度、价格优势、产品体验、业绩达成情况与合规，而各家的手段又千姿百态。比如：</p>
     <p>1、 某农村信贷机构，派人跑去猪圈里属猪。来达到量化农民资产情况的目的。</p>
     <p>2、 某消费金融公司，通过住店销售人员采集贷款客户是否光头、是否纹身以及用户在 APP 上填写申请表单的每一个动作，结合自身算法进行欺诈管控和风险定价。</p>
     <p>3、 众多金融公司都鼓吹知识图谱技术，实际上就是把客户的关系性数据进行关联分析，然后发现异常点。（吐槽：这特么跟知识图谱最大的关系就是数据结构类似吧？）</p>
     <p>4、 某大型电商公司，结合自身丰富的场景以及海量的用户数据，实现整体风控闭环。</p>
     <p>5、 比如有些信贷机构新产品发布时盲目放贷然后死掉了，比如有些机构引入了灰度发布、灰度测试的机制把新产品发布机制拉长到数月甚至一年，但却稳扎稳打的逐步壮大。</p>
     <p>6、 比如我们团队，数据多到看不过来，通过穷尽方式程序化提取特征，然后直接靠深度学习算法跑数据。</p>
     <p>最后，风险管理是个严肃的系统性的问题。作为技术人员我更感兴趣如何创造新的技术高度、如何写篇高质量的 Paper，但作为风险从业人员我们深刻的理解不论是洋枪大炮深度学习，还是大刀长矛肉眼雷达，智能不是目的，赚钱才是硬道理。</p>
     </div>
     </div>


     <div class="view-more"><a href="http://www.zhihu.com/question/57410972">查看知乎讨论<span class="js-question-holder"></span></a></div>

     </div>





     <div class="question">
     <h2 class="question-title"></h2>

     <div class="answer">

     <div class="content">
     <p>更多讨论，查看 知乎圆桌 &middot;&nbsp;<a class="internal" href="https://www.zhihu.com/roundtable/fintech?utm_campaign=official_account&amp;utm_source=zhihudaily&amp;utm_medium=link&amp;utm_content=roundtable">金融科技浪潮</a><strong><br /></strong></p>
     </div>
     </div>


     </div>


     </div>
     </div>
     * image_source : Yestone.com 版权图片库
     * title : 这年头干什么都加个「智能」，借钱也能「智能借钱」
     * image : https://pic1.zhimg.com/v2-e8964c8e1fb417e9d0f8819aa23cb68c.jpg
     * share_url : http://daily.zhihu.com/story/9372267
     * js : []
     * ga_prefix : 042109
     * images : ["https://pic1.zhimg.com/v2-d68ffbbe9bb57bf3bcdfb43d8bad2980.jpg"]
     * type : 0
     * id : 9372267
     * css : ["http://news-at.zhihu.com/css/news_qa.auto.css?v=4b3e3"]
     */

    private String body;
    private String image_source;
    private String title;
    private String image;
    private String share_url;
    private String ga_prefix;
    private int type;
    private int id;
    private List<?> js;
    private List<String> images;
    private List<String> css;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImage_source() {
        return image_source;
    }

    public void setImage_source(String image_source) {
        this.image_source = image_source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<?> getJs() {
        return js;
    }

    public void setJs(List<?> js) {
        this.js = js;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getCss() {
        return css;
    }

    public void setCss(List<String> css) {
        this.css = css;
    }
}
