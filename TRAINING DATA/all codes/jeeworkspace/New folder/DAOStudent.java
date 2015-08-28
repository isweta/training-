import java.sql.Connection;
import java.util.List;

public interface DAOStudent {
	public Connection createConnection();

	public List<Student> matchNameQuery(String str);

	public List<Student> matchDeptQuery(String deptNameStr);

	public List<String> getDepartmentsQuery();

}
