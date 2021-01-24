package cn.pg.service;

/**
 * @author ：zhangfei
 * @date ：Created in 2021/1/24 9:40 上午
 */
public interface WeatherService {

    /**
     * 获取城市天气情况
     * @param city 城市
     * @return 天气情况
     */
     String getWeatherByCity(String city);
}
