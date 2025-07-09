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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseRole extends AbstractModel {

    /**
    * Role id.
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * Role name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * Role nickname.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Description

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Role type divides into System, Tenant, Project, Commercial.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * System preset.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemDefault")
    @Expose
    private Boolean SystemDefault;

    /**
    * Custom parameter.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Specifies member statistics.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * Permission

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * Operator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Operator")
    @Expose
    private BaseUser Operator;

    /**
    * Operation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperateTime")
    @Expose
    private Long OperateTime;

    /**
    * Creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Creation time

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTimeStr")
    @Expose
    private String CreateTimeStr;

    /**
    * Update time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTimeStr")
    @Expose
    private String UpdateTimeStr;

    /**
    * Project ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Update time.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Creator

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
     * Get Role id. 
     * @return RoleId Role id.
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set Role id.
     * @param RoleId Role id.
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get Role name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleName Role name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set Role name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleName Role name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get Role nickname.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Role nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Role nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Role nickname.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Description

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Role type divides into System, Tenant, Project, Commercial.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RoleType Role type divides into System, Tenant, Project, Commercial.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set Role type divides into System, Tenant, Project, Commercial.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RoleType Role type divides into System, Tenant, Project, Commercial.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get System preset.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SystemDefault System preset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSystemDefault() {
        return this.SystemDefault;
    }

    /**
     * Set System preset.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SystemDefault System preset.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemDefault(Boolean SystemDefault) {
        this.SystemDefault = SystemDefault;
    }

    /**
     * Get Custom parameter.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Parameters Custom parameter.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameter.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Parameters Custom parameter.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Specifies member statistics.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MemberCount Specifies member statistics.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set Specifies member statistics.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MemberCount Specifies member statistics.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get Permission

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Privileges Permission

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set Permission

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Privileges Permission

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get Operator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Operator Operator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BaseUser getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Operator Operator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperator(BaseUser Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Operation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperateTime Operation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOperateTime() {
        return this.OperateTime;
    }

    /**
     * Set Operation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperateTime Operation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperateTime(Long OperateTime) {
        this.OperateTime = OperateTime;
    }

    /**
     * Get Creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creation time

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTimeStr Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTimeStr() {
        return this.CreateTimeStr;
    }

    /**
     * Set Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTimeStr Creation time

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTimeStr(String CreateTimeStr) {
        this.CreateTimeStr = CreateTimeStr;
    }

    /**
     * Get Update time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTimeStr Update time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTimeStr() {
        return this.UpdateTimeStr;
    }

    /**
     * Set Update time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTimeStr Update time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTimeStr(String UpdateTimeStr) {
        this.UpdateTimeStr = UpdateTimeStr;
    }

    /**
     * Get Project ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Project ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Update time.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Creator

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Creator Creator

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Creator Creator

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    public BaseRole() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseRole(BaseRole source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.SystemDefault != null) {
            this.SystemDefault = new Boolean(source.SystemDefault);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.Privileges != null) {
            this.Privileges = new RolePrivilege[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new RolePrivilege(source.Privileges[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new BaseUser(source.Operator);
        }
        if (source.OperateTime != null) {
            this.OperateTime = new Long(source.OperateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.CreateTimeStr != null) {
            this.CreateTimeStr = new String(source.CreateTimeStr);
        }
        if (source.UpdateTimeStr != null) {
            this.UpdateTimeStr = new String(source.UpdateTimeStr);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "SystemDefault", this.SystemDefault);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "OperateTime", this.OperateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateTimeStr", this.CreateTimeStr);
        this.setParamSimple(map, prefix + "UpdateTimeStr", this.UpdateTimeStr);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);

    }
}

