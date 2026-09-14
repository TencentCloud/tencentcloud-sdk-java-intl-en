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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlobalAcceleratorAclRuleSet extends AbstractModel {

    /**
    * Access control policy ID.
    */
    @SerializedName("GlobalAcceleratorPolicyId")
    @Expose
    private String GlobalAcceleratorPolicyId;

    /**
    * Acl rule ID.
    */
    @SerializedName("GlobalAcceleratorAclRuleId")
    @Expose
    private String GlobalAcceleratorAclRuleId;

    /**
    * Protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * IP range.
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * Action.
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Access control policy ID. 
     * @return GlobalAcceleratorPolicyId Access control policy ID.
     */
    public String getGlobalAcceleratorPolicyId() {
        return this.GlobalAcceleratorPolicyId;
    }

    /**
     * Set Access control policy ID.
     * @param GlobalAcceleratorPolicyId Access control policy ID.
     */
    public void setGlobalAcceleratorPolicyId(String GlobalAcceleratorPolicyId) {
        this.GlobalAcceleratorPolicyId = GlobalAcceleratorPolicyId;
    }

    /**
     * Get Acl rule ID. 
     * @return GlobalAcceleratorAclRuleId Acl rule ID.
     */
    public String getGlobalAcceleratorAclRuleId() {
        return this.GlobalAcceleratorAclRuleId;
    }

    /**
     * Set Acl rule ID.
     * @param GlobalAcceleratorAclRuleId Acl rule ID.
     */
    public void setGlobalAcceleratorAclRuleId(String GlobalAcceleratorAclRuleId) {
        this.GlobalAcceleratorAclRuleId = GlobalAcceleratorAclRuleId;
    }

    /**
     * Get Protocol. 
     * @return Protocol Protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol.
     * @param Protocol Protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get IP range. 
     * @return SourceCidrBlock IP range.
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set IP range.
     * @param SourceCidrBlock IP range.
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
    }

    /**
     * Get Action. 
     * @return Policy Action.
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Action.
     * @param Policy Action.
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public GlobalAcceleratorAclRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorAclRuleSet(GlobalAcceleratorAclRuleSet source) {
        if (source.GlobalAcceleratorPolicyId != null) {
            this.GlobalAcceleratorPolicyId = new String(source.GlobalAcceleratorPolicyId);
        }
        if (source.GlobalAcceleratorAclRuleId != null) {
            this.GlobalAcceleratorAclRuleId = new String(source.GlobalAcceleratorAclRuleId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.SourceCidrBlock != null) {
            this.SourceCidrBlock = new String(source.SourceCidrBlock);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorPolicyId", this.GlobalAcceleratorPolicyId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclRuleId", this.GlobalAcceleratorAclRuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SourceCidrBlock", this.SourceCidrBlock);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

