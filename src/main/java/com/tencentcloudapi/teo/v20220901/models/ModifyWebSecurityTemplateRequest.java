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

public class ModifyWebSecurityTemplateRequest extends AbstractModel {

    /**
    * Zone ID. The zone to which the target policy template belongs for access control. Use the DescribeWebSecurityTemplates interface to query the zone of the policy template.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Policy template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Modified policy template name. Consists of Chinese characters, letters, numbers, and underscores, cannot start with an underscore, and must not exceed 32 characters. If the field is empty, no modification will be made.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Security policy template configuration content. If the value is empty, no modification will be made; submodule structures not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configurations in the Web Security module, using expression syntax for security policy configuration. Bot management rule configuration is not yet supported (under development).
Special note: When passing a submodule structure as input, ensure all rule content to be retained is included. Rule content not passed in will be treated as deleted.
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
     * Get Zone ID. The zone to which the target policy template belongs for access control. Use the DescribeWebSecurityTemplates interface to query the zone of the policy template. 
     * @return ZoneId Zone ID. The zone to which the target policy template belongs for access control. Use the DescribeWebSecurityTemplates interface to query the zone of the policy template.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID. The zone to which the target policy template belongs for access control. Use the DescribeWebSecurityTemplates interface to query the zone of the policy template.
     * @param ZoneId Zone ID. The zone to which the target policy template belongs for access control. Use the DescribeWebSecurityTemplates interface to query the zone of the policy template.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Policy template ID. 
     * @return TemplateId Policy template ID.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Policy template ID.
     * @param TemplateId Policy template ID.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Modified policy template name. Consists of Chinese characters, letters, numbers, and underscores, cannot start with an underscore, and must not exceed 32 characters. If the field is empty, no modification will be made. 
     * @return TemplateName Modified policy template name. Consists of Chinese characters, letters, numbers, and underscores, cannot start with an underscore, and must not exceed 32 characters. If the field is empty, no modification will be made.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Modified policy template name. Consists of Chinese characters, letters, numbers, and underscores, cannot start with an underscore, and must not exceed 32 characters. If the field is empty, no modification will be made.
     * @param TemplateName Modified policy template name. Consists of Chinese characters, letters, numbers, and underscores, cannot start with an underscore, and must not exceed 32 characters. If the field is empty, no modification will be made.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Security policy template configuration content. If the value is empty, no modification will be made; submodule structures not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configurations in the Web Security module, using expression syntax for security policy configuration. Bot management rule configuration is not yet supported (under development).
Special note: When passing a submodule structure as input, ensure all rule content to be retained is included. Rule content not passed in will be treated as deleted. 
     * @return SecurityPolicy Security policy template configuration content. If the value is empty, no modification will be made; submodule structures not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configurations in the Web Security module, using expression syntax for security policy configuration. Bot management rule configuration is not yet supported (under development).
Special note: When passing a submodule structure as input, ensure all rule content to be retained is included. Rule content not passed in will be treated as deleted.
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Security policy template configuration content. If the value is empty, no modification will be made; submodule structures not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configurations in the Web Security module, using expression syntax for security policy configuration. Bot management rule configuration is not yet supported (under development).
Special note: When passing a submodule structure as input, ensure all rule content to be retained is included. Rule content not passed in will be treated as deleted.
     * @param SecurityPolicy Security policy template configuration content. If the value is empty, no modification will be made; submodule structures not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configurations in the Web Security module, using expression syntax for security policy configuration. Bot management rule configuration is not yet supported (under development).
Special note: When passing a submodule structure as input, ensure all rule content to be retained is included. Rule content not passed in will be treated as deleted.
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    public ModifyWebSecurityTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebSecurityTemplateRequest(ModifyWebSecurityTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.SecurityPolicy != null) {
            this.SecurityPolicy = new SecurityPolicy(source.SecurityPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);

    }
}

