package Utils;

import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory factory = null;

    public static SqlSessionFactory getSqlSessionFactory(){
        if (factory == null) {
            //读取配置文件
            InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream("mybatis.xml");
            //创建sql会话工厂
            factory = new SqlSessionFactoryBuilder().build(config);
        }
        return factory;
    }

    //获得会话,默认为自动提交
    public static SqlSession getSqlSession(){
        /*return getSqlSessionFactory().openSession(true);*/
        return getSqlSeesion(true);
    }

    /**
     * 获得得sql会话
     * @param isAutoCommit 是否自动提交，如果为false则需要sqlSession.commit();rollback();
     * @return sql会话
     */
    public static SqlSession getSqlSeesion(Boolean isAutoCommit){
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
