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

public class PrivilegeInfo extends AbstractModel {

    /**
    * Permission name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Display name of the permission.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * Permission description.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether read permission.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsRead")
    @Expose
    private Boolean IsRead;

    /**
    * Whether it is a management permission.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsManage")
    @Expose
    private Boolean IsManage;

    /**
    * Checks whether the permission is available. used when checking permissions.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Granted")
    @Expose
    private Boolean Granted;

    /**
    * Specifies the resource it inherits from. used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InheritedObject")
    @Expose
    private PrivilegeResource InheritedObject;

    /**
    * Not inheritable, used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Inherited")
    @Expose
    private Boolean Inherited;

    /**
    * Whether edit permission.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsEdit")
    @Expose
    private Boolean IsEdit;

    /**
    * Whether metadata permissions (displayed on the front-end).
    */
    @SerializedName("IsMetaDataPermission")
    @Expose
    private Boolean IsMetaDataPermission;

    /**
    * CatalogID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CatalogID")
    @Expose
    private String CatalogID;

    /**
    * catalog name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * Space ID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkSpaceID")
    @Expose
    private String WorkSpaceID;

    /**
    * Space name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkSpaceName")
    @Expose
    private String WorkSpaceName;

    /**
     * Get Permission name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Permission name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Permission name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Permission name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Display name of the permission.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DisplayName Display name of the permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set Display name of the permission.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DisplayName Display name of the permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get Permission description.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Permission description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Permission description.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Permission description.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether read permission.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsRead Whether read permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsRead() {
        return this.IsRead;
    }

    /**
     * Set Whether read permission.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsRead Whether read permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsRead(Boolean IsRead) {
        this.IsRead = IsRead;
    }

    /**
     * Get Whether it is a management permission.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsManage Whether it is a management permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsManage() {
        return this.IsManage;
    }

    /**
     * Set Whether it is a management permission.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsManage Whether it is a management permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsManage(Boolean IsManage) {
        this.IsManage = IsManage;
    }

    /**
     * Get Checks whether the permission is available. used when checking permissions.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Granted Checks whether the permission is available. used when checking permissions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getGranted() {
        return this.Granted;
    }

    /**
     * Set Checks whether the permission is available. used when checking permissions.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Granted Checks whether the permission is available. used when checking permissions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGranted(Boolean Granted) {
        this.Granted = Granted;
    }

    /**
     * Get Specifies the resource it inherits from. used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InheritedObject Specifies the resource it inherits from. used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrivilegeResource getInheritedObject() {
        return this.InheritedObject;
    }

    /**
     * Set Specifies the resource it inherits from. used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InheritedObject Specifies the resource it inherits from. used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInheritedObject(PrivilegeResource InheritedObject) {
        this.InheritedObject = InheritedObject;
    }

    /**
     * Get Not inheritable, used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Inherited Not inheritable, used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getInherited() {
        return this.Inherited;
    }

    /**
     * Set Not inheritable, used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Inherited Not inheritable, used when querying permission details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInherited(Boolean Inherited) {
        this.Inherited = Inherited;
    }

    /**
     * Get Whether edit permission.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsEdit Whether edit permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsEdit() {
        return this.IsEdit;
    }

    /**
     * Set Whether edit permission.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsEdit Whether edit permission.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsEdit(Boolean IsEdit) {
        this.IsEdit = IsEdit;
    }

    /**
     * Get Whether metadata permissions (displayed on the front-end). 
     * @return IsMetaDataPermission Whether metadata permissions (displayed on the front-end).
     */
    public Boolean getIsMetaDataPermission() {
        return this.IsMetaDataPermission;
    }

    /**
     * Set Whether metadata permissions (displayed on the front-end).
     * @param IsMetaDataPermission Whether metadata permissions (displayed on the front-end).
     */
    public void setIsMetaDataPermission(Boolean IsMetaDataPermission) {
        this.IsMetaDataPermission = IsMetaDataPermission;
    }

    /**
     * Get CatalogID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CatalogID CatalogID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalogID() {
        return this.CatalogID;
    }

    /**
     * Set CatalogID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CatalogID CatalogID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalogID(String CatalogID) {
        this.CatalogID = CatalogID;
    }

    /**
     * Get catalog name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CatalogName catalog name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CatalogName catalog name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get Space ID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkSpaceID Space ID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkSpaceID() {
        return this.WorkSpaceID;
    }

    /**
     * Set Space ID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkSpaceID Space ID (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkSpaceID(String WorkSpaceID) {
        this.WorkSpaceID = WorkSpaceID;
    }

    /**
     * Get Space name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WorkSpaceName Space name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWorkSpaceName() {
        return this.WorkSpaceName;
    }

    /**
     * Set Space name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WorkSpaceName Space name (deprecated).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWorkSpaceName(String WorkSpaceName) {
        this.WorkSpaceName = WorkSpaceName;
    }

    public PrivilegeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeInfo(PrivilegeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsRead != null) {
            this.IsRead = new Boolean(source.IsRead);
        }
        if (source.IsManage != null) {
            this.IsManage = new Boolean(source.IsManage);
        }
        if (source.Granted != null) {
            this.Granted = new Boolean(source.Granted);
        }
        if (source.InheritedObject != null) {
            this.InheritedObject = new PrivilegeResource(source.InheritedObject);
        }
        if (source.Inherited != null) {
            this.Inherited = new Boolean(source.Inherited);
        }
        if (source.IsEdit != null) {
            this.IsEdit = new Boolean(source.IsEdit);
        }
        if (source.IsMetaDataPermission != null) {
            this.IsMetaDataPermission = new Boolean(source.IsMetaDataPermission);
        }
        if (source.CatalogID != null) {
            this.CatalogID = new String(source.CatalogID);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.WorkSpaceID != null) {
            this.WorkSpaceID = new String(source.WorkSpaceID);
        }
        if (source.WorkSpaceName != null) {
            this.WorkSpaceName = new String(source.WorkSpaceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsRead", this.IsRead);
        this.setParamSimple(map, prefix + "IsManage", this.IsManage);
        this.setParamSimple(map, prefix + "Granted", this.Granted);
        this.setParamObj(map, prefix + "InheritedObject.", this.InheritedObject);
        this.setParamSimple(map, prefix + "Inherited", this.Inherited);
        this.setParamSimple(map, prefix + "IsEdit", this.IsEdit);
        this.setParamSimple(map, prefix + "IsMetaDataPermission", this.IsMetaDataPermission);
        this.setParamSimple(map, prefix + "CatalogID", this.CatalogID);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "WorkSpaceID", this.WorkSpaceID);
        this.setParamSimple(map, prefix + "WorkSpaceName", this.WorkSpaceName);

    }
}

