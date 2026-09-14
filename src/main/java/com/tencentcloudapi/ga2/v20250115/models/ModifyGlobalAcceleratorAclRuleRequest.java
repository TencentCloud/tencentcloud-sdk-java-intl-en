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

public class ModifyGlobalAcceleratorAclRuleRequest extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Security policy ID</p>
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * <p>Acl rule ID.</p>
    */
    @SerializedName("GlobalAcceleratorAclRuleId")
    @Expose
    private String GlobalAcceleratorAclRuleId;

    /**
    * <p>Protocol.</p><p>Input parameter limit: support selecting 'TCP', 'UDP'.</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>Port.</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>IP range.</p>
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * <p>Action.</p><p>Input parameter limit: support selecting 'ACCEPT', 'DROP'.</p><p>Enumeration values:</p><ul><li>ACCEPT: permission.</li><li>DROP: deny.</li></ul>
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * <p>Description. Maximum length cannot exceed 100 bytes.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Security policy ID</p> 
     * @return GlobalAcceleratorAclPolicyId <p>Security policy ID</p>
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set <p>Security policy ID</p>
     * @param GlobalAcceleratorAclPolicyId <p>Security policy ID</p>
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get <p>Acl rule ID.</p> 
     * @return GlobalAcceleratorAclRuleId <p>Acl rule ID.</p>
     */
    public String getGlobalAcceleratorAclRuleId() {
        return this.GlobalAcceleratorAclRuleId;
    }

    /**
     * Set <p>Acl rule ID.</p>
     * @param GlobalAcceleratorAclRuleId <p>Acl rule ID.</p>
     */
    public void setGlobalAcceleratorAclRuleId(String GlobalAcceleratorAclRuleId) {
        this.GlobalAcceleratorAclRuleId = GlobalAcceleratorAclRuleId;
    }

    /**
     * Get <p>Protocol.</p><p>Input parameter limit: support selecting 'TCP', 'UDP'.</p> 
     * @return Protocol <p>Protocol.</p><p>Input parameter limit: support selecting 'TCP', 'UDP'.</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>Protocol.</p><p>Input parameter limit: support selecting 'TCP', 'UDP'.</p>
     * @param Protocol <p>Protocol.</p><p>Input parameter limit: support selecting 'TCP', 'UDP'.</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>Port.</p> 
     * @return Port <p>Port.</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port.</p>
     * @param Port <p>Port.</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>IP range.</p> 
     * @return SourceCidrBlock <p>IP range.</p>
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set <p>IP range.</p>
     * @param SourceCidrBlock <p>IP range.</p>
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
    }

    /**
     * Get <p>Action.</p><p>Input parameter limit: support selecting 'ACCEPT', 'DROP'.</p><p>Enumeration values:</p><ul><li>ACCEPT: permission.</li><li>DROP: deny.</li></ul> 
     * @return Policy <p>Action.</p><p>Input parameter limit: support selecting 'ACCEPT', 'DROP'.</p><p>Enumeration values:</p><ul><li>ACCEPT: permission.</li><li>DROP: deny.</li></ul>
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>Action.</p><p>Input parameter limit: support selecting 'ACCEPT', 'DROP'.</p><p>Enumeration values:</p><ul><li>ACCEPT: permission.</li><li>DROP: deny.</li></ul>
     * @param Policy <p>Action.</p><p>Input parameter limit: support selecting 'ACCEPT', 'DROP'.</p><p>Enumeration values:</p><ul><li>ACCEPT: permission.</li><li>DROP: deny.</li></ul>
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>Description. Maximum length cannot exceed 100 bytes.</p> 
     * @return Description <p>Description. Maximum length cannot exceed 100 bytes.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description. Maximum length cannot exceed 100 bytes.</p>
     * @param Description <p>Description. Maximum length cannot exceed 100 bytes.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyGlobalAcceleratorAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalAcceleratorAclRuleRequest(ModifyGlobalAcceleratorAclRuleRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
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
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclRuleId", this.GlobalAcceleratorAclRuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SourceCidrBlock", this.SourceCidrBlock);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

