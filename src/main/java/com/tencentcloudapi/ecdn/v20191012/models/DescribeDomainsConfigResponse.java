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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainsConfigResponse extends AbstractModel {

    /**
    * Domain name list.
    */
    @SerializedName("Domains")
    @Expose
    private DomainDetailInfo [] Domains;

    /**
    * Number of matched domain names. This is used for paginated query.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Domain name list. 
     * @return Domains Domain name list.
     */
    public DomainDetailInfo [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Domain name list.
     * @param Domains Domain name list.
     */
    public void setDomains(DomainDetailInfo [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Number of matched domain names. This is used for paginated query. 
     * @return TotalCount Number of matched domain names. This is used for paginated query.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of matched domain names. This is used for paginated query.
     * @param TotalCount Number of matched domain names. This is used for paginated query.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeDomainsConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainsConfigResponse(DescribeDomainsConfigResponse source) {
        if (source.Domains != null) {
            this.Domains = new DomainDetailInfo[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new DomainDetailInfo(source.Domains[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

