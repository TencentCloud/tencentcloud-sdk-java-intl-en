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

public class WebSecurityTemplates extends AbstractModel {

    /**
    * <p>ID of the policy template</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>Policy template name. It consists of Chinese, English, digits, and underscores. It cannot begin with an underscore and its length cannot exceed 32 characters.</p>
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>Policy settings of a policy template apply to all domain names associated with the template.</p>
    */
    @SerializedName("Policy")
    @Expose
    private SecurityPolicy Policy;

    /**
     * Get <p>ID of the policy template</p> 
     * @return TemplateId <p>ID of the policy template</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>ID of the policy template</p>
     * @param TemplateId <p>ID of the policy template</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>Policy template name. It consists of Chinese, English, digits, and underscores. It cannot begin with an underscore and its length cannot exceed 32 characters.</p> 
     * @return TemplateName <p>Policy template name. It consists of Chinese, English, digits, and underscores. It cannot begin with an underscore and its length cannot exceed 32 characters.</p>
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>Policy template name. It consists of Chinese, English, digits, and underscores. It cannot begin with an underscore and its length cannot exceed 32 characters.</p>
     * @param TemplateName <p>Policy template name. It consists of Chinese, English, digits, and underscores. It cannot begin with an underscore and its length cannot exceed 32 characters.</p>
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>Policy settings of a policy template apply to all domain names associated with the template.</p> 
     * @return Policy <p>Policy settings of a policy template apply to all domain names associated with the template.</p>
     */
    public SecurityPolicy getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>Policy settings of a policy template apply to all domain names associated with the template.</p>
     * @param Policy <p>Policy settings of a policy template apply to all domain names associated with the template.</p>
     */
    public void setPolicy(SecurityPolicy Policy) {
        this.Policy = Policy;
    }

    public WebSecurityTemplates() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebSecurityTemplates(WebSecurityTemplates source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Policy != null) {
            this.Policy = new SecurityPolicy(source.Policy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "Policy.", this.Policy);

    }
}

