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

public class ListPoliciesRequest extends AbstractModel {

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
    * Query range. Valid values: All: all policies; QCS; only preset policies; Local: only custom policies. The default value is All.
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * Search keyword. Searches can be performed by policy name.
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Policy type. Valid values: SERVICE_CONTROL_POLICY: service control policy; TAG_POLICY: tag policy. The default value is SERVICE_CONTROL_POLICY.
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

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
     * Get Query range. Valid values: All: all policies; QCS; only preset policies; Local: only custom policies. The default value is All. 
     * @return Scope Query range. Valid values: All: all policies; QCS; only preset policies; Local: only custom policies. The default value is All.
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set Query range. Valid values: All: all policies; QCS; only preset policies; Local: only custom policies. The default value is All.
     * @param Scope Query range. Valid values: All: all policies; QCS; only preset policies; Local: only custom policies. The default value is All.
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Search keyword. Searches can be performed by policy name. 
     * @return Keyword Search keyword. Searches can be performed by policy name.
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search keyword. Searches can be performed by policy name.
     * @param Keyword Search keyword. Searches can be performed by policy name.
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
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

    public ListPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesRequest(ListPoliciesRequest source) {
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);

    }
}

