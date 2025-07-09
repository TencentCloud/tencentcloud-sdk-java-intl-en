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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAccountSummaryResponse extends AbstractModel {

    /**
    * Number of policies
    */
    @SerializedName("Policies")
    @Expose
    private Long Policies;

    /**
    * Number of roles
    */
    @SerializedName("Roles")
    @Expose
    private Long Roles;

    /**
    * Number of identity providers
    */
    @SerializedName("Idps")
    @Expose
    private Long Idps;

    /**
    * Number of sub-accounts
    */
    @SerializedName("User")
    @Expose
    private Long User;

    /**
    * Number of groups
    */
    @SerializedName("Group")
    @Expose
    private Long Group;

    /**
    * Total number of grouped users
    */
    @SerializedName("Member")
    @Expose
    private Long Member;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of policies 
     * @return Policies Number of policies
     */
    public Long getPolicies() {
        return this.Policies;
    }

    /**
     * Set Number of policies
     * @param Policies Number of policies
     */
    public void setPolicies(Long Policies) {
        this.Policies = Policies;
    }

    /**
     * Get Number of roles 
     * @return Roles Number of roles
     */
    public Long getRoles() {
        return this.Roles;
    }

    /**
     * Set Number of roles
     * @param Roles Number of roles
     */
    public void setRoles(Long Roles) {
        this.Roles = Roles;
    }

    /**
     * Get Number of identity providers 
     * @return Idps Number of identity providers
     */
    public Long getIdps() {
        return this.Idps;
    }

    /**
     * Set Number of identity providers
     * @param Idps Number of identity providers
     */
    public void setIdps(Long Idps) {
        this.Idps = Idps;
    }

    /**
     * Get Number of sub-accounts 
     * @return User Number of sub-accounts
     */
    public Long getUser() {
        return this.User;
    }

    /**
     * Set Number of sub-accounts
     * @param User Number of sub-accounts
     */
    public void setUser(Long User) {
        this.User = User;
    }

    /**
     * Get Number of groups 
     * @return Group Number of groups
     */
    public Long getGroup() {
        return this.Group;
    }

    /**
     * Set Number of groups
     * @param Group Number of groups
     */
    public void setGroup(Long Group) {
        this.Group = Group;
    }

    /**
     * Get Total number of grouped users 
     * @return Member Total number of grouped users
     */
    public Long getMember() {
        return this.Member;
    }

    /**
     * Set Total number of grouped users
     * @param Member Total number of grouped users
     */
    public void setMember(Long Member) {
        this.Member = Member;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetAccountSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAccountSummaryResponse(GetAccountSummaryResponse source) {
        if (source.Policies != null) {
            this.Policies = new Long(source.Policies);
        }
        if (source.Roles != null) {
            this.Roles = new Long(source.Roles);
        }
        if (source.Idps != null) {
            this.Idps = new Long(source.Idps);
        }
        if (source.User != null) {
            this.User = new Long(source.User);
        }
        if (source.Group != null) {
            this.Group = new Long(source.Group);
        }
        if (source.Member != null) {
            this.Member = new Long(source.Member);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Policies", this.Policies);
        this.setParamSimple(map, prefix + "Roles", this.Roles);
        this.setParamSimple(map, prefix + "Idps", this.Idps);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Member", this.Member);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

