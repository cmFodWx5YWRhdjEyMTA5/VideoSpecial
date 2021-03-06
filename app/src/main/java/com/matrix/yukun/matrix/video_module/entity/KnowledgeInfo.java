package com.matrix.yukun.matrix.video_module.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yukun on 18-1-4.
 */

public class KnowledgeInfo {

    /**
     * errorCode : 0
     * errorMsg : null
     * data : [{"id":150,"name":"开发环境","courseId":13,"parentChapterId":0,"order":1,"visible":1,"children":[{"id":60,"name":"Android Studio相关","courseId":13,"parentChapterId":150,"order":1000,"visible":1,"children":[]},{"id":169,"name":"gradle","courseId":13,"parentChapterId":150,"order":1001,"visible":1,"children":[]},{"id":269,"name":"官方发布","courseId":13,"parentChapterId":150,"order":1002,"visible":1,"children":[]}]},{"id":167,"name":"基础知识","courseId":13,"parentChapterId":0,"order":5,"visible":1,"children":[{"id":168,"name":"Drawable","courseId":13,"parentChapterId":167,"order":5000,"visible":1,"children":[]},{"id":172,"name":"deep link","courseId":13,"parentChapterId":167,"order":5001,"visible":1,"children":[]},{"id":198,"name":"基础概念","courseId":13,"parentChapterId":167,"order":5002,"visible":1,"children":[]},{"id":224,"name":"adb","courseId":13,"parentChapterId":167,"order":5003,"visible":1,"children":[]},{"id":240,"name":"字符编码","courseId":13,"parentChapterId":167,"order":5004,"visible":1,"children":[]},{"id":241,"name":"线程池","courseId":13,"parentChapterId":167,"order":5005,"visible":1,"children":[]},{"id":257,"name":"Span","courseId":13,"parentChapterId":167,"order":5006,"visible":1,"children":[]}]},{"id":9,"name":"四大组件","courseId":13,"parentChapterId":0,"order":10,"visible":1,"children":[{"id":10,"name":"Activity","courseId":13,"parentChapterId":9,"order":10000,"visible":1,"children":[]},{"id":15,"name":"Service","courseId":13,"parentChapterId":9,"order":10001,"visible":1,"children":[]},{"id":16,"name":"BroadcastReceiver","courseId":13,"parentChapterId":9,"order":10002,"visible":1,"children":[]},{"id":17,"name":"ContentProvider","courseId":13,"parentChapterId":9,"order":10003,"visible":1,"children":[]},{"id":19,"name":"Intent","courseId":13,"parentChapterId":9,"order":10004,"visible":1,"children":[]},{"id":40,"name":"Context","courseId":13,"parentChapterId":9,"order":10005,"visible":1,"children":[]},{"id":267,"name":"handler","courseId":13,"parentChapterId":9,"order":10006,"visible":1,"children":[]}]},{"id":25,"name":"常用控件","courseId":13,"parentChapterId":0,"order":15,"visible":1,"children":[{"id":26,"name":"基础UI控件","courseId":13,"parentChapterId":25,"order":15000,"visible":1,"children":[]},{"id":27,"name":"ListView&GridView","courseId":13,"parentChapterId":25,"order":15001,"visible":1,"children":[]},{"id":121,"name":"ViewPager","courseId":13,"parentChapterId":25,"order":15003,"visible":1,"children":[]},{"id":124,"name":"Fragment","courseId":13,"parentChapterId":25,"order":15004,"visible":1,"children":[]},{"id":259,"name":"ScrollView","courseId":13,"parentChapterId":25,"order":15005,"visible":1,"children":[]}]},{"id":29,"name":"用户交互","courseId":13,"parentChapterId":0,"order":20,"visible":1,"children":[{"id":30,"name":"Toast","courseId":13,"parentChapterId":29,"order":20000,"visible":1,"children":[]},{"id":31,"name":"Dialog","courseId":13,"parentChapterId":29,"order":20001,"visible":1,"children":[]},{"id":32,"name":"PopupWindow","courseId":13,"parentChapterId":29,"order":20002,"visible":1,"children":[]},{"id":33,"name":"Notification","courseId":13,"parentChapterId":29,"order":20003,"visible":1,"children":[]},{"id":190,"name":"震动","courseId":13,"parentChapterId":29,"order":20004,"visible":1,"children":[]},{"id":263,"name":"截屏","courseId":13,"parentChapterId":29,"order":20005,"visible":1,"children":[]}]},{"id":34,"name":"网络访问","courseId":13,"parentChapterId":0,"order":25,"visible":1,"children":[{"id":98,"name":"WebView","courseId":13,"parentChapterId":34,"order":12000,"visible":1,"children":[]},{"id":67,"name":"网络基础","courseId":13,"parentChapterId":34,"order":25000,"visible":1,"children":[]},{"id":68,"name":"volley","courseId":13,"parentChapterId":34,"order":25001,"visible":1,"children":[]},{"id":69,"name":"okhttp","courseId":13,"parentChapterId":34,"order":25002,"visible":1,"children":[]},{"id":70,"name":"retrofit","courseId":13,"parentChapterId":34,"order":25003,"visible":1,"children":[]},{"id":71,"name":"数据解析","courseId":13,"parentChapterId":34,"order":25004,"visible":1,"children":[]},{"id":200,"name":"https","courseId":13,"parentChapterId":34,"order":25005,"visible":1,"children":[]}]},{"id":72,"name":"图片加载","courseId":13,"parentChapterId":0,"order":30,"visible":1,"children":[{"id":87,"name":"图片加载库","courseId":13,"parentChapterId":72,"order":6000,"visible":1,"children":[]},{"id":86,"name":"图片处理","courseId":13,"parentChapterId":72,"order":6000,"visible":1,"children":[]}]},{"id":35,"name":"数据存储","courseId":13,"parentChapterId":0,"order":35,"visible":1,"children":[{"id":90,"name":"数据库","courseId":13,"parentChapterId":35,"order":7000,"visible":1,"children":[]},{"id":89,"name":"app缓存相关","courseId":13,"parentChapterId":35,"order":7000,"visible":1,"children":[]}]},{"id":36,"name":"动画效果","courseId":13,"parentChapterId":0,"order":40,"visible":1,"children":[{"id":92,"name":"属性动画","courseId":13,"parentChapterId":36,"order":8000,"visible":1,"children":[]},{"id":91,"name":"常规动画","courseId":13,"parentChapterId":36,"order":8000,"visible":1,"children":[]},{"id":188,"name":"转场动画","courseId":13,"parentChapterId":36,"order":8000,"visible":1,"children":[]},{"id":238,"name":"其他动画","courseId":13,"parentChapterId":36,"order":8001,"visible":1,"children":[]}]},{"id":37,"name":"自定义控件","courseId":13,"parentChapterId":0,"order":45,"visible":1,"children":[{"id":126,"name":"绘图相关","courseId":13,"parentChapterId":37,"order":9000,"visible":1,"children":[]},{"id":134,"name":"SurfaceView","courseId":13,"parentChapterId":37,"order":9000,"visible":1,"children":[]},{"id":93,"name":"基础知识","courseId":13,"parentChapterId":37,"order":9000,"visible":1,"children":[]},{"id":94,"name":"事件分发","courseId":13,"parentChapterId":37,"order":9000,"visible":1,"children":[]},{"id":99,"name":"具体案例","courseId":13,"parentChapterId":37,"order":9000,"visible":1,"children":[]}]},{"id":38,"name":"多媒体技术","courseId":13,"parentChapterId":0,"order":50,"visible":1,"children":[{"id":97,"name":"音视频","courseId":13,"parentChapterId":38,"order":10000,"visible":1,"children":[]},{"id":95,"name":"相机Camera","courseId":13,"parentChapterId":38,"order":10000,"visible":1,"children":[]},{"id":170,"name":"闹钟","courseId":13,"parentChapterId":38,"order":10005,"visible":1,"children":[]}]},{"id":39,"name":"5.+高新技术","courseId":13,"parentChapterId":0,"order":55,"visible":0,"children":[{"id":125,"name":"CoordinatorLayout","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":192,"name":"权限管理","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":142,"name":"ConstraintLayout","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":55,"name":"新的API","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":193,"name":"分屏","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":54,"name":"新的控件","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":100,"name":"RecyclerView","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":179,"name":"Data Binding","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":183,"name":"WebP","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":166,"name":"BottomSheet","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":165,"name":"Support Annotations","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":164,"name":"File Provider","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":151,"name":"Vector","courseId":13,"parentChapterId":39,"order":11000,"visible":1,"children":[]},{"id":140,"name":"dagger2","courseId":13,"parentChapterId":39,"order":16000,"visible":1,"children":[]}]},{"id":53,"name":"热门专题","courseId":13,"parentChapterId":0,"order":60,"visible":0,"children":[{"id":81,"name":"学习的正确姿势","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":77,"name":"响应式编程","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":76,"name":"项目架构","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":75,"name":"插件化","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":196,"name":"常见异常","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":74,"name":"混淆与反编译","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":195,"name":"设计模式","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":73,"name":"面试相关","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":191,"name":"数据采集与埋点","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":184,"name":"推送&即时通讯","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":185,"name":"组件化","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":186,"name":"沉浸式","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":197,"name":"Native Crash","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":78,"name":"性能优化","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":146,"name":"React Native","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":61,"name":"Android测试相关","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":160,"name":"热修复","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":80,"name":"Github用法进阶","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":174,"name":"增量更新","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":159,"name":"OpenGL ES","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":79,"name":"黑科技","courseId":13,"parentChapterId":53,"order":12000,"visible":1,"children":[]},{"id":239,"name":"Xposed","courseId":13,"parentChapterId":53,"order":12001,"visible":1,"children":[]},{"id":246,"name":"保活","courseId":13,"parentChapterId":53,"order":12002,"visible":1,"children":[]},{"id":250,"name":"直播","courseId":13,"parentChapterId":53,"order":12003,"visible":1,"children":[]},{"id":251,"name":"OpenCV","courseId":13,"parentChapterId":53,"order":12004,"visible":1,"children":[]},{"id":262,"name":"SDK开发","courseId":13,"parentChapterId":53,"order":12005,"visible":1,"children":[]}]},{"id":127,"name":"硬件模块","courseId":13,"parentChapterId":0,"order":70,"visible":1,"children":[{"id":132,"name":"传感器","courseId":13,"parentChapterId":127,"order":14000,"visible":1,"children":[]},{"id":131,"name":"蓝牙","courseId":13,"parentChapterId":127,"order":14000,"visible":1,"children":[]},{"id":133,"name":"NFC","courseId":13,"parentChapterId":127,"order":14000,"visible":1,"children":[]}]},{"id":128,"name":"JNI","courseId":13,"parentChapterId":0,"order":75,"visible":1,"children":[{"id":182,"name":"JNI编程","courseId":13,"parentChapterId":128,"order":15000,"visible":1,"children":[]},{"id":149,"name":"so文件相关","courseId":13,"parentChapterId":128,"order":15000,"visible":1,"children":[]}]},{"id":130,"name":"常用SDK","courseId":13,"parentChapterId":0,"order":85,"visible":1,"children":[{"id":139,"name":"Crash捕获","courseId":13,"parentChapterId":130,"order":17000,"visible":1,"children":[]},{"id":137,"name":"后端云","courseId":13,"parentChapterId":130,"order":17000,"visible":1,"children":[]},{"id":138,"name":"推送","courseId":13,"parentChapterId":130,"order":17000,"visible":1,"children":[]},{"id":136,"name":"地图","courseId":13,"parentChapterId":130,"order":17000,"visible":1,"children":[]},{"id":223,"name":"ocr&图像识别","courseId":13,"parentChapterId":130,"order":17001,"visible":1,"children":[]}]},{"id":152,"name":"framework","courseId":13,"parentChapterId":0,"order":90,"visible":1,"children":[{"id":171,"name":"binder","courseId":13,"parentChapterId":152,"order":18000,"visible":1,"children":[]},{"id":155,"name":"SystemServer启动过程","courseId":13,"parentChapterId":152,"order":18000,"visible":1,"children":[]},{"id":173,"name":"Choregrapher","courseId":13,"parentChapterId":152,"order":18000,"visible":1,"children":[]},{"id":153,"name":"Zygote进程启动","courseId":13,"parentChapterId":152,"order":18000,"visible":1,"children":[]},{"id":178,"name":"apk安装","courseId":13,"parentChapterId":152,"order":18000,"visible":1,"children":[]},{"id":233,"name":"framework-四大组件","courseId":13,"parentChapterId":152,"order":18001,"visible":1,"children":[]},{"id":264,"name":"SystemServer相关","courseId":13,"parentChapterId":152,"order":18002,"visible":1,"children":[]}]},{"id":156,"name":"项目必备","courseId":13,"parentChapterId":0,"order":95,"visible":1,"children":[{"id":135,"name":"二维码","courseId":13,"parentChapterId":156,"order":16000,"visible":1,"children":[]},{"id":158,"name":"Fragment懒加载","courseId":13,"parentChapterId":156,"order":19000,"visible":1,"children":[]},{"id":199,"name":"MultiDex 启动优化","courseId":13,"parentChapterId":156,"order":19000,"visible":1,"children":[]},{"id":157,"name":"获取设备唯一标识","courseId":13,"parentChapterId":156,"order":19000,"visible":1,"children":[]},{"id":163,"name":"Splash页优化","courseId":13,"parentChapterId":156,"order":19000,"visible":1,"children":[]},{"id":222,"name":"持续集成","courseId":13,"parentChapterId":156,"order":19001,"visible":1,"children":[]},{"id":228,"name":"辅助 or 工具类","courseId":13,"parentChapterId":156,"order":19002,"visible":1,"children":[]},{"id":230,"name":"打包","courseId":13,"parentChapterId":156,"order":19003,"visible":1,"children":[]},{"id":237,"name":"下拉刷新&上拉加载","courseId":13,"parentChapterId":156,"order":19004,"visible":1,"children":[]},{"id":242,"name":"实用插件","courseId":13,"parentChapterId":156,"order":19005,"visible":1,"children":[]},{"id":247,"name":"防逆向","courseId":13,"parentChapterId":156,"order":19006,"visible":1,"children":[]},{"id":252,"name":"奇怪的Bug","courseId":13,"parentChapterId":156,"order":19007,"visible":1,"children":[]},{"id":258,"name":"三方分享 & 登录","courseId":13,"parentChapterId":156,"order":19008,"visible":1,"children":[]},{"id":260,"name":"RxJava & Retrofit & MVP","courseId":13,"parentChapterId":156,"order":19009,"visible":1,"children":[]},{"id":261,"name":"屏幕适配","courseId":13,"parentChapterId":156,"order":19010,"visible":1,"children":[]},{"id":268,"name":"优秀的设计","courseId":13,"parentChapterId":156,"order":19011,"visible":1,"children":[]}]},{"id":175,"name":"推荐网站","courseId":13,"parentChapterId":0,"order":100,"visible":1,"children":[{"id":176,"name":"个人博客","courseId":13,"parentChapterId":175,"order":20000,"visible":1,"children":[]},{"id":177,"name":"公司对外","courseId":13,"parentChapterId":175,"order":20000,"visible":1,"children":[]}]},{"id":180,"name":"延伸技术","courseId":13,"parentChapterId":0,"order":105,"visible":1,"children":[{"id":181,"name":"javassist","courseId":13,"parentChapterId":180,"order":21000,"visible":1,"children":[]},{"id":202,"name":"机器学习&人工智能","courseId":13,"parentChapterId":180,"order":21000,"visible":1,"children":[]},{"id":203,"name":"javapoet","courseId":13,"parentChapterId":180,"order":21000,"visible":1,"children":[]},{"id":243,"name":"JVM","courseId":13,"parentChapterId":180,"order":21001,"visible":1,"children":[]}]},{"id":225,"name":"注解 & 反射 & AOP","courseId":13,"parentChapterId":0,"order":110,"visible":1,"children":[{"id":227,"name":"注解","courseId":13,"parentChapterId":225,"order":110000,"visible":1,"children":[]},{"id":229,"name":"AOP","courseId":13,"parentChapterId":225,"order":110001,"visible":1,"children":[]},{"id":265,"name":"反射","courseId":13,"parentChapterId":225,"order":110002,"visible":1,"children":[]}]},{"id":231,"name":"Kotlin","courseId":13,"parentChapterId":0,"order":115,"visible":1,"children":[{"id":232,"name":"入门及知识点","courseId":13,"parentChapterId":231,"order":115000,"visible":1,"children":[]}]},{"id":244,"name":"Java常见源码分析","courseId":13,"parentChapterId":0,"order":120,"visible":1,"children":[{"id":245,"name":"集合相关","courseId":13,"parentChapterId":244,"order":120000,"visible":1,"children":[]}]},{"id":248,"name":"干货资源","courseId":13,"parentChapterId":0,"order":125,"visible":1,"children":[{"id":249,"name":"干货资源","courseId":13,"parentChapterId":248,"order":125000,"visible":1,"children":[]}]},{"id":253,"name":"完整开源项目","courseId":13,"parentChapterId":0,"order":130,"visible":1,"children":[{"id":254,"name":"新闻资讯","courseId":13,"parentChapterId":253,"order":130000,"visible":1,"children":[]},{"id":255,"name":"工具类","courseId":13,"parentChapterId":253,"order":130001,"visible":1,"children":[]},{"id":256,"name":"音乐、视频类","courseId":13,"parentChapterId":253,"order":130002,"visible":1,"children":[]}]},{"id":266,"name":"开源项目主Tab","courseId":13,"parentChapterId":0,"order":135,"visible":0,"children":[]}]
     */

    private int errorCode;
    private Object errorMsg;
    /**
     * id : 150
     * name : 开发环境
     * courseId : 13
     * parentChapterId : 0
     * order : 1.0
     * visible : 1
     * children : [{"id":60,"name":"Android Studio相关","courseId":13,"parentChapterId":150,"order":1000,"visible":1,"children":[]},{"id":169,"name":"gradle","courseId":13,"parentChapterId":150,"order":1001,"visible":1,"children":[]},{"id":269,"name":"官方发布","courseId":13,"parentChapterId":150,"order":1002,"visible":1,"children":[]}]
     */

    private List<DataBean> data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Object getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(Object errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        private int id;
        private String name;
        private int courseId;
        private int parentChapterId;
        private double order;
        private int visible;
        /**
         * id : 60
         * name : Android Studio相关
         * courseId : 13
         * parentChapterId : 150
         * order : 1000.0
         * visible : 1
         * children : []
         */

        private List<ChildrenBean> children;

        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", courseId=" + courseId +
                    ", parentChapterId=" + parentChapterId +
                    ", order=" + order +
                    ", visible=" + visible +
                    ", children=" + children +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public int getParentChapterId() {
            return parentChapterId;
        }

        public void setParentChapterId(int parentChapterId) {
            this.parentChapterId = parentChapterId;
        }

        public double getOrder() {
            return order;
        }

        public void setOrder(double order) {
            this.order = order;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        public static class ChildrenBean implements Serializable{
            private int id;
            private String name;
            private int courseId;
            private int parentChapterId;
            private double order;
            private int visible;
            private List<?> children;

            @Override
            public String toString() {
                return "ChildrenBean{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", courseId=" + courseId +
                        ", parentChapterId=" + parentChapterId +
                        ", order=" + order +
                        ", visible=" + visible +
                        ", children=" + children +
                        '}';
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public int getParentChapterId() {
                return parentChapterId;
            }

            public void setParentChapterId(int parentChapterId) {
                this.parentChapterId = parentChapterId;
            }

            public double getOrder() {
                return order;
            }

            public void setOrder(double order) {
                this.order = order;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public List<?> getChildren() {
                return children;
            }

            public void setChildren(List<?> children) {
                this.children = children;
            }
        }
    }
}
