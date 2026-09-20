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

public class MPSSmartEraseTemplate extends AbstractModel {

    /**
    * <p>Length limit for the smart erasing template name: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul>
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * <p>Length limit for the description information of the smart erasing template: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.</p>
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private MPSSmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * <p>Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.</p>
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private MPSSmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * <p>Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.</p>
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private MPSSmartErasePrivacyConfig ErasePrivacyConfig;

    /**
    * <p>Width of the sample video or image, in pixels.</p>
    */
    @SerializedName("SampleWidth")
    @Expose
    private Long SampleWidth;

    /**
    * <p>Height of the sample video or image, in pixels.</p>
    */
    @SerializedName("SampleHeight")
    @Expose
    private Long SampleHeight;

    /**
     * Get <p>Length limit for the smart erasing template name: 64 characters.</p> 
     * @return Name <p>Length limit for the smart erasing template name: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Length limit for the smart erasing template name: 64 characters.</p>
     * @param Name <p>Length limit for the smart erasing template name: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul> 
     * @return EraseType <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul>
     */
    public String getEraseType() {
        return this.EraseType;
    }

    /**
     * Set <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul>
     * @param EraseType <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul>
     */
    public void setEraseType(String EraseType) {
        this.EraseType = EraseType;
    }

    /**
     * Get <p>Length limit for the description information of the smart erasing template: 256 characters.</p> 
     * @return Comment <p>Length limit for the description information of the smart erasing template: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Length limit for the description information of the smart erasing template: 256 characters.</p>
     * @param Comment <p>Length limit for the description information of the smart erasing template: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.</p> 
     * @return EraseSubtitleConfig <p>Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.</p>
     */
    public MPSSmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set <p>Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.</p>
     * @param EraseSubtitleConfig <p>Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.</p>
     */
    public void setEraseSubtitleConfig(MPSSmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get <p>Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.</p> 
     * @return EraseWatermarkConfig <p>Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.</p>
     */
    public MPSSmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set <p>Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.</p>
     * @param EraseWatermarkConfig <p>Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.</p>
     */
    public void setEraseWatermarkConfig(MPSSmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get <p>Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.</p> 
     * @return ErasePrivacyConfig <p>Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.</p>
     */
    public MPSSmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set <p>Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.</p>
     * @param ErasePrivacyConfig <p>Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.</p>
     */
    public void setErasePrivacyConfig(MPSSmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    /**
     * Get <p>Width of the sample video or image, in pixels.</p> 
     * @return SampleWidth <p>Width of the sample video or image, in pixels.</p>
     */
    public Long getSampleWidth() {
        return this.SampleWidth;
    }

    /**
     * Set <p>Width of the sample video or image, in pixels.</p>
     * @param SampleWidth <p>Width of the sample video or image, in pixels.</p>
     */
    public void setSampleWidth(Long SampleWidth) {
        this.SampleWidth = SampleWidth;
    }

    /**
     * Get <p>Height of the sample video or image, in pixels.</p> 
     * @return SampleHeight <p>Height of the sample video or image, in pixels.</p>
     */
    public Long getSampleHeight() {
        return this.SampleHeight;
    }

    /**
     * Set <p>Height of the sample video or image, in pixels.</p>
     * @param SampleHeight <p>Height of the sample video or image, in pixels.</p>
     */
    public void setSampleHeight(Long SampleHeight) {
        this.SampleHeight = SampleHeight;
    }

    public MPSSmartEraseTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSmartEraseTemplate(MPSSmartEraseTemplate source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.EraseSubtitleConfig != null) {
            this.EraseSubtitleConfig = new MPSSmartEraseSubtitleConfig(source.EraseSubtitleConfig);
        }
        if (source.EraseWatermarkConfig != null) {
            this.EraseWatermarkConfig = new MPSSmartEraseWatermarkConfig(source.EraseWatermarkConfig);
        }
        if (source.ErasePrivacyConfig != null) {
            this.ErasePrivacyConfig = new MPSSmartErasePrivacyConfig(source.ErasePrivacyConfig);
        }
        if (source.SampleWidth != null) {
            this.SampleWidth = new Long(source.SampleWidth);
        }
        if (source.SampleHeight != null) {
            this.SampleHeight = new Long(source.SampleHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);
        this.setParamSimple(map, prefix + "SampleWidth", this.SampleWidth);
        this.setParamSimple(map, prefix + "SampleHeight", this.SampleHeight);

    }
}

