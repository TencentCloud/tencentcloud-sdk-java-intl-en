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

public class Project extends AbstractModel {

    /**
    * Tenant ID of the project
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * Project IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Project Identifier, English Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Project Display Name, can be Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * RegionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * RemarksNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Creator
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Creator")
    @Expose
    private BaseUser Creator;

    /**
    * Tenant Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tenant")
    @Expose
    private BaseTenant Tenant;

    /**
    * Project Administrator
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("AdminUsers")
    @Expose
    private BaseUser [] AdminUsers;

    /**
    * Project-related cluster information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Clusters")
    @Expose
    private BaseClusterInfo [] Clusters;

    /**
    * Additional configuration parameters for the project
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * Project Status: 0: disabled, 1: enabled, -3: disabling, 2: enabling
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Project Type, SIMPLE: simple mode STANDARD: standard mode
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
     * Get Tenant ID of the project
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TenantId Tenant ID of the project
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set Tenant ID of the project
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TenantId Tenant ID of the project
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get Project IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectId Project IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project Identifier, English Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ProjectName Project Identifier, English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project Identifier, English Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ProjectName Project Identifier, English Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Project Display Name, can be Chinese Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DisplayName Project Display Name, can be Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Project Display Name, can be Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DisplayName Project Display Name, can be Chinese Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get RegionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Region RegionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set RegionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Region RegionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get RemarksNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description RemarksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set RemarksNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description RemarksNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Creator
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Creator Creator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public BaseUser getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Creator Creator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreator(BaseUser Creator) {
        this.Creator = Creator;
    }

    /**
     * Get Tenant Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Tenant Tenant Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public BaseTenant getTenant() {
        return this.Tenant;
    }

    /**
     * Set Tenant Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Tenant Tenant Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTenant(BaseTenant Tenant) {
        this.Tenant = Tenant;
    }

    /**
     * Get Project Administrator
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return AdminUsers Project Administrator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public BaseUser [] getAdminUsers() {
        return this.AdminUsers;
    }

    /**
     * Set Project Administrator
Note: This field may return null, indicating that no valid value can be obtained.
     * @param AdminUsers Project Administrator
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setAdminUsers(BaseUser [] AdminUsers) {
        this.AdminUsers = AdminUsers;
    }

    /**
     * Get Project-related cluster information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Clusters Project-related cluster information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public BaseClusterInfo [] getClusters() {
        return this.Clusters;
    }

    /**
     * Set Project-related cluster information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Clusters Project-related cluster information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setClusters(BaseClusterInfo [] Clusters) {
        this.Clusters = Clusters;
    }

    /**
     * Get Additional configuration parameters for the project
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Params Additional configuration parameters for the project
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set Additional configuration parameters for the project
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Params Additional configuration parameters for the project
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get Project Status: 0: disabled, 1: enabled, -3: disabling, 2: enabling 
     * @return Status Project Status: 0: disabled, 1: enabled, -3: disabling, 2: enabling
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Project Status: 0: disabled, 1: enabled, -3: disabling, 2: enabling
     * @param Status Project Status: 0: disabled, 1: enabled, -3: disabling, 2: enabling
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Project Type, SIMPLE: simple mode STANDARD: standard mode
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Model Project Type, SIMPLE: simple mode STANDARD: standard mode
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Project Type, SIMPLE: simple mode STANDARD: standard mode
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Model Project Type, SIMPLE: simple mode STANDARD: standard mode
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    public Project() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Project(Project source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new BaseUser(source.Creator);
        }
        if (source.Tenant != null) {
            this.Tenant = new BaseTenant(source.Tenant);
        }
        if (source.AdminUsers != null) {
            this.AdminUsers = new BaseUser[source.AdminUsers.length];
            for (int i = 0; i < source.AdminUsers.length; i++) {
                this.AdminUsers[i] = new BaseUser(source.AdminUsers[i]);
            }
        }
        if (source.Clusters != null) {
            this.Clusters = new BaseClusterInfo[source.Clusters.length];
            for (int i = 0; i < source.Clusters.length; i++) {
                this.Clusters[i] = new BaseClusterInfo(source.Clusters[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamObj(map, prefix + "Tenant.", this.Tenant);
        this.setParamArrayObj(map, prefix + "AdminUsers.", this.AdminUsers);
        this.setParamArrayObj(map, prefix + "Clusters.", this.Clusters);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Model", this.Model);

    }
}

