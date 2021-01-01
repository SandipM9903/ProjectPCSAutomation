package controller;

import java.util.List;
import dao.ISkillDao;
import daoImpl.SkillDaoImpl;
import model.Skill;

public class SkillController {

ISkillDao skDao=null;
	
	public SkillController() {
		skDao=new SkillDaoImpl();
	}
	
	public List<Skill> getAllEmployees(){
		List<Skill> empList=skDao.getAllSkills();
		return empList;
	}
	
	public void addEmployee(Skill sk) {
		skDao.addSkill(sk);
	}
	public Skill getEmployeeById(int id) {
		Skill sk=skDao.getSkillById(id);
		return sk;
	}
	public void updateSkill(Skill sk) {
		skDao.updateSkill(sk);
	}
	public void deleteSkill(int id) {
		skDao.deleteSkill(id);
	}
	public void deactivateSkill(Skill sk) {
		skDao.deactivateSkill(sk);
	}
	public void activateSkill(Skill sk) {
		skDao.activateSkill(sk);
	}
}
