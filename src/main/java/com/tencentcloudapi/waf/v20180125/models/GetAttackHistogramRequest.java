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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAttackHistogramRequest extends AbstractModel {

    /**
    * Queried domain: use all for all domains
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Query start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Query end time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Lucene syntax.
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
     * Get Queried domain: use all for all domains 
     * @return Domain Queried domain: use all for all domains
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Queried domain: use all for all domains
     * @param Domain Queried domain: use all for all domains
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Query start time 
     * @return StartTime Query start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time
     * @param StartTime Query start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Query end time 
     * @return EndTime Query end time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Query end time
     * @param EndTime Query end time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Lucene syntax. 
     * @return QueryString Lucene syntax.
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Lucene syntax.
     * @param QueryString Lucene syntax.
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    public GetAttackHistogramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAttackHistogramRequest(GetAttackHistogramRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);

    }
}

