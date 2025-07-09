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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulingDomainListResponse extends AbstractModel {

    /**
    * Total number of scheduling domain names
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List of scheduling domain names
    */
    @SerializedName("DomainList")
    @Expose
    private SchedulingDomain [] DomainList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of scheduling domain names 
     * @return Total Total number of scheduling domain names
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of scheduling domain names
     * @param Total Total number of scheduling domain names
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get List of scheduling domain names 
     * @return DomainList List of scheduling domain names
     */
    public SchedulingDomain [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set List of scheduling domain names
     * @param DomainList List of scheduling domain names
     */
    public void setDomainList(SchedulingDomain [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSchedulingDomainListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulingDomainListResponse(DescribeSchedulingDomainListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.DomainList != null) {
            this.DomainList = new SchedulingDomain[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new SchedulingDomain(source.DomainList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

