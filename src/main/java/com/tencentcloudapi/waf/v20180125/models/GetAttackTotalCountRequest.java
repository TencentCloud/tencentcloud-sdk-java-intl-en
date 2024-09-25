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

public class GetAttackTotalCountRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Domain names queried. Fill in all for all domain names.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Query criteria, "" by default
    */
    @SerializedName("QueryString")
    @Expose
    private String QueryString;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Domain names queried. Fill in all for all domain names. 
     * @return Domain Domain names queried. Fill in all for all domain names.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain names queried. Fill in all for all domain names.
     * @param Domain Domain names queried. Fill in all for all domain names.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Query criteria, "" by default 
     * @return QueryString Query criteria, "" by default
     */
    public String getQueryString() {
        return this.QueryString;
    }

    /**
     * Set Query criteria, "" by default
     * @param QueryString Query criteria, "" by default
     */
    public void setQueryString(String QueryString) {
        this.QueryString = QueryString;
    }

    public GetAttackTotalCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAttackTotalCountRequest(GetAttackTotalCountRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.QueryString != null) {
            this.QueryString = new String(source.QueryString);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "QueryString", this.QueryString);

    }
}

