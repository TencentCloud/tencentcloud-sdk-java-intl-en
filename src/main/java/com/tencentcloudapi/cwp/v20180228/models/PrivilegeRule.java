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

public class PrivilegeRule extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Whether the mode is S mode
    */
    @SerializedName("SMode")
    @Expose
    private Long SMode;

    /**
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Whether the rule is global
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Status. 0: valid; 1: invalid.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Host IP
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID 
     * @return Uuid Client ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Client ID
     * @param Uuid Client ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Whether the mode is S mode 
     * @return SMode Whether the mode is S mode
     */
    public Long getSMode() {
        return this.SMode;
    }

    /**
     * Set Whether the mode is S mode
     * @param SMode Whether the mode is S mode
     */
    public void setSMode(Long SMode) {
        this.SMode = SMode;
    }

    /**
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Whether the rule is global 
     * @return IsGlobal Whether the rule is global
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule is global
     * @param IsGlobal Whether the rule is global
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Status. 0: valid; 1: invalid. 
     * @return Status Status. 0: valid; 1: invalid.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 0: valid; 1: invalid.
     * @param Status Status. 0: valid; 1: invalid.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Host IP 
     * @return Hostip Host IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set Host IP
     * @param Hostip Host IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    public PrivilegeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivilegeRule(PrivilegeRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.SMode != null) {
            this.SMode = new Long(source.SMode);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "SMode", this.SMode);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);

    }
}

