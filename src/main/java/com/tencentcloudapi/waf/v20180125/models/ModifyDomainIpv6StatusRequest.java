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

public class ModifyDomainIpv6StatusRequest extends AbstractModel {

    /**
    * Instance ID of the domain to be modified
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Domain to modify
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain ID to be modified
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * IPv6 switch for modifying domain is Status (1: enable, 2: disable)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Instance ID of the domain to be modified 
     * @return InstanceId Instance ID of the domain to be modified
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID of the domain to be modified
     * @param InstanceId Instance ID of the domain to be modified
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Domain to modify 
     * @return Domain Domain to modify
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain to modify
     * @param Domain Domain to modify
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Domain ID to be modified 
     * @return DomainId Domain ID to be modified
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID to be modified
     * @param DomainId Domain ID to be modified
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get IPv6 switch for modifying domain is Status (1: enable, 2: disable) 
     * @return Status IPv6 switch for modifying domain is Status (1: enable, 2: disable)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set IPv6 switch for modifying domain is Status (1: enable, 2: disable)
     * @param Status IPv6 switch for modifying domain is Status (1: enable, 2: disable)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyDomainIpv6StatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainIpv6StatusRequest(ModifyDomainIpv6StatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

