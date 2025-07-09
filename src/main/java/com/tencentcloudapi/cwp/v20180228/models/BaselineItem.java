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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectResultDesc")
    @Expose
    private String DetectResultDesc;

    /**
    * Risk level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * Host ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * First Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Last Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * Can Be Fixed or Not
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CanBeFixed")
    @Expose
    private Long CanBeFixed;

    /**
    * Host Security UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
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
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectResultDesc Check result description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDetectResultDesc() {
        return this.DetectResultDesc;
    }

    /**
     * Set Check result description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectResultDesc Check result description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectResultDesc(String DetectResultDesc) {
        this.DetectResultDesc = DetectResultDesc;
    }

    /**
     * Get Risk level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Level Risk level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DetectStatus Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DetectStatus Detection Status. 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get Host ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostId Host ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostId Host ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIp Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIp Host IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WanIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WanIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get First Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstTime First Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstTime First Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Last Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastTime Last Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastTime Last Occurrence Time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get Can Be Fixed or Not
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CanBeFixed Can Be Fixed or Not
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCanBeFixed() {
        return this.CanBeFixed;
    }

    /**
     * Set Can Be Fixed or Not
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CanBeFixed Can Be Fixed or Not
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCanBeFixed(Long CanBeFixed) {
        this.CanBeFixed = CanBeFixed;
    }

    /**
     * Get Host Security UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Host Security UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host Security UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Host Security UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
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

