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

public class BindSecurityTemplateToEntityRequest extends AbstractModel {

    /**
    * Site ID of the policy template to be bound to or unbound from.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of domain names to bind to/unbind from a policy template
    */
    @SerializedName("Entities")
    @Expose
    private String [] Entities;

    /**
    * Bind or unbind operation option. valid values:.
<Li>`Bind`: bind the domain name to the policy template.</li>.
<li>unbind-keep-policy: unbind a domain name from the policy template while retaining the current policy.</li>.
<li>unbind-use-default: unbind a domain name from the policy template and use the default blank policy.</li> note: the unbinding operation currently only supports unbinding a single domain name. that is, when the Operate parameter value is unbind-keep-policy or unbind-use-default, the Entities parameter list only supports filling in one domain name.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * Specifies the ID of the policy template or the site global policy to be bound or unbound.
<li>To bind to a policy template, or unbind from it, specify the policy template ID.</li>.
<li>To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.</li>.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * If the imported domain name has already been bound to a policy template (including a site-level security policy), this parameter indicates whether to replace the template by setting it. the default value is true. values: <li>`true`: replace the template currently bound to the domain.</li> <li>`false`: do not replace the template currently bound to the domain.</li> note: when set to false, if the imported domain name has already been bound to a policy template, the API will return an error; a site-level security policy is also a type of policy template.
    */
    @SerializedName("OverWrite")
    @Expose
    private Boolean OverWrite;

    /**
     * Get Site ID of the policy template to be bound to or unbound from. 
     * @return ZoneId Site ID of the policy template to be bound to or unbound from.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID of the policy template to be bound to or unbound from.
     * @param ZoneId Site ID of the policy template to be bound to or unbound from.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of domain names to bind to/unbind from a policy template 
     * @return Entities List of domain names to bind to/unbind from a policy template
     */
    public String [] getEntities() {
        return this.Entities;
    }

    /**
     * Set List of domain names to bind to/unbind from a policy template
     * @param Entities List of domain names to bind to/unbind from a policy template
     */
    public void setEntities(String [] Entities) {
        this.Entities = Entities;
    }

    /**
     * Get Bind or unbind operation option. valid values:.
<Li>`Bind`: bind the domain name to the policy template.</li>.
<li>unbind-keep-policy: unbind a domain name from the policy template while retaining the current policy.</li>.
<li>unbind-use-default: unbind a domain name from the policy template and use the default blank policy.</li> note: the unbinding operation currently only supports unbinding a single domain name. that is, when the Operate parameter value is unbind-keep-policy or unbind-use-default, the Entities parameter list only supports filling in one domain name. 
     * @return Operate Bind or unbind operation option. valid values:.
<Li>`Bind`: bind the domain name to the policy template.</li>.
<li>unbind-keep-policy: unbind a domain name from the policy template while retaining the current policy.</li>.
<li>unbind-use-default: unbind a domain name from the policy template and use the default blank policy.</li> note: the unbinding operation currently only supports unbinding a single domain name. that is, when the Operate parameter value is unbind-keep-policy or unbind-use-default, the Entities parameter list only supports filling in one domain name.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set Bind or unbind operation option. valid values:.
<Li>`Bind`: bind the domain name to the policy template.</li>.
<li>unbind-keep-policy: unbind a domain name from the policy template while retaining the current policy.</li>.
<li>unbind-use-default: unbind a domain name from the policy template and use the default blank policy.</li> note: the unbinding operation currently only supports unbinding a single domain name. that is, when the Operate parameter value is unbind-keep-policy or unbind-use-default, the Entities parameter list only supports filling in one domain name.
     * @param Operate Bind or unbind operation option. valid values:.
<Li>`Bind`: bind the domain name to the policy template.</li>.
<li>unbind-keep-policy: unbind a domain name from the policy template while retaining the current policy.</li>.
<li>unbind-use-default: unbind a domain name from the policy template and use the default blank policy.</li> note: the unbinding operation currently only supports unbinding a single domain name. that is, when the Operate parameter value is unbind-keep-policy or unbind-use-default, the Entities parameter list only supports filling in one domain name.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Specifies the ID of the policy template or the site global policy to be bound or unbound.
<li>To bind to a policy template, or unbind from it, specify the policy template ID.</li>.
<li>To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.</li>.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding. 
     * @return TemplateId Specifies the ID of the policy template or the site global policy to be bound or unbound.
<li>To bind to a policy template, or unbind from it, specify the policy template ID.</li>.
<li>To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.</li>.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Specifies the ID of the policy template or the site global policy to be bound or unbound.
<li>To bind to a policy template, or unbind from it, specify the policy template ID.</li>.
<li>To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.</li>.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
     * @param TemplateId Specifies the ID of the policy template or the site global policy to be bound or unbound.
<li>To bind to a policy template, or unbind from it, specify the policy template ID.</li>.
<li>To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.</li>.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get If the imported domain name has already been bound to a policy template (including a site-level security policy), this parameter indicates whether to replace the template by setting it. the default value is true. values: <li>`true`: replace the template currently bound to the domain.</li> <li>`false`: do not replace the template currently bound to the domain.</li> note: when set to false, if the imported domain name has already been bound to a policy template, the API will return an error; a site-level security policy is also a type of policy template. 
     * @return OverWrite If the imported domain name has already been bound to a policy template (including a site-level security policy), this parameter indicates whether to replace the template by setting it. the default value is true. values: <li>`true`: replace the template currently bound to the domain.</li> <li>`false`: do not replace the template currently bound to the domain.</li> note: when set to false, if the imported domain name has already been bound to a policy template, the API will return an error; a site-level security policy is also a type of policy template.
     */
    public Boolean getOverWrite() {
        return this.OverWrite;
    }

    /**
     * Set If the imported domain name has already been bound to a policy template (including a site-level security policy), this parameter indicates whether to replace the template by setting it. the default value is true. values: <li>`true`: replace the template currently bound to the domain.</li> <li>`false`: do not replace the template currently bound to the domain.</li> note: when set to false, if the imported domain name has already been bound to a policy template, the API will return an error; a site-level security policy is also a type of policy template.
     * @param OverWrite If the imported domain name has already been bound to a policy template (including a site-level security policy), this parameter indicates whether to replace the template by setting it. the default value is true. values: <li>`true`: replace the template currently bound to the domain.</li> <li>`false`: do not replace the template currently bound to the domain.</li> note: when set to false, if the imported domain name has already been bound to a policy template, the API will return an error; a site-level security policy is also a type of policy template.
     */
    public void setOverWrite(Boolean OverWrite) {
        this.OverWrite = OverWrite;
    }

    public BindSecurityTemplateToEntityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSecurityTemplateToEntityRequest(BindSecurityTemplateToEntityRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entities != null) {
            this.Entities = new String[source.Entities.length];
            for (int i = 0; i < source.Entities.length; i++) {
                this.Entities[i] = new String(source.Entities[i]);
            }
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.OverWrite != null) {
            this.OverWrite = new Boolean(source.OverWrite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "Entities.", this.Entities);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "OverWrite", this.OverWrite);

    }
}

