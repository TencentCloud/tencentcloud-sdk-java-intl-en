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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Project extends AbstractModel{

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * The UIN of the resource owner (root account)
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * Application ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Project name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Creator UIN
    */
    @SerializedName("CreatorUin")
    @Expose
    private Long CreatorUin;

    /**
    * Source platform
    */
    @SerializedName("SrcPlat")
    @Expose
    private String SrcPlat;

    /**
    * Source APPID
    */
    @SerializedName("SrcAppId")
    @Expose
    private Long SrcAppId;

    /**
    * Project status. Valid values: `0` (normal), `-1` (disabled), `3` (default project).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether it is the default project. Valid values: `1` (yes), `0` (no).
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * Description
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get The UIN of the resource owner (root account) 
     * @return OwnerUin The UIN of the resource owner (root account)
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set The UIN of the resource owner (root account)
     * @param OwnerUin The UIN of the resource owner (root account)
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get Application ID 
     * @return AppId Application ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Application ID
     * @param AppId Application ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Project name 
     * @return Name Project name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Project name
     * @param Name Project name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Creator UIN 
     * @return CreatorUin Creator UIN
     */
    public Long getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set Creator UIN
     * @param CreatorUin Creator UIN
     */
    public void setCreatorUin(Long CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get Source platform 
     * @return SrcPlat Source platform
     */
    public String getSrcPlat() {
        return this.SrcPlat;
    }

    /**
     * Set Source platform
     * @param SrcPlat Source platform
     */
    public void setSrcPlat(String SrcPlat) {
        this.SrcPlat = SrcPlat;
    }

    /**
     * Get Source APPID 
     * @return SrcAppId Source APPID
     */
    public Long getSrcAppId() {
        return this.SrcAppId;
    }

    /**
     * Set Source APPID
     * @param SrcAppId Source APPID
     */
    public void setSrcAppId(Long SrcAppId) {
        this.SrcAppId = SrcAppId;
    }

    /**
     * Get Project status. Valid values: `0` (normal), `-1` (disabled), `3` (default project). 
     * @return Status Project status. Valid values: `0` (normal), `-1` (disabled), `3` (default project).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Project status. Valid values: `0` (normal), `-1` (disabled), `3` (default project).
     * @param Status Project status. Valid values: `0` (normal), `-1` (disabled), `3` (default project).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether it is the default project. Valid values: `1` (yes), `0` (no). 
     * @return IsDefault Whether it is the default project. Valid values: `1` (yes), `0` (no).
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether it is the default project. Valid values: `1` (yes), `0` (no).
     * @param IsDefault Whether it is the default project. Valid values: `1` (yes), `0` (no).
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get Description 
     * @return Info Description
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * Set Description
     * @param Info Description
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "SrcPlat", this.SrcPlat);
        this.setParamSimple(map, prefix + "SrcAppId", this.SrcAppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "Info", this.Info);

    }
}

