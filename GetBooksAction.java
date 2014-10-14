package books;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("serial")
public class GetBooksAction extends ActionSupport{
			
	private String username;	
	private  Connection conn;
	private  Statement st;
    private String author;
    private String authid;
    private String publisher;
    private String date;
    private String isbn;
    private String booknames;
    private String bookdetail;
    private String price;
    private String age;
    private String country;

    
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date = date;
	}
	public String getBookdetail() {
		return bookdetail;
	}
	public void setBookdetail(String bookdetail) {
		this.bookdetail = bookdetail;
	}
	public String getBooknames(){
		return booknames;
	}
	public void setBooknames(String booknames){
		this.booknames = booknames;
	}
	public String getAuthid(){
		return authid;
	}
	public void setAuthid(String authid){
		this.authid = authid;
	}
    public String getIsbn(){
		return isbn;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;

	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}  
	public String execute() throws Exception {
		 
		queryauthid();
		   return SUCCESS; 
		  
	}
	/*public String getSql() 
	{
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}*/
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/* ��ѯ���ݿ⣬�������Ҫ��ļ�¼�����*/


public void queryauthid()/* ��ȡ���ݿ����ӵĺ���*/
{
      conn = getConnection();
      //author = "Conan";
      author = username;
      try{
    	 
		String sql = "select * from lkl where author = \"" + author+"\"";
		st = conn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next())
		{
			authid = rs.getString("authid");
			System.out.println(authid);
			isbn = (rs.getString("isbn"));
			booknames = (rs.getString("booknames"));
			date = (rs.getString("date"));
			publisher = (rs.getString("publisher"));
			//bookdetail = (rs.getString("bookdetail"));
			price = (rs.getString("price"));
			age = (rs.getString("age"));
			country = (rs.getString("country"));
			System.out.println(country);
				
			
		}
		conn.close();
      }catch (SQLException e) {  
          System.out.println("ʧ��");  
          
      }

  }  
	public Connection getConnection() {
		Connection con = null;	//���������������ݿ��Connection����
		try {
			Class.forName("com.mysql.jdbc.Driver");// ����Mysql��������
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bh", "root", "123456");// ������������
			
		} catch (Exception e) {
			//System.out.println("���ݿ�����ʧ��" + e.getMessage());
		}
		return con;	//���������������ݿ�����
	}
}
