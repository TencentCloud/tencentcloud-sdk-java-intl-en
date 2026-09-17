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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * 
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * 
    */
    @SerializedName("SubStreamSet")
    @Expose
    private MediaSubStreamInfoItem [] SubStreamSet;

    /**
    * 
    */
    @SerializedName("CopyRightWatermarkText")
    @Expose
    private String CopyRightWatermarkText;

    /**
    * 
    */
    @SerializedName("BlindWatermarkDefinition")
    @Expose
    private Long BlindWatermarkDefinition;

    /**
    * 
    */
    @SerializedName("SubtitleSet")
    @Expose
    private MediaSubtitleItem [] SubtitleSet;

    /**
    * 
    */
    @SerializedName("DefaultSubtitleId")
    @Expose
    private String DefaultSubtitleId;

    /**
    * 
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return Package 
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 
     * @param Package 
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get  
     * @return DrmType 
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set 
     * @param DrmType 
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get  
     * @return Size 
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 
     * @param Size 
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get  
     * @return DigitalWatermarkType 
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set 
     * @param DigitalWatermarkType 
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get  
     * @return SubStreamSet 
     */
    public MediaSubStreamInfoItem [] getSubStreamSet() {
        return this.SubStreamSet;
    }

    /**
     * Set 
     * @param SubStreamSet 
     */
    public void setSubStreamSet(MediaSubStreamInfoItem [] SubStreamSet) {
        this.SubStreamSet = SubStreamSet;
    }

    /**
     * Get  
     * @return CopyRightWatermarkText 
     */
    public String getCopyRightWatermarkText() {
        return this.CopyRightWatermarkText;
    }

    /**
     * Set 
     * @param CopyRightWatermarkText 
     */
    public void setCopyRightWatermarkText(String CopyRightWatermarkText) {
        this.CopyRightWatermarkText = CopyRightWatermarkText;
    }

    /**
     * Get  
     * @return BlindWatermarkDefinition 
     */
    public Long getBlindWatermarkDefinition() {
        return this.BlindWatermarkDefinition;
    }

    /**
     * Set 
     * @param BlindWatermarkDefinition 
     */
    public void setBlindWatermarkDefinition(Long BlindWatermarkDefinition) {
        this.BlindWatermarkDefinition = BlindWatermarkDefinition;
    }

    /**
     * Get  
     * @return SubtitleSet 
     */
    public MediaSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 
     * @param SubtitleSet 
     */
    public void setSubtitleSet(MediaSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get  
     * @return DefaultSubtitleId 
     */
    public String getDefaultSubtitleId() {
        return this.DefaultSubtitleId;
    }

    /**
     * Set 
     * @param DefaultSubtitleId 
     */
    public void setDefaultSubtitleId(String DefaultSubtitleId) {
        this.DefaultSubtitleId = DefaultSubtitleId;
    }

    /**
     * Get  
     * @return DrmEncryptType 
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set 
     * @param DrmEncryptType 
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
    }

    public AdaptiveDynamicStreamingInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingInfoItem(AdaptiveDynamicStreamingInfoItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.SubStreamSet != null) {
            this.SubStreamSet = new MediaSubStreamInfoItem[source.SubStreamSet.length];
            for (int i = 0; i < source.SubStreamSet.length; i++) {
                this.SubStreamSet[i] = new MediaSubStreamInfoItem(source.SubStreamSet[i]);
            }
        }
        if (source.CopyRightWatermarkText != null) {
            this.CopyRightWatermarkText = new String(source.CopyRightWatermarkText);
        }
        if (source.BlindWatermarkDefinition != null) {
            this.BlindWatermarkDefinition = new Long(source.BlindWatermarkDefinition);
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new MediaSubtitleItem[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new MediaSubtitleItem(source.SubtitleSet[i]);
            }
        }
        if (source.DefaultSubtitleId != null) {
            this.DefaultSubtitleId = new String(source.DefaultSubtitleId);
        }
        if (source.DrmEncryptType != null) {
            this.DrmEncryptType = new String(source.DrmEncryptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamArrayObj(map, prefix + "SubStreamSet.", this.SubStreamSet);
        this.setParamSimple(map, prefix + "CopyRightWatermarkText", this.CopyRightWatermarkText);
        this.setParamSimple(map, prefix + "BlindWatermarkDefinition", this.BlindWatermarkDefinition);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);
        this.setParamSimple(map, prefix + "DefaultSubtitleId", this.DefaultSubtitleId);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);

    }
}

