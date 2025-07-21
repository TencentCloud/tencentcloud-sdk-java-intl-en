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
    * Zone ID. Explicitly identifies the zone to which the policy template belongs for access control purposes.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Policy template name. Composed of Chinese characters, letters, digits, and underscores. Cannot begin with an underscore and must be less than or equal to 32 characters.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Web security policy template configuration. Generates default config if empty. Supported: Exception rules, custom rules, rate limiting rules, managed rules. Not supported: Bot management rules (under development).
    */
    @SerializedName("SecurityPolicy")
    @Expose
    private SecurityPolicy SecurityPolicy;

    /**
     * Get Zone ID. Explicitly identifies the zone to which the policy template belongs for access control purposes. 
     * @return ZoneId Zone ID. Explicitly identifies the zone to which the policy template belongs for access control purposes.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID. Explicitly identifies the zone to which the policy template belongs for access control purposes.
     * @param ZoneId Zone ID. Explicitly identifies the zone to which the policy template belongs for access control purposes.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Policy template name. Composed of Chinese characters, letters, digits, and underscores. Cannot begin with an underscore and must be less than or equal to 32 characters. 
     * @return TemplateName Policy template name. Composed of Chinese characters, letters, digits, and underscores. Cannot begin with an underscore and must be less than or equal to 32 characters.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Policy template name. Composed of Chinese characters, letters, digits, and underscores. Cannot begin with an underscore and must be less than or equal to 32 characters.
     * @param TemplateName Policy template name. Composed of Chinese characters, letters, digits, and underscores. Cannot begin with an underscore and must be less than or equal to 32 characters.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Web security policy template configuration. Generates default config if empty. Supported: Exception rules, custom rules, rate limiting rules, managed rules. Not supported: Bot management rules (under development). 
     * @return SecurityPolicy Web security policy template configuration. Generates default config if empty. Supported: Exception rules, custom rules, rate limiting rules, managed rules. Not supported: Bot management rules (under development).
     */
    public SecurityPolicy getSecurityPolicy() {
        return this.SecurityPolicy;
    }

    /**
     * Set Web security policy template configuration. Generates default config if empty. Supported: Exception rules, custom rules, rate limiting rules, managed rules. Not supported: Bot management rules (under development).
     * @param SecurityPolicy Web security policy template configuration. Generates default config if empty. Supported: Exception rules, custom rules, rate limiting rules, managed rules. Not supported: Bot management rules (under development).
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

