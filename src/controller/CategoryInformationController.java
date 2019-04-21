package controller;

import java.util.HashMap;
import java.util.List;

import model.CategoryLevelGrade;
import model.Student;
import model.StudentGrade;
import model.StudentInfo;

public class CategoryInformationController extends DashboardBasicsController {

	public CategoryInformationController(int courseId) {
		super(courseId);
		// TODO Auto-generated constructor stub
	}
	
	public double getGradeableItemMean(int gradeableItemId) {
		double total = 0;
		int count = 0;
		for (HashMap.Entry<Student, StudentInfo> entry : dashboardInfo.entrySet()) {
		    StudentInfo si = entry.getValue();
		    List<CategoryLevelGrade> categoryLevelGrades = si.getCategoryLevelGrades();
		    for(CategoryLevelGrade cg : categoryLevelGrades)
		    {
		    	for(StudentGrade sg : cg.getStudentGrades())
		    	{
		    		if(sg.getGradableItem().getId() == gradeableItemId)
			    	{
			    		total = total + sg.getGrade().getScore();
			    		count++;
			    	}
		    	}
		    }
		}
		return total/count;
	}

	public double getGradeableItemStandardDeviation(int gradeableItemId) {
		double mean = getGradeableItemMean(gradeableItemId);
		double standard_deviation = 0;
		double sigma = 0;
		int count = 0;
		
		for (HashMap.Entry<Student, StudentInfo> entry : dashboardInfo.entrySet()) {
		    StudentInfo si = entry.getValue();
		    List<CategoryLevelGrade> categoryLevelGrades = si.getCategoryLevelGrades();
		    for(CategoryLevelGrade cg : categoryLevelGrades)
		    {
		    	for(StudentGrade sg : cg.getStudentGrades())
		    	{
		    		if(sg.getGradableItem().getId() == gradeableItemId)
			    	{
			    		sigma = sigma + Math.pow(sg.getGrade().getScore() - mean, 2);
			    		count++;
			    	}
		    	}
		    }
		}
		
		standard_deviation = Math.pow(sigma/count, 0.5);
		return standard_deviation;
	}

}