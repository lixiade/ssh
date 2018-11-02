package cap.test;

import cap.bean.Admin;
import cap.dao.AdminDAO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AdminDAOTest {
    private ApplicationContext context;
    @Before
    public void init(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testFindAll() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        List<Admin> adminList = adminDAO.findAdmins();
        for (Admin admin : adminList) {
            System.out.println(admin.getUsername() + ":" + admin.getPassword());
        }
    }

    @Test
    public void testFindById() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        Admin admin = adminDAO.findById(11);
        System.out.println(admin.getId() + ":" + admin.getUsername() + ":" + admin.getPassword());
    }

    @Test
    public void testAddAdmin() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        Admin admin = new Admin("xxx", "xxx");
        int res = adminDAO.addAdmin(admin);
        assert res == 1;
    }

    @Test
    public void testDelAdmin() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        int res = adminDAO.delAdmin(12);
        assert res == 1;
    }

    @Test
    public void testUpdateAdmin() {
        AdminDAO adminDAO = (AdminDAO) context.getBean("adminDAO");
        Admin admin = new Admin(11, "xxx111", "xxx111");
        int res = adminDAO.updateAdmin(admin);
        assert res == 1;

    }
}