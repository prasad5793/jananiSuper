package lk.janani_super.asset.employee.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.janani_super.asset.common_asset.model.FileInfo;
import lk.janani_super.asset.common_asset.model.enums.CivilStatus;
import lk.janani_super.asset.common_asset.model.enums.Gender;
import lk.janani_super.asset.common_asset.model.enums.LiveDead;
import lk.janani_super.asset.common_asset.model.enums.Title;
import lk.janani_super.asset.employee.entity.enums.Designation;
import lk.janani_super.asset.employee.entity.enums.EmployeeStatus;
import lk.janani_super.util.audit.AuditEntity;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonFilter( "Employee" )
public class Employee extends AuditEntity {

    @Column(unique = true)
    private String code;

    @Size( min = 5, message = "Your name cannot be accepted" )
    private String name;

    @Size( min = 5, message = "At least 5 characters should be included calling name" )
    private String callingName;

    @Size( max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 " )
    @Column( unique = true )
    private String nic;

    @Size( max = 10, message = "Mobile number length should be contained 10 and 9" )
    private String mobileOne;

    @Size( max = 10, message = "Mobile number length should be contained 10 and 9" )
    private String mobileTwo;

    @Size( max = 10, message = "Phone number length should be contained 10 and 9" )
    private String land;

    @Column( unique = true )
    private String officeEmail;

    @Column( columnDefinition = "VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NULL", length = 255 )
    private String address;

    @Enumerated( EnumType.STRING )
    private Title title;

    @Enumerated( EnumType.STRING )
    private Gender gender;

    @Enumerated( EnumType.STRING )
    private Designation designation;

    @Enumerated( EnumType.STRING )
    private CivilStatus civilStatus;

    @Enumerated( EnumType.STRING )
    private EmployeeStatus employeeStatus;

    @Enumerated(EnumType.STRING)
    private LiveDead liveDead;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate dateOfBirth;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private LocalDate dateOfAssignment;


    @Transient
    private MultipartFile file;

    @Transient
    private FileInfo fileInfo;

}
