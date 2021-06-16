/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNStatDetailsRequest extends AbstractModel{

    /**
    * Metrics to query. Valid values:
<li>`Traffic`: traffic in bytes</li>
<li>`Bandwidth`: bandwidth in bps</li>
<li>`Requests`: the number of requests</li>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * List of domain names. The usage data of up to 20 domain names can be queried at a time. The usage data of all domain names is returned by default.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * Service region. Valid values:
<li>Chinese Mainland</li>
<li>Asia Pacific Region 1: Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand</li>
<li>Asia Pacific Region 2: Taiwan (China), Japan, Malaysia, Indonesia, and South Korea</li>
<li>Asia Pacific Region 3: Philippines, India, Australia, and other Asia Pacific countries and regions</li>
<li>Middle East</li>
<li>Europe</li>
<li>North America</li>
<li>South America</li>
<li>Africa</li>
Default value: Chinese Mainland
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * District where users are located. When `Area` is `Chinese Mainland`, valid values for `Districts` are as follows. Otherwise, `Districts` can be ignored.
<li>Beijing</li>
<li>Inner Mongolia</li>
<li>Shanxi</li>
<li>Hebei</li>
<li>Tianjin</li>
<li>Ningxia</li>
<li>Shaanxi</li>
<li>Gansu</li>
<li>Qinghai</li>
<li>Xinjiang</li>
<li>Heilongjiang</li>
<li>Jilin</li>
<li>Liaoning</li>
<li>Fujian</li>
<li>Jiangsu</li>
<li>Anhui</li>
<li>Shandong</li>
<li>Shanghai</li>
<li>Zhejiang</li>
<li>Henan</li>
<li>Hubei</li>
<li>Jiangxi</li>
<li>Hunan</li>
<li>Guizhou</li>
<li>Yunnan</li>
<li>Chongqing</li>
<li>Sichuan</li>
<li>Tibet</li>
<li>Guangdong</li>
<li>Guangxi</li>
<li>Hainan</li>
<li>Hong Kong, Macao and Taiwan</li>
<li>Outside Chinese Mainland</li>
<li>Other</li>
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
    * ISP of users. When `Area` is `Chinese Mainland`, valid values for `Isps` are as follows. Otherwise, `Isps` can be ignored.
<li>China Telecom</li>
<li>China Unicom</li>
<li>CERNET</li>
<li>Great Wall Broadband Network</li>
<li>China Mobile</li>
<li>China Mobile Tietong</li>
<li>ISPs outside Chinese Mainland</li>
<li>Other ISPs</li>
    */
    @SerializedName("Isps")
    @Expose
    private String [] Isps;

    /**
    * Time granularity of every piece of data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned. If the query period is larger than 24 hours, only data at 1-day granularity can be queried.</li>
If the difference between `StartTime` and `EndTime` is larger than 24 hours, the default value of `DataInterval` is 1440.
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get Metrics to query. Valid values:
<li>`Traffic`: traffic in bytes</li>
<li>`Bandwidth`: bandwidth in bps</li>
<li>`Requests`: the number of requests</li> 
     * @return Metric Metrics to query. Valid values:
<li>`Traffic`: traffic in bytes</li>
<li>`Bandwidth`: bandwidth in bps</li>
<li>`Requests`: the number of requests</li>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Metrics to query. Valid values:
<li>`Traffic`: traffic in bytes</li>
<li>`Bandwidth`: bandwidth in bps</li>
<li>`Requests`: the number of requests</li>
     * @param Metric Metrics to query. Valid values:
<li>`Traffic`: traffic in bytes</li>
<li>`Bandwidth`: bandwidth in bps</li>
<li>`Requests`: the number of requests</li>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). 
     * @return StartTime Start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     * @param StartTime Start time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). 
     * @return EndTime End time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     * @param EndTime End time in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get List of domain names. The usage data of up to 20 domain names can be queried at a time. The usage data of all domain names is returned by default. 
     * @return DomainNames List of domain names. The usage data of up to 20 domain names can be queried at a time. The usage data of all domain names is returned by default.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set List of domain names. The usage data of up to 20 domain names can be queried at a time. The usage data of all domain names is returned by default.
     * @param DomainNames List of domain names. The usage data of up to 20 domain names can be queried at a time. The usage data of all domain names is returned by default.
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get Service region. Valid values:
<li>Chinese Mainland</li>
<li>Asia Pacific Region 1: Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand</li>
<li>Asia Pacific Region 2: Taiwan (China), Japan, Malaysia, Indonesia, and South Korea</li>
<li>Asia Pacific Region 3: Philippines, India, Australia, and other Asia Pacific countries and regions</li>
<li>Middle East</li>
<li>Europe</li>
<li>North America</li>
<li>South America</li>
<li>Africa</li>
Default value: Chinese Mainland 
     * @return Area Service region. Valid values:
<li>Chinese Mainland</li>
<li>Asia Pacific Region 1: Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand</li>
<li>Asia Pacific Region 2: Taiwan (China), Japan, Malaysia, Indonesia, and South Korea</li>
<li>Asia Pacific Region 3: Philippines, India, Australia, and other Asia Pacific countries and regions</li>
<li>Middle East</li>
<li>Europe</li>
<li>North America</li>
<li>South America</li>
<li>Africa</li>
Default value: Chinese Mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Service region. Valid values:
<li>Chinese Mainland</li>
<li>Asia Pacific Region 1: Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand</li>
<li>Asia Pacific Region 2: Taiwan (China), Japan, Malaysia, Indonesia, and South Korea</li>
<li>Asia Pacific Region 3: Philippines, India, Australia, and other Asia Pacific countries and regions</li>
<li>Middle East</li>
<li>Europe</li>
<li>North America</li>
<li>South America</li>
<li>Africa</li>
Default value: Chinese Mainland
     * @param Area Service region. Valid values:
<li>Chinese Mainland</li>
<li>Asia Pacific Region 1: Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand</li>
<li>Asia Pacific Region 2: Taiwan (China), Japan, Malaysia, Indonesia, and South Korea</li>
<li>Asia Pacific Region 3: Philippines, India, Australia, and other Asia Pacific countries and regions</li>
<li>Middle East</li>
<li>Europe</li>
<li>North America</li>
<li>South America</li>
<li>Africa</li>
Default value: Chinese Mainland
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get District where users are located. When `Area` is `Chinese Mainland`, valid values for `Districts` are as follows. Otherwise, `Districts` can be ignored.
<li>Beijing</li>
<li>Inner Mongolia</li>
<li>Shanxi</li>
<li>Hebei</li>
<li>Tianjin</li>
<li>Ningxia</li>
<li>Shaanxi</li>
<li>Gansu</li>
<li>Qinghai</li>
<li>Xinjiang</li>
<li>Heilongjiang</li>
<li>Jilin</li>
<li>Liaoning</li>
<li>Fujian</li>
<li>Jiangsu</li>
<li>Anhui</li>
<li>Shandong</li>
<li>Shanghai</li>
<li>Zhejiang</li>
<li>Henan</li>
<li>Hubei</li>
<li>Jiangxi</li>
<li>Hunan</li>
<li>Guizhou</li>
<li>Yunnan</li>
<li>Chongqing</li>
<li>Sichuan</li>
<li>Tibet</li>
<li>Guangdong</li>
<li>Guangxi</li>
<li>Hainan</li>
<li>Hong Kong, Macao and Taiwan</li>
<li>Outside Chinese Mainland</li>
<li>Other</li> 
     * @return Districts District where users are located. When `Area` is `Chinese Mainland`, valid values for `Districts` are as follows. Otherwise, `Districts` can be ignored.
<li>Beijing</li>
<li>Inner Mongolia</li>
<li>Shanxi</li>
<li>Hebei</li>
<li>Tianjin</li>
<li>Ningxia</li>
<li>Shaanxi</li>
<li>Gansu</li>
<li>Qinghai</li>
<li>Xinjiang</li>
<li>Heilongjiang</li>
<li>Jilin</li>
<li>Liaoning</li>
<li>Fujian</li>
<li>Jiangsu</li>
<li>Anhui</li>
<li>Shandong</li>
<li>Shanghai</li>
<li>Zhejiang</li>
<li>Henan</li>
<li>Hubei</li>
<li>Jiangxi</li>
<li>Hunan</li>
<li>Guizhou</li>
<li>Yunnan</li>
<li>Chongqing</li>
<li>Sichuan</li>
<li>Tibet</li>
<li>Guangdong</li>
<li>Guangxi</li>
<li>Hainan</li>
<li>Hong Kong, Macao and Taiwan</li>
<li>Outside Chinese Mainland</li>
<li>Other</li>
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set District where users are located. When `Area` is `Chinese Mainland`, valid values for `Districts` are as follows. Otherwise, `Districts` can be ignored.
<li>Beijing</li>
<li>Inner Mongolia</li>
<li>Shanxi</li>
<li>Hebei</li>
<li>Tianjin</li>
<li>Ningxia</li>
<li>Shaanxi</li>
<li>Gansu</li>
<li>Qinghai</li>
<li>Xinjiang</li>
<li>Heilongjiang</li>
<li>Jilin</li>
<li>Liaoning</li>
<li>Fujian</li>
<li>Jiangsu</li>
<li>Anhui</li>
<li>Shandong</li>
<li>Shanghai</li>
<li>Zhejiang</li>
<li>Henan</li>
<li>Hubei</li>
<li>Jiangxi</li>
<li>Hunan</li>
<li>Guizhou</li>
<li>Yunnan</li>
<li>Chongqing</li>
<li>Sichuan</li>
<li>Tibet</li>
<li>Guangdong</li>
<li>Guangxi</li>
<li>Hainan</li>
<li>Hong Kong, Macao and Taiwan</li>
<li>Outside Chinese Mainland</li>
<li>Other</li>
     * @param Districts District where users are located. When `Area` is `Chinese Mainland`, valid values for `Districts` are as follows. Otherwise, `Districts` can be ignored.
<li>Beijing</li>
<li>Inner Mongolia</li>
<li>Shanxi</li>
<li>Hebei</li>
<li>Tianjin</li>
<li>Ningxia</li>
<li>Shaanxi</li>
<li>Gansu</li>
<li>Qinghai</li>
<li>Xinjiang</li>
<li>Heilongjiang</li>
<li>Jilin</li>
<li>Liaoning</li>
<li>Fujian</li>
<li>Jiangsu</li>
<li>Anhui</li>
<li>Shandong</li>
<li>Shanghai</li>
<li>Zhejiang</li>
<li>Henan</li>
<li>Hubei</li>
<li>Jiangxi</li>
<li>Hunan</li>
<li>Guizhou</li>
<li>Yunnan</li>
<li>Chongqing</li>
<li>Sichuan</li>
<li>Tibet</li>
<li>Guangdong</li>
<li>Guangxi</li>
<li>Hainan</li>
<li>Hong Kong, Macao and Taiwan</li>
<li>Outside Chinese Mainland</li>
<li>Other</li>
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get ISP of users. When `Area` is `Chinese Mainland`, valid values for `Isps` are as follows. Otherwise, `Isps` can be ignored.
<li>China Telecom</li>
<li>China Unicom</li>
<li>CERNET</li>
<li>Great Wall Broadband Network</li>
<li>China Mobile</li>
<li>China Mobile Tietong</li>
<li>ISPs outside Chinese Mainland</li>
<li>Other ISPs</li> 
     * @return Isps ISP of users. When `Area` is `Chinese Mainland`, valid values for `Isps` are as follows. Otherwise, `Isps` can be ignored.
<li>China Telecom</li>
<li>China Unicom</li>
<li>CERNET</li>
<li>Great Wall Broadband Network</li>
<li>China Mobile</li>
<li>China Mobile Tietong</li>
<li>ISPs outside Chinese Mainland</li>
<li>Other ISPs</li>
     */
    public String [] getIsps() {
        return this.Isps;
    }

    /**
     * Set ISP of users. When `Area` is `Chinese Mainland`, valid values for `Isps` are as follows. Otherwise, `Isps` can be ignored.
<li>China Telecom</li>
<li>China Unicom</li>
<li>CERNET</li>
<li>Great Wall Broadband Network</li>
<li>China Mobile</li>
<li>China Mobile Tietong</li>
<li>ISPs outside Chinese Mainland</li>
<li>Other ISPs</li>
     * @param Isps ISP of users. When `Area` is `Chinese Mainland`, valid values for `Isps` are as follows. Otherwise, `Isps` can be ignored.
<li>China Telecom</li>
<li>China Unicom</li>
<li>CERNET</li>
<li>Great Wall Broadband Network</li>
<li>China Mobile</li>
<li>China Mobile Tietong</li>
<li>ISPs outside Chinese Mainland</li>
<li>Other ISPs</li>
     */
    public void setIsps(String [] Isps) {
        this.Isps = Isps;
    }

    /**
     * Get Time granularity of every piece of data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned. If the query period is larger than 24 hours, only data at 1-day granularity can be queried.</li>
If the difference between `StartTime` and `EndTime` is larger than 24 hours, the default value of `DataInterval` is 1440. 
     * @return DataInterval Time granularity of every piece of data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned. If the query period is larger than 24 hours, only data at 1-day granularity can be queried.</li>
If the difference between `StartTime` and `EndTime` is larger than 24 hours, the default value of `DataInterval` is 1440.
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set Time granularity of every piece of data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned. If the query period is larger than 24 hours, only data at 1-day granularity can be queried.</li>
If the difference between `StartTime` and `EndTime` is larger than 24 hours, the default value of `DataInterval` is 1440.
     * @param DataInterval Time granularity of every piece of data in minutes. Valid values:
<li>5: 5-minute granularity. The data at 5-minute granularity in the query period will be returned.</li>
<li>1440: 1-day granularity. The data at 1-day granularity in the query period will be returned. If the query period is larger than 24 hours, only data at 1-day granularity can be queried.</li>
If the difference between `StartTime` and `EndTime` is larger than 24 hours, the default value of `DataInterval` is 1440.
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty. 
     * @return SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     * @param SubAppId VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) ID. If you need to access a resource in a subapplication, enter the subapplication ID in this field; otherwise, leave it empty.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeCDNStatDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDNStatDetailsRequest(DescribeCDNStatDetailsRequest source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Districts != null) {
            this.Districts = new String[source.Districts.length];
            for (int i = 0; i < source.Districts.length; i++) {
                this.Districts[i] = new String(source.Districts[i]);
            }
        }
        if (source.Isps != null) {
            this.Isps = new String[source.Isps.length];
            for (int i = 0; i < source.Isps.length; i++) {
                this.Isps[i] = new String(source.Isps[i]);
            }
        }
        if (source.DataInterval != null) {
            this.DataInterval = new Long(source.DataInterval);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "Districts.", this.Districts);
        this.setParamArraySimple(map, prefix + "Isps.", this.Isps);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

