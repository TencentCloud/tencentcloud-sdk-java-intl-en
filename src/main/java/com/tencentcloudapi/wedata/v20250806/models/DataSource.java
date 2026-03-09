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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSource extends AbstractModel {

    /**
    * Belonging project ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Data source type: enumeration value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Data source name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Data source display name for visual inspection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Data source description information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Affiliated project Name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Data source creator.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Updater
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyUser")
    @Expose
    private String ModifyUser;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Configuration message of data sources is stored in JSON KV. KV storage information varies based on data source type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProdConProperties")
    @Expose
    private String ProdConProperties;

    /**
    * Same as params content for developing data of data sources.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DevConProperties")
    @Expose
    private String DevConProperties;

    /**
    * Data source type.

-DB - custom definition source.
-CLUSTER --- system source.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
     * Get Belonging project ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectId Belonging project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Belonging project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectId Belonging project ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Data source ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Data source ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Data source type: enumeration value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Data source type: enumeration value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Data source type: enumeration value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Data source type: enumeration value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Data source name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Data source name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data source name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Data source name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Data source display name for visual inspection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Data source display name for visual inspection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Data source display name for visual inspection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Data source display name for visual inspection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Data source description information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Data source description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Data source description information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Data source description information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Affiliated project Name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Affiliated project Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Affiliated project Name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Affiliated project Name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Data source creator.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUser Data source creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Data source creator.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUser Data source creator.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Updater
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyUser Updater
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyUser() {
        return this.ModifyUser;
    }

    /**
     * Set Updater
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyUser Updater
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyUser(String ModifyUser) {
        this.ModifyUser = ModifyUser;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Configuration message of data sources is stored in JSON KV. KV storage information varies based on data source type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProdConProperties Configuration message of data sources is stored in JSON KV. KV storage information varies based on data source type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProdConProperties() {
        return this.ProdConProperties;
    }

    /**
     * Set Configuration message of data sources is stored in JSON KV. KV storage information varies based on data source type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProdConProperties Configuration message of data sources is stored in JSON KV. KV storage information varies based on data source type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProdConProperties(String ProdConProperties) {
        this.ProdConProperties = ProdConProperties;
    }

    /**
     * Get Same as params content for developing data of data sources.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DevConProperties Same as params content for developing data of data sources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDevConProperties() {
        return this.DevConProperties;
    }

    /**
     * Set Same as params content for developing data of data sources.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DevConProperties Same as params content for developing data of data sources.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDevConProperties(String DevConProperties) {
        this.DevConProperties = DevConProperties;
    }

    /**
     * Get Data source type.

-DB - custom definition source.
-CLUSTER --- system source.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Category Data source type.

-DB - custom definition source.
-CLUSTER --- system source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set Data source type.

-DB - custom definition source.
-CLUSTER --- system source.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Category Data source type.

-DB - custom definition source.
-CLUSTER --- system source.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    public DataSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSource(DataSource source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyUser != null) {
            this.ModifyUser = new String(source.ModifyUser);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ProdConProperties != null) {
            this.ProdConProperties = new String(source.ProdConProperties);
        }
        if (source.DevConProperties != null) {
            this.DevConProperties = new String(source.DevConProperties);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyUser", this.ModifyUser);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ProdConProperties", this.ProdConProperties);
        this.setParamSimple(map, prefix + "DevConProperties", this.DevConProperties);
        this.setParamSimple(map, prefix + "Category", this.Category);

    }
}

