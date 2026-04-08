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
    * <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul>
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * <p>Subtitle erasing configuration;<br>This field is required when the value of EraseType is set to subtitle.</p>
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private UpdateSmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * <p>Watermark erasing configuration.<br>This field is required when the value of EraseType is set to watermark.</p>
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private UpdateSmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * <p>Privacy protection configuration.<br>This field is required when the value of EraseType is privacy.</p>
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private UpdateSmartErasePrivacyConfig ErasePrivacyConfig;

    /**
    * <p>id of the subtitle removal suppression template.</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

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
     * Get <p>Subtitle erasing configuration;<br>This field is required when the value of EraseType is set to subtitle.</p> 
     * @return EraseSubtitleConfig <p>Subtitle erasing configuration;<br>This field is required when the value of EraseType is set to subtitle.</p>
     */
    public UpdateSmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set <p>Subtitle erasing configuration;<br>This field is required when the value of EraseType is set to subtitle.</p>
     * @param EraseSubtitleConfig <p>Subtitle erasing configuration;<br>This field is required when the value of EraseType is set to subtitle.</p>
     */
    public void setEraseSubtitleConfig(UpdateSmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get <p>Watermark erasing configuration.<br>This field is required when the value of EraseType is set to watermark.</p> 
     * @return EraseWatermarkConfig <p>Watermark erasing configuration.<br>This field is required when the value of EraseType is set to watermark.</p>
     */
    public UpdateSmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set <p>Watermark erasing configuration.<br>This field is required when the value of EraseType is set to watermark.</p>
     * @param EraseWatermarkConfig <p>Watermark erasing configuration.<br>This field is required when the value of EraseType is set to watermark.</p>
     */
    public void setEraseWatermarkConfig(UpdateSmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get <p>Privacy protection configuration.<br>This field is required when the value of EraseType is privacy.</p> 
     * @return ErasePrivacyConfig <p>Privacy protection configuration.<br>This field is required when the value of EraseType is privacy.</p>
     */
    public UpdateSmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set <p>Privacy protection configuration.<br>This field is required when the value of EraseType is privacy.</p>
     * @param ErasePrivacyConfig <p>Privacy protection configuration.<br>This field is required when the value of EraseType is privacy.</p>
     */
    public void setErasePrivacyConfig(UpdateSmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    /**
     * Get <p>id of the subtitle removal suppression template.</p> 
     * @return SubtitleEmbedId <p>id of the subtitle removal suppression template.</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>id of the subtitle removal suppression template.</p>
     * @param SubtitleEmbedId <p>id of the subtitle removal suppression template.</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
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
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
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
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);

    }
}

