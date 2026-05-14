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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * The time when the group is created, in ms.	
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The time when the group is updated, in ms.	
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Group description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Number of devices grouped in
    */
    @SerializedName("DeviceNum")
    @Expose
    private Long DeviceNum;

    /**
     * Get group ID 
     * @return GroupId group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set group ID
     * @param GroupId group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name 
     * @return GroupName Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name
     * @param GroupName Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get The time when the group is created, in ms.	 
     * @return CreateTime The time when the group is created, in ms.	
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The time when the group is created, in ms.	
     * @param CreateTime The time when the group is created, in ms.	
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The time when the group is updated, in ms.	 
     * @return UpdateTime The time when the group is updated, in ms.	
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The time when the group is updated, in ms.	
     * @param UpdateTime The time when the group is updated, in ms.	
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Group description 
     * @return Description Group description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Group description
     * @param Description Group description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Number of devices grouped in 
     * @return DeviceNum Number of devices grouped in
     */
    public Long getDeviceNum() {
        return this.DeviceNum;
    }

    /**
     * Set Number of devices grouped in
     * @param DeviceNum Number of devices grouped in
     */
    public void setDeviceNum(Long DeviceNum) {
        this.DeviceNum = DeviceNum;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DeviceNum != null) {
            this.DeviceNum = new Long(source.DeviceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DeviceNum", this.DeviceNum);

    }
}

