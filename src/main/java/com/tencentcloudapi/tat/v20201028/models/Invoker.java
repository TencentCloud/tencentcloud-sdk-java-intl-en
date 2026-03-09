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
    * Executor type. currently only support SCHEDULE.
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
    * Executor periodic schedule. recurring invoker will return this field.
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
    * Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last modified. the format is YYYY-MM-DDThh:MM:ssZ.
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
     * Get Executor type. currently only support SCHEDULE. 
     * @return Type Executor type. currently only support SCHEDULE.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Executor type. currently only support SCHEDULE.
     * @param Type Executor type. currently only support SCHEDULE.
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
     * Get Executor periodic schedule. recurring invoker will return this field. 
     * @return ScheduleSettings Executor periodic schedule. recurring invoker will return this field.
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set Executor periodic schedule. recurring invoker will return this field.
     * @param ScheduleSettings Executor periodic schedule. recurring invoker will return this field.
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    /**
     * Get Creation time. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return CreatedTime Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param CreatedTime Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last modified. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return UpdatedTime Last modified. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Last modified. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param UpdatedTime Last modified. the format is YYYY-MM-DDThh:MM:ssZ.
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

