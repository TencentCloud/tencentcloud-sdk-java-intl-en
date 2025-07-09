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

public class DescribeDomainAliasListResponse extends AbstractModel {

    /**
    * List of domain aliases
    */
    @SerializedName("DomainAliasList")
    @Expose
    private DomainAliasInfo [] DomainAliasList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of domain aliases 
     * @return DomainAliasList List of domain aliases
     */
    public DomainAliasInfo [] getDomainAliasList() {
        return this.DomainAliasList;
    }

    /**
     * Set List of domain aliases
     * @param DomainAliasList List of domain aliases
     */
    public void setDomainAliasList(DomainAliasInfo [] DomainAliasList) {
        this.DomainAliasList = DomainAliasList;
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

    public DescribeDomainAliasListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainAliasListResponse(DescribeDomainAliasListResponse source) {
        if (source.DomainAliasList != null) {
            this.DomainAliasList = new DomainAliasInfo[source.DomainAliasList.length];
            for (int i = 0; i < source.DomainAliasList.length; i++) {
                this.DomainAliasList[i] = new DomainAliasInfo(source.DomainAliasList[i]);
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
        this.setParamArrayObj(map, prefix + "DomainAliasList.", this.DomainAliasList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

