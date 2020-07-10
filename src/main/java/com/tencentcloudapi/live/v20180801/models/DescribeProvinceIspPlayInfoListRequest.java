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
    * Start time point (Beijing time).
Example: 2019-02-21 10:00:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time point (Beijing time).
Example: 2019-02-21 12:00:00.
Note: EndTime and StartTime only support querying data on the past day.
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
"Bandwidth": Bandwidth
"FluxPerSecond": Average traffic
"Flux": Traffic
"Request": Number of requests
"Online": Number of concurrent connections
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * List of playback domain names.
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * An optional parameter, which is the list of the districts to be queried, such as Beijing
    */
    @SerializedName("ProvinceNames")
    @Expose
    private String [] ProvinceNames;

    /**
    * An optional parameter, which is the list of the ISPs to be queried, such as China Mobile. If it is blank, the data of all ISPs will be queried.
    */
    @SerializedName("IspNames")
    @Expose
    private String [] IspNames;

    /**
    * 
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get Start time point (Beijing time).
Example: 2019-02-21 10:00:00. 
     * @return StartTime Start time point (Beijing time).
Example: 2019-02-21 10:00:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time point (Beijing time).
Example: 2019-02-21 10:00:00.
     * @param StartTime Start time point (Beijing time).
Example: 2019-02-21 10:00:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time point (Beijing time).
Example: 2019-02-21 12:00:00.
Note: EndTime and StartTime only support querying data on the past day. 
     * @return EndTime End time point (Beijing time).
Example: 2019-02-21 12:00:00.
Note: EndTime and StartTime only support querying data on the past day.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time point (Beijing time).
Example: 2019-02-21 12:00:00.
Note: EndTime and StartTime only support querying data on the past day.
     * @param EndTime End time point (Beijing time).
Example: 2019-02-21 12:00:00.
Note: EndTime and StartTime only support querying data on the past day.
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
"Bandwidth": Bandwidth
"FluxPerSecond": Average traffic
"Flux": Traffic
"Request": Number of requests
"Online": Number of concurrent connections 
     * @return StatType Statistical metric type:
"Bandwidth": Bandwidth
"FluxPerSecond": Average traffic
"Flux": Traffic
"Request": Number of requests
"Online": Number of concurrent connections
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set Statistical metric type:
"Bandwidth": Bandwidth
"FluxPerSecond": Average traffic
"Flux": Traffic
"Request": Number of requests
"Online": Number of concurrent connections
     * @param StatType Statistical metric type:
"Bandwidth": Bandwidth
"FluxPerSecond": Average traffic
"Flux": Traffic
"Request": Number of requests
"Online": Number of concurrent connections
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get List of playback domain names. 
     * @return PlayDomains List of playback domain names.
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set List of playback domain names.
     * @param PlayDomains List of playback domain names.
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get An optional parameter, which is the list of the districts to be queried, such as Beijing 
     * @return ProvinceNames An optional parameter, which is the list of the districts to be queried, such as Beijing
     */
    public String [] getProvinceNames() {
        return this.ProvinceNames;
    }

    /**
     * Set An optional parameter, which is the list of the districts to be queried, such as Beijing
     * @param ProvinceNames An optional parameter, which is the list of the districts to be queried, such as Beijing
     */
    public void setProvinceNames(String [] ProvinceNames) {
        this.ProvinceNames = ProvinceNames;
    }

    /**
     * Get An optional parameter, which is the list of the ISPs to be queried, such as China Mobile. If it is blank, the data of all ISPs will be queried. 
     * @return IspNames An optional parameter, which is the list of the ISPs to be queried, such as China Mobile. If it is blank, the data of all ISPs will be queried.
     */
    public String [] getIspNames() {
        return this.IspNames;
    }

    /**
     * Set An optional parameter, which is the list of the ISPs to be queried, such as China Mobile. If it is blank, the data of all ISPs will be queried.
     * @param IspNames An optional parameter, which is the list of the ISPs to be queried, such as China Mobile. If it is blank, the data of all ISPs will be queried.
     */
    public void setIspNames(String [] IspNames) {
        this.IspNames = IspNames;
    }

    /**
     * Get  
     * @return MainlandOrOversea 
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 
     * @param MainlandOrOversea 
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

