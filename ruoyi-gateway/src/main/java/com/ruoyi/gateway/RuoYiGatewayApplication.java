package com.ruoyi.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RuoYiGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiGatewayApplication.class, args);
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
                "//                HHY网关启动成功\n" +
                "//               佛祖保佑         永无BUG\n" +
                "//\n" +
                "//\n" +
                "//\n");
    }
}

