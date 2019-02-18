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

        //查看日志
        //git log
        //
        //版本回退
        //git reset --hard 版本号
        //git reset --hard 5b88373e5174b358d4bf6cdbc07a9b65bfc17df1
        //git reset --hard 5b88373
        //
        //HEAD:当前的指向,最后一次提交的位置
        //退回到HEAD的前一个指向
        //git reset --hard HEAD^
        //一个^代表一级
        //git reset --hard HEAD^^
        //~后面是次数
        //git reset --hard HEAD~100
        //查看所有日志
        //git reflog
        //
        //工作区,暂存区,版本库,远程仓库
        //工作区:当前编辑的工程(工程区不是所有的工程都能进行版本控制)
        //暂存区:当执行了git add后,文件会存入暂存区
        //版本库:当执行了git commit后,会把暂存区的文件提交到版本库
        //注:工作区,暂存区,版本库都在自己的电脑上
        //暂存区,版本库在.git文件夹中(.git文件夹是隐藏文件夹(Git01 -> 右键Show in Explorer进入))
        //远程仓库:git服务器

        //练习:
        //1.为Girl添加购物方法
        //2.add
        //3.为Girl添加休息方法
        //4.commit

        //撤销修改
        //1.工作区:直接修改,或 命令:git checkout -- 文件
        //2.暂存区:直接修改,再次add,或 命令:git reset HEAD 文件
        //3.版本库:版本回退
    }
}
