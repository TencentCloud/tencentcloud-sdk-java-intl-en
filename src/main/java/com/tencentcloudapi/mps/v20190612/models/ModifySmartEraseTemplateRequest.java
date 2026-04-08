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

public class ModifySmartEraseTemplateRequest extends AbstractModel {

    /**
    * <p>Unique identifier of the intelligent erasure template</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Length limit for the smart erasing template name: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Length limit for the description information of the smart erasing template: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Removal Type</p><ul><li>subtitle removal</li><li>watermark removal</li><li>privacy protection</li></ul>
    */
    @SerializedName("EraseType")
    @Expose
    private String EraseType;

    /**
    * <p>Subtitle erasing configuration. It takes effect when the value of EraseType is set to subtitle, or when the value of EraseType is left unspecified but the original EraseType value of the modified template is subtitle.</p>
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * <p>Watermark erasing configuration. The value of EraseType can be set to watermark or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to watermark.</p>
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * <p>Privacy protection configuration. The value of EraseType can be set to privacy or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to privacy.</p>
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
     * Get <p>Unique identifier of the intelligent erasure template</p> 
     * @return Definition <p>Unique identifier of the intelligent erasure template</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of the intelligent erasure template</p>
     * @param Definition <p>Unique identifier of the intelligent erasure template</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

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
     * Get <p>Subtitle erasing configuration. It takes effect when the value of EraseType is set to subtitle, or when the value of EraseType is left unspecified but the original EraseType value of the modified template is subtitle.</p> 
     * @return EraseSubtitleConfig <p>Subtitle erasing configuration. It takes effect when the value of EraseType is set to subtitle, or when the value of EraseType is left unspecified but the original EraseType value of the modified template is subtitle.</p>
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set <p>Subtitle erasing configuration. It takes effect when the value of EraseType is set to subtitle, or when the value of EraseType is left unspecified but the original EraseType value of the modified template is subtitle.</p>
     * @param EraseSubtitleConfig <p>Subtitle erasing configuration. It takes effect when the value of EraseType is set to subtitle, or when the value of EraseType is left unspecified but the original EraseType value of the modified template is subtitle.</p>
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get <p>Watermark erasing configuration. The value of EraseType can be set to watermark or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to watermark.</p> 
     * @return EraseWatermarkConfig <p>Watermark erasing configuration. The value of EraseType can be set to watermark or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to watermark.</p>
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set <p>Watermark erasing configuration. The value of EraseType can be set to watermark or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to watermark.</p>
     * @param EraseWatermarkConfig <p>Watermark erasing configuration. The value of EraseType can be set to watermark or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to watermark.</p>
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get <p>Privacy protection configuration. The value of EraseType can be set to privacy or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to privacy.</p> 
     * @return ErasePrivacyConfig <p>Privacy protection configuration. The value of EraseType can be set to privacy or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to privacy.</p>
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set <p>Privacy protection configuration. The value of EraseType can be set to privacy or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to privacy.</p>
     * @param ErasePrivacyConfig <p>Privacy protection configuration. The value of EraseType can be set to privacy or left unspecified. This parameter is valid only when the value of EraseType of the corresponding template is set to privacy.</p>
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    public ModifySmartEraseTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmartEraseTemplateRequest(ModifySmartEraseTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);

    }
}

