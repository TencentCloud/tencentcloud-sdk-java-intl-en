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

public class WorkGroupDetailInfo extends AbstractModel {

    /**
    * Working group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * Working group name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkGroupName")
    @Expose
    private String WorkGroupName;

    /**
    * Types of information included. User: user information; DataAuth: data permissions; EngineAuth: engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Collection of users bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserInfo")
    @Expose
    private Users UserInfo;

    /**
    * Collection of data permissions
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
    * Working group description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkGroupDescription")
    @Expose
    private String WorkGroupDescription;

    /**
    * Collection of information about filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RowFilterInfo")
    @Expose
    private Policys RowFilterInfo;

    /**
     * Get Working group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkGroupId Working group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set Working group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkGroupId Working group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get Working group name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkGroupName Working group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkGroupName() {
        return this.WorkGroupName;
    }

    /**
     * Set Working group name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkGroupName Working group name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkGroupName(String WorkGroupName) {
        this.WorkGroupName = WorkGroupName;
    }

    /**
     * Get Types of information included. User: user information; DataAuth: data permissions; EngineAuth: engine permissions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Types of information included. User: user information; DataAuth: data permissions; EngineAuth: engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Types of information included. User: user information; DataAuth: data permissions; EngineAuth: engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Types of information included. User: user information; DataAuth: data permissions; EngineAuth: engine permissions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Collection of users bound to working groups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserInfo Collection of users bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Users getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set Collection of users bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserInfo Collection of users bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserInfo(Users UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get Collection of data permissions
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataPolicyInfo Collection of data permissions
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policys getDataPolicyInfo() {
        return this.DataPolicyInfo;
    }

    /**
     * Set Collection of data permissions
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataPolicyInfo Collection of data permissions
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
     * Get Working group description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkGroupDescription Working group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkGroupDescription() {
        return this.WorkGroupDescription;
    }

    /**
     * Set Working group description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkGroupDescription Working group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkGroupDescription(String WorkGroupDescription) {
        this.WorkGroupDescription = WorkGroupDescription;
    }

    /**
     * Get Collection of information about filtered rows
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RowFilterInfo Collection of information about filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policys getRowFilterInfo() {
        return this.RowFilterInfo;
    }

    /**
     * Set Collection of information about filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RowFilterInfo Collection of information about filtered rows
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRowFilterInfo(Policys RowFilterInfo) {
        this.RowFilterInfo = RowFilterInfo;
    }

    public WorkGroupDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkGroupDetailInfo(WorkGroupDetailInfo source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new Users(source.UserInfo);
        }
        if (source.DataPolicyInfo != null) {
            this.DataPolicyInfo = new Policys(source.DataPolicyInfo);
        }
        if (source.EnginePolicyInfo != null) {
            this.EnginePolicyInfo = new Policys(source.EnginePolicyInfo);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.RowFilterInfo != null) {
            this.RowFilterInfo = new Policys(source.RowFilterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamSimple(map, prefix + "WorkGroupName", this.WorkGroupName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "DataPolicyInfo.", this.DataPolicyInfo);
        this.setParamObj(map, prefix + "EnginePolicyInfo.", this.EnginePolicyInfo);
        this.setParamSimple(map, prefix + "WorkGroupDescription", this.WorkGroupDescription);
        this.setParamObj(map, prefix + "RowFilterInfo.", this.RowFilterInfo);

    }
}

