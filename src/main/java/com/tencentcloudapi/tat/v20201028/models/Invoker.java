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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Invoker extends AbstractModel {

    /**
    * Invoker ID.
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
    * Invoker name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Invoker type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Command ID.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Custom parameters.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Instance ID list.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Whether to enable the invoker.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Execution schedule of the invoker. This field is returned for recurring invokers.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Modification time.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get Invoker ID. 
     * @return InvokerId Invoker ID.
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set Invoker ID.
     * @param InvokerId Invoker ID.
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    /**
     * Get Invoker name. 
     * @return Name Invoker name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Invoker name.
     * @param Name Invoker name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Invoker type. 
     * @return Type Invoker type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Invoker type.
     * @param Type Invoker type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Command ID. 
     * @return CommandId Command ID.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Command ID.
     * @param CommandId Command ID.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Username. 
     * @return Username Username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username.
     * @param Username Username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Custom parameters. 
     * @return Parameters Custom parameters.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameters.
     * @param Parameters Custom parameters.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Instance ID list. 
     * @return InstanceIds Instance ID list.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list.
     * @param InstanceIds Instance ID list.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Whether to enable the invoker. 
     * @return Enable Whether to enable the invoker.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the invoker.
     * @param Enable Whether to enable the invoker.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Execution schedule of the invoker. This field is returned for recurring invokers.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ScheduleSettings Execution schedule of the invoker. This field is returned for recurring invokers.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set Execution schedule of the invoker. This field is returned for recurring invokers.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ScheduleSettings Execution schedule of the invoker. This field is returned for recurring invokers.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Modification time. 
     * @return UpdatedTime Modification time.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Modification time.
     * @param UpdatedTime Modification time.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public Invoker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Invoker(Invoker source) {
        if (source.InvokerId != null) {
            this.InvokerId = new String(source.InvokerId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokerId", this.InvokerId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

