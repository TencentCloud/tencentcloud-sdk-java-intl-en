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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppSummary extends AbstractModel {

    /**
    * <p>Application ID.</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Application mode. Enumeration values: 1: standard mode, 2: Agent mode, 3: single workflow mode, 4: ClawAgent mode</p>
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * <p>Application avatar</p>
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * <p>Application name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Operation information</p>
    */
    @SerializedName("OperationInfo")
    @Expose
    private AppOperation OperationInfo;

    /**
    * <p>Status information</p>
    */
    @SerializedName("Status")
    @Expose
    private AppStatusInfo Status;

    /**
    * <p>Sub-status information</p>
    */
    @SerializedName("SubStatus")
    @Expose
    private AppSubStatusInfo SubStatus;

    /**
    * <p>Resource operation permissions</p>
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
    * <p>Application description information</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>Application ID.</p> 
     * @return AppId <p>Application ID.</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Application ID.</p>
     * @param AppId <p>Application ID.</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Application mode. Enumeration values: 1: standard mode, 2: Agent mode, 3: single workflow mode, 4: ClawAgent mode</p> 
     * @return AppMode <p>Application mode. Enumeration values: 1: standard mode, 2: Agent mode, 3: single workflow mode, 4: ClawAgent mode</p>
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>Application mode. Enumeration values: 1: standard mode, 2: Agent mode, 3: single workflow mode, 4: ClawAgent mode</p>
     * @param AppMode <p>Application mode. Enumeration values: 1: standard mode, 2: Agent mode, 3: single workflow mode, 4: ClawAgent mode</p>
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get <p>Application avatar</p> 
     * @return Avatar <p>Application avatar</p>
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set <p>Application avatar</p>
     * @param Avatar <p>Application avatar</p>
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get <p>Application name.</p> 
     * @return Name <p>Application name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Application name.</p>
     * @param Name <p>Application name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Operation information</p> 
     * @return OperationInfo <p>Operation information</p>
     */
    public AppOperation getOperationInfo() {
        return this.OperationInfo;
    }

    /**
     * Set <p>Operation information</p>
     * @param OperationInfo <p>Operation information</p>
     */
    public void setOperationInfo(AppOperation OperationInfo) {
        this.OperationInfo = OperationInfo;
    }

    /**
     * Get <p>Status information</p> 
     * @return Status <p>Status information</p>
     */
    public AppStatusInfo getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Status information</p>
     * @param Status <p>Status information</p>
     */
    public void setStatus(AppStatusInfo Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Sub-status information</p> 
     * @return SubStatus <p>Sub-status information</p>
     */
    public AppSubStatusInfo getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set <p>Sub-status information</p>
     * @param SubStatus <p>Sub-status information</p>
     */
    public void setSubStatus(AppSubStatusInfo SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get <p>Resource operation permissions</p> 
     * @return PermissionIdList <p>Resource operation permissions</p>
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set <p>Resource operation permissions</p>
     * @param PermissionIdList <p>Resource operation permissions</p>
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    /**
     * Get <p>Application description information</p> 
     * @return Description <p>Application description information</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Application description information</p>
     * @param Description <p>Application description information</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public AppSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppSummary(AppSummary source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OperationInfo != null) {
            this.OperationInfo = new AppOperation(source.OperationInfo);
        }
        if (source.Status != null) {
            this.Status = new AppStatusInfo(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new AppSubStatusInfo(source.SubStatus);
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "OperationInfo.", this.OperationInfo);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamObj(map, prefix + "SubStatus.", this.SubStatus);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

