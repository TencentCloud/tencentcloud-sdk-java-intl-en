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
    * <p>Alarm name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Alarm level<br>0-Unavailable 1-Notification 2-Low risk 3-Medium risk 4-High risk 5-Critical</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>Alarm record ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Alarm rule ID</p>
    */
    @SerializedName("AlarmRuleID")
    @Expose
    private Long AlarmRuleID;

    /**
    * <p>Alarm type<br>0 Abnormal call<br>1 Leak monitoring</p>
    */
    @SerializedName("AlarmType")
    @Expose
    private Long AlarmType;

    /**
    * <p>Access key</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>Access Key ID</p>
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * <p>Access key remark</p>
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * <p>Last alarm time</p>
    */
    @SerializedName("LastAlarmTime")
    @Expose
    private String LastAlarmTime;

    /**
    * <p>Alarm status<br>0-unprocessed 1-processed 2-ignored</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Aggregate date</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>Alarm tag</p>
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * <p>Uin of the main account</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>Nickname of the main account</p>
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * <p>Sub-account Uin</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>Sub-account nickname</p>
    */
    @SerializedName("SubNickname")
    @Expose
    private String SubNickname;

    /**
    * <p>Account type<br>0 Root account AK 1 Sub-account AK 2 Temporary key</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>App ID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Leakage evidence</p>
    */
    @SerializedName("LeakEvidence")
    @Expose
    private String [] LeakEvidence;

    /**
    * <p>Whether support editing trust account</p>
    */
    @SerializedName("IsSupportEditWhiteAccount")
    @Expose
    private Boolean IsSupportEditWhiteAccount;

    /**
    * <p>Alert evidence</p>
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * <p>Alarm rule flag</p>
    */
    @SerializedName("RuleKey")
    @Expose
    private String RuleKey;

    /**
    * <p>Cloud vendor type 0:Tencent Cloud 1:Amazon Web Services 2:Microsoft Azure 3:Google Cloud 4:Alibaba Cloud 5:Huawei Cloud</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>Alarm AI analysis status<br>-1 Analysis failed<br>0 Not analyzed<br>1 Under analysis<br>2 Analysis successful, real alarm<br>3 Analysis successful, suspicious alarm</p>
    */
    @SerializedName("AIStatus")
    @Expose
    private Long AIStatus;

    /**
    * <p>First alarm timestamp (in seconds)</p>
    */
    @SerializedName("FirstAlarmTimestamp")
    @Expose
    private Long FirstAlarmTimestamp;

    /**
    * <p>Last alarm timestamp (in seconds)</p>
    */
    @SerializedName("LastAlarmTimestamp")
    @Expose
    private Long LastAlarmTimestamp;

    /**
    * <p>AI analysis failure description. Empty string if not failed.</p>
    */
    @SerializedName("AIFailedReason")
    @Expose
    private String AIFailedReason;

    /**
     * Get <p>Alarm name</p> 
     * @return Name <p>Alarm name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Alarm name</p>
     * @param Name <p>Alarm name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Alarm level<br>0-Unavailable 1-Notification 2-Low risk 3-Medium risk 4-High risk 5-Critical</p> 
     * @return Level <p>Alarm level<br>0-Unavailable 1-Notification 2-Low risk 3-Medium risk 4-High risk 5-Critical</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>Alarm level<br>0-Unavailable 1-Notification 2-Low risk 3-Medium risk 4-High risk 5-Critical</p>
     * @param Level <p>Alarm level<br>0-Unavailable 1-Notification 2-Low risk 3-Medium risk 4-High risk 5-Critical</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>Alarm record ID</p> 
     * @return ID <p>Alarm record ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Alarm record ID</p>
     * @param ID <p>Alarm record ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Alarm rule ID</p> 
     * @return AlarmRuleID <p>Alarm rule ID</p>
     */
    public Long getAlarmRuleID() {
        return this.AlarmRuleID;
    }

    /**
     * Set <p>Alarm rule ID</p>
     * @param AlarmRuleID <p>Alarm rule ID</p>
     */
    public void setAlarmRuleID(Long AlarmRuleID) {
        this.AlarmRuleID = AlarmRuleID;
    }

    /**
     * Get <p>Alarm type<br>0 Abnormal call<br>1 Leak monitoring</p> 
     * @return AlarmType <p>Alarm type<br>0 Abnormal call<br>1 Leak monitoring</p>
     */
    public Long getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set <p>Alarm type<br>0 Abnormal call<br>1 Leak monitoring</p>
     * @param AlarmType <p>Alarm type<br>0 Abnormal call<br>1 Leak monitoring</p>
     */
    public void setAlarmType(Long AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get <p>Access key</p> 
     * @return AccessKey <p>Access key</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>Access key</p>
     * @param AccessKey <p>Access key</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>Access Key ID</p> 
     * @return AccessKeyID <p>Access Key ID</p>
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set <p>Access Key ID</p>
     * @param AccessKeyID <p>Access Key ID</p>
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get <p>Access key remark</p> 
     * @return AccessKeyRemark <p>Access key remark</p>
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set <p>Access key remark</p>
     * @param AccessKeyRemark <p>Access key remark</p>
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get <p>Last alarm time</p> 
     * @return LastAlarmTime <p>Last alarm time</p>
     */
    public String getLastAlarmTime() {
        return this.LastAlarmTime;
    }

    /**
     * Set <p>Last alarm time</p>
     * @param LastAlarmTime <p>Last alarm time</p>
     */
    public void setLastAlarmTime(String LastAlarmTime) {
        this.LastAlarmTime = LastAlarmTime;
    }

    /**
     * Get <p>Alarm status<br>0-unprocessed 1-processed 2-ignored</p> 
     * @return Status <p>Alarm status<br>0-unprocessed 1-processed 2-ignored</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Alarm status<br>0-unprocessed 1-processed 2-ignored</p>
     * @param Status <p>Alarm status<br>0-unprocessed 1-processed 2-ignored</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Aggregate date</p> 
     * @return Date <p>Aggregate date</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>Aggregate date</p>
     * @param Date <p>Aggregate date</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>Alarm tag</p> 
     * @return Tag <p>Alarm tag</p>
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Alarm tag</p>
     * @param Tag <p>Alarm tag</p>
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Uin of the main account</p> 
     * @return Uin <p>Uin of the main account</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Uin of the main account</p>
     * @param Uin <p>Uin of the main account</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>Nickname of the main account</p> 
     * @return Nickname <p>Nickname of the main account</p>
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set <p>Nickname of the main account</p>
     * @param Nickname <p>Nickname of the main account</p>
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get <p>Sub-account Uin</p> 
     * @return SubUin <p>Sub-account Uin</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>Sub-account Uin</p>
     * @param SubUin <p>Sub-account Uin</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>Sub-account nickname</p> 
     * @return SubNickname <p>Sub-account nickname</p>
     */
    public String getSubNickname() {
        return this.SubNickname;
    }

    /**
     * Set <p>Sub-account nickname</p>
     * @param SubNickname <p>Sub-account nickname</p>
     */
    public void setSubNickname(String SubNickname) {
        this.SubNickname = SubNickname;
    }

    /**
     * Get <p>Account type<br>0 Root account AK 1 Sub-account AK 2 Temporary key</p> 
     * @return Type <p>Account type<br>0 Root account AK 1 Sub-account AK 2 Temporary key</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Account type<br>0 Root account AK 1 Sub-account AK 2 Temporary key</p>
     * @param Type <p>Account type<br>0 Root account AK 1 Sub-account AK 2 Temporary key</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>App ID</p> 
     * @return AppID <p>App ID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>App ID</p>
     * @param AppID <p>App ID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Leakage evidence</p> 
     * @return LeakEvidence <p>Leakage evidence</p>
     */
    public String [] getLeakEvidence() {
        return this.LeakEvidence;
    }

    /**
     * Set <p>Leakage evidence</p>
     * @param LeakEvidence <p>Leakage evidence</p>
     */
    public void setLeakEvidence(String [] LeakEvidence) {
        this.LeakEvidence = LeakEvidence;
    }

    /**
     * Get <p>Whether support editing trust account</p> 
     * @return IsSupportEditWhiteAccount <p>Whether support editing trust account</p>
     */
    public Boolean getIsSupportEditWhiteAccount() {
        return this.IsSupportEditWhiteAccount;
    }

    /**
     * Set <p>Whether support editing trust account</p>
     * @param IsSupportEditWhiteAccount <p>Whether support editing trust account</p>
     */
    public void setIsSupportEditWhiteAccount(Boolean IsSupportEditWhiteAccount) {
        this.IsSupportEditWhiteAccount = IsSupportEditWhiteAccount;
    }

    /**
     * Get <p>Alert evidence</p> 
     * @return Evidence <p>Alert evidence</p>
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set <p>Alert evidence</p>
     * @param Evidence <p>Alert evidence</p>
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get <p>Alarm rule flag</p> 
     * @return RuleKey <p>Alarm rule flag</p>
     */
    public String getRuleKey() {
        return this.RuleKey;
    }

    /**
     * Set <p>Alarm rule flag</p>
     * @param RuleKey <p>Alarm rule flag</p>
     */
    public void setRuleKey(String RuleKey) {
        this.RuleKey = RuleKey;
    }

    /**
     * Get <p>Cloud vendor type 0:Tencent Cloud 1:Amazon Web Services 2:Microsoft Azure 3:Google Cloud 4:Alibaba Cloud 5:Huawei Cloud</p> 
     * @return CloudType <p>Cloud vendor type 0:Tencent Cloud 1:Amazon Web Services 2:Microsoft Azure 3:Google Cloud 4:Alibaba Cloud 5:Huawei Cloud</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>Cloud vendor type 0:Tencent Cloud 1:Amazon Web Services 2:Microsoft Azure 3:Google Cloud 4:Alibaba Cloud 5:Huawei Cloud</p>
     * @param CloudType <p>Cloud vendor type 0:Tencent Cloud 1:Amazon Web Services 2:Microsoft Azure 3:Google Cloud 4:Alibaba Cloud 5:Huawei Cloud</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>Alarm AI analysis status<br>-1 Analysis failed<br>0 Not analyzed<br>1 Under analysis<br>2 Analysis successful, real alarm<br>3 Analysis successful, suspicious alarm</p> 
     * @return AIStatus <p>Alarm AI analysis status<br>-1 Analysis failed<br>0 Not analyzed<br>1 Under analysis<br>2 Analysis successful, real alarm<br>3 Analysis successful, suspicious alarm</p>
     */
    public Long getAIStatus() {
        return this.AIStatus;
    }

    /**
     * Set <p>Alarm AI analysis status<br>-1 Analysis failed<br>0 Not analyzed<br>1 Under analysis<br>2 Analysis successful, real alarm<br>3 Analysis successful, suspicious alarm</p>
     * @param AIStatus <p>Alarm AI analysis status<br>-1 Analysis failed<br>0 Not analyzed<br>1 Under analysis<br>2 Analysis successful, real alarm<br>3 Analysis successful, suspicious alarm</p>
     */
    public void setAIStatus(Long AIStatus) {
        this.AIStatus = AIStatus;
    }

    /**
     * Get <p>First alarm timestamp (in seconds)</p> 
     * @return FirstAlarmTimestamp <p>First alarm timestamp (in seconds)</p>
     */
    public Long getFirstAlarmTimestamp() {
        return this.FirstAlarmTimestamp;
    }

    /**
     * Set <p>First alarm timestamp (in seconds)</p>
     * @param FirstAlarmTimestamp <p>First alarm timestamp (in seconds)</p>
     */
    public void setFirstAlarmTimestamp(Long FirstAlarmTimestamp) {
        this.FirstAlarmTimestamp = FirstAlarmTimestamp;
    }

    /**
     * Get <p>Last alarm timestamp (in seconds)</p> 
     * @return LastAlarmTimestamp <p>Last alarm timestamp (in seconds)</p>
     */
    public Long getLastAlarmTimestamp() {
        return this.LastAlarmTimestamp;
    }

    /**
     * Set <p>Last alarm timestamp (in seconds)</p>
     * @param LastAlarmTimestamp <p>Last alarm timestamp (in seconds)</p>
     */
    public void setLastAlarmTimestamp(Long LastAlarmTimestamp) {
        this.LastAlarmTimestamp = LastAlarmTimestamp;
    }

    /**
     * Get <p>AI analysis failure description. Empty string if not failed.</p> 
     * @return AIFailedReason <p>AI analysis failure description. Empty string if not failed.</p>
     */
    public String getAIFailedReason() {
        return this.AIFailedReason;
    }

    /**
     * Set <p>AI analysis failure description. Empty string if not failed.</p>
     * @param AIFailedReason <p>AI analysis failure description. Empty string if not failed.</p>
     */
    public void setAIFailedReason(String AIFailedReason) {
        this.AIFailedReason = AIFailedReason;
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
        if (source.AIFailedReason != null) {
            this.AIFailedReason = new String(source.AIFailedReason);
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
        this.setParamSimple(map, prefix + "AIFailedReason", this.AIFailedReason);

    }
}

