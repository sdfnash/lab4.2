package books;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Statement;

	public class Bookservice {
		// ������̬ȫ�ֱ���
		static Connection conn;

		static Statement st;
		private String username;
		private String sql;
		private String[] booknames = null;

		private String worklen;

		public static void main(String[] args) {
			//insert();	//�������Ӽ�¼
			//update();	//���¼�¼����
			//delete();	//ɾ����¼
			query();	//��ѯ��¼����ʾ
		}
		
		/* �������ݼ�¼���������������ݼ�¼��*/
		/*public static void insert() {
			
			conn = getConnection();	// ����Ҫ��ȡ���ӣ������ӵ����ݿ�

			try {
				String sql = "INSERT INTO staff(name, age, sex,address, depart, worklen,wage)"
						+ " VALUES ('Tom1', 32, 'M', 'china','Personnel','3','3000')";	// �������ݵ�sql���
				
				st = (Statement) conn.createStatement();	// ��������ִ�о�̬sql����Statement����
				
				int count = st.executeUpdate(sql);	// ִ�в��������sql��䣬�����ز������ݵĸ���
				
				System.out.println("��staff���в��� " + count + " ������");	//�����������Ĵ������
				
				conn.close();	//�ر����ݿ�����
				
			} catch (SQLException e) {
				System.out.println("��������ʧ��" + e.getMessage());
			}
		}*/
		
		/* ���·���Ҫ��ļ�¼�������ظ��µļ�¼��Ŀ*/
		/*public static void update() {
			conn = getConnection();	//ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�
			try {
				String sql = "update staff set wage='2200' where name = 'lucy'";// �������ݵ�sql���
				
				st = (Statement) conn.createStatement();	//��������ִ�о�̬sql����Statement����st���ֲ�����
				
				int count = st.executeUpdate(sql);// ִ�и��²�����sql��䣬���ظ������ݵĸ���
				
				System.out.println("staff���и��� " + count + " ������");		//������²����Ĵ������
				
				conn.close();	//�ر����ݿ�����
				
			} catch (SQLException e) {
				System.out.println("��������ʧ��");
			}
		}*/

		/* ��ѯ���ݿ⣬�������Ҫ��ļ�¼�����*/
		public static void query() {
			
			conn = getConnection();	//ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�
			try {
				String sql = "select * from lkl";		// ��ѯ���ݵ�sql���
				st = conn.createStatement();	//��������ִ�о�̬sql����Statement����st���ֲ�����
				ResultSet rs = st.executeQuery(sql);	//ִ��sql��ѯ��䣬���ز�ѯ���ݵĽ����
				System.out.println("���Ĳ�ѯ���Ϊ��");
				while (rs.next()) {	// �ж��Ƿ�����һ������
					// �����ֶ�����ȡ��Ӧ��ֵ
//					String name = rs.getString("name");
//					int age = rs.getInt("age");
//					String sex = rs.getString("sex");
//					String address = rs.getString("address");
					String author = rs.getString("author");
					String worklen = rs.getString("booknames");
					String wage = rs.getString("date").trim();
					
					//����鵽�ļ�¼�ĸ����ֶε�ֵ
					System.out.println(author + " " + worklen + " " + wage);
				
				}
				
				conn.close();	//�ر����ݿ�����
				
			} catch (SQLException e) {
				System.out.println("��ѯ����ʧ��");
			}
		}
		public String getLeeBooks()
		{
			return worklen;
		}

		/* ɾ������Ҫ��ļ�¼��������*/
		/*public static void delete() {

			conn = getConnection();	//ͬ����Ҫ��ȡ���ӣ������ӵ����ݿ�
			try {
				String sql = "delete from staff  where name = 'lili'";// ɾ�����ݵ�sql���
				st = (Statement) conn.createStatement();	//��������ִ�о�̬sql����Statement����st���ֲ�����
				
				int count = st.executeUpdate(sql);// ִ��sqlɾ����䣬����ɾ�����ݵ�����
				
				System.out.println("staff����ɾ�� " + count + " ������\n");	//���ɾ�������Ĵ������
				
				conn.close();	//�ر����ݿ�����
				
			} catch (SQLException e) {
				System.out.println("ɾ������ʧ��");
			}
			
		}
		*/
		/* ��ȡ���ݿ����ӵĺ���*/
		public static Connection getConnection() {
			Connection con = null;	//���������������ݿ��Connection����
			try {
				Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������
				
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/bh", "root", "123456");// ������������
				
			} catch (Exception e) {
				System.out.println("���ݿ�����ʧ��" + e.getMessage());
			}
			return con;	//���������������ݿ�����
		}
	}
