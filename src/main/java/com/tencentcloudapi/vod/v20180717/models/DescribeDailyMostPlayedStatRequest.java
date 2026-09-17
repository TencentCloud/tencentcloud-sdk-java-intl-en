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

public class DescribeDailyMostPlayedStatRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get  
     * @return Date 
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 
     * @param Date 
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get  
     * @return DomainName 
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 
     * @param DomainName 
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

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

    public DescribeDailyMostPlayedStatRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDailyMostPlayedStatRequest(DescribeDailyMostPlayedStatRequest source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

