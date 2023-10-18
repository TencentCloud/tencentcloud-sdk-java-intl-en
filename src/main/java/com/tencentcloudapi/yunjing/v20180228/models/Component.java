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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Component extends AbstractModel {

    /**
    * Unique ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWP agent `Uuid`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP of server.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Component version number.
    */
    @SerializedName("ComponentVersion")
    @Expose
    private String ComponentVersion;

    /**
    * Component type.
<li>SYSTEM: system component</li>
<li>WEB: web component</li>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * Component name.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * Component detection update time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Unique ID. 
     * @return Id Unique ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID.
     * @param Id Unique ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWP agent `Uuid`. 
     * @return Uuid CWP agent `Uuid`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`.
     * @param Uuid CWP agent `Uuid`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP of server. 
     * @return MachineIp Private IP of server.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP of server.
     * @param MachineIp Private IP of server.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Component version number. 
     * @return ComponentVersion Component version number.
     */
    public String getComponentVersion() {
        return this.ComponentVersion;
    }

    /**
     * Set Component version number.
     * @param ComponentVersion Component version number.
     */
    public void setComponentVersion(String ComponentVersion) {
        this.ComponentVersion = ComponentVersion;
    }

    /**
     * Get Component type.
<li>SYSTEM: system component</li>
<li>WEB: web component</li> 
     * @return ComponentType Component type.
<li>SYSTEM: system component</li>
<li>WEB: web component</li>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set Component type.
<li>SYSTEM: system component</li>
<li>WEB: web component</li>
     * @param ComponentType Component type.
<li>SYSTEM: system component</li>
<li>WEB: web component</li>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
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
     * Get Component detection update time. 
     * @return ModifyTime Component detection update time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Component detection update time.
     * @param ModifyTime Component detection update time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public Component() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Component(Component source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.ComponentVersion != null) {
            this.ComponentVersion = new String(source.ComponentVersion);
        }
        if (source.ComponentType != null) {
            this.ComponentType = new String(source.ComponentType);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "ComponentVersion", this.ComponentVersion);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

