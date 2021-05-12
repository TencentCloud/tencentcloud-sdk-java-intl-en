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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentStatistics extends AbstractModel{

    /**
    * Component ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Number of servers.
    */
    @SerializedName("MachineNum")
    @Expose
    private Long MachineNum;

    /**
    * Component name.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * Component description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Component ID. 
     * @return Id Component ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Component ID.
     * @param Id Component ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Number of servers. 
     * @return MachineNum Number of servers.
     */
    public Long getMachineNum() {
        return this.MachineNum;
    }

    /**
     * Set Number of servers.
     * @param MachineNum Number of servers.
     */
    public void setMachineNum(Long MachineNum) {
        this.MachineNum = MachineNum;
    }

    /**
     * Get Component name. 
     * @return ComponentName Component name.
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Component name.
     * @param ComponentName Component name.
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li> 
     * @return ComponentType Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
     * @param ComponentType Component type.
<li>WEB: web component</li>
<li>SYSTEM: system component</li>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get Component description. 
     * @return Description Component description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Component description.
     * @param Description Component description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ComponentStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentStatistics(ComponentStatistics source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineNum != null) {
            this.MachineNum = new Long(source.MachineNum);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineNum", this.MachineNum);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

