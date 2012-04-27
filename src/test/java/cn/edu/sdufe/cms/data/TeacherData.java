package cn.edu.sdufe.cms.data;

import cn.edu.sdufe.cms.common.entity.agency.Teacher;

/**
 * 老师信息测试数据
 * User: pengfei.dongpf(pengfei.dong@gmail.com)
 * Date: 12-4-26
 * Time: 下午2:12
 */
public class TeacherData {

    public static Teacher getTeacher() {
        Teacher teacher = new Teacher();
        teacher.setTeacherName("teacherName");
        teacher.setArticleId(1L);
        teacher.setAgencyId(1L);
        teacher.setImageUrl("teacherName.jpg");
        teacher.setDescription("dddd");
        return teacher;
    }

}
