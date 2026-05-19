/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCDNStatDetailsRequest extends AbstractModel {

    /**
    * Query metric. Valid values:
<li>Traffic: Total Traffic in bytes.</li>
<li>Bandwidth: bandwidth, in Bps.</li>
<li>Requests: Request count.</li>
<li>QUICRequests: Number of QUIC requests.</li>
<li>IpVisit: Number of IP visits.</li>
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Start time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Domain name list. Up to 20 domain names can be queried for data. Default returns the overlaid usage data of all domains.
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * Service area. Valid values:
<li>Chinese Mainland: Chinese mainland.</li>
<li>Asia Pacific Region 1: Asia Pacific zone 1, including Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand.</li>
<li>Asia Pacific Region 2: Asia Pacific zone 2, including Taiwan, Japan, Malaysia, Indonesia, Korea.</li>
<li>Asia Pacific Region 3: Asia Pacific zone 3, including Philippines, India, Australia and other countries and regions in Asia Pacific.</li>
<li>Middle East: Middle East.</li>
<li>Europe: Europe.</li>
<li>North America: North America.</li>
<li>South America: South America.</li>
<li>Africa: Africa.</li>
Default is Chinese mainland.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * When the user's located region is Chinese Mainland, value is the following region information. When Area has other values, ignore the Districts parameter.
<li>Beijing: Beijing.</li>
<li>Inner Mongolia: Inner Mongolia.</li>
<li>Shanxi: Shanxi.</li>
<li>Hebei: Hebei.</li>
<li>Tianjin: Tianjin.</li>
<li>Ningxia: Ningxia.</li>
<li>Shaanxi: Shaanxi.</li>
<li>Gansu: Gansu.</li>
<li>Qinghai: Qinghai.</li>
<li>Xinjiang: Xinjiang.</li>
<li>Heilongjiang: Heilongjiang.</li>
<li>Jilin: Jilin.</li>
<li>Liaoning: Liaoning.</li>
<li>Fujian: Fujian.</li>
<li>Jiangsu: Jiangsu.</li>
<li>Anhui: Anhui.</li>
<li>Shandong: Shandong.</li>
<li>Shanghai: Shanghai.</li>
<li>Zhejiang: Zhejiang.</li>
<li>Henan: Henan.</li>
<li>Hubei: Hubei.</li>
<li>Jiangxi: Jiangxi.</li>
<li>Hunan: Hu’nan.</li>
<li>Guizhou: Guizhou.</li>
<li>Yunnan: Yunnan.</li>
<li>Chongqing: Chongqing.</li>
<li>Sichuan: Sichuan.</li>
<li>Xizang: Tibet.</li>
<li>Guangdong: Guangdong.</li>
<li>Guangxi: Guangxi.</li>
<li>Hainan: Hainan.</li>
<li>Hong Kong, Macao and Taiwan: Hong Kong (China), Macao (China) and Taiwan (China).</li>
<li>Outside Chinese Mainland: overseas.</li>
<li>Other: other.</li>
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
    * User's Operator Information. When Area is Chinese Mainland, value is the following carrier information. When Area is other values, ignore the Isps parameter.
<li>China Telecom: CTCC. </li>
<li>China Unicom: CUCC. </li>
<li>CERNET: China Education Network.</li>
<li>Great Wall Broadband Network: Great Wall Broadband.</li>
<li>China Mobile: CMCC.</li>
<li>China Mobile Tietong: China Tietong.</li>
<li>ISPs outside Chinese Mainland: Overseas carriers.</li>
<li>Other ISPs: Other ISPs.</li>
    */
    @SerializedName("Isps")
    @Expose
    private String [] Isps;

    /**
    * Time granularity of each data entry. Unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>1440: Day granularity. Returns the data of day granularity within the specified query time. The duration between start time and end time is more than 24 hours. Supports only day granularity data.</li>
When the duration between StartTime and EndTime is more than 24 hours, DataInterval defaults to 1440.
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
     * Get Query metric. Valid values:
<li>Traffic: Total Traffic in bytes.</li>
<li>Bandwidth: bandwidth, in Bps.</li>
<li>Requests: Request count.</li>
<li>QUICRequests: Number of QUIC requests.</li>
<li>IpVisit: Number of IP visits.</li> 
     * @return Metric Query metric. Valid values:
<li>Traffic: Total Traffic in bytes.</li>
<li>Bandwidth: bandwidth, in Bps.</li>
<li>Requests: Request count.</li>
<li>QUICRequests: Number of QUIC requests.</li>
<li>IpVisit: Number of IP visits.</li>
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Query metric. Valid values:
<li>Traffic: Total Traffic in bytes.</li>
<li>Bandwidth: bandwidth, in Bps.</li>
<li>Requests: Request count.</li>
<li>QUICRequests: Number of QUIC requests.</li>
<li>IpVisit: Number of IP visits.</li>
     * @param Metric Query metric. Valid values:
<li>Traffic: Total Traffic in bytes.</li>
<li>Bandwidth: bandwidth, in Bps.</li>
<li>Requests: Request count.</li>
<li>QUICRequests: Number of QUIC requests.</li>
<li>IpVisit: Number of IP visits.</li>
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Start time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return StartTime Start time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param StartTime Start time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return EndTime End time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param EndTime End time. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Domain name list. Up to 20 domain names can be queried for data. Default returns the overlaid usage data of all domains. 
     * @return DomainNames Domain name list. Up to 20 domain names can be queried for data. Default returns the overlaid usage data of all domains.
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set Domain name list. Up to 20 domain names can be queried for data. Default returns the overlaid usage data of all domains.
     * @param DomainNames Domain name list. Up to 20 domain names can be queried for data. Default returns the overlaid usage data of all domains.
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get Service area. Valid values:
<li>Chinese Mainland: Chinese mainland.</li>
<li>Asia Pacific Region 1: Asia Pacific zone 1, including Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand.</li>
<li>Asia Pacific Region 2: Asia Pacific zone 2, including Taiwan, Japan, Malaysia, Indonesia, Korea.</li>
<li>Asia Pacific Region 3: Asia Pacific zone 3, including Philippines, India, Australia and other countries and regions in Asia Pacific.</li>
<li>Middle East: Middle East.</li>
<li>Europe: Europe.</li>
<li>North America: North America.</li>
<li>South America: South America.</li>
<li>Africa: Africa.</li>
Default is Chinese mainland. 
     * @return Area Service area. Valid values:
<li>Chinese Mainland: Chinese mainland.</li>
<li>Asia Pacific Region 1: Asia Pacific zone 1, including Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand.</li>
<li>Asia Pacific Region 2: Asia Pacific zone 2, including Taiwan, Japan, Malaysia, Indonesia, Korea.</li>
<li>Asia Pacific Region 3: Asia Pacific zone 3, including Philippines, India, Australia and other countries and regions in Asia Pacific.</li>
<li>Middle East: Middle East.</li>
<li>Europe: Europe.</li>
<li>North America: North America.</li>
<li>South America: South America.</li>
<li>Africa: Africa.</li>
Default is Chinese mainland.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Service area. Valid values:
<li>Chinese Mainland: Chinese mainland.</li>
<li>Asia Pacific Region 1: Asia Pacific zone 1, including Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand.</li>
<li>Asia Pacific Region 2: Asia Pacific zone 2, including Taiwan, Japan, Malaysia, Indonesia, Korea.</li>
<li>Asia Pacific Region 3: Asia Pacific zone 3, including Philippines, India, Australia and other countries and regions in Asia Pacific.</li>
<li>Middle East: Middle East.</li>
<li>Europe: Europe.</li>
<li>North America: North America.</li>
<li>South America: South America.</li>
<li>Africa: Africa.</li>
Default is Chinese mainland.
     * @param Area Service area. Valid values:
<li>Chinese Mainland: Chinese mainland.</li>
<li>Asia Pacific Region 1: Asia Pacific zone 1, including Hong Kong (China), Macao (China), Singapore, Vietnam, and Thailand.</li>
<li>Asia Pacific Region 2: Asia Pacific zone 2, including Taiwan, Japan, Malaysia, Indonesia, Korea.</li>
<li>Asia Pacific Region 3: Asia Pacific zone 3, including Philippines, India, Australia and other countries and regions in Asia Pacific.</li>
<li>Middle East: Middle East.</li>
<li>Europe: Europe.</li>
<li>North America: North America.</li>
<li>South America: South America.</li>
<li>Africa: Africa.</li>
Default is Chinese mainland.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get When the user's located region is Chinese Mainland, value is the following region information. When Area has other values, ignore the Districts parameter.
<li>Beijing: Beijing.</li>
<li>Inner Mongolia: Inner Mongolia.</li>
<li>Shanxi: Shanxi.</li>
<li>Hebei: Hebei.</li>
<li>Tianjin: Tianjin.</li>
<li>Ningxia: Ningxia.</li>
<li>Shaanxi: Shaanxi.</li>
<li>Gansu: Gansu.</li>
<li>Qinghai: Qinghai.</li>
<li>Xinjiang: Xinjiang.</li>
<li>Heilongjiang: Heilongjiang.</li>
<li>Jilin: Jilin.</li>
<li>Liaoning: Liaoning.</li>
<li>Fujian: Fujian.</li>
<li>Jiangsu: Jiangsu.</li>
<li>Anhui: Anhui.</li>
<li>Shandong: Shandong.</li>
<li>Shanghai: Shanghai.</li>
<li>Zhejiang: Zhejiang.</li>
<li>Henan: Henan.</li>
<li>Hubei: Hubei.</li>
<li>Jiangxi: Jiangxi.</li>
<li>Hunan: Hu’nan.</li>
<li>Guizhou: Guizhou.</li>
<li>Yunnan: Yunnan.</li>
<li>Chongqing: Chongqing.</li>
<li>Sichuan: Sichuan.</li>
<li>Xizang: Tibet.</li>
<li>Guangdong: Guangdong.</li>
<li>Guangxi: Guangxi.</li>
<li>Hainan: Hainan.</li>
<li>Hong Kong, Macao and Taiwan: Hong Kong (China), Macao (China) and Taiwan (China).</li>
<li>Outside Chinese Mainland: overseas.</li>
<li>Other: other.</li> 
     * @return Districts When the user's located region is Chinese Mainland, value is the following region information. When Area has other values, ignore the Districts parameter.
<li>Beijing: Beijing.</li>
<li>Inner Mongolia: Inner Mongolia.</li>
<li>Shanxi: Shanxi.</li>
<li>Hebei: Hebei.</li>
<li>Tianjin: Tianjin.</li>
<li>Ningxia: Ningxia.</li>
<li>Shaanxi: Shaanxi.</li>
<li>Gansu: Gansu.</li>
<li>Qinghai: Qinghai.</li>
<li>Xinjiang: Xinjiang.</li>
<li>Heilongjiang: Heilongjiang.</li>
<li>Jilin: Jilin.</li>
<li>Liaoning: Liaoning.</li>
<li>Fujian: Fujian.</li>
<li>Jiangsu: Jiangsu.</li>
<li>Anhui: Anhui.</li>
<li>Shandong: Shandong.</li>
<li>Shanghai: Shanghai.</li>
<li>Zhejiang: Zhejiang.</li>
<li>Henan: Henan.</li>
<li>Hubei: Hubei.</li>
<li>Jiangxi: Jiangxi.</li>
<li>Hunan: Hu’nan.</li>
<li>Guizhou: Guizhou.</li>
<li>Yunnan: Yunnan.</li>
<li>Chongqing: Chongqing.</li>
<li>Sichuan: Sichuan.</li>
<li>Xizang: Tibet.</li>
<li>Guangdong: Guangdong.</li>
<li>Guangxi: Guangxi.</li>
<li>Hainan: Hainan.</li>
<li>Hong Kong, Macao and Taiwan: Hong Kong (China), Macao (China) and Taiwan (China).</li>
<li>Outside Chinese Mainland: overseas.</li>
<li>Other: other.</li>
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set When the user's located region is Chinese Mainland, value is the following region information. When Area has other values, ignore the Districts parameter.
<li>Beijing: Beijing.</li>
<li>Inner Mongolia: Inner Mongolia.</li>
<li>Shanxi: Shanxi.</li>
<li>Hebei: Hebei.</li>
<li>Tianjin: Tianjin.</li>
<li>Ningxia: Ningxia.</li>
<li>Shaanxi: Shaanxi.</li>
<li>Gansu: Gansu.</li>
<li>Qinghai: Qinghai.</li>
<li>Xinjiang: Xinjiang.</li>
<li>Heilongjiang: Heilongjiang.</li>
<li>Jilin: Jilin.</li>
<li>Liaoning: Liaoning.</li>
<li>Fujian: Fujian.</li>
<li>Jiangsu: Jiangsu.</li>
<li>Anhui: Anhui.</li>
<li>Shandong: Shandong.</li>
<li>Shanghai: Shanghai.</li>
<li>Zhejiang: Zhejiang.</li>
<li>Henan: Henan.</li>
<li>Hubei: Hubei.</li>
<li>Jiangxi: Jiangxi.</li>
<li>Hunan: Hu’nan.</li>
<li>Guizhou: Guizhou.</li>
<li>Yunnan: Yunnan.</li>
<li>Chongqing: Chongqing.</li>
<li>Sichuan: Sichuan.</li>
<li>Xizang: Tibet.</li>
<li>Guangdong: Guangdong.</li>
<li>Guangxi: Guangxi.</li>
<li>Hainan: Hainan.</li>
<li>Hong Kong, Macao and Taiwan: Hong Kong (China), Macao (China) and Taiwan (China).</li>
<li>Outside Chinese Mainland: overseas.</li>
<li>Other: other.</li>
     * @param Districts When the user's located region is Chinese Mainland, value is the following region information. When Area has other values, ignore the Districts parameter.
<li>Beijing: Beijing.</li>
<li>Inner Mongolia: Inner Mongolia.</li>
<li>Shanxi: Shanxi.</li>
<li>Hebei: Hebei.</li>
<li>Tianjin: Tianjin.</li>
<li>Ningxia: Ningxia.</li>
<li>Shaanxi: Shaanxi.</li>
<li>Gansu: Gansu.</li>
<li>Qinghai: Qinghai.</li>
<li>Xinjiang: Xinjiang.</li>
<li>Heilongjiang: Heilongjiang.</li>
<li>Jilin: Jilin.</li>
<li>Liaoning: Liaoning.</li>
<li>Fujian: Fujian.</li>
<li>Jiangsu: Jiangsu.</li>
<li>Anhui: Anhui.</li>
<li>Shandong: Shandong.</li>
<li>Shanghai: Shanghai.</li>
<li>Zhejiang: Zhejiang.</li>
<li>Henan: Henan.</li>
<li>Hubei: Hubei.</li>
<li>Jiangxi: Jiangxi.</li>
<li>Hunan: Hu’nan.</li>
<li>Guizhou: Guizhou.</li>
<li>Yunnan: Yunnan.</li>
<li>Chongqing: Chongqing.</li>
<li>Sichuan: Sichuan.</li>
<li>Xizang: Tibet.</li>
<li>Guangdong: Guangdong.</li>
<li>Guangxi: Guangxi.</li>
<li>Hainan: Hainan.</li>
<li>Hong Kong, Macao and Taiwan: Hong Kong (China), Macao (China) and Taiwan (China).</li>
<li>Outside Chinese Mainland: overseas.</li>
<li>Other: other.</li>
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get User's Operator Information. When Area is Chinese Mainland, value is the following carrier information. When Area is other values, ignore the Isps parameter.
<li>China Telecom: CTCC. </li>
<li>China Unicom: CUCC. </li>
<li>CERNET: China Education Network.</li>
<li>Great Wall Broadband Network: Great Wall Broadband.</li>
<li>China Mobile: CMCC.</li>
<li>China Mobile Tietong: China Tietong.</li>
<li>ISPs outside Chinese Mainland: Overseas carriers.</li>
<li>Other ISPs: Other ISPs.</li> 
     * @return Isps User's Operator Information. When Area is Chinese Mainland, value is the following carrier information. When Area is other values, ignore the Isps parameter.
<li>China Telecom: CTCC. </li>
<li>China Unicom: CUCC. </li>
<li>CERNET: China Education Network.</li>
<li>Great Wall Broadband Network: Great Wall Broadband.</li>
<li>China Mobile: CMCC.</li>
<li>China Mobile Tietong: China Tietong.</li>
<li>ISPs outside Chinese Mainland: Overseas carriers.</li>
<li>Other ISPs: Other ISPs.</li>
     */
    public String [] getIsps() {
        return this.Isps;
    }

    /**
     * Set User's Operator Information. When Area is Chinese Mainland, value is the following carrier information. When Area is other values, ignore the Isps parameter.
<li>China Telecom: CTCC. </li>
<li>China Unicom: CUCC. </li>
<li>CERNET: China Education Network.</li>
<li>Great Wall Broadband Network: Great Wall Broadband.</li>
<li>China Mobile: CMCC.</li>
<li>China Mobile Tietong: China Tietong.</li>
<li>ISPs outside Chinese Mainland: Overseas carriers.</li>
<li>Other ISPs: Other ISPs.</li>
     * @param Isps User's Operator Information. When Area is Chinese Mainland, value is the following carrier information. When Area is other values, ignore the Isps parameter.
<li>China Telecom: CTCC. </li>
<li>China Unicom: CUCC. </li>
<li>CERNET: China Education Network.</li>
<li>Great Wall Broadband Network: Great Wall Broadband.</li>
<li>China Mobile: CMCC.</li>
<li>China Mobile Tietong: China Tietong.</li>
<li>ISPs outside Chinese Mainland: Overseas carriers.</li>
<li>Other ISPs: Other ISPs.</li>
     */
    public void setIsps(String [] Isps) {
        this.Isps = Isps;
    }

    /**
     * Get Time granularity of each data entry. Unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>1440: Day granularity. Returns the data of day granularity within the specified query time. The duration between start time and end time is more than 24 hours. Supports only day granularity data.</li>
When the duration between StartTime and EndTime is more than 24 hours, DataInterval defaults to 1440. 
     * @return DataInterval Time granularity of each data entry. Unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>1440: Day granularity. Returns the data of day granularity within the specified query time. The duration between start time and end time is more than 24 hours. Supports only day granularity data.</li>
When the duration between StartTime and EndTime is more than 24 hours, DataInterval defaults to 1440.
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set Time granularity of each data entry. Unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>1440: Day granularity. Returns the data of day granularity within the specified query time. The duration between start time and end time is more than 24 hours. Supports only day granularity data.</li>
When the duration between StartTime and EndTime is more than 24 hours, DataInterval defaults to 1440.
     * @param DataInterval Time granularity of each data entry. Unit: minute. Valid values:
<li>5: 5 minutes, return detailed data at a minute granularity for the specified query time.</li>
<li>1440: Day granularity. Returns the data of day granularity within the specified query time. The duration between start time and end time is more than 24 hours. Supports only day granularity data.</li>
When the duration between StartTime and EndTime is more than 24 hours, DataInterval defaults to 1440.
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
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
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArraySimple(map, prefix + "Districts.", this.Districts);
        this.setParamArraySimple(map, prefix + "Isps.", this.Isps);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);

    }
}

