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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostMetricConfig extends AbstractModel {

    /**
    * Collection Configuration id
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * Collection configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Collection frequency, in milliseconds
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * Collection item
    */
    @SerializedName("HostMetricItems")
    @Expose
    private HostMetricItem [] HostMetricItems;

    /**
    * Machine group id list
    */
    @SerializedName("MachineGroupIds")
    @Expose
    private String [] MachineGroupIds;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Modification time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Collection Configuration id 
     * @return ConfigId Collection Configuration id
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set Collection Configuration id
     * @param ConfigId Collection Configuration id
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get Collection configuration name 
     * @return Name Collection configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Collection configuration name
     * @param Name Collection configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Collection frequency, in milliseconds 
     * @return Interval Collection frequency, in milliseconds
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set Collection frequency, in milliseconds
     * @param Interval Collection frequency, in milliseconds
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get Collection item 
     * @return HostMetricItems Collection item
     */
    public HostMetricItem [] getHostMetricItems() {
        return this.HostMetricItems;
    }

    /**
     * Set Collection item
     * @param HostMetricItems Collection item
     */
    public void setHostMetricItems(HostMetricItem [] HostMetricItems) {
        this.HostMetricItems = HostMetricItems;
    }

    /**
     * Get Machine group id list 
     * @return MachineGroupIds Machine group id list
     */
    public String [] getMachineGroupIds() {
        return this.MachineGroupIds;
    }

    /**
     * Set Machine group id list
     * @param MachineGroupIds Machine group id list
     */
    public void setMachineGroupIds(String [] MachineGroupIds) {
        this.MachineGroupIds = MachineGroupIds;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time. 
     * @return UpdateTime Modification time.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Modification time.
     * @param UpdateTime Modification time.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public HostMetricConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostMetricConfig(HostMetricConfig source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.HostMetricItems != null) {
            this.HostMetricItems = new HostMetricItem[source.HostMetricItems.length];
            for (int i = 0; i < source.HostMetricItems.length; i++) {
                this.HostMetricItems[i] = new HostMetricItem(source.HostMetricItems[i]);
            }
        }
        if (source.MachineGroupIds != null) {
            this.MachineGroupIds = new String[source.MachineGroupIds.length];
            for (int i = 0; i < source.MachineGroupIds.length; i++) {
                this.MachineGroupIds[i] = new String(source.MachineGroupIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "HostMetricItems.", this.HostMetricItems);
        this.setParamArraySimple(map, prefix + "MachineGroupIds.", this.MachineGroupIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

