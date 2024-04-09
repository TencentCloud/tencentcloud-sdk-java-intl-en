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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityPolicyRequest extends AbstractModel {

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Security configuration.
    */
    @SerializedName("SecurityConfig")
    @Expose
    private SecurityConfig SecurityConfig;

    /**
    * Subdomain/application name.

Note: When both this parameter and the TemplateId parameter are specified, this parameter will not take effect. Do not specify this parameter and the TemplateId parameter at the same time.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Specifies the policy template ID, or the site's global policy.
- To configure a policy template, specify the policy template ID.
- To configure the site's global policy, use the @ZoneLevel@Domain parameter value.

Note: When this parameter is used, the Entity parameter will not take effect. Do not use this parameter and the Entity parameter at the same time.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Security configuration. 
     * @return SecurityConfig Security configuration.
     */
    public SecurityConfig getSecurityConfig() {
        return this.SecurityConfig;
    }

    /**
     * Set Security configuration.
     * @param SecurityConfig Security configuration.
     */
    public void setSecurityConfig(SecurityConfig SecurityConfig) {
        this.SecurityConfig = SecurityConfig;
    }

    /**
     * Get Subdomain/application name.

Note: When both this parameter and the TemplateId parameter are specified, this parameter will not take effect. Do not specify this parameter and the TemplateId parameter at the same time. 
     * @return Entity Subdomain/application name.

Note: When both this parameter and the TemplateId parameter are specified, this parameter will not take effect. Do not specify this parameter and the TemplateId parameter at the same time.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Subdomain/application name.

Note: When both this parameter and the TemplateId parameter are specified, this parameter will not take effect. Do not specify this parameter and the TemplateId parameter at the same time.
     * @param Entity Subdomain/application name.

Note: When both this parameter and the TemplateId parameter are specified, this parameter will not take effect. Do not specify this parameter and the TemplateId parameter at the same time.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Specifies the policy template ID, or the site's global policy.
- To configure a policy template, specify the policy template ID.
- To configure the site's global policy, use the @ZoneLevel@Domain parameter value.

Note: When this parameter is used, the Entity parameter will not take effect. Do not use this parameter and the Entity parameter at the same time. 
     * @return TemplateId Specifies the policy template ID, or the site's global policy.
- To configure a policy template, specify the policy template ID.
- To configure the site's global policy, use the @ZoneLevel@Domain parameter value.

Note: When this parameter is used, the Entity parameter will not take effect. Do not use this parameter and the Entity parameter at the same time.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Specifies the policy template ID, or the site's global policy.
- To configure a policy template, specify the policy template ID.
- To configure the site's global policy, use the @ZoneLevel@Domain parameter value.

Note: When this parameter is used, the Entity parameter will not take effect. Do not use this parameter and the Entity parameter at the same time.
     * @param TemplateId Specifies the policy template ID, or the site's global policy.
- To configure a policy template, specify the policy template ID.
- To configure the site's global policy, use the @ZoneLevel@Domain parameter value.

Note: When this parameter is used, the Entity parameter will not take effect. Do not use this parameter and the Entity parameter at the same time.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ModifySecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityPolicyRequest(ModifySecurityPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SecurityConfig != null) {
            this.SecurityConfig = new SecurityConfig(source.SecurityConfig);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "SecurityConfig.", this.SecurityConfig);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

