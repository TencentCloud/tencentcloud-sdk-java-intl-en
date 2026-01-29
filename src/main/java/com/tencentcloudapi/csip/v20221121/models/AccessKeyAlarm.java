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

public class AccessKeyAlarm extends AbstractModel {

    /**
    * Alarm name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Alarm level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Alarm record ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Alarm rule ID.
    */
    @SerializedName("AlarmRuleID")
    @Expose
    private Long AlarmRuleID;

    /**
    * Alarm type
Abnormal call.
Leak monitoring.
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * Access key.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Access key ID.
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * Access key remark.
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * Last Alarm Time
    */
    @SerializedName("LastAlarmTime")
    @Expose
    private String LastAlarmTime;

    /**
    * Alarm status.
0 - unprocessed 1 - processed 2 - ignored.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Aggregate date.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Alarm Tag.
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

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
    * Account type.
0 root account AK 1 sub-account AK 2 temporary key.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * App ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Leakage evidence.
    */
    @SerializedName("LeakEvidence")
    @Expose
    private String [] LeakEvidence;

    /**
    * Whether editing a trusted account is supported.
    */
    @SerializedName("IsSupportEditWhiteAccount")
    @Expose
    private Boolean IsSupportEditWhiteAccount;

    /**
    * Alarm evidence.
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * Alarm rule flag.
    */
    @SerializedName("RuleKey")
    @Expose
    private String RuleKey;

    /**
    * Cloud vendor type 0: tencent cloud 1: amazon web services 2: microsoft azure 3: google cloud 4: alibaba cloud 5: huawei cloud.
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * Alarm AI analysis status.
-Analysis failed.
0 not analyzed.
Under analysis.
2 analysis successful, real Alarm.
3 analysis successful, suspicious Alarm.
    */
    @SerializedName("AIStatus")
    @Expose
    private Long AIStatus;

    /**
    * First Alarm timestamp (in seconds).
    */
    @SerializedName("FirstAlarmTimestamp")
    @Expose
    private Long FirstAlarmTimestamp;

    /**
    * Last Alarm timestamp (in seconds).
    */
    @SerializedName("LastAlarmTimestamp")
    @Expose
    private Long LastAlarmTimestamp;

    /**
     * Get Alarm name. 
     * @return Name Alarm name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm name.
     * @param Name Alarm name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Alarm level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical. 
     * @return Level Alarm level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Alarm level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
     * @param Level Alarm level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Alarm record ID. 
     * @return ID Alarm record ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Alarm record ID.
     * @param ID Alarm record ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Alarm rule ID. 
     * @return AlarmRuleID Alarm rule ID.
     */
    public Long getAlarmRuleID() {
        return this.AlarmRuleID;
    }

    /**
     * Set Alarm rule ID.
     * @param AlarmRuleID Alarm rule ID.
     */
    public void setAlarmRuleID(Long AlarmRuleID) {
        this.AlarmRuleID = AlarmRuleID;
    }

    /**
     * Get Alarm type
Abnormal call.
Leak monitoring. 
     * @return AlarmType Alarm type
Abnormal call.
Leak monitoring.
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set Alarm type
Abnormal call.
Leak monitoring.
     * @param AlarmType Alarm type
Abnormal call.
Leak monitoring.
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get Access key. 
     * @return AccessKey Access key.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access key.
     * @param AccessKey Access key.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Access key ID. 
     * @return AccessKeyID Access key ID.
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set Access key ID.
     * @param AccessKeyID Access key ID.
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get Access key remark. 
     * @return AccessKeyRemark Access key remark.
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set Access key remark.
     * @param AccessKeyRemark Access key remark.
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get Last Alarm Time 
     * @return LastAlarmTime Last Alarm Time
     */
    public String getLastAlarmTime() {
        return this.LastAlarmTime;
    }

    /**
     * Set Last Alarm Time
     * @param LastAlarmTime Last Alarm Time
     */
    public void setLastAlarmTime(String LastAlarmTime) {
        this.LastAlarmTime = LastAlarmTime;
    }

    /**
     * Get Alarm status.
0 - unprocessed 1 - processed 2 - ignored. 
     * @return Status Alarm status.
0 - unprocessed 1 - processed 2 - ignored.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Alarm status.
0 - unprocessed 1 - processed 2 - ignored.
     * @param Status Alarm status.
0 - unprocessed 1 - processed 2 - ignored.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Aggregate date. 
     * @return Date Aggregate date.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Aggregate date.
     * @param Date Aggregate date.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Alarm Tag. 
     * @return Tag Alarm Tag.
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Alarm Tag.
     * @param Tag Alarm Tag.
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
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
     * Get Account type.
0 root account AK 1 sub-account AK 2 temporary key. 
     * @return Type Account type.
0 root account AK 1 sub-account AK 2 temporary key.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Account type.
0 root account AK 1 sub-account AK 2 temporary key.
     * @param Type Account type.
0 root account AK 1 sub-account AK 2 temporary key.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get App ID 
     * @return AppID App ID
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set App ID
     * @param AppID App ID
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Leakage evidence. 
     * @return LeakEvidence Leakage evidence.
     */
    public String [] getLeakEvidence() {
        return this.LeakEvidence;
    }

    /**
     * Set Leakage evidence.
     * @param LeakEvidence Leakage evidence.
     */
    public void setLeakEvidence(String [] LeakEvidence) {
        this.LeakEvidence = LeakEvidence;
    }

    /**
     * Get Whether editing a trusted account is supported. 
     * @return IsSupportEditWhiteAccount Whether editing a trusted account is supported.
     */
    public Boolean getIsSupportEditWhiteAccount() {
        return this.IsSupportEditWhiteAccount;
    }

    /**
     * Set Whether editing a trusted account is supported.
     * @param IsSupportEditWhiteAccount Whether editing a trusted account is supported.
     */
    public void setIsSupportEditWhiteAccount(Boolean IsSupportEditWhiteAccount) {
        this.IsSupportEditWhiteAccount = IsSupportEditWhiteAccount;
    }

    /**
     * Get Alarm evidence. 
     * @return Evidence Alarm evidence.
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set Alarm evidence.
     * @param Evidence Alarm evidence.
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get Alarm rule flag. 
     * @return RuleKey Alarm rule flag.
     */
    public String getRuleKey() {
        return this.RuleKey;
    }

    /**
     * Set Alarm rule flag.
     * @param RuleKey Alarm rule flag.
     */
    public void setRuleKey(String RuleKey) {
        this.RuleKey = RuleKey;
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

    /**
     * Get Alarm AI analysis status.
-Analysis failed.
0 not analyzed.
Under analysis.
2 analysis successful, real Alarm.
3 analysis successful, suspicious Alarm. 
     * @return AIStatus Alarm AI analysis status.
-Analysis failed.
0 not analyzed.
Under analysis.
2 analysis successful, real Alarm.
3 analysis successful, suspicious Alarm.
     */
    public Long getAIStatus() {
        return this.AIStatus;
    }

    /**
     * Set Alarm AI analysis status.
-Analysis failed.
0 not analyzed.
Under analysis.
2 analysis successful, real Alarm.
3 analysis successful, suspicious Alarm.
     * @param AIStatus Alarm AI analysis status.
-Analysis failed.
0 not analyzed.
Under analysis.
2 analysis successful, real Alarm.
3 analysis successful, suspicious Alarm.
     */
    public void setAIStatus(Long AIStatus) {
        this.AIStatus = AIStatus;
    }

    /**
     * Get First Alarm timestamp (in seconds). 
     * @return FirstAlarmTimestamp First Alarm timestamp (in seconds).
     */
    public Long getFirstAlarmTimestamp() {
        return this.FirstAlarmTimestamp;
    }

    /**
     * Set First Alarm timestamp (in seconds).
     * @param FirstAlarmTimestamp First Alarm timestamp (in seconds).
     */
    public void setFirstAlarmTimestamp(Long FirstAlarmTimestamp) {
        this.FirstAlarmTimestamp = FirstAlarmTimestamp;
    }

    /**
     * Get Last Alarm timestamp (in seconds). 
     * @return LastAlarmTimestamp Last Alarm timestamp (in seconds).
     */
    public Long getLastAlarmTimestamp() {
        return this.LastAlarmTimestamp;
    }

    /**
     * Set Last Alarm timestamp (in seconds).
     * @param LastAlarmTimestamp Last Alarm timestamp (in seconds).
     */
    public void setLastAlarmTimestamp(Long LastAlarmTimestamp) {
        this.LastAlarmTimestamp = LastAlarmTimestamp;
    }

    public AccessKeyAlarm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAlarm(AccessKeyAlarm source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AlarmRuleID != null) {
            this.AlarmRuleID = new Long(source.AlarmRuleID);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new Long(source.AlarmType);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.AccessKeyRemark != null) {
            this.AccessKeyRemark = new String(source.AccessKeyRemark);
        }
        if (source.LastAlarmTime != null) {
            this.LastAlarmTime = new String(source.LastAlarmTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
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
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.LeakEvidence != null) {
            this.LeakEvidence = new String[source.LeakEvidence.length];
            for (int i = 0; i < source.LeakEvidence.length; i++) {
                this.LeakEvidence[i] = new String(source.LeakEvidence[i]);
            }
        }
        if (source.IsSupportEditWhiteAccount != null) {
            this.IsSupportEditWhiteAccount = new Boolean(source.IsSupportEditWhiteAccount);
        }
        if (source.Evidence != null) {
            this.Evidence = new String(source.Evidence);
        }
        if (source.RuleKey != null) {
            this.RuleKey = new String(source.RuleKey);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.AIStatus != null) {
            this.AIStatus = new Long(source.AIStatus);
        }
        if (source.FirstAlarmTimestamp != null) {
            this.FirstAlarmTimestamp = new Long(source.FirstAlarmTimestamp);
        }
        if (source.LastAlarmTimestamp != null) {
            this.LastAlarmTimestamp = new Long(source.LastAlarmTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AlarmRuleID", this.AlarmRuleID);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "AccessKeyRemark", this.AccessKeyRemark);
        this.setParamSimple(map, prefix + "LastAlarmTime", this.LastAlarmTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamArraySimple(map, prefix + "LeakEvidence.", this.LeakEvidence);
        this.setParamSimple(map, prefix + "IsSupportEditWhiteAccount", this.IsSupportEditWhiteAccount);
        this.setParamSimple(map, prefix + "Evidence", this.Evidence);
        this.setParamSimple(map, prefix + "RuleKey", this.RuleKey);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "AIStatus", this.AIStatus);
        this.setParamSimple(map, prefix + "FirstAlarmTimestamp", this.FirstAlarmTimestamp);
        this.setParamSimple(map, prefix + "LastAlarmTimestamp", this.LastAlarmTimestamp);

    }
}

