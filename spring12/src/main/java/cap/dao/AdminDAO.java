package cap.dao;

import cap.bean.Admin;

import java.util.List;

public interface AdminDAO {
    List<Admin> findAdmins();
    Admin findByid(int id);
    int deleteAdmins(int id);
    int updateAdmins(Admin admin);
    int addAdmins(Admin admin);
}
