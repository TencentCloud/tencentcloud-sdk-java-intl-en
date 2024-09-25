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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainsCLSStatusRequest extends AbstractModel {

    /**
    * Domain name list to be modified
    */
    @SerializedName("Domains")
    @Expose
    private DomainURI [] Domains;

    /**
    * Change the access log switch of the domain to Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Domain name list to be modified 
     * @return Domains Domain name list to be modified
     */
    public DomainURI [] getDomains() {
        return this.Domains;
    }

    /**
     * Set Domain name list to be modified
     * @param Domains Domain name list to be modified
     */
    public void setDomains(DomainURI [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get Change the access log switch of the domain to Status 
     * @return Status Change the access log switch of the domain to Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Change the access log switch of the domain to Status
     * @param Status Change the access log switch of the domain to Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDomainsCLSStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainsCLSStatusRequest(ModifyDomainsCLSStatusRequest source) {
        if (source.Domains != null) {
            this.Domains = new DomainURI[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new DomainURI(source.Domains[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

