package com.ruoyi.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.ruoyi.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author ruoyi
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RuoYiAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiAuthApplication.class, args);
        System.out.println("//\n" +
                "//                       _oo0oo_\n" +
                "//                      o8888888o\n" +
                "//                      88\" . \"88\n" +
                "//                      (| -_- |)\n" +
                "//                      0\\  =  /0\n" +
                "//                    ___/`---'\\___\n" +
                "//                  .' \\\\|     |// '.\n" +
                "//                 / \\\\|||  :  |||// \\\n" +
                "//                / _||||| -:- |||||- \\\n" +
                "//               |   | \\\\\\  -  /// |   |\n" +
                "//               | \\_|  ''\\---/''  |_/ |\n" +
                "//               \\  .-\\__  '-'  ___/-. /\n" +
                "//             ___'. .'  /--.--\\  `. .'___\n" +
                "//          .\"\" '<  `.___\\_<|>_/___.' >' \"\".\n" +
                "//         | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |\n" +
                "//         \\  \\ `_.   \\_ __\\ /__ _/   .-` /  /\n" +
                "//     =====`-.____`.___ \\_____/___.-`___.-'=====\n" +
                "//                       `=---='\n" +
                "//\n" +
                "//\n" +
                "//     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "//                HHY 认证中心启动成功\n" +
                "//               佛祖保佑         永无BUG\n" +
                "//\n" +
                "//\n" +
                "//\n");
    }
}
