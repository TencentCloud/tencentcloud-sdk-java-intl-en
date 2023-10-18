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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsResponse extends AbstractModel {

    /**
    * List of domain names
    */
    @SerializedName("Domains")
    @Expose
    private BriefDomain [] Domains;

    /**
    * The number of domain names that matched the query conditions
Used for paginated queries
    */
    @SerializedName("TotalNumber")
    @Expose
    private Long TotalNumber;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of domain names 
     * @return Domains List of domain names
     */
    public BriefDomain [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of domain names
     * @param Domains List of domain names
     */
    public void setDomains(BriefDomain [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get The number of domain names that matched the query conditions
Used for paginated queries 
     * @return TotalNumber The number of domain names that matched the query conditions
Used for paginated queries
     */
    public Long getTotalNumber() {
        return this.TotalNumber;
    }

    /**
     * Set The number of domain names that matched the query conditions
Used for paginated queries
     * @param TotalNumber The number of domain names that matched the query conditions
Used for paginated queries
     */
    public void setTotalNumber(Long TotalNumber) {
        this.TotalNumber = TotalNumber;
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

    public DescribeDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainsResponse(DescribeDomainsResponse source) {
        if (source.Domains != null) {
            this.Domains = new BriefDomain[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new BriefDomain(source.Domains[i]);
            }
        }
        if (source.TotalNumber != null) {
            this.TotalNumber = new Long(source.TotalNumber);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "TotalNumber", this.TotalNumber);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

