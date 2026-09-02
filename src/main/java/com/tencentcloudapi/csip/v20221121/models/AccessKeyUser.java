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

public class AccessKeyUser extends AbstractModel {

    /**
    * Account ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Account name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 0 Root account 1 Sub-account
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Access method
0 API
1 Console and API
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Security advice. Enumerated values: 0: Normal. 1: Process now. 2: Hardening recommended.
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
    * APPID of the account
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Main account nickname
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Sub-account nickname
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * Uin of the main account to which the account belongs
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Account's own uin. For a root account, it is the same as the root account uin.
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * Login IP
    */
    @SerializedName("LoginIP")
    @Expose
    private String LoginIP;

    /**
    * Login address.
    */
    @SerializedName("LoginLocation")
    @Expose
    private String LoginLocation;

    /**
    * Log-in time
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * ISP name
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * Whether operation protection is enabled
0: not enabled
1: On.
    */
    @SerializedName("ActionFlag")
    @Expose
    private Long ActionFlag;

    /**
    * Whether login protection is enabled
0: not enabled
1: On.
    */
    @SerializedName("LoginFlag")
    @Expose
    private Long LoginFlag;

    /**
    * 0 indicates detected, and 1 indicates in-progress detection.
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
    * Cloud vendor type. 0: Tencent Cloud. 1: Amazon Web Services. 2: Microsoft Azure. 3: Google Cloud. 4: Alibaba Cloud. 5: Huawei Cloud
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get Account ID 
     * @return ID Account ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Account ID
     * @param ID Account ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Account name 
     * @return Name Account name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account name
     * @param Name Account name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 0 Root account 1 Sub-account 
     * @return Type 0 Root account 1 Sub-account
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 Root account 1 Sub-account
     * @param Type 0 Root account 1 Sub-account
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Access method
0 API
1 Console and API 
     * @return AccessType Access method
0 API
1 Console and API
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access method
0 API
1 Console and API
     * @param AccessType Access method
0 API
1 Console and API
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Security advice. Enumerated values: 0: Normal. 1: Process now. 2: Hardening recommended. 
     * @return Advice Security advice. Enumerated values: 0: Normal. 1: Process now. 2: Hardening recommended.
     */
    public Long getAdvice() {
        return this.Advice;
    }

    /**
     * Set Security advice. Enumerated values: 0: Normal. 1: Process now. 2: Hardening recommended.
     * @param Advice Security advice. Enumerated values: 0: Normal. 1: Process now. 2: Hardening recommended.
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
     * Get Main account nickname 
     * @return Nickname Main account nickname
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Main account nickname
     * @param Nickname Main account nickname
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Sub-account nickname 
     * @return SubNickname Sub-account nickname
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set Sub-account nickname
     * @param SubNickname Sub-account nickname
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get Uin of the main account to which the account belongs 
     * @return Uin Uin of the main account to which the account belongs
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Uin of the main account to which the account belongs
     * @param Uin Uin of the main account to which the account belongs
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Account's own uin. For a root account, it is the same as the root account uin. 
     * @return SubUin Account's own uin. For a root account, it is the same as the root account uin.
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Account's own uin. For a root account, it is the same as the root account uin.
     * @param SubUin Account's own uin. For a root account, it is the same as the root account uin.
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Login IP 
     * @return LoginIP Login IP
     */
    public String getLoginIP() {
        return this.LoginIP;
    }

    /**
     * Set Login IP
     * @param LoginIP Login IP
     */
    public void setLoginIP(String LoginIP) {
        this.LoginIP = LoginIP;
    }

    /**
     * Get Login address. 
     * @return LoginLocation Login address.
     */
    public String getLoginLocation() {
        return this.LoginLocation;
    }

    /**
     * Set Login address.
     * @param LoginLocation Login address.
     */
    public void setLoginLocation(String LoginLocation) {
        this.LoginLocation = LoginLocation;
    }

    /**
     * Get Log-in time 
     * @return LoginTime Log-in time
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set Log-in time
     * @param LoginTime Log-in time
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get ISP name 
     * @return ISP ISP name
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set ISP name
     * @param ISP ISP name
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get Whether operation protection is enabled
0: not enabled
1: On. 
     * @return ActionFlag Whether operation protection is enabled
0: not enabled
1: On.
     */
    public Long getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set Whether operation protection is enabled
0: not enabled
1: On.
     * @param ActionFlag Whether operation protection is enabled
0: not enabled
1: On.
     */
    public void setActionFlag(Long ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get Whether login protection is enabled
0: not enabled
1: On. 
     * @return LoginFlag Whether login protection is enabled
0: not enabled
1: On.
     */
    public Long getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set Whether login protection is enabled
0: not enabled
1: On.
     * @param LoginFlag Whether login protection is enabled
0: not enabled
1: On.
     */
    public void setLoginFlag(Long LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get 0 indicates detected, and 1 indicates in-progress detection. 
     * @return CheckStatus 0 indicates detected, and 1 indicates in-progress detection.
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0 indicates detected, and 1 indicates in-progress detection.
     * @param CheckStatus 0 indicates detected, and 1 indicates in-progress detection.
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get Cloud vendor type. 0: Tencent Cloud. 1: Amazon Web Services. 2: Microsoft Azure. 3: Google Cloud. 4: Alibaba Cloud. 5: Huawei Cloud 
     * @return CloudType Cloud vendor type. 0: Tencent Cloud. 1: Amazon Web Services. 2: Microsoft Azure. 3: Google Cloud. 4: Alibaba Cloud. 5: Huawei Cloud
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud vendor type. 0: Tencent Cloud. 1: Amazon Web Services. 2: Microsoft Azure. 3: Google Cloud. 4: Alibaba Cloud. 5: Huawei Cloud
     * @param CloudType Cloud vendor type. 0: Tencent Cloud. 1: Amazon Web Services. 2: Microsoft Azure. 3: Google Cloud. 4: Alibaba Cloud. 5: Huawei Cloud
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public AccessKeyUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyUser(AccessKeyUser source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
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
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.SubNickname != null) {
            this.SubNickname = new String(source.SubNickname);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.LoginIP != null) {
            this.LoginIP = new String(source.LoginIP);
        }
        if (source.LoginLocation != null) {
            this.LoginLocation = new String(source.LoginLocation);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.ActionFlag != null) {
            this.ActionFlag = new Long(source.ActionFlag);
        }
        if (source.LoginFlag != null) {
            this.LoginFlag = new Long(source.LoginFlag);
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
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "Advice", this.Advice);
        this.setParamArrayObj(map, prefix + "AccessKeyAlarmList.", this.AccessKeyAlarmList);
        this.setParamArrayObj(map, prefix + "AccessKeyRiskList.", this.AccessKeyRiskList);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "LoginIP", this.LoginIP);
        this.setParamSimple(map, prefix + "LoginLocation", this.LoginLocation);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "ActionFlag", this.ActionFlag);
        this.setParamSimple(map, prefix + "LoginFlag", this.LoginFlag);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

