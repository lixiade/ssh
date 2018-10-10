package cap.dao;

import cap.bean.Admin;

import java.util.List;

public interface AdminDAO {
    List<Admin> findAdmin();
    Admin findByid(int id);
    int deleteAdmin(int id);
    int addAdmin(Admin admin);
    int updateAdmin(Admin admin);
}
