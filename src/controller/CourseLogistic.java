package controller;

import java.util.List;

import model.GradeableItem;

//Page : https://jus69c.axshare.com/#g=1&p=course_logitstic-p7

public interface CourseLogistic {
	public List<GradeableItem> getAllGradedItems();
	public float getMean(int gradedItemId);
	public float getStandardDeviation(int gradedItemId);
	public boolean isInclude(int gradedItemId);
	public void setInclude(int gradedItemId);
	public void setExclude(int gradedItemId);
	public void setDelete(int gradedItemId);
}
