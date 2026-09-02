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

public class AssetTagItem extends AbstractModel {

    /**
    * <p>Tag ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Tag key</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>Tag value</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Automatic tagging policy</p>
    */
    @SerializedName("TaggingRule")
    @Expose
    private String TaggingRule;

    /**
    * <p>Tag color</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>Number of assets bound to a tag</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Tag ID</p> 
     * @return ID <p>Tag ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Tag ID</p>
     * @param ID <p>Tag ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Tag key</p> 
     * @return TagKey <p>Tag key</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>Tag key</p>
     * @param TagKey <p>Tag key</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>Tag value</p> 
     * @return TagValue <p>Tag value</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>Tag value</p>
     * @param TagValue <p>Tag value</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Automatic tagging policy</p> 
     * @return TaggingRule <p>Automatic tagging policy</p>
     */
    public String getTaggingRule() {
        return this.TaggingRule;
    }

    /**
     * Set <p>Automatic tagging policy</p>
     * @param TaggingRule <p>Automatic tagging policy</p>
     */
    public void setTaggingRule(String TaggingRule) {
        this.TaggingRule = TaggingRule;
    }

    /**
     * Get <p>Tag color</p> 
     * @return Color <p>Tag color</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>Tag color</p>
     * @param Color <p>Tag color</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get <p>Number of assets bound to a tag</p> 
     * @return AssetCount <p>Number of assets bound to a tag</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>Number of assets bound to a tag</p>
     * @param AssetCount <p>Number of assets bound to a tag</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
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
     * Get <p>Update time.</p> 
     * @return UpdateTime <p>Update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time.</p>
     * @param UpdateTime <p>Update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AssetTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetTagItem(AssetTagItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TaggingRule != null) {
            this.TaggingRule = new String(source.TaggingRule);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaggingRule", this.TaggingRule);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

