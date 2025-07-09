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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubdomainAnalyticsResponse extends AbstractModel {

    /**
    * DNS query volume in the current statistical dimension
    */
    @SerializedName("Data")
    @Expose
    private DomainAnalyticsDetail [] Data;

    /**
    * Statistics on the DNS query volume of a subdomain
    */
    @SerializedName("Info")
    @Expose
    private SubdomainAnalyticsInfo Info;

    /**
    * DNS query volume of the subdomain alias
    */
    @SerializedName("AliasData")
    @Expose
    private SubdomainAliasAnalyticsItem [] AliasData;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DNS query volume in the current statistical dimension 
     * @return Data DNS query volume in the current statistical dimension
     */
    public DomainAnalyticsDetail [] getData() {
        return this.Data;
    }

    /**
     * Set DNS query volume in the current statistical dimension
     * @param Data DNS query volume in the current statistical dimension
     */
    public void setData(DomainAnalyticsDetail [] Data) {
        this.Data = Data;
    }

    /**
     * Get Statistics on the DNS query volume of a subdomain 
     * @return Info Statistics on the DNS query volume of a subdomain
     */
    public SubdomainAnalyticsInfo getInfo() {
        return this.Info;
    }

    /**
     * Set Statistics on the DNS query volume of a subdomain
     * @param Info Statistics on the DNS query volume of a subdomain
     */
    public void setInfo(SubdomainAnalyticsInfo Info) {
        this.Info = Info;
    }

    /**
     * Get DNS query volume of the subdomain alias 
     * @return AliasData DNS query volume of the subdomain alias
     */
    public SubdomainAliasAnalyticsItem [] getAliasData() {
        return this.AliasData;
    }

    /**
     * Set DNS query volume of the subdomain alias
     * @param AliasData DNS query volume of the subdomain alias
     */
    public void setAliasData(SubdomainAliasAnalyticsItem [] AliasData) {
        this.AliasData = AliasData;
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

    public DescribeSubdomainAnalyticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubdomainAnalyticsResponse(DescribeSubdomainAnalyticsResponse source) {
        if (source.Data != null) {
            this.Data = new DomainAnalyticsDetail[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DomainAnalyticsDetail(source.Data[i]);
            }
        }
        if (source.Info != null) {
            this.Info = new SubdomainAnalyticsInfo(source.Info);
        }
        if (source.AliasData != null) {
            this.AliasData = new SubdomainAliasAnalyticsItem[source.AliasData.length];
            for (int i = 0; i < source.AliasData.length; i++) {
                this.AliasData[i] = new SubdomainAliasAnalyticsItem(source.AliasData[i]);
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
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamArrayObj(map, prefix + "AliasData.", this.AliasData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

