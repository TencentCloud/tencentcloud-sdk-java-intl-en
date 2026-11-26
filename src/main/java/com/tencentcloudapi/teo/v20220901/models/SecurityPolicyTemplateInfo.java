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

public class SecurityPolicyTemplateInfo extends AbstractModel {

    /**
    * Site ID of the policy template.
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
    * Policy template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * Domain name info bound to the policy template.
    */
    @SerializedName("BindDomains")
    @Expose
    private BindDomainInfo [] BindDomains;

    /**
     * Get Site ID of the policy template. 
     * @return ZoneId Site ID of the policy template.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID of the policy template.
     * @param ZoneId Site ID of the policy template.
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
     * Get Policy template name. 
     * @return TemplateName Policy template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set Policy template name.
     * @param TemplateName Policy template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get Domain name info bound to the policy template. 
     * @return BindDomains Domain name info bound to the policy template.
     */
    public BindDomainInfo [] getBindDomains() {
        return this.BindDomains;
    }

    /**
     * Set Domain name info bound to the policy template.
     * @param BindDomains Domain name info bound to the policy template.
     */
    public void setBindDomains(BindDomainInfo [] BindDomains) {
        this.BindDomains = BindDomains;
    }

    public SecurityPolicyTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyTemplateInfo(SecurityPolicyTemplateInfo source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.BindDomains != null) {
            this.BindDomains = new BindDomainInfo[source.BindDomains.length];
            for (int i = 0; i < source.BindDomains.length; i++) {
                this.BindDomains[i] = new BindDomainInfo(source.BindDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArrayObj(map, prefix + "BindDomains.", this.BindDomains);

    }
}

