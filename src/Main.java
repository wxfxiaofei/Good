public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //版本控制系统:VCS,Version Control System
        //1.集中式版本控制系统:SVN,Subversion
        //只能向中心服务器提交
        //2.分布式版本控制系统:Git
        //每一个都可以看做是一个小的服务器,可以向远程服务器提交,也可以向本地自己提交
        //https://www.jianshu.com/p/302932e65bbb

        //SVN服务器:taoCode,SVNChina
        //Git服务器:gitee,github

        //Git使用
        //Git安装
        //https://git-scm.com/

        //初始化版本库
        //git init
        //注:当前文件夹中,有文件要进行版本控制

        //查看当前版本库的状态
        //git status

        //指定某个文件进行版本控制
        //git add 文件
        //红色:未进行版本控制的文件
        //绿色:新增文件
        //蓝色:修改文件(文件修改过,但还没有提交)

        //添加或修改git信息配置
        //git config --global user.email "邮箱"
        //git config --global user.name "姓名"
        //删除git信息配置
        //git config --global --unset user.email
        //查看git信息配置
        //git config --global --list
        //注:
        //--system:系统
        //--global:当前用户
        //--local:当前仓库

        //提交修改
        //git commit -m "注释"

        //和上个版本进行比较,查看修改的内容
        //git diff 文件
        //注:按q退出查看
    }
}
