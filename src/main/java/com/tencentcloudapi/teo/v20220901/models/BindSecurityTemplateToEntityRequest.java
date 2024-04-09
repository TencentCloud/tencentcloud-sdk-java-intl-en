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
    * Action options. Values include:
<li>`bind`: Bind the domain names to the specified policy template </li>
<li>`unbind-keep-policy`: Unbind a domain name from a policy template and keep the current policy when unbinding</li>
<li>`unbind-use-default`: Unbind domain names from policy templates and use default blank policy.</li> Note: Only one domain name can be unbound at one time. When `Operate` is `unbind-keep-policy` or `unbind-use-default`, there can only be one domain name specified in `Entities`.
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * Specifies the ID of the policy template or the site's global policy to be bound or unbound.
- To bind to a policy template, or unbind from it, specify the policy template ID.
- To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Whether to replace the existing policy template bound with the domain name. Values: 
<li>`true`: Replace the template bound to the domain. </li>
<li>`false`: Do not replace the template.</li> Note: In this case, the API returns an error if there is already a policy template bound to the specified domain name.
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
     * Get Action options. Values include:
<li>`bind`: Bind the domain names to the specified policy template </li>
<li>`unbind-keep-policy`: Unbind a domain name from a policy template and keep the current policy when unbinding</li>
<li>`unbind-use-default`: Unbind domain names from policy templates and use default blank policy.</li> Note: Only one domain name can be unbound at one time. When `Operate` is `unbind-keep-policy` or `unbind-use-default`, there can only be one domain name specified in `Entities`. 
     * @return Operate Action options. Values include:
<li>`bind`: Bind the domain names to the specified policy template </li>
<li>`unbind-keep-policy`: Unbind a domain name from a policy template and keep the current policy when unbinding</li>
<li>`unbind-use-default`: Unbind domain names from policy templates and use default blank policy.</li> Note: Only one domain name can be unbound at one time. When `Operate` is `unbind-keep-policy` or `unbind-use-default`, there can only be one domain name specified in `Entities`.
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set Action options. Values include:
<li>`bind`: Bind the domain names to the specified policy template </li>
<li>`unbind-keep-policy`: Unbind a domain name from a policy template and keep the current policy when unbinding</li>
<li>`unbind-use-default`: Unbind domain names from policy templates and use default blank policy.</li> Note: Only one domain name can be unbound at one time. When `Operate` is `unbind-keep-policy` or `unbind-use-default`, there can only be one domain name specified in `Entities`.
     * @param Operate Action options. Values include:
<li>`bind`: Bind the domain names to the specified policy template </li>
<li>`unbind-keep-policy`: Unbind a domain name from a policy template and keep the current policy when unbinding</li>
<li>`unbind-use-default`: Unbind domain names from policy templates and use default blank policy.</li> Note: Only one domain name can be unbound at one time. When `Operate` is `unbind-keep-policy` or `unbind-use-default`, there can only be one domain name specified in `Entities`.
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Specifies the ID of the policy template or the site's global policy to be bound or unbound.
- To bind to a policy template, or unbind from it, specify the policy template ID.
- To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding. 
     * @return TemplateId Specifies the ID of the policy template or the site's global policy to be bound or unbound.
- To bind to a policy template, or unbind from it, specify the policy template ID.
- To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Specifies the ID of the policy template or the site's global policy to be bound or unbound.
- To bind to a policy template, or unbind from it, specify the policy template ID.
- To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
     * @param TemplateId Specifies the ID of the policy template or the site's global policy to be bound or unbound.
- To bind to a policy template, or unbind from it, specify the policy template ID.
- To bind to the site's global policy, or unbind from it, use the @ZoneLevel@domain parameter value.

Note: After unbinding, the domain name will use an independent policy and rule quota will be calculated separately. Please make sure there is sufficient rule quota before unbinding.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Whether to replace the existing policy template bound with the domain name. Values: 
<li>`true`: Replace the template bound to the domain. </li>
<li>`false`: Do not replace the template.</li> Note: In this case, the API returns an error if there is already a policy template bound to the specified domain name. 
     * @return OverWrite Whether to replace the existing policy template bound with the domain name. Values: 
<li>`true`: Replace the template bound to the domain. </li>
<li>`false`: Do not replace the template.</li> Note: In this case, the API returns an error if there is already a policy template bound to the specified domain name.
     */
    public Boolean getOverWrite() {
        return this.OverWrite;
    }

    /**
     * Set Whether to replace the existing policy template bound with the domain name. Values: 
<li>`true`: Replace the template bound to the domain. </li>
<li>`false`: Do not replace the template.</li> Note: In this case, the API returns an error if there is already a policy template bound to the specified domain name.
     * @param OverWrite Whether to replace the existing policy template bound with the domain name. Values: 
<li>`true`: Replace the template bound to the domain. </li>
<li>`false`: Do not replace the template.</li> Note: In this case, the API returns an error if there is already a policy template bound to the specified domain name.
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

