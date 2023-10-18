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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDDoSWaterKeyRequest extends AbstractModel {

    /**
    * Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Key operation. Valid values: [add (add), delete (delete), open (open), close (close), get (get key)]
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Key ID, which can be left empty or 0 when adding a key but is required for other operations
    */
    @SerializedName("KeyId")
    @Expose
    private Long KeyId;

    /**
     * Get Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate 
     * @return Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     * @param Business Anti-DDoS service type. `bgpip`: Anti-DDoS Advanced; `bgp`: Anti-DDoS Pro (single IP); `bgp-multip`: Anti-DDoS Pro (multi-IP), `net`: Anti-DDoS Ultimate
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Key operation. Valid values: [add (add), delete (delete), open (open), close (close), get (get key)] 
     * @return Method Key operation. Valid values: [add (add), delete (delete), open (open), close (close), get (get key)]
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Key operation. Valid values: [add (add), delete (delete), open (open), close (close), get (get key)]
     * @param Method Key operation. Valid values: [add (add), delete (delete), open (open), close (close), get (get key)]
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Key ID, which can be left empty or 0 when adding a key but is required for other operations 
     * @return KeyId Key ID, which can be left empty or 0 when adding a key but is required for other operations
     */
    public Long getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key ID, which can be left empty or 0 when adding a key but is required for other operations
     * @param KeyId Key ID, which can be left empty or 0 when adding a key but is required for other operations
     */
    public void setKeyId(Long KeyId) {
        this.KeyId = KeyId;
    }

    public ModifyDDoSWaterKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDDoSWaterKeyRequest(ModifyDDoSWaterKeyRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.KeyId != null) {
            this.KeyId = new Long(source.KeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

