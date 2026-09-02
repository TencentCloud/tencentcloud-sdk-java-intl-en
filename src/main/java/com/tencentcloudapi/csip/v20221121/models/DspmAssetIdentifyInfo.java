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

public class DspmAssetIdentifyInfo extends AbstractModel {

    /**
    * <p>Asset instance id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Asset name</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: MySQL</li><li>mariadb: MariaDB</li><li>mongodb: MongoDB</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Number of detected databases</p>
    */
    @SerializedName("DetectedDbCount")
    @Expose
    private Long DetectedDbCount;

    /**
    * <p>Number of detected tables</p>
    */
    @SerializedName("DetectedTableCount")
    @Expose
    private Long DetectedTableCount;

    /**
    * <p>Data item id set</p>
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * <p>Collection of data item names.</p>
    */
    @SerializedName("RuleNames")
    @Expose
    private String [] RuleNames;

    /**
    * <p>Category id set</p>
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * <p>Collection of category names</p>
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * <p>Highest level ID</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * <p>Highest level name</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>Sensitivity level</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
    * <p>Detection time</p>
    */
    @SerializedName("DetectedTime")
    @Expose
    private String DetectedTime;

    /**
    * <p>Category details</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Account name</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>Account ID</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get <p>Asset instance id</p> 
     * @return AssetId <p>Asset instance id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset instance id</p>
     * @param AssetId <p>Asset instance id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Asset name</p> 
     * @return AssetName <p>Asset name</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>Asset name</p>
     * @param AssetName <p>Asset name</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: MySQL</li><li>mariadb: MariaDB</li><li>mongodb: MongoDB</li></ul> 
     * @return AssetType <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: MySQL</li><li>mariadb: MariaDB</li><li>mongodb: MongoDB</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: MySQL</li><li>mariadb: MariaDB</li><li>mongodb: MongoDB</li></ul>
     * @param AssetType <p>Asset type</p><p>Enumeration values:</p><ul><li>cdb: MySQL</li><li>mariadb: MariaDB</li><li>mongodb: MongoDB</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Number of detected databases</p> 
     * @return DetectedDbCount <p>Number of detected databases</p>
     */
    public Long getDetectedDbCount() {
        return this.DetectedDbCount;
    }

    /**
     * Set <p>Number of detected databases</p>
     * @param DetectedDbCount <p>Number of detected databases</p>
     */
    public void setDetectedDbCount(Long DetectedDbCount) {
        this.DetectedDbCount = DetectedDbCount;
    }

    /**
     * Get <p>Number of detected tables</p> 
     * @return DetectedTableCount <p>Number of detected tables</p>
     */
    public Long getDetectedTableCount() {
        return this.DetectedTableCount;
    }

    /**
     * Set <p>Number of detected tables</p>
     * @param DetectedTableCount <p>Number of detected tables</p>
     */
    public void setDetectedTableCount(Long DetectedTableCount) {
        this.DetectedTableCount = DetectedTableCount;
    }

    /**
     * Get <p>Data item id set</p> 
     * @return RuleIds <p>Data item id set</p>
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set <p>Data item id set</p>
     * @param RuleIds <p>Data item id set</p>
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get <p>Collection of data item names.</p> 
     * @return RuleNames <p>Collection of data item names.</p>
     */
    public String [] getRuleNames() {
        return this.RuleNames;
    }

    /**
     * Set <p>Collection of data item names.</p>
     * @param RuleNames <p>Collection of data item names.</p>
     */
    public void setRuleNames(String [] RuleNames) {
        this.RuleNames = RuleNames;
    }

    /**
     * Get <p>Category id set</p> 
     * @return CategoryIds <p>Category id set</p>
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set <p>Category id set</p>
     * @param CategoryIds <p>Category id set</p>
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get <p>Collection of category names</p> 
     * @return CategoryNames <p>Collection of category names</p>
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set <p>Collection of category names</p>
     * @param CategoryNames <p>Collection of category names</p>
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get <p>Highest level ID</p> 
     * @return LevelId <p>Highest level ID</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>Highest level ID</p>
     * @param LevelId <p>Highest level ID</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get <p>Highest level name</p> 
     * @return LevelName <p>Highest level name</p>
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set <p>Highest level name</p>
     * @param LevelName <p>Highest level name</p>
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get <p>Sensitivity level</p> 
     * @return LevelScore <p>Sensitivity level</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>Sensitivity level</p>
     * @param LevelScore <p>Sensitivity level</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    /**
     * Get <p>Detection time</p> 
     * @return DetectedTime <p>Detection time</p>
     */
    public String getDetectedTime() {
        return this.DetectedTime;
    }

    /**
     * Set <p>Detection time</p>
     * @param DetectedTime <p>Detection time</p>
     */
    public void setDetectedTime(String DetectedTime) {
        this.DetectedTime = DetectedTime;
    }

    /**
     * Get <p>Category details</p> 
     * @return CategoryDetails <p>Category details</p>
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>Category details</p>
     * @param CategoryDetails <p>Category details</p>
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Account name</p> 
     * @return NickName <p>Account name</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>Account name</p>
     * @param NickName <p>Account name</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>Account ID</p> 
     * @return Uin <p>Account ID</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>Account ID</p>
     * @param Uin <p>Account ID</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public DspmAssetIdentifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetIdentifyInfo(DspmAssetIdentifyInfo source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.DetectedDbCount != null) {
            this.DetectedDbCount = new Long(source.DetectedDbCount);
        }
        if (source.DetectedTableCount != null) {
            this.DetectedTableCount = new Long(source.DetectedTableCount);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.RuleNames != null) {
            this.RuleNames = new String[source.RuleNames.length];
            for (int i = 0; i < source.RuleNames.length; i++) {
                this.RuleNames[i] = new String(source.RuleNames[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
        if (source.CategoryNames != null) {
            this.CategoryNames = new String[source.CategoryNames.length];
            for (int i = 0; i < source.CategoryNames.length; i++) {
                this.CategoryNames[i] = new String(source.CategoryNames[i]);
            }
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
        if (source.DetectedTime != null) {
            this.DetectedTime = new String(source.DetectedTime);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new DspmIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new DspmIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "DetectedDbCount", this.DetectedDbCount);
        this.setParamSimple(map, prefix + "DetectedTableCount", this.DetectedTableCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "RuleNames.", this.RuleNames);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);
        this.setParamSimple(map, prefix + "DetectedTime", this.DetectedTime);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

