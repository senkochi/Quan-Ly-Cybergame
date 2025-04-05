
package com.senko.cybergamemanagementsystem.model.dao;

import com.senko.cybergamemanagementsystem.model.DatabaseConnection;
import com.senko.cybergamemanagementsystem.model.entities.NhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;


public class NhanVienDAO {
    public ArrayList<NhanVien> getAllNhanVien(){
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        String query = "SELECT * FROM NHANVIEN JOIN VITRI ON NHANVIEN.MaViTri = VITRI.MaViTri";
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                
                NhanVien current = new NhanVien(
                    rs.getString("MaNhanVien"),
                    rs.getString("HoVaTen"),
                    rs.getString("Username"),
                    rs.getString("Password"),
                    rs.getString("Email"),
                    rs.getBoolean("TrangThaiNV"),
                    rs.getString("tenViTri"),
                    LocalDate.parse(rs.getString("NgayVaoLam"))
                );
            
                dsNhanVien.add(current);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }
    
    public void insertNhanVien(int maViTri, String hoVaten, String username, String password, String email, int trangThai, Date ngayVaoLam){
        String query = "INSERT NHANVIEN(MaViTri, HoVaTen, Username, Password, Email, TrangThaiNV, NgayVaoLam)"
                + "VALUES(?,?,?,?,?,?,?)";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1,maViTri);
            stmt.setString(2,hoVaten);
            stmt.setString(3,username);
            stmt.setString(4,password);
            stmt.setString(5,email);
            stmt.setInt(6,trangThai);
            stmt.setDate(7,new java.sql.Date(ngayVaoLam.getTime()));
            
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void deleteNhanVien(int maNhanVien){
        String query = "DELETE FROM NHANVIEN WHERE MaNhanVien = ?";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1,maNhanVien);
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void updateNhanVien(int maNhanVien, int maViTri, String hoVaTen, String username, String password, String email){
        String query = "UPDATE NHANVIEN SET MaViTri = ?, HoVaTen = ?, Username = ?, Password = ?, Email = ?"
                         + "WHERE MaNhanVien = ?";
        try(Connection con = DatabaseConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1,maViTri);
            stmt.setString(2,hoVaTen);
            stmt.setString(3, username);
            stmt.setString(4, password);
            stmt.setString(5, email);
            stmt.setInt(6, maNhanVien);
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
