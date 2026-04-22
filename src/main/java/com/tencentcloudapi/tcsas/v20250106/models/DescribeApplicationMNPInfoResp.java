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
    * Mini program or mini game appid
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program or mini game icon
    */
    @SerializedName("MNPIcon")
    @Expose
    private String MNPIcon;

    /**
    * Mini program or mini game name
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Mini program or mini game information
    */
    @SerializedName("MNPIntro")
    @Expose
    private String MNPIntro;

    /**
    * Creator
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modifier
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Online status. 0 Not available; 1 Available
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * Engine type. 0 Mini program; 1 Mini game
    */
    @SerializedName("EngineType")
    @Expose
    private Long EngineType;

    /**
    * Category information
    */
    @SerializedName("CategoryList")
    @Expose
    private CategoryInfo [] CategoryList;

    /**
     * Get Mini program or mini game appid 
     * @return MNPId Mini program or mini game appid
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program or mini game appid
     * @param MNPId Mini program or mini game appid
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program or mini game icon 
     * @return MNPIcon Mini program or mini game icon
     */
    public String getMNPIcon() {
        return this.MNPIcon;
    }

    /**
     * Set Mini program or mini game icon
     * @param MNPIcon Mini program or mini game icon
     */
    public void setMNPIcon(String MNPIcon) {
        this.MNPIcon = MNPIcon;
    }

    /**
     * Get Mini program or mini game name 
     * @return MNPName Mini program or mini game name
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program or mini game name
     * @param MNPName Mini program or mini game name
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
    }

    /**
     * Get Mini program or mini game information 
     * @return MNPIntro Mini program or mini game information
     */
    public String getMNPIntro() {
        return this.MNPIntro;
    }

    /**
     * Set Mini program or mini game information
     * @param MNPIntro Mini program or mini game information
     */
    public void setMNPIntro(String MNPIntro) {
        this.MNPIntro = MNPIntro;
    }

    /**
     * Get Creator 
     * @return CreateUser Creator
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
     * @param CreateUser Creator
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modifier 
     * @return UpdateUser Modifier
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Modifier
     * @param UpdateUser Modifier
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Online status. 0 Not available; 1 Available 
     * @return OnlineStatus Online status. 0 Not available; 1 Available
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set Online status. 0 Not available; 1 Available
     * @param OnlineStatus Online status. 0 Not available; 1 Available
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get Engine type. 0 Mini program; 1 Mini game 
     * @return EngineType Engine type. 0 Mini program; 1 Mini game
     */
    public Long getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Engine type. 0 Mini program; 1 Mini game
     * @param EngineType Engine type. 0 Mini program; 1 Mini game
     */
    public void setEngineType(Long EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get Category information 
     * @return CategoryList Category information
     */
    public CategoryInfo [] getCategoryList() {
        return this.CategoryList;
    }

    /**
     * Set Category information
     * @param CategoryList Category information
     */
    public void setCategoryList(CategoryInfo [] CategoryList) {
        this.CategoryList = CategoryList;
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

    }
}

