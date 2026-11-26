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
    * Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
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
    * Name of the policy template after modification. It consists of Chinese characters, letters, digits, and underscores, cannot begin with an underline, and the length cannot exceed 32 characters. If the field is empty, no modification is made.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Configuration content of the security policy template. If the value is empty, no modification is made. Submodule structures that are not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rules in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
Special note: When a submodule structure is passed in, please ensure that all rule content to be retained is carried. Rule content not passed in is deemed as deletion.
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
     * Get Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs. 
     * @return ZoneId Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
     * @param ZoneId Site ID. Requires the input of the site to which the target policy template belongs in terms of access privileges. You can use the DescribeWebSecurityTemplates API to query the site to which the policy template belongs.
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
     * Get Name of the policy template after modification. It consists of Chinese characters, letters, digits, and underscores, cannot begin with an underline, and the length cannot exceed 32 characters. If the field is empty, no modification is made. 
     * @return TemplateName Name of the policy template after modification. It consists of Chinese characters, letters, digits, and underscores, cannot begin with an underline, and the length cannot exceed 32 characters. If the field is empty, no modification is made.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Name of the policy template after modification. It consists of Chinese characters, letters, digits, and underscores, cannot begin with an underline, and the length cannot exceed 32 characters. If the field is empty, no modification is made.
     * @param TemplateName Name of the policy template after modification. It consists of Chinese characters, letters, digits, and underscores, cannot begin with an underline, and the length cannot exceed 32 characters. If the field is empty, no modification is made.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Configuration content of the security policy template. If the value is empty, no modification is made. Submodule structures that are not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rules in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
Special note: When a submodule structure is passed in, please ensure that all rule content to be retained is carried. Rule content not passed in is deemed as deletion. 
     * @return SecurityPolicy Configuration content of the security policy template. If the value is empty, no modification is made. Submodule structures that are not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rules in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
Special note: When a submodule structure is passed in, please ensure that all rule content to be retained is carried. Rule content not passed in is deemed as deletion.
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Configuration content of the security policy template. If the value is empty, no modification is made. Submodule structures that are not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rules in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
Special note: When a submodule structure is passed in, please ensure that all rule content to be retained is carried. Rule content not passed in is deemed as deletion.
     * @param SecurityPolicy Configuration content of the security policy template. If the value is empty, no modification is made. Submodule structures that are not passed in will not be modified. Currently supports exception rules, custom rules, rate limiting rules, and managed rules in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
Special note: When a submodule structure is passed in, please ensure that all rule content to be retained is carried. Rule content not passed in is deemed as deletion.
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

