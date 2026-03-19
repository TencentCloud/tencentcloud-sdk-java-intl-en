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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePolicyRequest extends AbstractModel {

    /**
    * Policy ID that needs to be edited. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Policy description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Policy content. See the CAM policy syntax.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Policy name. The name is between one and 128 characters in length and can contain letters, digits, and underscores (_).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Policy ID that needs to be edited. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it. 
     * @return PolicyId Policy ID that needs to be edited. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID that needs to be edited. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.
     * @param PolicyId Policy ID that needs to be edited. you can call the [ListPolicies](https://www.tencentcloud.com/document/product/850/105311?from_cn_redirect=1) api to obtain it.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Policy description 
     * @return Description Policy description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Policy description
     * @param Description Policy description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Policy content. See the CAM policy syntax. 
     * @return Content Policy content. See the CAM policy syntax.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Policy content. See the CAM policy syntax.
     * @param Content Policy content. See the CAM policy syntax.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Policy name. The name is between one and 128 characters in length and can contain letters, digits, and underscores (_). 
     * @return Name Policy name. The name is between one and 128 characters in length and can contain letters, digits, and underscores (_).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name. The name is between one and 128 characters in length and can contain letters, digits, and underscores (_).
     * @param Name Policy name. The name is between one and 128 characters in length and can contain letters, digits, and underscores (_).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY. 
     * @return Type Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     * @param Type Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public UpdatePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePolicyRequest(UpdatePolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

