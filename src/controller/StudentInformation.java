package controller;

import java.util.HashMap;

import model.Student;
import model.StudentInfo;

//Page : https://jus69c.axshare.com/#g=1&p=student_information-p5
//Page : https://jus69c.axshare.com/#g=1&p=student_information_pre-filter-p5-1

public interface StudentInformation extends DashboardBasics{
	public HashMap<Student, StudentInfo>  addCommentForStudent(String BUI_Id, String note);
}
