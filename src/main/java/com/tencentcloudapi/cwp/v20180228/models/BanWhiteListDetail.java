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

public class BanWhiteListDetail extends AbstractModel {

    /**
    * Allowlist ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Allowlist alias
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Blocking source IP address
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Allowlist modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Allowlist creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether the allowlist takes effect globally
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Machine UUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * CWPP program UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Machine IP address
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Machine name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
     * Get Allowlist ID 
     * @return Id Allowlist ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Allowlist ID
     * @param Id Allowlist ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Allowlist alias 
     * @return Remark Allowlist alias
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Allowlist alias
     * @param Remark Allowlist alias
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Blocking source IP address 
     * @return SrcIp Blocking source IP address
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Blocking source IP address
     * @param SrcIp Blocking source IP address
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Allowlist modification time 
     * @return ModifyTime Allowlist modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Allowlist modification time
     * @param ModifyTime Allowlist modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Allowlist creation time 
     * @return CreateTime Allowlist creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Allowlist creation time
     * @param CreateTime Allowlist creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether the allowlist takes effect globally 
     * @return IsGlobal Whether the allowlist takes effect globally
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the allowlist takes effect globally
     * @param IsGlobal Whether the allowlist takes effect globally
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Machine UUID 
     * @return Quuid Machine UUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine UUID
     * @param Quuid Machine UUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get CWPP program UUID 
     * @return Uuid CWPP program UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP program UUID
     * @param Uuid CWPP program UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Machine IP address 
     * @return MachineIp Machine IP address
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Machine IP address
     * @param MachineIp Machine IP address
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Machine name 
     * @return MachineName Machine name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Machine name
     * @param MachineName Machine name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    public BanWhiteListDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanWhiteListDetail(BanWhiteListDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);

    }
}

