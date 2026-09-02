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

public class ModifyAssetTagRequest extends AbstractModel {

    /**
    * <p>Tag key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Tag value.</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>Tag ID</p>
    */
    @SerializedName("TagID")
    @Expose
    private Long TagID;

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Color</p>
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Tagging policy.</p>
    */
    @SerializedName("TaggingRule")
    @Expose
    private String TaggingRule;

    /**
    * <p>Whether to execute asset tagging immediately</p>
    */
    @SerializedName("ApplyNow")
    @Expose
    private Boolean ApplyNow;

    /**
     * Get <p>Tag key</p> 
     * @return Key <p>Tag key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>Tag key</p>
     * @param Key <p>Tag key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Tag value.</p> 
     * @return Value <p>Tag value.</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Tag value.</p>
     * @param Value <p>Tag value.</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>Tag ID</p> 
     * @return TagID <p>Tag ID</p>
     */
    public Long getTagID() {
        return this.TagID;
    }

    /**
     * Set <p>Tag ID</p>
     * @param TagID <p>Tag ID</p>
     */
    public void setTagID(Long TagID) {
        this.TagID = TagID;
    }

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Color</p> 
     * @return Color <p>Color</p>
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set <p>Color</p>
     * @param Color <p>Color</p>
     */
    public void setColor(String Color) {
        this.Color = Color;
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
     * Get <p>Tagging policy.</p> 
     * @return TaggingRule <p>Tagging policy.</p>
     */
    public String getTaggingRule() {
        return this.TaggingRule;
    }

    /**
     * Set <p>Tagging policy.</p>
     * @param TaggingRule <p>Tagging policy.</p>
     */
    public void setTaggingRule(String TaggingRule) {
        this.TaggingRule = TaggingRule;
    }

    /**
     * Get <p>Whether to execute asset tagging immediately</p> 
     * @return ApplyNow <p>Whether to execute asset tagging immediately</p>
     */
    public Boolean getApplyNow() {
        return this.ApplyNow;
    }

    /**
     * Set <p>Whether to execute asset tagging immediately</p>
     * @param ApplyNow <p>Whether to execute asset tagging immediately</p>
     */
    public void setApplyNow(Boolean ApplyNow) {
        this.ApplyNow = ApplyNow;
    }

    public ModifyAssetTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAssetTagRequest(ModifyAssetTagRequest source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.TagID != null) {
            this.TagID = new Long(source.TagID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TaggingRule != null) {
            this.TaggingRule = new String(source.TaggingRule);
        }
        if (source.ApplyNow != null) {
            this.ApplyNow = new Boolean(source.ApplyNow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TagID", this.TagID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TaggingRule", this.TaggingRule);
        this.setParamSimple(map, prefix + "ApplyNow", this.ApplyNow);

    }
}

