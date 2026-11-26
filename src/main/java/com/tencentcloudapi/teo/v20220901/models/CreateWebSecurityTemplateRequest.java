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

public class CreateWebSecurityTemplateRequest extends AbstractModel {

    /**
    * Site ID. This parameter clarifies the site to which the policy template belongs in terms of access permission.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Policy template name. It consists of Chinese characters, letters, digits, and underscores. It cannot begin with an underscore and cannot exceed 32 characters in length.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Configuration file content of the security policy template. If the field is empty, a default configuration is generated. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configuration in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
     * Get Site ID. This parameter clarifies the site to which the policy template belongs in terms of access permission. 
     * @return ZoneId Site ID. This parameter clarifies the site to which the policy template belongs in terms of access permission.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID. This parameter clarifies the site to which the policy template belongs in terms of access permission.
     * @param ZoneId Site ID. This parameter clarifies the site to which the policy template belongs in terms of access permission.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Policy template name. It consists of Chinese characters, letters, digits, and underscores. It cannot begin with an underscore and cannot exceed 32 characters in length. 
     * @return TemplateName Policy template name. It consists of Chinese characters, letters, digits, and underscores. It cannot begin with an underscore and cannot exceed 32 characters in length.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Policy template name. It consists of Chinese characters, letters, digits, and underscores. It cannot begin with an underscore and cannot exceed 32 characters in length.
     * @param TemplateName Policy template name. It consists of Chinese characters, letters, digits, and underscores. It cannot begin with an underscore and cannot exceed 32 characters in length.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Configuration file content of the security policy template. If the field is empty, a default configuration is generated. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configuration in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development. 
     * @return SecurityPolicy Configuration file content of the security policy template. If the field is empty, a default configuration is generated. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configuration in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Configuration file content of the security policy template. If the field is empty, a default configuration is generated. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configuration in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
     * @param SecurityPolicy Configuration file content of the security policy template. If the field is empty, a default configuration is generated. Currently supports exception rules, custom rules, rate limiting rules, and managed rule configuration in the Web protection module. Configure the security policy through expression syntax. Bot management rule configuration is not currently supported and is under development.
     */
    public void setSecurityPolicy(SecurityPolicy SecurityPolicy) {
        this.SecurityPolicy = SecurityPolicy;
    }

    public CreateWebSecurityTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWebSecurityTemplateRequest(CreateWebSecurityTemplateRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "SecurityPolicy.", this.SecurityPolicy);

    }
}

