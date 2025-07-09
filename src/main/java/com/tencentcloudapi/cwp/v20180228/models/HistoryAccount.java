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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HistoryAccount extends AbstractModel {

    /**
    * Unique ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * CWPP client UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Private IP address of the host
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Username
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Account change type
<li>CREATE: account creation</li>
<li>MODIFY: account modification</li>
<li>DELETE: account deletion</li>
    */
    @SerializedName("ModifyType")
    @Expose
    private String ModifyType;

    /**
    * Change time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Unique ID 
     * @return Id Unique ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID
     * @param Id Unique ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get CWPP client UUID 
     * @return Uuid CWPP client UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP client UUID
     * @param Uuid CWPP client UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Private IP address of the host 
     * @return MachineIp Private IP address of the host
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Private IP address of the host
     * @param MachineIp Private IP address of the host
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Host name 
     * @return MachineName Host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Host name
     * @param MachineName Host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Username 
     * @return Username Username
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Username
     * @param Username Username
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Account change type
<li>CREATE: account creation</li>
<li>MODIFY: account modification</li>
<li>DELETE: account deletion</li> 
     * @return ModifyType Account change type
<li>CREATE: account creation</li>
<li>MODIFY: account modification</li>
<li>DELETE: account deletion</li>
     */
    public String getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set Account change type
<li>CREATE: account creation</li>
<li>MODIFY: account modification</li>
<li>DELETE: account deletion</li>
     * @param ModifyType Account change type
<li>CREATE: account creation</li>
<li>MODIFY: account modification</li>
<li>DELETE: account deletion</li>
     */
    public void setModifyType(String ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get Change time 
     * @return ModifyTime Change time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Change time
     * @param ModifyTime Change time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public HistoryAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HistoryAccount(HistoryAccount source) {
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
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ModifyType != null) {
            this.ModifyType = new String(source.ModifyType);
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
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

