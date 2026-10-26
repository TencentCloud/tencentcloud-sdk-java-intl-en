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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCNAMERequest extends AbstractModel {

    /**
    * Service node ID (obtain from the DescribeDomainRegion API for querying domain name bindable service nodes)
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Domain type. 0: pull streaming domain name. 1: streaming domain.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get Service node ID (obtain from the DescribeDomainRegion API for querying domain name bindable service nodes) 
     * @return ClusterId Service node ID (obtain from the DescribeDomainRegion API for querying domain name bindable service nodes)
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Service node ID (obtain from the DescribeDomainRegion API for querying domain name bindable service nodes)
     * @param ClusterId Service node ID (obtain from the DescribeDomainRegion API for querying domain name bindable service nodes)
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Domain type. 0: pull streaming domain name. 1: streaming domain. 
     * @return DomainType Domain type. 0: pull streaming domain name. 1: streaming domain.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain type. 0: pull streaming domain name. 1: streaming domain.
     * @param DomainType Domain type. 0: pull streaming domain name. 1: streaming domain.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public DescribeCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCNAMERequest(DescribeCNAMERequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

