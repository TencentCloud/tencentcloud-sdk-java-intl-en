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

public class RegisterInstanceInfo extends AbstractModel {

    /**
    * Registration code ID.
    */
    @SerializedName("RegisterCodeId")
    @Expose
    private String RegisterCodeId;

    /**
    * Managed instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Managed instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Machine ID.
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * System name. valid values: Linux | Windows.
    */
    @SerializedName("SystemName")
    @Expose
    private String SystemName;

    /**
    * Host name.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Private network IP
    */
    @SerializedName("LocalIp")
    @Expose
    private String LocalIp;

    /**
    * Public key.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * Hosting status.
Return Online means the instance is managed, return Offline means the instance is unhosted.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last update time. the format is YYYY-MM-DDThh:MM:ssZ.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Registration code ID. 
     * @return RegisterCodeId Registration code ID.
     */
    public String getRegisterCodeId() {
        return this.RegisterCodeId;
    }

    /**
     * Set Registration code ID.
     * @param RegisterCodeId Registration code ID.
     */
    public void setRegisterCodeId(String RegisterCodeId) {
        this.RegisterCodeId = RegisterCodeId;
    }

    /**
     * Get Managed instance ID. 
     * @return InstanceId Managed instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Managed instance ID.
     * @param InstanceId Managed instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Managed instance name. 
     * @return InstanceName Managed instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Managed instance name.
     * @param InstanceName Managed instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Machine ID. 
     * @return MachineId Machine ID.
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set Machine ID.
     * @param MachineId Machine ID.
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get System name. valid values: Linux | Windows. 
     * @return SystemName System name. valid values: Linux | Windows.
     */
    public String getSystemName() {
        return this.SystemName;
    }

    /**
     * Set System name. valid values: Linux | Windows.
     * @param SystemName System name. valid values: Linux | Windows.
     */
    public void setSystemName(String SystemName) {
        this.SystemName = SystemName;
    }

    /**
     * Get Host name. 
     * @return HostName Host name.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name.
     * @param HostName Host name.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Private network IP 
     * @return LocalIp Private network IP
     */
    public String getLocalIp() {
        return this.LocalIp;
    }

    /**
     * Set Private network IP
     * @param LocalIp Private network IP
     */
    public void setLocalIp(String LocalIp) {
        this.LocalIp = LocalIp;
    }

    /**
     * Get Public key. 
     * @return PublicKey Public key.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set Public key.
     * @param PublicKey Public key.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get Hosting status.
Return Online means the instance is managed, return Offline means the instance is unhosted. 
     * @return Status Hosting status.
Return Online means the instance is managed, return Offline means the instance is unhosted.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Hosting status.
Return Online means the instance is managed, return Offline means the instance is unhosted.
     * @param Status Hosting status.
Return Online means the instance is managed, return Offline means the instance is unhosted.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get Last update time. the format is YYYY-MM-DDThh:MM:ssZ. 
     * @return UpdatedTime Last update time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Last update time. the format is YYYY-MM-DDThh:MM:ssZ.
     * @param UpdatedTime Last update time. the format is YYYY-MM-DDThh:MM:ssZ.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public RegisterInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterInstanceInfo(RegisterInstanceInfo source) {
        if (source.RegisterCodeId != null) {
            this.RegisterCodeId = new String(source.RegisterCodeId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.SystemName != null) {
            this.SystemName = new String(source.SystemName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.LocalIp != null) {
            this.LocalIp = new String(source.LocalIp);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterCodeId", this.RegisterCodeId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "SystemName", this.SystemName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "LocalIp", this.LocalIp);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

