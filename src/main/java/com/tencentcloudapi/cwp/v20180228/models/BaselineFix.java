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

public class BaselineFix extends AbstractModel {

    /**
    * Item name to repair
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Host IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * First detection time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last detection time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Fixing time
    */
    @SerializedName("FixTime")
    @Expose
    private String FixTime;

    /**
    * Baseline detection item result ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Host Additional Information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Item name to repair 
     * @return ItemName Item name to repair
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Item name to repair
     * @param ItemName Item name to repair
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Host IP address 
     * @return HostIp Host IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
     * @param HostIp Host IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get First detection time 
     * @return CreateTime First detection time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First detection time
     * @param CreateTime First detection time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last detection time 
     * @return ModifyTime Last detection time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Last detection time
     * @param ModifyTime Last detection time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Fixing time 
     * @return FixTime Fixing time
     */
    public String getFixTime() {
        return this.FixTime;
    }

    /**
     * Set Fixing time
     * @param FixTime Fixing time
     */
    public void setFixTime(String FixTime) {
        this.FixTime = FixTime;
    }

    /**
     * Get Baseline detection item result ID 
     * @return Id Baseline detection item result ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Baseline detection item result ID
     * @param Id Baseline detection item result ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Host Additional Information 
     * @return MachineExtraInfo Host Additional Information
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
     * @param MachineExtraInfo Host Additional Information
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public BaselineFix() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineFix(BaselineFix source) {
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.FixTime != null) {
            this.FixTime = new String(source.FixTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "FixTime", this.FixTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

