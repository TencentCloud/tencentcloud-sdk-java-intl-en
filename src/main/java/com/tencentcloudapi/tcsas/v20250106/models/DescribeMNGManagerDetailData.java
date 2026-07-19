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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGManagerDetailData extends AbstractModel {

    /**
    * <p>Mini game category.</p>
    */
    @SerializedName("MNPType")
    @Expose
    private String MNPType;

    /**
    * <p>Mini game appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini game name.</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini game icon.</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Mini game introduction.</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Mini game description.</p>
    */
    @SerializedName("MNPDesc")
    @Expose
    private String MNPDesc;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Access status. Valid values: 1: Not connected; 2: Connected. 
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Mini game available status. Valid values: 1: Available; 2: Not available.</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Mini game information in multiple languages.</p>
    */
    @SerializedName("I18nList")
    @Expose
    private MNPDetailI18nVO [] I18nList;

    /**
    * <p>Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.</p>
    */
    @SerializedName("TeamTypeId")
    @Expose
    private Long TeamTypeId;

    /**
    * <p>Age rating information.</p>
    */
    @SerializedName("AgeRatings")
    @Expose
    private AgeRatingItem [] AgeRatings;

    /**
    * <p>Merchant ID information bound to the team to which this mini program belongs.</p>
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
     * Get <p>Mini game category.</p> 
     * @return MNPType <p>Mini game category.</p>
     */
    public String getMNPType() {
        return this.MNPType;
    }

    /**
     * Set <p>Mini game category.</p>
     * @param MNPType <p>Mini game category.</p>
     */
    public void setMNPType(String MNPType) {
        this.MNPType = MNPType;
    }

    /**
     * Get <p>Mini game appid.</p> 
     * @return MNPId <p>Mini game appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini game appid.</p>
     * @param MNPId <p>Mini game appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini game name.</p> 
     * @return MNPName <p>Mini game name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini game name.</p>
     * @param MNPName <p>Mini game name.</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini game icon.</p> 
     * @return MNPIcon <p>Mini game icon.</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini game icon.</p>
     * @param MNPIcon <p>Mini game icon.</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Mini game introduction.</p> 
     * @return MNPIntro <p>Mini game introduction.</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini game introduction.</p>
     * @param MNPIntro <p>Mini game introduction.</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get <p>Mini game description.</p> 
     * @return MNPDesc <p>Mini game description.</p>
     */
    public String getMNPDesc() {
        return this.MNPDesc;
    }

    /**
     * Set <p>Mini game description.</p>
     * @param MNPDesc <p>Mini game description.</p>
     */
    public void setMNPDesc(String MNPDesc) {
        this.MNPDesc = MNPDesc;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Creator.</p> 
     * @return CreateUser <p>Creator.</p>
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set <p>Creator.</p>
     * @param CreateUser <p>Creator.</p>
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Access status. Valid values: 1: Not connected; 2: Connected.  
     * @return AccessStatus Access status. Valid values: 1: Not connected; 2: Connected. 
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set Access status. Valid values: 1: Not connected; 2: Connected. 
     * @param AccessStatus Access status. Valid values: 1: Not connected; 2: Connected. 
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
    }

    /**
     * Get <p>Team name.</p> 
     * @return TeamName <p>Team name.</p>
     */
    public String getTeamName() {
        return this.TeamName;
    }

    /**
     * Set <p>Team name.</p>
     * @param TeamName <p>Team name.</p>
     */
    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    /**
     * Get <p>Team ID.</p> 
     * @return TeamId <p>Team ID.</p>
     */
    public String getTeamId() {
        return this.TeamId;
    }

    /**
     * Set <p>Team ID.</p>
     * @param TeamId <p>Team ID.</p>
     */
    public void setTeamId(String TeamId) {
        this.TeamId = TeamId;
    }

    /**
     * Get <p>Mini game available status. Valid values: 1: Available; 2: Not available.</p> 
     * @return Status <p>Mini game available status. Valid values: 1: Available; 2: Not available.</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Mini game available status. Valid values: 1: Available; 2: Not available.</p>
     * @param Status <p>Mini game available status. Valid values: 1: Available; 2: Not available.</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Mini game information in multiple languages.</p> 
     * @return I18nList <p>Mini game information in multiple languages.</p>
     */
    public MNPDetailI18nVO [] getI18nList() {
        return this.I18nList;
    }

    /**
     * Set <p>Mini game information in multiple languages.</p>
     * @param I18nList <p>Mini game information in multiple languages.</p>
     */
    public void setI18nList(MNPDetailI18nVO [] I18nList) {
        this.I18nList = I18nList;
    }

    /**
     * Get <p>Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.</p> 
     * @return TeamTypeId <p>Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.</p>
     */
    public Long getTeamTypeId() {
        return this.TeamTypeId;
    }

    /**
     * Set <p>Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.</p>
     * @param TeamTypeId <p>Team type ID. Valid values: 1: Mini program team; 2: Superapp team; 3: Service provider team.</p>
     */
    public void setTeamTypeId(Long TeamTypeId) {
        this.TeamTypeId = TeamTypeId;
    }

    /**
     * Get <p>Age rating information.</p> 
     * @return AgeRatings <p>Age rating information.</p>
     */
    public AgeRatingItem [] getAgeRatings() {
        return this.AgeRatings;
    }

    /**
     * Set <p>Age rating information.</p>
     * @param AgeRatings <p>Age rating information.</p>
     */
    public void setAgeRatings(AgeRatingItem [] AgeRatings) {
        this.AgeRatings = AgeRatings;
    }

    /**
     * Get <p>Merchant ID information bound to the team to which this mini program belongs.</p> 
     * @return MerchantId <p>Merchant ID information bound to the team to which this mini program belongs.</p>
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set <p>Merchant ID information bound to the team to which this mini program belongs.</p>
     * @param MerchantId <p>Merchant ID information bound to the team to which this mini program belongs.</p>
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    public DescribeMNGManagerDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGManagerDetailData(DescribeMNGManagerDetailData source) {
        if (source.MNPType != null) {
            this.MNPType = new String(source.MNPType);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.MNPDesc != null) {
            this.MNPDesc = new String(source.MNPDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.AccessStatus != null) {
            this.AccessStatus = new Long(source.AccessStatus);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.I18nList != null) {
            this.I18nList = new MNPDetailI18nVO[source.I18nList.length];
            for (int i = 0; i < source.I18nList.length; i++) {
                this.I18nList[i] = new MNPDetailI18nVO(source.I18nList[i]);
            }
        }
        if (source.TeamTypeId != null) {
            this.TeamTypeId = new Long(source.TeamTypeId);
        }
        if (source.AgeRatings != null) {
            this.AgeRatings = new AgeRatingItem[source.AgeRatings.length];
            for (int i = 0; i < source.AgeRatings.length; i++) {
                this.AgeRatings[i] = new AgeRatingItem(source.AgeRatings[i]);
            }
        }
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPType", this.MNPType);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "MNPDesc", this.MNPDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "AccessStatus", this.AccessStatus);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "I18nList.", this.I18nList);
        this.setParamSimple(map, prefix + "TeamTypeId", this.TeamTypeId);
        this.setParamArrayObj(map, prefix + "AgeRatings.", this.AgeRatings);
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);

    }
}

