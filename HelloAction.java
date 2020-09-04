package hello;

import com.opensymphony.xwork2.Action;

import java.util.ArrayList;
import java.util.List;

public class HelloAction implements Action {
    private String userName;
    private String pwd;
    private List<String> nameList;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("666------------------------------------------------");
        nameList=new ArrayList<String>();
        nameList.add("大狗");
        nameList.add("二狗");
        nameList.add("三狗");
        nameList.add("四狗");
        if("admin".equals(userName)){
            if("123456".equals(pwd)){
                return SUCCESS;
            }else{
                return INPUT;
            }
        }
        return INPUT;
    }




}
