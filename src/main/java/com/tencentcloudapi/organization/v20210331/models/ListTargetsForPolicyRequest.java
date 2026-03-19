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

public class ListTargetsForPolicyRequest extends AbstractModel {

    /**
    * Policy ID.
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Items per page, which should be greater than 0 and less than or equal to 200. The default value is 20.
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * Page number, which starts from 1 and cannot exceed 200. The default value is 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Policy type. Valid values: All, User, and Node.
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Search by multiple policy IDs, separated by spaces.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Policy ID. 
     * @return PolicyId Policy ID.
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID.
     * @param PolicyId Policy ID.
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Items per page, which should be greater than 0 and less than or equal to 200. The default value is 20. 
     * @return Rp Items per page, which should be greater than 0 and less than or equal to 200. The default value is 20.
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set Items per page, which should be greater than 0 and less than or equal to 200. The default value is 20.
     * @param Rp Items per page, which should be greater than 0 and less than or equal to 200. The default value is 20.
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get Page number, which starts from 1 and cannot exceed 200. The default value is 1. 
     * @return Page Page number, which starts from 1 and cannot exceed 200. The default value is 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, which starts from 1 and cannot exceed 200. The default value is 1.
     * @param Page Page number, which starts from 1 and cannot exceed 200. The default value is 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Policy type. Valid values: All, User, and Node. 
     * @return TargetType Policy type. Valid values: All, User, and Node.
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set Policy type. Valid values: All, User, and Node.
     * @param TargetType Policy type. Valid values: All, User, and Node.
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY. 
     * @return PolicyType Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     * @param PolicyType Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Search by multiple policy IDs, separated by spaces. 
     * @return Keyword Search by multiple policy IDs, separated by spaces.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search by multiple policy IDs, separated by spaces.
     * @param Keyword Search by multiple policy IDs, separated by spaces.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListTargetsForPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTargetsForPolicyRequest(ListTargetsForPolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

