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

public class DescribeMNGDomainInfoResp extends AbstractModel {

    /**
    * <p>Multiple domain names are concatenated with the separator ;</p>
    */
    @SerializedName("DomainUrl")
    @Expose
    private String DomainUrl;

    /**
    * <p>Domain type. Valid values: 1: Requests domain; 2: web-view domain</p>
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get <p>Multiple domain names are concatenated with the separator ;</p> 
     * @return DomainUrl <p>Multiple domain names are concatenated with the separator ;</p>
     */
    public String getDomainUrl() {
        return this.DomainUrl;
    }

    /**
     * Set <p>Multiple domain names are concatenated with the separator ;</p>
     * @param DomainUrl <p>Multiple domain names are concatenated with the separator ;</p>
     */
    public void setDomainUrl(String DomainUrl) {
        this.DomainUrl = DomainUrl;
    }

    /**
     * Get <p>Domain type. Valid values: 1: Requests domain; 2: web-view domain</p> 
     * @return DomainType <p>Domain type. Valid values: 1: Requests domain; 2: web-view domain</p>
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set <p>Domain type. Valid values: 1: Requests domain; 2: web-view domain</p>
     * @param DomainType <p>Domain type. Valid values: 1: Requests domain; 2: web-view domain</p>
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public DescribeMNGDomainInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGDomainInfoResp(DescribeMNGDomainInfoResp source) {
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

