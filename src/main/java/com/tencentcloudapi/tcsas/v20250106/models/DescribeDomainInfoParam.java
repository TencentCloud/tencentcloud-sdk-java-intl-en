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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainInfoParam extends AbstractModel {

    /**
    * Multiple domains concatenated with semicolons (;). 
    */
    @SerializedName("DomainUrl")
    @Expose
    private String DomainUrl;

    /**
    * Domain type. Valid values: 1 Requests domain; 2 web-view domain.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get Multiple domains concatenated with semicolons (;).  
     * @return DomainUrl Multiple domains concatenated with semicolons (;). 
     */
    public String getDomainUrl() {
        return this.DomainUrl;
    }

    /**
     * Set Multiple domains concatenated with semicolons (;). 
     * @param DomainUrl Multiple domains concatenated with semicolons (;). 
     */
    public void setDomainUrl(String DomainUrl) {
        this.DomainUrl = DomainUrl;
    }

    /**
     * Get Domain type. Valid values: 1 Requests domain; 2 web-view domain. 
     * @return DomainType Domain type. Valid values: 1 Requests domain; 2 web-view domain.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain type. Valid values: 1 Requests domain; 2 web-view domain.
     * @param DomainType Domain type. Valid values: 1 Requests domain; 2 web-view domain.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public DescribeDomainInfoParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainInfoParam(DescribeDomainInfoParam source) {
        if (source.DomainUrl != null) {
            this.DomainUrl = new String(source.DomainUrl);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainUrl", this.DomainUrl);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

