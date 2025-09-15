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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupsSTDRequest extends AbstractModel {

    /**
    * Cluster name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Batch user group information.
    */
    @SerializedName("Groups")
    @Expose
    private GroupInfo [] Groups;

    /**
     * Get Cluster name. 
     * @return InstanceId Cluster name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster name.
     * @param InstanceId Cluster name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Batch user group information. 
     * @return Groups Batch user group information.
     */
    public GroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set Batch user group information.
     * @param Groups Batch user group information.
     */
    public void setGroups(GroupInfo [] Groups) {
        this.Groups = Groups;
    }

    public CreateGroupsSTDRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupsSTDRequest(CreateGroupsSTDRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Groups != null) {
            this.Groups = new GroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GroupInfo(source.Groups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);

    }
}

