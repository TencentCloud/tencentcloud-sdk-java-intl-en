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

public class RawSmartEraseParameter extends AbstractModel {

    /**
    * Specifies the removal type.
-subtitle removal.
-Remove watermark.
-privacy protection.
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * Subtitle erasure configuration.
When EraseType is subtitle, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * Specifies the watermark removal configuration.
When EraseType is watermark, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * Privacy protection configuration.
When EraseType is privacy, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
     * Get Specifies the removal type.
-subtitle removal.
-Remove watermark.
-privacy protection. 
     * @return EraseType Specifies the removal type.
-subtitle removal.
-Remove watermark.
-privacy protection.
     */
    public String getEraseType() {
        return this.EraseType;
    }

    /**
     * Set Specifies the removal type.
-subtitle removal.
-Remove watermark.
-privacy protection.
     * @param EraseType Specifies the removal type.
-subtitle removal.
-Remove watermark.
-privacy protection.
     */
    public void setEraseType(String EraseType) {
        this.EraseType = EraseType;
    }

    /**
     * Get Subtitle erasure configuration.
When EraseType is subtitle, this field is required.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EraseSubtitleConfig Subtitle erasure configuration.
When EraseType is subtitle, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set Subtitle erasure configuration.
When EraseType is subtitle, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EraseSubtitleConfig Subtitle erasure configuration.
When EraseType is subtitle, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get Specifies the watermark removal configuration.
When EraseType is watermark, this field is required.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return EraseWatermarkConfig Specifies the watermark removal configuration.
When EraseType is watermark, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set Specifies the watermark removal configuration.
When EraseType is watermark, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param EraseWatermarkConfig Specifies the watermark removal configuration.
When EraseType is watermark, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get Privacy protection configuration.
When EraseType is privacy, this field is required.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ErasePrivacyConfig Privacy protection configuration.
When EraseType is privacy, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set Privacy protection configuration.
When EraseType is privacy, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ErasePrivacyConfig Privacy protection configuration.
When EraseType is privacy, this field is required.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    public RawSmartEraseParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSmartEraseParameter(RawSmartEraseParameter source) {
        if (source.EraseType != null) {
            this.EraseType = new String(source.EraseType);
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
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);

    }
}

