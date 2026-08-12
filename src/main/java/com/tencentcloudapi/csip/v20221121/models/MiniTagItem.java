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

public class MiniTagItem extends AbstractModel {

    /**
    * Tag display color.
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * Tag description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Tag ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Tag key (Chinese).
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * Tag value (Chinese).
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * Tag key (English).
    */
    @SerializedName("TagKeyEn")
    @Expose
    private String TagKeyEn;

    /**
    * Tag value (English).
    */
    @SerializedName("TagValueEn")
    @Expose
    private String TagValueEn;

    /**
     * Get Tag display color. 
     * @return Color Tag display color.
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set Tag display color.
     * @param Color Tag display color.
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get Tag description. 
     * @return Description Tag description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Tag description.
     * @param Description Tag description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Tag ID. 
     * @return ID Tag ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Tag ID.
     * @param ID Tag ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Tag key (Chinese). 
     * @return TagKey Tag key (Chinese).
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set Tag key (Chinese).
     * @param TagKey Tag key (Chinese).
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get Tag value (Chinese). 
     * @return TagValue Tag value (Chinese).
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set Tag value (Chinese).
     * @param TagValue Tag value (Chinese).
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get Tag key (English). 
     * @return TagKeyEn Tag key (English).
     */
    public String getTagKeyEn() {
        return this.TagKeyEn;
    }

    /**
     * Set Tag key (English).
     * @param TagKeyEn Tag key (English).
     */
    public void setTagKeyEn(String TagKeyEn) {
        this.TagKeyEn = TagKeyEn;
    }

    /**
     * Get Tag value (English). 
     * @return TagValueEn Tag value (English).
     */
    public String getTagValueEn() {
        return this.TagValueEn;
    }

    /**
     * Set Tag value (English).
     * @param TagValueEn Tag value (English).
     */
    public void setTagValueEn(String TagValueEn) {
        this.TagValueEn = TagValueEn;
    }

    public MiniTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MiniTagItem(MiniTagItem source) {
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.TagKeyEn != null) {
            this.TagKeyEn = new String(source.TagKeyEn);
        }
        if (source.TagValueEn != null) {
            this.TagValueEn = new String(source.TagValueEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "TagKeyEn", this.TagKeyEn);
        this.setParamSimple(map, prefix + "TagValueEn", this.TagValueEn);

    }
}

