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

public class AccessKeyAsset extends AbstractModel {

    /**
    * AK id.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * AK name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Account associate APPID.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Account associate Uin belonging to main account.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Nickname of the main account.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Sub-Account Uin belonging to.
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * Sub-Account nickname.
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * Root account AK.
Sub-Account AK.
2 temporary key.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Security advice enumeration.
Normal.
Process now.
2 recommend reinforcement.
    */
    @SerializedName("Advice")
    @Expose
    private Long Advice;

    /**
    * Alarm information list.
    */
    @SerializedName("AccessKeyAlarmList")
    @Expose
    private AccessKeyAlarmInfo [] AccessKeyAlarmList;

    /**
    * Risk information list.
    */
    @SerializedName("AccessKeyRiskList")
    @Expose
    private AccessKeyAlarmInfo [] AccessKeyRiskList;

    /**
    * Source IP quantity.
    */
    @SerializedName("IPCount")
    @Expose
    private Long IPCount;

    /**
    * Creation time.


    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last access Time
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * AK status. 
0: disabled.
1: enabled.
2: deleted (deleted in cam, the security center still retains the previous log).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0 means detected.
1 indicates detecting.
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
    * Cloud vendor type 0: tencent cloud 1: amazon web services 2: microsoft azure 3: google cloud 4: alibaba cloud 5: huawei cloud.
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get AK id. 
     * @return ID AK id.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set AK id.
     * @param ID AK id.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get AK name. 
     * @return Name AK name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set AK name.
     * @param Name AK name.
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Account associate APPID. 
     * @return AppID Account associate APPID.
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set Account associate APPID.
     * @param AppID Account associate APPID.
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Account associate Uin belonging to main account. 
     * @return Uin Account associate Uin belonging to main account.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account associate Uin belonging to main account.
     * @param Uin Account associate Uin belonging to main account.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Nickname of the main account. 
     * @return Nickname Nickname of the main account.
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Nickname of the main account.
     * @param Nickname Nickname of the main account.
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Sub-Account Uin belonging to. 
     * @return SubUin Sub-Account Uin belonging to.
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Sub-Account Uin belonging to.
     * @param SubUin Sub-Account Uin belonging to.
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Sub-Account nickname. 
     * @return SubNickname Sub-Account nickname.
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set Sub-Account nickname.
     * @param SubNickname Sub-Account nickname.
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get Root account AK.
Sub-Account AK.
2 temporary key. 
     * @return Type Root account AK.
Sub-Account AK.
2 temporary key.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Root account AK.
Sub-Account AK.
2 temporary key.
     * @param Type Root account AK.
Sub-Account AK.
2 temporary key.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Security advice enumeration.
Normal.
Process now.
2 recommend reinforcement. 
     * @return Advice Security advice enumeration.
Normal.
Process now.
2 recommend reinforcement.
     */
    public Long getAdvice() {
        return this.Advice;
    }

    /**
     * Set Security advice enumeration.
Normal.
Process now.
2 recommend reinforcement.
     * @param Advice Security advice enumeration.
Normal.
Process now.
2 recommend reinforcement.
     */
    public void setAdvice(Long Advice) {
        this.Advice = Advice;
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
     * Get Risk information list. 
     * @return AccessKeyRiskList Risk information list.
     */
    public AccessKeyAlarmInfo [] getAccessKeyRiskList() {
        return this.AccessKeyRiskList;
    }

    /**
     * Set Risk information list.
     * @param AccessKeyRiskList Risk information list.
     */
    public void setAccessKeyRiskList(AccessKeyAlarmInfo [] AccessKeyRiskList) {
        this.AccessKeyRiskList = AccessKeyRiskList;
    }

    /**
     * Get Source IP quantity. 
     * @return IPCount Source IP quantity.
     */
    public Long getIPCount() {
        return this.IPCount;
    }

    /**
     * Set Source IP quantity.
     * @param IPCount Source IP quantity.
     */
    public void setIPCount(Long IPCount) {
        this.IPCount = IPCount;
    }

    /**
     * Get Creation time.

 
     * @return CreateTime Creation time.


     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.


     * @param CreateTime Creation time.


     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get AK status. 
0: disabled.
1: enabled.
2: deleted (deleted in cam, the security center still retains the previous log). 
     * @return Status AK status. 
0: disabled.
1: enabled.
2: deleted (deleted in cam, the security center still retains the previous log).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set AK status. 
0: disabled.
1: enabled.
2: deleted (deleted in cam, the security center still retains the previous log).
     * @param Status AK status. 
0: disabled.
1: enabled.
2: deleted (deleted in cam, the security center still retains the previous log).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0 means detected.
1 indicates detecting. 
     * @return CheckStatus 0 means detected.
1 indicates detecting.
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0 means detected.
1 indicates detecting.
     * @param CheckStatus 0 means detected.
1 indicates detecting.
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get Cloud vendor type 0: tencent cloud 1: amazon web services 2: microsoft azure 3: google cloud 4: alibaba cloud 5: huawei cloud. 
     * @return CloudType Cloud vendor type 0: tencent cloud 1: amazon web services 2: microsoft azure 3: google cloud 4: alibaba cloud 5: huawei cloud.
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud vendor type 0: tencent cloud 1: amazon web services 2: microsoft azure 3: google cloud 4: alibaba cloud 5: huawei cloud.
     * @param CloudType Cloud vendor type 0: tencent cloud 1: amazon web services 2: microsoft azure 3: google cloud 4: alibaba cloud 5: huawei cloud.
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public AccessKeyAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAsset(AccessKeyAsset source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubNickname != null) {
            this.SubNickname = new String(source.SubNickname);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Advice != null) {
            this.Advice = new Long(source.Advice);
        }
        if (source.AccessKeyAlarmList != null) {
            this.AccessKeyAlarmList = new AccessKeyAlarmInfo[source.AccessKeyAlarmList.length];
            for (int i = 0; i < source.AccessKeyAlarmList.length; i++) {
                this.AccessKeyAlarmList[i] = new AccessKeyAlarmInfo(source.AccessKeyAlarmList[i]);
            }
        }
        if (source.AccessKeyRiskList != null) {
            this.AccessKeyRiskList = new AccessKeyAlarmInfo[source.AccessKeyRiskList.length];
            for (int i = 0; i < source.AccessKeyRiskList.length; i++) {
                this.AccessKeyRiskList[i] = new AccessKeyAlarmInfo(source.AccessKeyRiskList[i]);
            }
        }
        if (source.IPCount != null) {
            this.IPCount = new Long(source.IPCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Advice", this.Advice);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmList.", this.AccessKeyAlarmList);
        this.setParamArrayObj(map, prefix + "AccessKeyRiskList.", this.AccessKeyRiskList);
        this.setParamSimple(map, prefix + "IPCount", this.IPCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

