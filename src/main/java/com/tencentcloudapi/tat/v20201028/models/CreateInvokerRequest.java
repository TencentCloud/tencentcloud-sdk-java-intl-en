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

public class CreateInvokerRequest extends AbstractModel {

    /**
    * Invoker name.
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
    * Remote command ID.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * ID of the instance bound to the trigger. Up to 100 IDs are allowed.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * The user who executes the command.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Custom parameters of the command.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Settings required for a recurring invoker.
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

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
     * Get Remote command ID. 
     * @return CommandId Remote command ID.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Remote command ID.
     * @param CommandId Remote command ID.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get ID of the instance bound to the trigger. Up to 100 IDs are allowed. 
     * @return InstanceIds ID of the instance bound to the trigger. Up to 100 IDs are allowed.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set ID of the instance bound to the trigger. Up to 100 IDs are allowed.
     * @param InstanceIds ID of the instance bound to the trigger. Up to 100 IDs are allowed.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get The user who executes the command. 
     * @return Username The user who executes the command.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set The user who executes the command.
     * @param Username The user who executes the command.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Custom parameters of the command. 
     * @return Parameters Custom parameters of the command.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Custom parameters of the command.
     * @param Parameters Custom parameters of the command.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Settings required for a recurring invoker. 
     * @return ScheduleSettings Settings required for a recurring invoker.
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set Settings required for a recurring invoker.
     * @param ScheduleSettings Settings required for a recurring invoker.
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    public CreateInvokerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInvokerRequest(CreateInvokerRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);

    }
}

