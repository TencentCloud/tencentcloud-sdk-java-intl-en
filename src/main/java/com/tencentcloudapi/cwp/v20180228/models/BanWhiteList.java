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

public class BanWhiteList extends AbstractModel {

    /**
    * Allowlist IDs
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Allowlist aliases
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Block source IP
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * Time of modifying allowlists
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Time of creating allowlists
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Machine associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Whether the allowlist is global
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Boolean IsGlobal;

    /**
    * Machine list associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get Allowlist IDs 
     * @return Id Allowlist IDs
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Allowlist IDs
     * @param Id Allowlist IDs
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Allowlist aliases 
     * @return Remark Allowlist aliases
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Allowlist aliases
     * @param Remark Allowlist aliases
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Block source IP 
     * @return SrcIp Block source IP
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set Block source IP
     * @param SrcIp Block source IP
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get Time of modifying allowlists 
     * @return ModifyTime Time of modifying allowlists
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Time of modifying allowlists
     * @param ModifyTime Time of modifying allowlists
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Time of creating allowlists 
     * @return CreateTime Time of creating allowlists
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Time of creating allowlists
     * @param CreateTime Time of creating allowlists
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Machine associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Machine associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Machine associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Machine associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Whether the allowlist is global
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsGlobal Whether the allowlist is global
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the allowlist is global
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsGlobal Whether the allowlist is global
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsGlobal(Boolean IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Machine list associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuids Machine list associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Machine list associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuids Machine list associated with the allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public BanWhiteList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanWhiteList(BanWhiteList source) {
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
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Boolean(source.IsGlobal);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
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
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

