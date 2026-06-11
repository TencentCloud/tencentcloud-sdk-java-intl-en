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

public class BaselineItem extends AbstractModel {

    /**
    * Item ID
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Item Name
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Detection Item Classification
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * Item Description
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * Fixing Method
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * Rule
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * Check result description
    */
    @SerializedName("DetectResultDesc")
    @Expose
    private String DetectResultDesc;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * Host ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Public IP address
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * First Occurrence Time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Last Occurrence Time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Can Be Fixed or Not
    */
    @SerializedName("CanBeFixed")
    @Expose
    private Long CanBeFixed;

    /**
    * Host Security UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host Additional Information
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Item ID 
     * @return ItemId Item ID
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Item ID
     * @param ItemId Item ID
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Item Name 
     * @return ItemName Item Name
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Item Name
     * @param ItemName Item Name
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Detection Item Classification 
     * @return CategoryId Detection Item Classification
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set Detection Item Classification
     * @param CategoryId Detection Item Classification
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get Item Description 
     * @return ItemDesc Item Description
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set Item Description
     * @param ItemDesc Item Description
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get Fixing Method 
     * @return FixMethod Fixing Method
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set Fixing Method
     * @param FixMethod Fixing Method
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get Rule 
     * @return RuleName Rule
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set Rule
     * @param RuleName Rule
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get Check result description 
     * @return DetectResultDesc Check result description
     */
    public String getDetectResultDesc() {
        return this.DetectResultDesc;
    }

    /**
     * Set Check result description
     * @param DetectResultDesc Check result description
     */
    public void setDetectResultDesc(String DetectResultDesc) {
        this.DetectResultDesc = DetectResultDesc;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection 
     * @return DetectStatus Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     * @param DetectStatus Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get Host ID 
     * @return HostId Host ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host ID
     * @param HostId Host ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get host name 
     * @return HostName host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set host name
     * @param HostName host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
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
     * Get Public IP address 
     * @return WanIp Public IP address
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public IP address
     * @param WanIp Public IP address
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get First Occurrence Time 
     * @return FirstTime First Occurrence Time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First Occurrence Time
     * @param FirstTime First Occurrence Time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Last Occurrence Time 
     * @return LastTime Last Occurrence Time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last Occurrence Time
     * @param LastTime Last Occurrence Time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Can Be Fixed or Not 
     * @return CanBeFixed Can Be Fixed or Not
     */
    public Long getCanBeFixed() {
        return this.CanBeFixed;
    }

    /**
     * Set Can Be Fixed or Not
     * @param CanBeFixed Can Be Fixed or Not
     */
    public void setCanBeFixed(Long CanBeFixed) {
        this.CanBeFixed = CanBeFixed;
    }

    /**
     * Get Host Security UUID 
     * @return Uuid Host Security UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host Security UUID
     * @param Uuid Host Security UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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

    public BaselineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItem(BaselineItem source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.ItemDesc != null) {
            this.ItemDesc = new String(source.ItemDesc);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String(source.FixMethod);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.DetectResultDesc != null) {
            this.DetectResultDesc = new String(source.DetectResultDesc);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.CanBeFixed != null) {
            this.CanBeFixed = new Long(source.CanBeFixed);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "ItemDesc", this.ItemDesc);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "DetectResultDesc", this.DetectResultDesc);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "CanBeFixed", this.CanBeFixed);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

