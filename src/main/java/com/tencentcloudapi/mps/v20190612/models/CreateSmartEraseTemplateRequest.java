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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSmartEraseTemplateRequest extends AbstractModel {

    /**
    * Length limit for the smart erasing template name: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Erasing type.
-subtitle: subtitle removal.
-watermark: watermark removal.
-privacy: privacy protection.
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * Length limit for the description information of the smart erasing template: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
     * Get Length limit for the smart erasing template name: 64 characters. 
     * @return Name Length limit for the smart erasing template name: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Length limit for the smart erasing template name: 64 characters.
     * @param Name Length limit for the smart erasing template name: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Erasing type.
-subtitle: subtitle removal.
-watermark: watermark removal.
-privacy: privacy protection. 
     * @return EraseType Erasing type.
-subtitle: subtitle removal.
-watermark: watermark removal.
-privacy: privacy protection.
     */
    public String getEraseType() {
        return this.EraseType;
    }

    /**
     * Set Erasing type.
-subtitle: subtitle removal.
-watermark: watermark removal.
-privacy: privacy protection.
     * @param EraseType Erasing type.
-subtitle: subtitle removal.
-watermark: watermark removal.
-privacy: privacy protection.
     */
    public void setEraseType(String EraseType) {
        this.EraseType = EraseType;
    }

    /**
     * Get Length limit for the description information of the smart erasing template: 256 characters. 
     * @return Comment Length limit for the description information of the smart erasing template: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Length limit for the description information of the smart erasing template: 256 characters.
     * @param Comment Length limit for the description information of the smart erasing template: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle. 
     * @return EraseSubtitleConfig Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.
     * @param EraseSubtitleConfig Subtitle erasing configuration. This parameter is required and valid only when the value of EraseType is set to subtitle.
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark. 
     * @return EraseWatermarkConfig Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.
     * @param EraseWatermarkConfig Watermark erasing configuration. This parameter is required and valid only when the value of EraseType is set to watermark.
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy. 
     * @return ErasePrivacyConfig Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.
     * @param ErasePrivacyConfig Privacy protection configuration. This parameter is required and valid only when the value of EraseType is set to privacy.
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    public CreateSmartEraseTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSmartEraseTemplateRequest(CreateSmartEraseTemplateRequest source) {
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
            this.EraseSubtitleConfig = new SmartEraseSubtitleConfig(source.EraseSubtitleConfig);
        }
        if (source.EraseWatermarkConfig != null) {
            this.EraseWatermarkConfig = new SmartEraseWatermarkConfig(source.EraseWatermarkConfig);
        }
        if (source.ErasePrivacyConfig != null) {
            this.ErasePrivacyConfig = new SmartErasePrivacyConfig(source.ErasePrivacyConfig);
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

    }
}

