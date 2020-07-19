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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProvinceIspPlayInfoListRequest extends AbstractModel{

    /**
    * Start point in time (Beijing time).
Example: 2019-02-21 10:00:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End point in time (Beijing time).
Example: 2019-02-21 12:00:00.
Note: `EndTime` and `StartTime` only support querying data for the last day.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Supported granularities:
1: 1-minute granularity (the query interval should be within 1 day)
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * Statistical metric type:
"Bandwidth": bandwidth
"FluxPerSecond": average traffic
"Flux": traffic
"Request": number of requests
"Online": number of concurrent connections
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * Playback domain name list.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * List of the districts to be queried, such as Beijing.
    */
    @SerializedName("ProvinceNames")
    @Expose
    private String [] ProvinceNames;

    /**
    * List of the ISPs to be queried, such as China Mobile. If this parameter is left empty, the data of all ISPs will be queried.
    */
    @SerializedName("IspNames")
    @Expose
    private String [] IspNames;

    /**
    * Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get Start point in time (Beijing time).
Example: 2019-02-21 10:00:00. 
     * @return StartTime Start point in time (Beijing time).
Example: 2019-02-21 10:00:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start point in time (Beijing time).
Example: 2019-02-21 10:00:00.
     * @param StartTime Start point in time (Beijing time).
Example: 2019-02-21 10:00:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End point in time (Beijing time).
Example: 2019-02-21 12:00:00.
Note: `EndTime` and `StartTime` only support querying data for the last day. 
     * @return EndTime End point in time (Beijing time).
Example: 2019-02-21 12:00:00.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End point in time (Beijing time).
Example: 2019-02-21 12:00:00.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     * @param EndTime End point in time (Beijing time).
Example: 2019-02-21 12:00:00.
Note: `EndTime` and `StartTime` only support querying data for the last day.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Supported granularities:
1: 1-minute granularity (the query interval should be within 1 day) 
     * @return Granularity Supported granularities:
1: 1-minute granularity (the query interval should be within 1 day)
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Supported granularities:
1: 1-minute granularity (the query interval should be within 1 day)
     * @param Granularity Supported granularities:
1: 1-minute granularity (the query interval should be within 1 day)
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Statistical metric type:
"Bandwidth": bandwidth
"FluxPerSecond": average traffic
"Flux": traffic
"Request": number of requests
"Online": number of concurrent connections 
     * @return StatType Statistical metric type:
"Bandwidth": bandwidth
"FluxPerSecond": average traffic
"Flux": traffic
"Request": number of requests
"Online": number of concurrent connections
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set Statistical metric type:
"Bandwidth": bandwidth
"FluxPerSecond": average traffic
"Flux": traffic
"Request": number of requests
"Online": number of concurrent connections
     * @param StatType Statistical metric type:
"Bandwidth": bandwidth
"FluxPerSecond": average traffic
"Flux": traffic
"Request": number of requests
"Online": number of concurrent connections
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get Playback domain name list. 
     * @return PlayDomains Playback domain name list.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set Playback domain name list.
     * @param PlayDomains Playback domain name list.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get List of the districts to be queried, such as Beijing. 
     * @return ProvinceNames List of the districts to be queried, such as Beijing.
     */
    public String [] getProvinceNames() {
        return this.ProvinceNames;
    }

    /**
     * Set List of the districts to be queried, such as Beijing.
     * @param ProvinceNames List of the districts to be queried, such as Beijing.
     */
    public void setProvinceNames(String [] ProvinceNames) {
        this.ProvinceNames = ProvinceNames;
    }

    /**
     * Get List of the ISPs to be queried, such as China Mobile. If this parameter is left empty, the data of all ISPs will be queried. 
     * @return IspNames List of the ISPs to be queried, such as China Mobile. If this parameter is left empty, the data of all ISPs will be queried.
     */
    public String [] getIspNames() {
        return this.IspNames;
    }

    /**
     * Set List of the ISPs to be queried, such as China Mobile. If this parameter is left empty, the data of all ISPs will be queried.
     * @param IspNames List of the ISPs to be queried, such as China Mobile. If this parameter is left empty, the data of all ISPs will be queried.
     */
    public void setIspNames(String [] IspNames) {
        this.IspNames = IspNames;
    }

    /**
     * Get Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried. 
     * @return MainlandOrOversea Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
     * @param MainlandOrOversea Region. Valid values: Mainland (data for Mainland China), Oversea (data for regions outside Mainland China), China (data for China, including Hong Kong, Macao, and Taiwan), Foreign (data for regions outside China, excluding Hong Kong, Macao, and Taiwan), Global (default). If this parameter is left empty, data for all regions will be queried.
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamArraySimple(map, prefix + "ProvinceNames.", this.ProvinceNames);
        this.setParamArraySimple(map, prefix + "IspNames.", this.IspNames);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}

