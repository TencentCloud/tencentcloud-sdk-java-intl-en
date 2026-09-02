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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceIPAsset extends AbstractModel {

    /**
    * Source IP id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Source IP
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * APPID of the account
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * IP region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Calling method
-1: Uncounted
0: Console invocation
1:API
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * IP type
0: within the account (no remark)
1: Outside the account (no remarks)
2: Within the account (remarked)
3: Outside the account   (Remarks added)
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * Alarm information list.
    */
    @SerializedName("AccessKeyAlarmList")
    @Expose
    private AccessKeyAlarmInfo [] AccessKeyAlarmList;

    /**
    * ak information list
    */
    @SerializedName("AKInfo")
    @Expose
    private AKInfo [] AKInfo;

    /**
    * Number of API calls.
    */
    @SerializedName("ActionCount")
    @Expose
    private Long ActionCount;

    /**
    * Last access Time
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * Associated instance ID of the IP. If it is an empty string, the asset is not within the account.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * IP associated instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Uin of the account
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Display status.
    */
    @SerializedName("ShowStatus")
    @Expose
    private Boolean ShowStatus;

    /**
    * Carrier field
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * vpc information outside the account
    */
    @SerializedName("VpcInfo")
    @Expose
    private SourceIPVpcInfo [] VpcInfo;

    /**
    * Cloud type
0: Tencent Cloud
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get Source IP id 
     * @return ID Source IP id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Source IP id
     * @param ID Source IP id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Source IP 
     * @return SourceIP Source IP
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set Source IP
     * @param SourceIP Source IP
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get APPID of the account 
     * @return AppID APPID of the account
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set APPID of the account
     * @param AppID APPID of the account
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get IP region 
     * @return Region IP region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set IP region
     * @param Region IP region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Calling method
-1: Uncounted
0: Console invocation
1:API 
     * @return EventType Calling method
-1: Uncounted
0: Console invocation
1:API
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Calling method
-1: Uncounted
0: Console invocation
1:API
     * @param EventType Calling method
-1: Uncounted
0: Console invocation
1:API
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get IP type
0: within the account (no remark)
1: Outside the account (no remarks)
2: Within the account (remarked)
3: Outside the account   (Remarks added) 
     * @return IPType IP type
0: within the account (no remark)
1: Outside the account (no remarks)
2: Within the account (remarked)
3: Outside the account   (Remarks added)
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set IP type
0: within the account (no remark)
1: Outside the account (no remarks)
2: Within the account (remarked)
3: Outside the account   (Remarks added)
     * @param IPType IP type
0: within the account (no remark)
1: Outside the account (no remarks)
2: Within the account (remarked)
3: Outside the account   (Remarks added)
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
    }

    /**
     * Get Alarm information list. 
     * @return AccessKeyAlarmList Alarm information list.
     */
    public AccessKeyAlarmInfo [] getAccessKeyAlarmList() {
        return this.AccessKeyAlarmList;
    }

    /**
     * Set Alarm information list.
     * @param AccessKeyAlarmList Alarm information list.
     */
    public void setAccessKeyAlarmList(AccessKeyAlarmInfo [] AccessKeyAlarmList) {
        this.AccessKeyAlarmList = AccessKeyAlarmList;
    }

    /**
     * Get ak information list 
     * @return AKInfo ak information list
     */
    public AKInfo [] getAKInfo() {
        return this.AKInfo;
    }

    /**
     * Set ak information list
     * @param AKInfo ak information list
     */
    public void setAKInfo(AKInfo [] AKInfo) {
        this.AKInfo = AKInfo;
    }

    /**
     * Get Number of API calls. 
     * @return ActionCount Number of API calls.
     */
    public Long getActionCount() {
        return this.ActionCount;
    }

    /**
     * Set Number of API calls.
     * @param ActionCount Number of API calls.
     */
    public void setActionCount(Long ActionCount) {
        this.ActionCount = ActionCount;
    }

    /**
     * Get Last access Time 
     * @return LastAccessTime Last access Time
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set Last access Time
     * @param LastAccessTime Last access Time
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    /**
     * Get Associated instance ID of the IP. If it is an empty string, the asset is not within the account. 
     * @return InstanceID Associated instance ID of the IP. If it is an empty string, the asset is not within the account.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Associated instance ID of the IP. If it is an empty string, the asset is not within the account.
     * @param InstanceID Associated instance ID of the IP. If it is an empty string, the asset is not within the account.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get IP associated instance name 
     * @return InstanceName IP associated instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set IP associated instance name
     * @param InstanceName IP associated instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Uin of the account 
     * @return Uin Uin of the account
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin of the account
     * @param Uin Uin of the account
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Nickname 
     * @return Nickname Nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname
     * @param Nickname Nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Display status. 
     * @return ShowStatus Display status.
     */
    public Boolean getShowStatus() {
        return this.ShowStatus;
    }

    /**
     * Set Display status.
     * @param ShowStatus Display status.
     */
    public void setShowStatus(Boolean ShowStatus) {
        this.ShowStatus = ShowStatus;
    }

    /**
     * Get Carrier field 
     * @return ISP Carrier field
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set Carrier field
     * @param ISP Carrier field
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get vpc information outside the account 
     * @return VpcInfo vpc information outside the account
     */
    public SourceIPVpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set vpc information outside the account
     * @param VpcInfo vpc information outside the account
     */
    public void setVpcInfo(SourceIPVpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get Cloud type
0: Tencent Cloud 
     * @return CloudType Cloud type
0: Tencent Cloud
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud type
0: Tencent Cloud
     * @param CloudType Cloud type
0: Tencent Cloud
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public SourceIPAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceIPAsset(SourceIPAsset source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.IPType != null) {
            this.IPType = new Long(source.IPType);
        }
        if (source.AccessKeyAlarmList != null) {
            this.AccessKeyAlarmList = new AccessKeyAlarmInfo[source.AccessKeyAlarmList.length];
            for (int i = 0; i < source.AccessKeyAlarmList.length; i++) {
                this.AccessKeyAlarmList[i] = new AccessKeyAlarmInfo(source.AccessKeyAlarmList[i]);
            }
        }
        if (source.AKInfo != null) {
            this.AKInfo = new AKInfo[source.AKInfo.length];
            for (int i = 0; i < source.AKInfo.length; i++) {
                this.AKInfo[i] = new AKInfo(source.AKInfo[i]);
            }
        }
        if (source.ActionCount != null) {
            this.ActionCount = new Long(source.ActionCount);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.ShowStatus != null) {
            this.ShowStatus = new Boolean(source.ShowStatus);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new SourceIPVpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new SourceIPVpcInfo(source.VpcInfo[i]);
            }
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "IPType", this.IPType);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmList.", this.AccessKeyAlarmList);
        this.setParamArrayObj(map, prefix + "AKInfo.", this.AKInfo);
        this.setParamSimple(map, prefix + "ActionCount", this.ActionCount);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "ShowStatus", this.ShowStatus);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

