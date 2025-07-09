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

public class BaselineHostDetect extends AbstractModel {

    /**
    * Host ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Private IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Public IP address
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * Number of Passed Tasks in Detection
    */
    @SerializedName("PassedItemCount")
    @Expose
    private Long PassedItemCount;

    /**
    * Associated Detection Item Count
    */
    @SerializedName("ItemCount")
    @Expose
    private Long ItemCount;

    /**
    * Detection Failure Count
    */
    @SerializedName("NotPassedItemCount")
    @Expose
    private Long NotPassedItemCount;

    /**
    * First detection time
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * Last detection Time
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * CWPP UUID
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
     * Get Private IP address 
     * @return HostIp Private IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Private IP address
     * @param HostIp Private IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
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
     * Get 0: Failed; 1: Ignored; 3: Passed; 5: Under detection 
     * @return DetectStatus 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     * @param DetectStatus 0: Failed; 1: Ignored; 3: Passed; 5: Under detection
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get Number of Passed Tasks in Detection 
     * @return PassedItemCount Number of Passed Tasks in Detection
     */
    public Long getPassedItemCount() {
        return this.PassedItemCount;
    }

    /**
     * Set Number of Passed Tasks in Detection
     * @param PassedItemCount Number of Passed Tasks in Detection
     */
    public void setPassedItemCount(Long PassedItemCount) {
        this.PassedItemCount = PassedItemCount;
    }

    /**
     * Get Associated Detection Item Count 
     * @return ItemCount Associated Detection Item Count
     */
    public Long getItemCount() {
        return this.ItemCount;
    }

    /**
     * Set Associated Detection Item Count
     * @param ItemCount Associated Detection Item Count
     */
    public void setItemCount(Long ItemCount) {
        this.ItemCount = ItemCount;
    }

    /**
     * Get Detection Failure Count 
     * @return NotPassedItemCount Detection Failure Count
     */
    public Long getNotPassedItemCount() {
        return this.NotPassedItemCount;
    }

    /**
     * Set Detection Failure Count
     * @param NotPassedItemCount Detection Failure Count
     */
    public void setNotPassedItemCount(Long NotPassedItemCount) {
        this.NotPassedItemCount = NotPassedItemCount;
    }

    /**
     * Get First detection time 
     * @return FirstTime First detection time
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set First detection time
     * @param FirstTime First detection time
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get Last detection Time 
     * @return LastTime Last detection Time
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set Last detection Time
     * @param LastTime Last detection Time
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get CWPP UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid CWPP UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWPP UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid CWPP UUID
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

    public BaselineHostDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHostDetect(BaselineHostDetect source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.PassedItemCount != null) {
            this.PassedItemCount = new Long(source.PassedItemCount);
        }
        if (source.ItemCount != null) {
            this.ItemCount = new Long(source.ItemCount);
        }
        if (source.NotPassedItemCount != null) {
            this.NotPassedItemCount = new Long(source.NotPassedItemCount);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
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
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamSimple(map, prefix + "PassedItemCount", this.PassedItemCount);
        this.setParamSimple(map, prefix + "ItemCount", this.ItemCount);
        this.setParamSimple(map, prefix + "NotPassedItemCount", this.NotPassedItemCount);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

