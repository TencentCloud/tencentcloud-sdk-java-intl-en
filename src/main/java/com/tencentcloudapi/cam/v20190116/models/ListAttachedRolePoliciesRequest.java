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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedRolePoliciesRequest extends AbstractModel {

    /**
    * Page number, beginning from 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Number of lines per page, no more than 200
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * Role ID, used to specify a role. Input either `RoleId` or `RoleName`
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name, used to specify a role. Input either `RoleId` or `RoleName`
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Filter according to policy type. `User` indicates querying custom policies only. `QCS` indicates querying preset policies only
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Search by keyword
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get Page number, beginning from 1 
     * @return Page Page number, beginning from 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number, beginning from 1
     * @param Page Page number, beginning from 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Number of lines per page, no more than 200 
     * @return Rp Number of lines per page, no more than 200
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set Number of lines per page, no more than 200
     * @param Rp Number of lines per page, no more than 200
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get Role ID, used to specify a role. Input either `RoleId` or `RoleName` 
     * @return RoleId Role ID, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role ID, used to specify a role. Input either `RoleId` or `RoleName`
     * @param RoleId Role ID, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name, used to specify a role. Input either `RoleId` or `RoleName` 
     * @return RoleName Role name, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name, used to specify a role. Input either `RoleId` or `RoleName`
     * @param RoleName Role name, used to specify a role. Input either `RoleId` or `RoleName`
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Filter according to policy type. `User` indicates querying custom policies only. `QCS` indicates querying preset policies only 
     * @return PolicyType Filter according to policy type. `User` indicates querying custom policies only. `QCS` indicates querying preset policies only
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Filter according to policy type. `User` indicates querying custom policies only. `QCS` indicates querying preset policies only
     * @param PolicyType Filter according to policy type. `User` indicates querying custom policies only. `QCS` indicates querying preset policies only
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Search by keyword 
     * @return Keyword Search by keyword
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Search by keyword
     * @param Keyword Search by keyword
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListAttachedRolePoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAttachedRolePoliciesRequest(ListAttachedRolePoliciesRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

