package model;

import java.sql.*;
import com.mchange.v2.c3p0.*;

import java.util.ArrayList;

public class Database {
	
	private static ComboPooledDataSource dataSource;
	
	static {	
		init();
	}

	public static void init() {
		/* connection pool means we don't have to connect completely freshly
		 * every time
		 */
		dataSource = new ComboPooledDataSource();
		dataSource.setJdbcUrl(DbUtil.mySQLurl);
		dataSource.setUser("root");
		dataSource.setPassword(null); 
	}
	
	public static void main(String[] args) {
		//addStudent();	
	}
	
	/** 	ADDER FUNCTIONS
	 * 
	 * 		There is one function for each of the 8 tables, which adds an
	 * entirely new row. 
	 */
	public static void addCourse(Course c) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "INSERT INTO Course " + 
					"(courseId, courseName, semester, isActive)" +
					" VALUES (?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(DbUtil.COURSE_ID, c.getCourseId());
			ps.setString(DbUtil.COURSE_NAME, c.getCourseName());
			ps.setString(DbUtil.COURSE_SEMESTER, c.getCourseSemester());
			ps.setInt(DbUtil.COURSE_ACTIVE, c.isActive() ? 1 : 0);
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	         }	
	}
	
	public static void addStudentType(int typeId, String typeName) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "INSERT INTO StudentType " + 
					"(studentTypeId, studentType)" +
					" VALUES (?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(DbUtil.STUDENTTYPE_ID, typeId);
			ps.setString(DbUtil.STUDENTTYPE_NAME, typeName);
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	         } 
	}
	
	/* updates Student and Enrolled */
	public static void addStudentToCourse(Student s, int courseId) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			
			String existenceQuery = "SELECT * FROM Student " +
					"WHERE studentId = " + s.getBUId();
			
			ResultSet existenceResult = DbUtil.execute(conn, existenceQuery);
			
			/* if student doesn't exist at all, first add them to Student table */
			if (! existenceResult.next()) {
				String queryStudent = "INSERT INTO Student " + 
						"(studentId, firstName, middleInitial, lastName, email, studentType)" +
						" VALUES (?, ?, ?, ?, ?, ?)";
				
				PreparedStatement ps = conn.prepareStatement(queryStudent);

				ps.setInt(DbUtil.STUDENT_ID, s.getBUId());
				ps.setString(DbUtil.STUDENT_FNAME, s.getName().getFirstName());
				ps.setString(DbUtil.STUDENT_MI, String.valueOf(s.getName().getMiddleInitial()));
				ps.setString(DbUtil.STUDENT_LNAME, s.getName().getLastName());
				ps.setString(DbUtil.STUDENT_EMAIL, s.getEmail());
				ps.setInt(DbUtil.STUDENT_TYPE, s.isGradStudent() ? 2 : 1);
				ps.execute();
			}
			
			String queryEnrolled = "INSERT INTO Enrolled " + 
					"(courseId, studentId)" +
					" VALUES (?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(queryEnrolled);
			ps.setInt(DbUtil.ENROLLED_CORID, courseId);
			ps.setInt(DbUtil.ENROLLED_SID, s.getBUId());
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addCategory(GradableCategory gc, int courseId) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "INSERT INTO Category" + 
					"(categoryId, categoryName, courseId, percentageWeight)" +
					" VALUES (?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(DbUtil.CATEGORY_ID, gc.getId());
			ps.setString(DbUtil.CATEGORY_NAME, gc.getName());
			ps.setInt(DbUtil.CATEGORY_CORID, courseId);
			ps.setDouble(DbUtil.CATEGORY_WEIGHT, gc.getWeight());
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	      } 
	}
	
	public static void addScoringMethod(int methodId, String method) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "INSERT INTO ScoringMethod" + 
					"(scoringMethodId, scoringMethod)" +
					" VALUES (?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(DbUtil.SCORINGMETHOD_ID, methodId);
			ps.setString(DbUtil.SCORINGMETHOD_NAME, method);
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	         } 
	}
	
	public static void addGradedItem(GradableItem gi, int categoryId) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "INSERT INTO GradedItem " + 
					"(gradedItemId, gradedItemName, categoryId, maxPoints, scoringMethodId, percentageWeight)" +
					" VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(DbUtil.GRADEDITEM_ID, gi.getId());
			ps.setString(DbUtil.GRADEDITEM_NAME, gi.getName());
			ps.setInt(DbUtil.GRADEDITEM_CATID, categoryId);
			ps.setDouble(DbUtil.GRADEDITEM_MAXPOINTS, gi.getMaxPoints());
			ps.setInt(DbUtil.GRADEDITEM_SCORINGMETHOD, gi.getScoringMethod());
			ps.setDouble(DbUtil.GRADEDITEM_WEIGHT, gi.getWeightage());
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	      } 	
	}
	
	public static void addStudentGrade(StudentGrade sg) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "INSERT INTO StudentGrade " + 
					"(studentId, gradedItemId, score, notes)" +
					" VALUES (?, ?, ?, ?)";

			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(DbUtil.STUDENTGRADE_SID, sg.getStudentId());
			ps.setInt(DbUtil.STUDENTGRADE_GID, sg.getGradableItem().getId());
			ps.setDouble(DbUtil.STUDENTGRADE_SCORE, sg.getGrade().getScore());
			String notes = sg.getGrade().getNote();
			if (notes == null) {
				notes = "";
			}
			ps.setString(DbUtil.STUDENTGRADE_NOTES, notes);
			ps.execute();
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	      } 	
	}
	
	
	/** UPDATER FUNCTIONS
	 * 
	 * 		These functions adjust values in existing table rows
	 */
	
	public static void updateStudentGrade(StudentGrade sg, int courseId) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();

			String query =  "UPDATE StudentGrade " + 
					   "SET score = ?, notes = ? " + 
					   "WHERE studentId = ? AND gradedItemId = ?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setDouble(1, sg.getGrade().getScore());
			ps.setString(2, sg.getGrade().getNote());
			ps.setInt(3, sg.getStudentId());
			ps.setInt(4, courseId);
			
	        conn.close();      
		} catch(SQLException e) {
	         e.printStackTrace();
	      } 
	}
	
	
	public static void setCommentStudent(int courseId, int bu_id, String note) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
	 * GETTER FUNCTIONS
	 */
	
	public static ArrayList<ScoringMethod> getScoringMethods()
	{
		//TODO
		return null;
	}
	
	public static ArrayList<Course> getAllCourses() {
		ArrayList<Course> courses = new ArrayList<Course>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();

			/* select * from student */
			String query = "SELECT * FROM Course";
			
			ResultSet rs = DbUtil.execute(conn, query);
			
			while (rs.next()) {
				Course course = new Course(rs.getInt(DbUtil.COURSE_ID),
						rs.getString(DbUtil.COURSE_NAME),
						rs.getString(DbUtil.COURSE_SEMESTER));
				if (rs.getInt(DbUtil.COURSE_ACTIVE) == 0) {
					course.finishCourse();
				}
				
				courses.add(course);			
			}			
			conn.close();      
        } catch(SQLException e) {
         e.printStackTrace();
        }
		return courses;
	}
	
	public static StudentInfo getStudentsInfo(int courseId, int bu_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static ArrayList<Student> getStudentsInCourse(int courseId) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();

			/* select * from student */
			String query = "SELECT s.* FROM Student s, Enrolled e " +
						   "WHERE s.studentId = e.studentId AND " +
						   "e.courseId = " + courseId;
			
			ResultSet rs = DbUtil.execute(conn, query);
			
			while (rs.next()) {
				Name name = new Name(rs.getString(DbUtil.STUDENT_FNAME),
						rs.getString(DbUtil.STUDENT_MI).charAt(0),
						rs.getString(DbUtil.STUDENT_LNAME));
						
				Student student = new Student(rs.getInt(DbUtil.STUDENT_ID),
						name, rs.getString(DbUtil.STUDENT_EMAIL), 
						rs.getInt(DbUtil.STUDENT_TYPE) == 2);
				
				students.add(student);
			}
			
	        conn.close();      
	        } catch(SQLException e) {
	         e.printStackTrace();
	        }
		
		return students;	
	}
	
	public static ArrayList<GradableCategory> getCategoriesInCourse(int courseId) {
		ArrayList<GradableCategory> cats = new ArrayList<GradableCategory>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();

			/* select * from student */
			String query = "SELECT * FROM Category " +
						   "WHERE courseId = " + courseId;
			
			ResultSet rs = DbUtil.execute(conn, query);
			
			while (rs.next()) {
						
				GradableCategory cat = new GradableCategory(
						rs.getString(DbUtil.CATEGORY_NAME), 
						rs.getDouble(DbUtil.CATEGORY_WEIGHT));
				
				cats.add(cat);
			}
			
	        conn.close();      
	        } catch(SQLException e) {
	         e.printStackTrace();
	        }
		
		return cats;
	}
	
	public static ArrayList<StudentType> getAllStudentTypes() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static ArrayList<GradableItem> getGradedItemsInCategory(int catId) {
		ArrayList<GradableItem> gis = new ArrayList<GradableItem>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();

			/* select * from student */
			String query = "SELECT * FROM GradedItem " +
						   "WHERE categoryId = " + catId;
			
			ResultSet rs = DbUtil.execute(conn, query);
			
			while (rs.next()) {				
				GradableItem gi = new GradableItem(rs.getString(DbUtil.GRADEDITEM_NAME),
						(int) rs.getDouble(DbUtil.GRADEDITEM_MAXPOINTS),
						rs.getInt(DbUtil.GRADEDITEM_SCORINGMETHOD),
						rs.getDouble(DbUtil.GRADEDITEM_WEIGHT));
				
				gis.add(gi);
			}
			
	        conn.close();      
	        } catch(SQLException e) {
	         e.printStackTrace();
	        }
		
		return gis;
	}
	
	public static boolean checkIfIncludedGradedItem(int gradedItemId) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void setIncludeGradedItem(int gradedItemId) {
		// TODO Auto-generated method stub
	}

	public static void setExcludeGradedItem(int gradedItemId) {
		// TODO Auto-generated method stub
		
	}

	public static void setDeleteGradedItem(int gradedItemId) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * DELETER FUNCTIONS
	 * 
	 * 		These functions remove rows from tables (may have cascading effects!)
	 */
	
	public static void removeStudentFromCourse(int studentId, int courseId) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			String query = "DELETE FROM Enrolled " +
					"WHERE studentId = ? AND courseId = ?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, studentId);
			ps.setInt(2, courseId);
			
			ps.execute();
			
		} catch(SQLException e) {
	         e.printStackTrace();
	      } 	
		return;	
		
	}
}
