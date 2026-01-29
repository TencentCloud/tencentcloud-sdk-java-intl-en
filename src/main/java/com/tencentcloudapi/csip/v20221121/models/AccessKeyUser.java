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
    * Account ID.
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
    * 0 root account 1 sub-account.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Access method.
0 API
1 console and API.
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * Security recommendation enumerate 0 normal 1 process immediately 2 recommend reinforcement.
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
    * Account associate APPID.
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Nickname of the main account.
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Sub-Account nickname.
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * Account Uin belonging to main account.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Account self uin, same as root account uin when it is the root account.
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * Login IP.
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
    * Log-In time.
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
    * Whether operation protection is enabled.
0 not enabled.
1: enabled.
    */
    @SerializedName("ActionFlag")
    @Expose
    private Long ActionFlag;

    /**
    * Is login protection enabled?.
0 not enabled.
1: enabled.
    */
    @SerializedName("LoginFlag")
    @Expose
    private Long LoginFlag;

    /**
    * 0 means detected. 1 means detecting.
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
     * Get Account ID. 
     * @return ID Account ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Account ID.
     * @param ID Account ID.
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
     * Get 0 root account 1 sub-account. 
     * @return Type 0 root account 1 sub-account.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0 root account 1 sub-account.
     * @param Type 0 root account 1 sub-account.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Access method.
0 API
1 console and API. 
     * @return AccessType Access method.
0 API
1 console and API.
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set Access method.
0 API
1 console and API.
     * @param AccessType Access method.
0 API
1 console and API.
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get Security recommendation enumerate 0 normal 1 process immediately 2 recommend reinforcement. 
     * @return Advice Security recommendation enumerate 0 normal 1 process immediately 2 recommend reinforcement.
     */
    public Long getAdvice() {
        return this.Advice;
    }

    /**
     * Set Security recommendation enumerate 0 normal 1 process immediately 2 recommend reinforcement.
     * @param Advice Security recommendation enumerate 0 normal 1 process immediately 2 recommend reinforcement.
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
     * Get Account Uin belonging to main account. 
     * @return Uin Account Uin belonging to main account.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account Uin belonging to main account.
     * @param Uin Account Uin belonging to main account.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Account self uin, same as root account uin when it is the root account. 
     * @return SubUin Account self uin, same as root account uin when it is the root account.
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Account self uin, same as root account uin when it is the root account.
     * @param SubUin Account self uin, same as root account uin when it is the root account.
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get Login IP. 
     * @return LoginIP Login IP.
     */
    public String getLoginIP() {
        return this.LoginIP;
    }

    /**
     * Set Login IP.
     * @param LoginIP Login IP.
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
     * Get Log-In time. 
     * @return LoginTime Log-In time.
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set Log-In time.
     * @param LoginTime Log-In time.
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
     * Get Whether operation protection is enabled.
0 not enabled.
1: enabled. 
     * @return ActionFlag Whether operation protection is enabled.
0 not enabled.
1: enabled.
     */
    public Long getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set Whether operation protection is enabled.
0 not enabled.
1: enabled.
     * @param ActionFlag Whether operation protection is enabled.
0 not enabled.
1: enabled.
     */
    public void setActionFlag(Long ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get Is login protection enabled?.
0 not enabled.
1: enabled. 
     * @return LoginFlag Is login protection enabled?.
0 not enabled.
1: enabled.
     */
    public Long getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set Is login protection enabled?.
0 not enabled.
1: enabled.
     * @param LoginFlag Is login protection enabled?.
0 not enabled.
1: enabled.
     */
    public void setLoginFlag(Long LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get 0 means detected. 1 means detecting. 
     * @return CheckStatus 0 means detected. 1 means detecting.
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0 means detected. 1 means detecting.
     * @param CheckStatus 0 means detected. 1 means detecting.
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

