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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkGroupMessage extends AbstractModel {

    /**
    * Unique ID of the working group
    */
    @SerializedName("WorkGroupId")
    @Expose
    private Long WorkGroupId;

    /**
    * Working group name
    */
    @SerializedName("WorkGroupName")
    @Expose
    private String WorkGroupName;

    /**
    * Working group description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WorkGroupDescription")
    @Expose
    private String WorkGroupDescription;

    /**
    * Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * The creation time of the working group, e.g. at 16:19:32 on Jul 28, 2021
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Unique ID of the working group 
     * @return WorkGroupId Unique ID of the working group
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set Unique ID of the working group
     * @param WorkGroupId Unique ID of the working group
     */
    public void setWorkGroupId(Long WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    /**
     * Get Working group name 
     * @return WorkGroupName Working group name
     */
    public String getWorkGroupName() {
        return this.WorkGroupName;
    }

    /**
     * Set Working group name
     * @param WorkGroupName Working group name
     */
    public void setWorkGroupName(String WorkGroupName) {
        this.WorkGroupName = WorkGroupName;
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
     * Get Creator 
     * @return Creator Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
     * @param Creator Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get The creation time of the working group, e.g. at 16:19:32 on Jul 28, 2021 
     * @return CreateTime The creation time of the working group, e.g. at 16:19:32 on Jul 28, 2021
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time of the working group, e.g. at 16:19:32 on Jul 28, 2021
     * @param CreateTime The creation time of the working group, e.g. at 16:19:32 on Jul 28, 2021
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public WorkGroupMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkGroupMessage(WorkGroupMessage source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupId", this.WorkGroupId);
        this.setParamSimple(map, prefix + "WorkGroupName", this.WorkGroupName);
        this.setParamSimple(map, prefix + "WorkGroupDescription", this.WorkGroupDescription);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

