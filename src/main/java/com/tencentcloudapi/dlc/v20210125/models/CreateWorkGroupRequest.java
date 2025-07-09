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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWorkGroupRequest extends AbstractModel {

    /**
    * Working group name
    */
    @SerializedName("WorkGroupName")
    @Expose
    private String WorkGroupName;

    /**
    * Working group description
    */
    @SerializedName("WorkGroupDescription")
    @Expose
    private String WorkGroupDescription;

    /**
    * Collections of authentication policies bound to working groups
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * Collection of IDs of users to be bound to working groups
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

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
     * @return WorkGroupDescription Working group description
     */
    public String getWorkGroupDescription() {
        return this.WorkGroupDescription;
    }

    /**
     * Set Working group description
     * @param WorkGroupDescription Working group description
     */
    public void setWorkGroupDescription(String WorkGroupDescription) {
        this.WorkGroupDescription = WorkGroupDescription;
    }

    /**
     * Get Collections of authentication policies bound to working groups 
     * @return PolicySet Collections of authentication policies bound to working groups
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set Collections of authentication policies bound to working groups
     * @param PolicySet Collections of authentication policies bound to working groups
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get Collection of IDs of users to be bound to working groups 
     * @return UserIds Collection of IDs of users to be bound to working groups
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set Collection of IDs of users to be bound to working groups
     * @param UserIds Collection of IDs of users to be bound to working groups
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    public CreateWorkGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWorkGroupRequest(CreateWorkGroupRequest source) {
        if (source.WorkGroupName != null) {
            this.WorkGroupName = new String(source.WorkGroupName);
        }
        if (source.WorkGroupDescription != null) {
            this.WorkGroupDescription = new String(source.WorkGroupDescription);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkGroupName", this.WorkGroupName);
        this.setParamSimple(map, prefix + "WorkGroupDescription", this.WorkGroupDescription);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);

    }
}

