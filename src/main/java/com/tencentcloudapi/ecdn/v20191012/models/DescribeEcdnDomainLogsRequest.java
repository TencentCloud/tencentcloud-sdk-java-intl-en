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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEcdnDomainLogsRequest extends AbstractModel{

    /**
    * Domain name to be queried.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Log start time, such as 2019-10-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Log end time, such as 2019-10-02 00:00:00. Only logs for the last 30 days can be queried.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Pagination offset for log link list. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of log links per page. Default value: 100. Maximum value: 1000.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Domain name to be queried. 
     * @return Domain Domain name to be queried.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name to be queried.
     * @param Domain Domain name to be queried.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Log start time, such as 2019-10-01 00:00:00 
     * @return StartTime Log start time, such as 2019-10-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Log start time, such as 2019-10-01 00:00:00
     * @param StartTime Log start time, such as 2019-10-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Log end time, such as 2019-10-02 00:00:00. Only logs for the last 30 days can be queried. 
     * @return EndTime Log end time, such as 2019-10-02 00:00:00. Only logs for the last 30 days can be queried.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Log end time, such as 2019-10-02 00:00:00. Only logs for the last 30 days can be queried.
     * @param EndTime Log end time, such as 2019-10-02 00:00:00. Only logs for the last 30 days can be queried.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Pagination offset for log link list. Default value: 0. 
     * @return Offset Pagination offset for log link list. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset for log link list. Default value: 0.
     * @param Offset Pagination offset for log link list. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of log links per page. Default value: 100. Maximum value: 1000. 
     * @return Limit Number of log links per page. Default value: 100. Maximum value: 1000.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of log links per page. Default value: 100. Maximum value: 1000.
     * @param Limit Number of log links per page. Default value: 100. Maximum value: 1000.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeEcdnDomainLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEcdnDomainLogsRequest(DescribeEcdnDomainLogsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

