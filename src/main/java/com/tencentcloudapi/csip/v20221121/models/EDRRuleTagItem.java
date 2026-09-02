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

public class EDRRuleTagItem extends AbstractModel {

    /**
    * <p>Security center tag ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Tag Key in Chinese</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>Tag English key</p>
    */
    @SerializedName("TagKeyEn")
    @Expose
    private String TagKeyEn;

    /**
    * <p>Tag Chinese value</p>
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * <p>Tag value in English.</p>
    */
    @SerializedName("TagValueEn")
    @Expose
    private String TagValueEn;

    /**
    * <p>Tag description</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Tag color</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
     * Get <p>Security center tag ID</p> 
     * @return ID <p>Security center tag ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Security center tag ID</p>
     * @param ID <p>Security center tag ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Tag Key in Chinese</p> 
     * @return TagKey <p>Tag Key in Chinese</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>Tag Key in Chinese</p>
     * @param TagKey <p>Tag Key in Chinese</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>Tag English key</p> 
     * @return TagKeyEn <p>Tag English key</p>
     */
    public String getTagKeyEn() {
        return this.TagKeyEn;
    }

    /**
     * Set <p>Tag English key</p>
     * @param TagKeyEn <p>Tag English key</p>
     */
    public void setTagKeyEn(String TagKeyEn) {
        this.TagKeyEn = TagKeyEn;
    }

    /**
     * Get <p>Tag Chinese value</p> 
     * @return TagValue <p>Tag Chinese value</p>
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set <p>Tag Chinese value</p>
     * @param TagValue <p>Tag Chinese value</p>
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get <p>Tag value in English.</p> 
     * @return TagValueEn <p>Tag value in English.</p>
     */
    public String getTagValueEn() {
        return this.TagValueEn;
    }

    /**
     * Set <p>Tag value in English.</p>
     * @param TagValueEn <p>Tag value in English.</p>
     */
    public void setTagValueEn(String TagValueEn) {
        this.TagValueEn = TagValueEn;
    }

    /**
     * Get <p>Tag description</p> 
     * @return Description <p>Tag description</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Tag description</p>
     * @param Description <p>Tag description</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public EDRRuleTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRRuleTagItem(EDRRuleTagItem source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagKeyEn != null) {
            this.TagKeyEn = new String(source.TagKeyEn);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.TagValueEn != null) {
            this.TagValueEn = new String(source.TagValueEn);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagKeyEn", this.TagKeyEn);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "TagValueEn", this.TagValueEn);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

