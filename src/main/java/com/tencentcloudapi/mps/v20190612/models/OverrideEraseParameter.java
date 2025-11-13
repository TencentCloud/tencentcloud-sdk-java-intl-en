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

public class OverrideEraseParameter extends AbstractModel {

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
    * Subtitle erasing configuration.
This field is required when the value of EraseType is subtitle.
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private UpdateSmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * Watermark erasing configuration.
This field is required when the value of EraseType is watermark.
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private UpdateSmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * Privacy protection configuration.
This field is required when the value of EraseType is privacy.
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private UpdateSmartErasePrivacyConfig ErasePrivacyConfig;

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
     * Get Subtitle erasing configuration.
This field is required when the value of EraseType is subtitle. 
     * @return EraseSubtitleConfig Subtitle erasing configuration.
This field is required when the value of EraseType is subtitle.
     */
    public UpdateSmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set Subtitle erasing configuration.
This field is required when the value of EraseType is subtitle.
     * @param EraseSubtitleConfig Subtitle erasing configuration.
This field is required when the value of EraseType is subtitle.
     */
    public void setEraseSubtitleConfig(UpdateSmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get Watermark erasing configuration.
This field is required when the value of EraseType is watermark. 
     * @return EraseWatermarkConfig Watermark erasing configuration.
This field is required when the value of EraseType is watermark.
     */
    public UpdateSmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set Watermark erasing configuration.
This field is required when the value of EraseType is watermark.
     * @param EraseWatermarkConfig Watermark erasing configuration.
This field is required when the value of EraseType is watermark.
     */
    public void setEraseWatermarkConfig(UpdateSmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get Privacy protection configuration.
This field is required when the value of EraseType is privacy. 
     * @return ErasePrivacyConfig Privacy protection configuration.
This field is required when the value of EraseType is privacy.
     */
    public UpdateSmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set Privacy protection configuration.
This field is required when the value of EraseType is privacy.
     * @param ErasePrivacyConfig Privacy protection configuration.
This field is required when the value of EraseType is privacy.
     */
    public void setErasePrivacyConfig(UpdateSmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    public OverrideEraseParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverrideEraseParameter(OverrideEraseParameter source) {
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
        }
        if (source.EraseSubtitleConfig != null) {
            this.EraseSubtitleConfig = new UpdateSmartEraseSubtitleConfig(source.EraseSubtitleConfig);
        }
        if (source.EraseWatermarkConfig != null) {
            this.EraseWatermarkConfig = new UpdateSmartEraseWatermarkConfig(source.EraseWatermarkConfig);
        }
        if (source.ErasePrivacyConfig != null) {
            this.ErasePrivacyConfig = new UpdateSmartErasePrivacyConfig(source.ErasePrivacyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);

    }
}

