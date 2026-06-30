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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DuplicateDomainConfigRequest extends AbstractModel {

    /**
    * Adds a domain name.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Specifies the configured domain name to be copied.
    */
    @SerializedName("ReferenceDomain")
    @Expose
    private String ReferenceDomain;

    /**
     * Get Adds a domain name. 
     * @return Domain Adds a domain name.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Adds a domain name.
     * @param Domain Adds a domain name.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Specifies the configured domain name to be copied. 
     * @return ReferenceDomain Specifies the configured domain name to be copied.
     */
    public String getReferenceDomain() {
        return this.ReferenceDomain;
    }

    /**
     * Set Specifies the configured domain name to be copied.
     * @param ReferenceDomain Specifies the configured domain name to be copied.
     */
    public void setReferenceDomain(String ReferenceDomain) {
        this.ReferenceDomain = ReferenceDomain;
    }

    public DuplicateDomainConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplicateDomainConfigRequest(DuplicateDomainConfigRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ReferenceDomain != null) {
            this.ReferenceDomain = new String(source.ReferenceDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ReferenceDomain", this.ReferenceDomain);

    }
}

