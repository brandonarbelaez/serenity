package starter.ui.sophos;

import org.openqa.selenium.By;

public class Constants{
    String n;
    public static By DIV = By.xpath("/html/body");
    public static By TRABAJE_CON_NOSOTROS = By.xpath("/html/body/div[1]/div/header/div/div/header[1]/div/div/div/div/div/section/div/div/div[2]/div/div/div/div/div/ul/li[5]/a");
    public static By ELEMENTS= By.xpath("/html/body/div[1]/div/main/div/div/div/article/div/div/div/div/section[2]/div/div/div/div/div/div[2]/div/div[1]/div[2]");
    public static By DIV_JOBS(Integer i){
       By DIV2= By.xpath("//*[@id=\"main\"]/div/div/section/div/div/div/div/div/div[4]/div/div/article["+i+"]/div/div[1]");
       //System.out.println("Constantes"+ DIV2);
       return DIV2;
    }
    public static By JOBS_JAVA= By.xpath("//*[@id=\"s\"]");

}
