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

public class ModifyInvokerRequest extends AbstractModel {

    /**
    * ID of the invoker to be modified.
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
    * Name of the invoker to be modified.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Invoker type. It can only be `SCHEDULE` (recurring invokers).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ID of the command to be modified.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * The username to be modified.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Custom parameters to be modified.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * List of instance IDs to be modified. Up to 100 IDs are allowed.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Scheduled invoker settings to be modified.
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
     * Get ID of the invoker to be modified. 
     * @return InvokerId ID of the invoker to be modified.
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set ID of the invoker to be modified.
     * @param InvokerId ID of the invoker to be modified.
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    /**
     * Get Name of the invoker to be modified. 
     * @return Name Name of the invoker to be modified.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the invoker to be modified.
     * @param Name Name of the invoker to be modified.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Invoker type. It can only be `SCHEDULE` (recurring invokers). 
     * @return Type Invoker type. It can only be `SCHEDULE` (recurring invokers).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Invoker type. It can only be `SCHEDULE` (recurring invokers).
     * @param Type Invoker type. It can only be `SCHEDULE` (recurring invokers).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ID of the command to be modified. 
     * @return CommandId ID of the command to be modified.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set ID of the command to be modified.
     * @param CommandId ID of the command to be modified.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get The username to be modified. 
     * @return Username The username to be modified.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The username to be modified.
     * @param Username The username to be modified.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Custom parameters to be modified. 
     * @return Parameters Custom parameters to be modified.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameters to be modified.
     * @param Parameters Custom parameters to be modified.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get List of instance IDs to be modified. Up to 100 IDs are allowed. 
     * @return InstanceIds List of instance IDs to be modified. Up to 100 IDs are allowed.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of instance IDs to be modified. Up to 100 IDs are allowed.
     * @param InstanceIds List of instance IDs to be modified. Up to 100 IDs are allowed.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Scheduled invoker settings to be modified. 
     * @return ScheduleSettings Scheduled invoker settings to be modified.
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set Scheduled invoker settings to be modified.
     * @param ScheduleSettings Scheduled invoker settings to be modified.
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    public ModifyInvokerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInvokerRequest(ModifyInvokerRequest source) {
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
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
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
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);

    }
}

