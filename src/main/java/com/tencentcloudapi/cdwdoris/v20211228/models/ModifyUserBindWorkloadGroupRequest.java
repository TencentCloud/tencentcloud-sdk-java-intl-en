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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserBindWorkloadGroupRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * The user information of the resource group needs to be bound. If an account has information of multiple hosts, all information needs to be uploaded.
    */
    @SerializedName("BindUsers")
    @Expose
    private BindUser [] BindUsers;

    /**
    * Name of the resource group bound before modification
    */
    @SerializedName("OldWorkloadGroupName")
    @Expose
    private String OldWorkloadGroupName;

    /**
    * Name of the resource group bound after modification
    */
    @SerializedName("NewWorkloadGroupName")
    @Expose
    private String NewWorkloadGroupName;

    /**
     * Get Cluster ID 
     * @return InstanceId Cluster ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID
     * @param InstanceId Cluster ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get The user information of the resource group needs to be bound. If an account has information of multiple hosts, all information needs to be uploaded. 
     * @return BindUsers The user information of the resource group needs to be bound. If an account has information of multiple hosts, all information needs to be uploaded.
     */
    public BindUser [] getBindUsers() {
        return this.BindUsers;
    }

    /**
     * Set The user information of the resource group needs to be bound. If an account has information of multiple hosts, all information needs to be uploaded.
     * @param BindUsers The user information of the resource group needs to be bound. If an account has information of multiple hosts, all information needs to be uploaded.
     */
    public void setBindUsers(BindUser [] BindUsers) {
        this.BindUsers = BindUsers;
    }

    /**
     * Get Name of the resource group bound before modification 
     * @return OldWorkloadGroupName Name of the resource group bound before modification
     */
    public String getOldWorkloadGroupName() {
        return this.OldWorkloadGroupName;
    }

    /**
     * Set Name of the resource group bound before modification
     * @param OldWorkloadGroupName Name of the resource group bound before modification
     */
    public void setOldWorkloadGroupName(String OldWorkloadGroupName) {
        this.OldWorkloadGroupName = OldWorkloadGroupName;
    }

    /**
     * Get Name of the resource group bound after modification 
     * @return NewWorkloadGroupName Name of the resource group bound after modification
     */
    public String getNewWorkloadGroupName() {
        return this.NewWorkloadGroupName;
    }

    /**
     * Set Name of the resource group bound after modification
     * @param NewWorkloadGroupName Name of the resource group bound after modification
     */
    public void setNewWorkloadGroupName(String NewWorkloadGroupName) {
        this.NewWorkloadGroupName = NewWorkloadGroupName;
    }

    public ModifyUserBindWorkloadGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserBindWorkloadGroupRequest(ModifyUserBindWorkloadGroupRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BindUsers != null) {
            this.BindUsers = new BindUser[source.BindUsers.length];
            for (int i = 0; i < source.BindUsers.length; i++) {
                this.BindUsers[i] = new BindUser(source.BindUsers[i]);
            }
        }
        if (source.OldWorkloadGroupName != null) {
            this.OldWorkloadGroupName = new String(source.OldWorkloadGroupName);
        }
        if (source.NewWorkloadGroupName != null) {
            this.NewWorkloadGroupName = new String(source.NewWorkloadGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "BindUsers.", this.BindUsers);
        this.setParamSimple(map, prefix + "OldWorkloadGroupName", this.OldWorkloadGroupName);
        this.setParamSimple(map, prefix + "NewWorkloadGroupName", this.NewWorkloadGroupName);

    }
}

