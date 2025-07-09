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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDetailInfo extends AbstractModel {

    /**
    * User ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Types of returned information. Group: returned information about the working group where the current user is; DataAuth: returned information about the current user's data permission; EngineAuth: returned information about the current user's engine permission
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * User description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserDescription")
    @Expose
    private String UserDescription;

    /**
    * Collection of data permission information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataPolicyInfo")
    @Expose
    private Policys DataPolicyInfo;

    /**
    * Collection of engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnginePolicyInfo")
    @Expose
    private Policys EnginePolicyInfo;

    /**
    * Information about collections of working groups bound to the user
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkGroupInfo")
    @Expose
    private WorkGroups WorkGroupInfo;

    /**
    * User alias
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAlias")
    @Expose
    private String UserAlias;

    /**
    * Collection of filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowFilterInfo")
    @Expose
    private Policys RowFilterInfo;

    /**
     * Get User ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Types of returned information. Group: returned information about the working group where the current user is; DataAuth: returned information about the current user's data permission; EngineAuth: returned information about the current user's engine permission
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Types of returned information. Group: returned information about the working group where the current user is; DataAuth: returned information about the current user's data permission; EngineAuth: returned information about the current user's engine permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Types of returned information. Group: returned information about the working group where the current user is; DataAuth: returned information about the current user's data permission; EngineAuth: returned information about the current user's engine permission
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Types of returned information. Group: returned information about the working group where the current user is; DataAuth: returned information about the current user's data permission; EngineAuth: returned information about the current user's engine permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserType Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserType Types of users. ADMIN: administrators; COMMON: general users
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get User description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserDescription User description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserDescription() {
        return this.UserDescription;
    }

    /**
     * Set User description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserDescription User description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserDescription(String UserDescription) {
        this.UserDescription = UserDescription;
    }

    /**
     * Get Collection of data permission information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataPolicyInfo Collection of data permission information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policys getDataPolicyInfo() {
        return this.DataPolicyInfo;
    }

    /**
     * Set Collection of data permission information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataPolicyInfo Collection of data permission information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataPolicyInfo(Policys DataPolicyInfo) {
        this.DataPolicyInfo = DataPolicyInfo;
    }

    /**
     * Get Collection of engine permissions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnginePolicyInfo Collection of engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policys getEnginePolicyInfo() {
        return this.EnginePolicyInfo;
    }

    /**
     * Set Collection of engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnginePolicyInfo Collection of engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnginePolicyInfo(Policys EnginePolicyInfo) {
        this.EnginePolicyInfo = EnginePolicyInfo;
    }

    /**
     * Get Information about collections of working groups bound to the user
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkGroupInfo Information about collections of working groups bound to the user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public WorkGroups getWorkGroupInfo() {
        return this.WorkGroupInfo;
    }

    /**
     * Set Information about collections of working groups bound to the user
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkGroupInfo Information about collections of working groups bound to the user
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkGroupInfo(WorkGroups WorkGroupInfo) {
        this.WorkGroupInfo = WorkGroupInfo;
    }

    /**
     * Get User alias
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAlias User alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAlias() {
        return this.UserAlias;
    }

    /**
     * Set User alias
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAlias User alias
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAlias(String UserAlias) {
        this.UserAlias = UserAlias;
    }

    /**
     * Get Collection of filtered rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowFilterInfo Collection of filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policys getRowFilterInfo() {
        return this.RowFilterInfo;
    }

    /**
     * Set Collection of filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowFilterInfo Collection of filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowFilterInfo(Policys RowFilterInfo) {
        this.RowFilterInfo = RowFilterInfo;
    }

    public UserDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDetailInfo(UserDetailInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserDescription != null) {
            this.UserDescription = new String(source.UserDescription);
        }
        if (source.DataPolicyInfo != null) {
            this.DataPolicyInfo = new Policys(source.DataPolicyInfo);
        }
        if (source.EnginePolicyInfo != null) {
            this.EnginePolicyInfo = new Policys(source.EnginePolicyInfo);
        }
        if (source.WorkGroupInfo != null) {
            this.WorkGroupInfo = new WorkGroups(source.WorkGroupInfo);
        }
        if (source.UserAlias != null) {
            this.UserAlias = new String(source.UserAlias);
        }
        if (source.RowFilterInfo != null) {
            this.RowFilterInfo = new Policys(source.RowFilterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserDescription", this.UserDescription);
        this.setParamObj(map, prefix + "DataPolicyInfo.", this.DataPolicyInfo);
        this.setParamObj(map, prefix + "EnginePolicyInfo.", this.EnginePolicyInfo);
        this.setParamObj(map, prefix + "WorkGroupInfo.", this.WorkGroupInfo);
        this.setParamSimple(map, prefix + "UserAlias", this.UserAlias);
        this.setParamObj(map, prefix + "RowFilterInfo.", this.RowFilterInfo);

    }
}

