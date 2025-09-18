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

public class DescribeRecordLineCategoryListRequest extends AbstractModel {

    /**
    * Specifies the domain name to query the line list.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain ID for querying the route list. parameter DomainId has higher priority than parameter Domain. if you pass parameter DomainId, it will ignore parameter Domain.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get Specifies the domain name to query the line list. 
     * @return Domain Specifies the domain name to query the line list.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Specifies the domain name to query the line list.
     * @param Domain Specifies the domain name to query the line list.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain ID for querying the route list. parameter DomainId has higher priority than parameter Domain. if you pass parameter DomainId, it will ignore parameter Domain. 
     * @return DomainId Domain ID for querying the route list. parameter DomainId has higher priority than parameter Domain. if you pass parameter DomainId, it will ignore parameter Domain.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID for querying the route list. parameter DomainId has higher priority than parameter Domain. if you pass parameter DomainId, it will ignore parameter Domain.
     * @param DomainId Domain ID for querying the route list. parameter DomainId has higher priority than parameter Domain. if you pass parameter DomainId, it will ignore parameter Domain.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeRecordLineCategoryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordLineCategoryListRequest(DescribeRecordLineCategoryListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

