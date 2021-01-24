package cn.pg.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author ：zhangfei
 * @date ：Created in 2021/1/24 9:40 上午
 */

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {

    private ThreadPoolExecutor executor= new ThreadPoolExecutor(4,8,1, TimeUnit.MINUTES,new ArrayBlockingQueue<>(50));
    /**
     * 获取城市天气情况
     *
     * @param city 城市
     * @return 天气情况
     */
    @Override
    public String getWeatherByCity(String city) {

        executor.execute(this::ss);
        return city+": 天气晴朗";
    }

    public void ss(){
        for (int i = 0; i < 1000; i++) {
            if(i%3==0){
                log.info("12345");
            }else if(i%3==1){
                log.debug("==========debug==========");
            }
            else {
                log.error("54321");
            }

        }

    }
}
