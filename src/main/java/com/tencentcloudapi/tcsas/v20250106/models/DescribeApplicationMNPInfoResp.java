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

public class DescribeApplicationMNPInfoResp extends AbstractModel {

    /**
    * <p>Mini program or mini game appid.</p>
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * <p>Mini program or mini game icon.</p>
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * <p>Mini program or mini game name.</p>
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * <p>Mini program or mini game introduction.</p>
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * <p>Creator.</p>
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modifier.</p>
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * <p>Last modified time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Available status. Valid value: 0: Not available; 1 Available; 2: In canary release.</p>
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * <p>Engine type. Specifies the runtime engine by product type. Valid values: 0: Mini program; 1: Mini game.</p>
    */
    @SerializedName("EngineType")
    @Expose
    private Long EngineType;

    /**
    * <p>Category information.</p>
    */
    @SerializedName("CategoryList")
    @Expose
    private CategoryInfo [] CategoryList;

    /**
    * <p>Team ID.</p>
    */
    @SerializedName("TeamId")
    @Expose
    private String TeamId;

    /**
    * <p>Team name.</p>
    */
    @SerializedName("TeamName")
    @Expose
    private String TeamName;

    /**
    * <p>Team type ID.</p>
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
     * Get <p>Mini program or mini game appid.</p> 
     * @return MNPId <p>Mini program or mini game appid.</p>
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set <p>Mini program or mini game appid.</p>
     * @param MNPId <p>Mini program or mini game appid.</p>
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get <p>Mini program or mini game icon.</p> 
     * @return MNPIcon <p>Mini program or mini game icon.</p>
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set <p>Mini program or mini game icon.</p>
     * @param MNPIcon <p>Mini program or mini game icon.</p>
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get <p>Mini program or mini game name.</p> 
     * @return MNPName <p>Mini program or mini game name.</p>
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set <p>Mini program or mini game name.</p>
     * @param MNPName <p>Mini program or mini game name.</p>
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get <p>Mini program or mini game introduction.</p> 
     * @return MNPIntro <p>Mini program or mini game introduction.</p>
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set <p>Mini program or mini game introduction.</p>
     * @param MNPIntro <p>Mini program or mini game introduction.</p>
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
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
     * Get <p>Last modifier.</p> 
     * @return UpdateUser <p>Last modifier.</p>
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set <p>Last modifier.</p>
     * @param UpdateUser <p>Last modifier.</p>
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get <p>Last modified time.</p> 
     * @return UpdateTime <p>Last modified time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last modified time.</p>
     * @param UpdateTime <p>Last modified time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Available status. Valid value: 0: Not available; 1 Available; 2: In canary release.</p> 
     * @return OnlineStatus <p>Available status. Valid value: 0: Not available; 1 Available; 2: In canary release.</p>
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set <p>Available status. Valid value: 0: Not available; 1 Available; 2: In canary release.</p>
     * @param OnlineStatus <p>Available status. Valid value: 0: Not available; 1 Available; 2: In canary release.</p>
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get <p>Engine type. Specifies the runtime engine by product type. Valid values: 0: Mini program; 1: Mini game.</p> 
     * @return EngineType <p>Engine type. Specifies the runtime engine by product type. Valid values: 0: Mini program; 1: Mini game.</p>
     */
    public Long getEngineType() {
        return this.EngineType;
    }

    /**
     * Set <p>Engine type. Specifies the runtime engine by product type. Valid values: 0: Mini program; 1: Mini game.</p>
     * @param EngineType <p>Engine type. Specifies the runtime engine by product type. Valid values: 0: Mini program; 1: Mini game.</p>
     */
    public void setEngineType(Long EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get <p>Category information.</p> 
     * @return CategoryList <p>Category information.</p>
     */
    public CategoryInfo [] getCategoryList() {
        return this.CategoryList;
    }

    /**
     * Set <p>Category information.</p>
     * @param CategoryList <p>Category information.</p>
     */
    public void setCategoryList(CategoryInfo [] CategoryList) {
        this.CategoryList = CategoryList;
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
     * Get <p>Team type ID.</p> 
     * @return TeamTypeId <p>Team type ID.</p>
     */
    public Long getTeamTypeId() {
        return this.TeamTypeId;
    }

    /**
     * Set <p>Team type ID.</p>
     * @param TeamTypeId <p>Team type ID.</p>
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

    public DescribeApplicationMNPInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationMNPInfoResp(DescribeApplicationMNPInfoResp source) {
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPIcon != null) {
            this.MNPIcon = new String(source.MNPIcon);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.MNPIntro != null) {
            this.MNPIntro = new String(source.MNPIntro);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.EngineType != null) {
            this.EngineType = new Long(source.EngineType);
        }
        if (source.CategoryList != null) {
            this.CategoryList = new CategoryInfo[source.CategoryList.length];
            for (int i = 0; i < source.CategoryList.length; i++) {
                this.CategoryList[i] = new CategoryInfo(source.CategoryList[i]);
            }
        }
        if (source.TeamId != null) {
            this.TeamId = new String(source.TeamId);
        }
        if (source.TeamName != null) {
            this.TeamName = new String(source.TeamName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPIcon", this.MNPIcon);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "MNPIntro", this.MNPIntro);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArrayObj(map, prefix + "CategoryList.", this.CategoryList);
        this.setParamSimple(map, prefix + "TeamId", this.TeamId);
        this.setParamSimple(map, prefix + "TeamName", this.TeamName);
        this.setParamSimple(map, prefix + "TeamTypeId", this.TeamTypeId);
        this.setParamArrayObj(map, prefix + "AgeRatings.", this.AgeRatings);

    }
}

