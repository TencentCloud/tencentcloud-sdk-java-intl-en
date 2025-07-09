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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCCPrecisionPolicyRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Protocol. Valid values: `HTTP` and `HTTPS`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
    */
    @SerializedName("PolicyAction")
    @Expose
    private String PolicyAction;

    /**
    * Policy records
    */
    @SerializedName("PolicyList")
    @Expose
    private CCPrecisionPlyRecord [] PolicyList;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Protocol. Valid values: `HTTP` and `HTTPS`. 
     * @return Protocol Protocol. Valid values: `HTTP` and `HTTPS`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Valid values: `HTTP` and `HTTPS`.
     * @param Protocol Protocol. Valid values: `HTTP` and `HTTPS`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests). 
     * @return PolicyAction Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     */
    public String getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     * @param PolicyAction Action of limiting request frequency. Valid values: `alg` (limit request frequency via verification codes) and `drop`(drop requests).
     */
    public void setPolicyAction(String PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get Policy records 
     * @return PolicyList Policy records
     */
    public CCPrecisionPlyRecord [] getPolicyList() {
        return this.PolicyList;
    }

    /**
     * Set Policy records
     * @param PolicyList Policy records
     */
    public void setPolicyList(CCPrecisionPlyRecord [] PolicyList) {
        this.PolicyList = PolicyList;
    }

    public CreateCCPrecisionPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCCPrecisionPolicyRequest(CreateCCPrecisionPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.PolicyAction != null) {
            this.PolicyAction = new String(source.PolicyAction);
        }
        if (source.PolicyList != null) {
            this.PolicyList = new CCPrecisionPlyRecord[source.PolicyList.length];
            for (int i = 0; i < source.PolicyList.length; i++) {
                this.PolicyList[i] = new CCPrecisionPlyRecord(source.PolicyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamArrayObj(map, prefix + "PolicyList.", this.PolicyList);

    }
}

