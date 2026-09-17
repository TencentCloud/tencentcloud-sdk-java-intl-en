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
    * 
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
    * 
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 
    */
    @SerializedName("Districts")
    @Expose
    private String [] Districts;

    /**
    * 
    */
    @SerializedName("Isps")
    @Expose
    private String [] Isps;

    /**
    * 
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
     * Get  
     * @return Metric 
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 
     * @param Metric 
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return DomainNames 
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 
     * @param DomainNames 
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    /**
     * Get  
     * @return Area 
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 
     * @param Area 
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get  
     * @return Districts 
     */
    public String [] getDistricts() {
        return this.Districts;
    }

    /**
     * Set 
     * @param Districts 
     */
    public void setDistricts(String [] Districts) {
        this.Districts = Districts;
    }

    /**
     * Get  
     * @return Isps 
     */
    public String [] getIsps() {
        return this.Isps;
    }

    /**
     * Set 
     * @param Isps 
     */
    public void setIsps(String [] Isps) {
        this.Isps = Isps;
    }

    /**
     * Get  
     * @return DataInterval 
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set 
     * @param DataInterval 
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

