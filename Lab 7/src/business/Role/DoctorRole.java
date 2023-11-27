/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.Role;

import business.Business;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import ui.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author vaibhaveegamit
 */
public class DoctorRole extends Role{
    public DoctorRole() {
         this.type = RoleType.Doctor;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Business business) {
        this.type = RoleType.Doctor;
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization) organization, business);
    }
}
