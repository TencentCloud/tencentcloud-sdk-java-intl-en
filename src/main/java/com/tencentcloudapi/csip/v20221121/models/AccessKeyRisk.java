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

public class AccessKeyRisk extends AbstractModel {

    /**
    * Risk name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Risk level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Risk record ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Risk rule ID.
    */
    @SerializedName("RiskRuleID")
    @Expose
    private Long RiskRuleID;

    /**
    * Risk type.
Configuration risk.
    */
    @SerializedName("RiskType")
    @Expose
    private Long RiskType;

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
    * Detection time of risk.
    */
    @SerializedName("RiskTime")
    @Expose
    private String RiskTime;

    /**
    * Risk status.
0 - unprocessed 2 - ignored 3 - converged.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Risk Tag.
    */
    @SerializedName("Tag")
    @Expose
    private String [] Tag;

    /**
    * Risk evidence.
    */
    @SerializedName("Evidence")
    @Expose
    private String Evidence;

    /**
    * Risk description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
0 root account AK 1 sub-account AK.
2 temporary key.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Detection status.
0: detected.
1 indicates detecting.
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
    * App ID
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Query parameter corresponding to the risk.
    */
    @SerializedName("QueryParam")
    @Expose
    private String QueryParam;

    /**
    * Cloud type 0 for tencent cloud 4 for alibaba cloud.
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * Related AK list, including AK name and remark.
    */
    @SerializedName("RelatedAK")
    @Expose
    private AKInfo [] RelatedAK;

    /**
     * Get Risk name. 
     * @return Name Risk name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Risk name.
     * @param Name Risk name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Risk level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical. 
     * @return Level Risk level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
     * @param Level Risk level.
0 - unavailable 1 - Note 2 - low risk 3 - medium risk 4 - high risk 5 - critical.
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Risk record ID. 
     * @return ID Risk record ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Risk record ID.
     * @param ID Risk record ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Risk rule ID. 
     * @return RiskRuleID Risk rule ID.
     */
    public Long getRiskRuleID() {
        return this.RiskRuleID;
    }

    /**
     * Set Risk rule ID.
     * @param RiskRuleID Risk rule ID.
     */
    public void setRiskRuleID(Long RiskRuleID) {
        this.RiskRuleID = RiskRuleID;
    }

    /**
     * Get Risk type.
Configuration risk. 
     * @return RiskType Risk type.
Configuration risk.
     */
    public Long getRiskType() {
        return this.RiskType;
    }

    /**
     * Set Risk type.
Configuration risk.
     * @param RiskType Risk type.
Configuration risk.
     */
    public void setRiskType(Long RiskType) {
        this.RiskType = RiskType;
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
     * Get Detection time of risk. 
     * @return RiskTime Detection time of risk.
     */
    public String getRiskTime() {
        return this.RiskTime;
    }

    /**
     * Set Detection time of risk.
     * @param RiskTime Detection time of risk.
     */
    public void setRiskTime(String RiskTime) {
        this.RiskTime = RiskTime;
    }

    /**
     * Get Risk status.
0 - unprocessed 2 - ignored 3 - converged. 
     * @return Status Risk status.
0 - unprocessed 2 - ignored 3 - converged.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Risk status.
0 - unprocessed 2 - ignored 3 - converged.
     * @param Status Risk status.
0 - unprocessed 2 - ignored 3 - converged.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Risk Tag. 
     * @return Tag Risk Tag.
     */
    public String [] getTag() {
        return this.Tag;
    }

    /**
     * Set Risk Tag.
     * @param Tag Risk Tag.
     */
    public void setTag(String [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Risk evidence. 
     * @return Evidence Risk evidence.
     */
    public String getEvidence() {
        return this.Evidence;
    }

    /**
     * Set Risk evidence.
     * @param Evidence Risk evidence.
     */
    public void setEvidence(String Evidence) {
        this.Evidence = Evidence;
    }

    /**
     * Get Risk description. 
     * @return Description Risk description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Risk description.
     * @param Description Risk description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
0 root account AK 1 sub-account AK.
2 temporary key. 
     * @return Type Account type.
0 root account AK 1 sub-account AK.
2 temporary key.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Account type.
0 root account AK 1 sub-account AK.
2 temporary key.
     * @param Type Account type.
0 root account AK 1 sub-account AK.
2 temporary key.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Detection status.
0: detected.
1 indicates detecting. 
     * @return CheckStatus Detection status.
0: detected.
1 indicates detecting.
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set Detection status.
0: detected.
1 indicates detecting.
     * @param CheckStatus Detection status.
0: detected.
1 indicates detecting.
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
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
     * Get Query parameter corresponding to the risk. 
     * @return QueryParam Query parameter corresponding to the risk.
     */
    public String getQueryParam() {
        return this.QueryParam;
    }

    /**
     * Set Query parameter corresponding to the risk.
     * @param QueryParam Query parameter corresponding to the risk.
     */
    public void setQueryParam(String QueryParam) {
        this.QueryParam = QueryParam;
    }

    /**
     * Get Cloud type 0 for tencent cloud 4 for alibaba cloud. 
     * @return CloudType Cloud type 0 for tencent cloud 4 for alibaba cloud.
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud type 0 for tencent cloud 4 for alibaba cloud.
     * @param CloudType Cloud type 0 for tencent cloud 4 for alibaba cloud.
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get Related AK list, including AK name and remark. 
     * @return RelatedAK Related AK list, including AK name and remark.
     */
    public AKInfo [] getRelatedAK() {
        return this.RelatedAK;
    }

    /**
     * Set Related AK list, including AK name and remark.
     * @param RelatedAK Related AK list, including AK name and remark.
     */
    public void setRelatedAK(AKInfo [] RelatedAK) {
        this.RelatedAK = RelatedAK;
    }

    public AccessKeyRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyRisk(AccessKeyRisk source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RiskRuleID != null) {
            this.RiskRuleID = new Long(source.RiskRuleID);
        }
        if (source.RiskType != null) {
            this.RiskType = new Long(source.RiskType);
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
        if (source.RiskTime != null) {
            this.RiskTime = new String(source.RiskTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tag != null) {
            this.Tag = new String[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new String(source.Tag[i]);
            }
        }
        if (source.Evidence != null) {
            this.Evidence = new String(source.Evidence);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.QueryParam != null) {
            this.QueryParam = new String(source.QueryParam);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.RelatedAK != null) {
            this.RelatedAK = new AKInfo[source.RelatedAK.length];
            for (int i = 0; i < source.RelatedAK.length; i++) {
                this.RelatedAK[i] = new AKInfo(source.RelatedAK[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RiskRuleID", this.RiskRuleID);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "AccessKeyRemark", this.AccessKeyRemark);
        this.setParamSimple(map, prefix + "RiskTime", this.RiskTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "Evidence", this.Evidence);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubNickname", this.SubNickname);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "QueryParam", this.QueryParam);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamArrayObj(map, prefix + "RelatedAK.", this.RelatedAK);

    }
}

