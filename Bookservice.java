package books;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Statement;

	public class Bookservice {
		// 创建静态全局变量
		static Connection conn;

		static Statement st;
		private String username;
		private String sql;
		private String[] booknames = null;

		private String worklen;

		public static void main(String[] args) {
			//insert();	//插入添加记录
			//update();	//更新记录数据
			//delete();	//删除记录
			query();	//查询记录并显示
		}
		
		/* 插入数据记录，并输出插入的数据记录数*/
		/*public static void insert() {
			
			conn = getConnection();	// 首先要获取连接，即连接到数据库

			try {
				String sql = "INSERT INTO staff(name, age, sex,address, depart, worklen,wage)"
						+ " VALUES ('Tom1', 32, 'M', 'china','Personnel','3','3000')";	// 插入数据的sql语句
				
				st = (Statement) conn.createStatement();	// 创建用于执行静态sql语句的Statement对象
				
				int count = st.executeUpdate(sql);	// 执行插入操作的sql语句，并返回插入数据的个数
				
				System.out.println("向staff表中插入 " + count + " 条数据");	//输出插入操作的处理结果
				
				conn.close();	//关闭数据库连接
				
			} catch (SQLException e) {
				System.out.println("插入数据失败" + e.getMessage());
			}
		}*/
		
		/* 更新符合要求的记录，并返回更新的记录数目*/
		/*public static void update() {
			conn = getConnection();	//同样先要获取连接，即连接到数据库
			try {
				String sql = "update staff set wage='2200' where name = 'lucy'";// 更新数据的sql语句
				
				st = (Statement) conn.createStatement();	//创建用于执行静态sql语句的Statement对象，st属局部变量
				
				int count = st.executeUpdate(sql);// 执行更新操作的sql语句，返回更新数据的个数
				
				System.out.println("staff表中更新 " + count + " 条数据");		//输出更新操作的处理结果
				
				conn.close();	//关闭数据库连接
				
			} catch (SQLException e) {
				System.out.println("更新数据失败");
			}
		}*/

		/* 查询数据库，输出符合要求的记录的情况*/
		public static void query() {
			
			conn = getConnection();	//同样先要获取连接，即连接到数据库
			try {
				String sql = "select * from lkl";		// 查询数据的sql语句
				st = conn.createStatement();	//创建用于执行静态sql语句的Statement对象，st属局部变量
				ResultSet rs = st.executeQuery(sql);	//执行sql查询语句，返回查询数据的结果集
				System.out.println("最后的查询结果为：");
				while (rs.next()) {	// 判断是否还有下一个数据
					// 根据字段名获取相应的值
//					String name = rs.getString("name");
//					int age = rs.getInt("age");
//					String sex = rs.getString("sex");
//					String address = rs.getString("address");
					String author = rs.getString("author");
					String worklen = rs.getString("booknames");
					String wage = rs.getString("date").trim();
					
					//输出查到的记录的各个字段的值
					System.out.println(author + " " + worklen + " " + wage);
				
				}
				
				conn.close();	//关闭数据库连接
				
			} catch (SQLException e) {
				System.out.println("查询数据失败");
			}
		}
		public String getLeeBooks()
		{
			return worklen;
		}

		/* 删除符合要求的记录，输出情况*/
		/*public static void delete() {

			conn = getConnection();	//同样先要获取连接，即连接到数据库
			try {
				String sql = "delete from staff  where name = 'lili'";// 删除数据的sql语句
				st = (Statement) conn.createStatement();	//创建用于执行静态sql语句的Statement对象，st属局部变量
				
				int count = st.executeUpdate(sql);// 执行sql删除语句，返回删除数据的数量
				
				System.out.println("staff表中删除 " + count + " 条数据\n");	//输出删除操作的处理结果
				
				conn.close();	//关闭数据库连接
				
			} catch (SQLException e) {
				System.out.println("删除数据失败");
			}
			
		}
		*/
		/* 获取数据库连接的函数*/
		public static Connection getConnection() {
			Connection con = null;	//创建用于连接数据库的Connection对象
			try {
				Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
				
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bh", "root", "123456");// 创建数据连接
				
			} catch (Exception e) {
				System.out.println("数据库连接失败" + e.getMessage());
			}
			return con;	//返回所建立的数据库连接
		}
	}

