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

public class Space extends AbstractModel {

    /**
    * <p>Space id</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Space name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Space description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Space permissions</p>
    */
    @SerializedName("PermissionIdList")
    @Expose
    private String [] PermissionIdList;

    /**
    * <p>Creation time.</p><p>Parameter format: timestamp in seconds</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time</p><p>Parameter format: timestamp</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Space id</p> 
     * @return SpaceId <p>Space id</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space id</p>
     * @param SpaceId <p>Space id</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Space name</p> 
     * @return Name <p>Space name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Space name</p>
     * @param Name <p>Space name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Space description.</p> 
     * @return Description <p>Space description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Space description.</p>
     * @param Description <p>Space description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Space permissions</p> 
     * @return PermissionIdList <p>Space permissions</p>
     */
    public String [] getPermissionIdList() {
        return this.PermissionIdList;
    }

    /**
     * Set <p>Space permissions</p>
     * @param PermissionIdList <p>Space permissions</p>
     */
    public void setPermissionIdList(String [] PermissionIdList) {
        this.PermissionIdList = PermissionIdList;
    }

    /**
     * Get <p>Creation time.</p><p>Parameter format: timestamp in seconds</p> 
     * @return CreateTime <p>Creation time.</p><p>Parameter format: timestamp in seconds</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p><p>Parameter format: timestamp in seconds</p>
     * @param CreateTime <p>Creation time.</p><p>Parameter format: timestamp in seconds</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Update time</p><p>Parameter format: timestamp</p> 
     * @return UpdateTime <p>Update time</p><p>Parameter format: timestamp</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time</p><p>Parameter format: timestamp</p>
     * @param UpdateTime <p>Update time</p><p>Parameter format: timestamp</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Space() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Space(Space source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PermissionIdList != null) {
            this.PermissionIdList = new String[source.PermissionIdList.length];
            for (int i = 0; i < source.PermissionIdList.length; i++) {
                this.PermissionIdList[i] = new String(source.PermissionIdList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "PermissionIdList.", this.PermissionIdList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

