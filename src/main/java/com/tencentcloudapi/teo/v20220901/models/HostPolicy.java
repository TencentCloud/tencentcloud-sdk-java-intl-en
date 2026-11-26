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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostPolicy extends AbstractModel {

    /**
    * <p>Site-level policy, a policy that takes effect for all domain names under the site. For details, see Site-level Policy.</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>Policy type used by the current domain. Valid values: <li>ZoneDefault: use a site-level policy, which is the policy settings defined in ZoneDefaultPolicy.</li><li>Custom: use a domain-level policy. When using this option, the Policy field must also be configured to specify the detailed policy settings.</li><li>Template: use a policy template. When using this option, the TemplateId field must also be configured to specify the policy template used by the current domain.</li></p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>Optional. When PolicyType is Custom, this field is the detailed policy configuration of the current domain name, which takes effect on the current domain.</p>
    */
    @SerializedName("Policy")
    @Expose
    private SecurityPolicy Policy;

    /**
    * <p>Optional. When PolicyType is Template, this field is used to specify the Id of the policy Template used by the current domain.</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get <p>Site-level policy, a policy that takes effect for all domain names under the site. For details, see Site-level Policy.</p> 
     * @return Host <p>Site-level policy, a policy that takes effect for all domain names under the site. For details, see Site-level Policy.</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Site-level policy, a policy that takes effect for all domain names under the site. For details, see Site-level Policy.</p>
     * @param Host <p>Site-level policy, a policy that takes effect for all domain names under the site. For details, see Site-level Policy.</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>Policy type used by the current domain. Valid values: <li>ZoneDefault: use a site-level policy, which is the policy settings defined in ZoneDefaultPolicy.</li><li>Custom: use a domain-level policy. When using this option, the Policy field must also be configured to specify the detailed policy settings.</li><li>Template: use a policy template. When using this option, the TemplateId field must also be configured to specify the policy template used by the current domain.</li></p> 
     * @return PolicyType <p>Policy type used by the current domain. Valid values: <li>ZoneDefault: use a site-level policy, which is the policy settings defined in ZoneDefaultPolicy.</li><li>Custom: use a domain-level policy. When using this option, the Policy field must also be configured to specify the detailed policy settings.</li><li>Template: use a policy template. When using this option, the TemplateId field must also be configured to specify the policy template used by the current domain.</li></p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>Policy type used by the current domain. Valid values: <li>ZoneDefault: use a site-level policy, which is the policy settings defined in ZoneDefaultPolicy.</li><li>Custom: use a domain-level policy. When using this option, the Policy field must also be configured to specify the detailed policy settings.</li><li>Template: use a policy template. When using this option, the TemplateId field must also be configured to specify the policy template used by the current domain.</li></p>
     * @param PolicyType <p>Policy type used by the current domain. Valid values: <li>ZoneDefault: use a site-level policy, which is the policy settings defined in ZoneDefaultPolicy.</li><li>Custom: use a domain-level policy. When using this option, the Policy field must also be configured to specify the detailed policy settings.</li><li>Template: use a policy template. When using this option, the TemplateId field must also be configured to specify the policy template used by the current domain.</li></p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>Optional. When PolicyType is Custom, this field is the detailed policy configuration of the current domain name, which takes effect on the current domain.</p> 
     * @return Policy <p>Optional. When PolicyType is Custom, this field is the detailed policy configuration of the current domain name, which takes effect on the current domain.</p>
     */
    public SecurityPolicy getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>Optional. When PolicyType is Custom, this field is the detailed policy configuration of the current domain name, which takes effect on the current domain.</p>
     * @param Policy <p>Optional. When PolicyType is Custom, this field is the detailed policy configuration of the current domain name, which takes effect on the current domain.</p>
     */
    public void setPolicy(SecurityPolicy Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>Optional. When PolicyType is Template, this field is used to specify the Id of the policy Template used by the current domain.</p> 
     * @return TemplateId <p>Optional. When PolicyType is Template, this field is used to specify the Id of the policy Template used by the current domain.</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>Optional. When PolicyType is Template, this field is used to specify the Id of the policy Template used by the current domain.</p>
     * @param TemplateId <p>Optional. When PolicyType is Template, this field is used to specify the Id of the policy Template used by the current domain.</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public HostPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostPolicy(HostPolicy source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Policy != null) {
            this.Policy = new SecurityPolicy(source.Policy);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "Policy.", this.Policy);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

