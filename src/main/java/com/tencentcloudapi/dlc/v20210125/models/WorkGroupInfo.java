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

public class WorkGroupInfo extends AbstractModel {

    /**
    * Unique ID of the working group that have been queried
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
    * Number of users associated with working groups
    */
    @SerializedName("UserNum")
    @Expose
    private Long UserNum;

    /**
    * Collection of users associated with working groups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserSet")
    @Expose
    private UserMessage [] UserSet;

    /**
    * Collections of permissions bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * Creators of working groups
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
     * Get Unique ID of the working group that have been queried 
     * @return WorkGroupId Unique ID of the working group that have been queried
     */
    public Long getWorkGroupId() {
        return this.WorkGroupId;
    }

    /**
     * Set Unique ID of the working group that have been queried
     * @param WorkGroupId Unique ID of the working group that have been queried
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
     * Get Number of users associated with working groups 
     * @return UserNum Number of users associated with working groups
     */
    public Long getUserNum() {
        return this.UserNum;
    }

    /**
     * Set Number of users associated with working groups
     * @param UserNum Number of users associated with working groups
     */
    public void setUserNum(Long UserNum) {
        this.UserNum = UserNum;
    }

    /**
     * Get Collection of users associated with working groups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserSet Collection of users associated with working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UserMessage [] getUserSet() {
        return this.UserSet;
    }

    /**
     * Set Collection of users associated with working groups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserSet Collection of users associated with working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserSet(UserMessage [] UserSet) {
        this.UserSet = UserSet;
    }

    /**
     * Get Collections of permissions bound to working groups
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicySet Collections of permissions bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set Collections of permissions bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicySet Collections of permissions bound to working groups
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get Creators of working groups 
     * @return Creator Creators of working groups
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creators of working groups
     * @param Creator Creators of working groups
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

    public WorkGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkGroupInfo(WorkGroupInfo source) {
        if (source.WorkGroupId != null) {
            this.WorkGroupId = new Long(source.WorkGroupId);
        }
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.UserNum != null) {
            this.UserNum = new Long(source.UserNum);
        }
        if (source.UserSet != null) {
            this.UserSet = new UserMessage[source.UserSet.length];
            for (int i = 0; i < source.UserSet.length; i++) {
                this.UserSet[i] = new UserMessage(source.UserSet[i]);
            }
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
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
        this.setParamSimple(map, prefix + "UserNum", this.UserNum);
        this.setParamArrayObj(map, prefix + "UserSet.", this.UserSet);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

