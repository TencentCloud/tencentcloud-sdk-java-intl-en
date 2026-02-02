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

public class SmartEraseTemplateItem extends AbstractModel {

    /**
    * Unique identifier of the smart erasing template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Smart erasing template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Smart erasing template description information.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
* Preset: system preset template.
* Custom: user-defined template.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EraseSubtitleConfig")
    @Expose
    private SmartEraseSubtitleConfig EraseSubtitleConfig;

    /**
    * Watermark erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EraseWatermarkConfig")
    @Expose
    private SmartEraseWatermarkConfig EraseWatermarkConfig;

    /**
    * Privacy protection configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErasePrivacyConfig")
    @Expose
    private SmartErasePrivacyConfig ErasePrivacyConfig;

    /**
    * Template creation time in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modification time of the template in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Alias of the preset smart erasing template.
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
     * Get Unique identifier of the smart erasing template. 
     * @return Definition Unique identifier of the smart erasing template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the smart erasing template.
     * @param Definition Unique identifier of the smart erasing template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Smart erasing template name. 
     * @return Name Smart erasing template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Smart erasing template name.
     * @param Name Smart erasing template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Smart erasing template description information. 
     * @return Comment Smart erasing template description information.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Smart erasing template description information.
     * @param Comment Smart erasing template description information.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
* Preset: system preset template.
* Custom: user-defined template. 
     * @return Type Template type. Valid values:
* Preset: system preset template.
* Custom: user-defined template.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
* Preset: system preset template.
* Custom: user-defined template.
     * @param Type Template type. Valid values:
* Preset: system preset template.
* Custom: user-defined template.
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get Subtitle erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EraseSubtitleConfig Subtitle erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartEraseSubtitleConfig getEraseSubtitleConfig() {
        return this.EraseSubtitleConfig;
    }

    /**
     * Set Subtitle erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EraseSubtitleConfig Subtitle erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEraseSubtitleConfig(SmartEraseSubtitleConfig EraseSubtitleConfig) {
        this.EraseSubtitleConfig = EraseSubtitleConfig;
    }

    /**
     * Get Watermark erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EraseWatermarkConfig Watermark erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartEraseWatermarkConfig getEraseWatermarkConfig() {
        return this.EraseWatermarkConfig;
    }

    /**
     * Set Watermark erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EraseWatermarkConfig Watermark erasing configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEraseWatermarkConfig(SmartEraseWatermarkConfig EraseWatermarkConfig) {
        this.EraseWatermarkConfig = EraseWatermarkConfig;
    }

    /**
     * Get Privacy protection configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ErasePrivacyConfig Privacy protection configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SmartErasePrivacyConfig getErasePrivacyConfig() {
        return this.ErasePrivacyConfig;
    }

    /**
     * Set Privacy protection configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ErasePrivacyConfig Privacy protection configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setErasePrivacyConfig(SmartErasePrivacyConfig ErasePrivacyConfig) {
        this.ErasePrivacyConfig = ErasePrivacyConfig;
    }

    /**
     * Get Template creation time in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52). 
     * @return CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
     * @param CreateTime Template creation time in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modification time of the template in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52). 
     * @return UpdateTime Last modification time of the template in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modification time of the template in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
     * @param UpdateTime Last modification time of the template in [ISO datetime format](https://www.tencentcloud.comom/document/product/862/37710?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Alias of the preset smart erasing template. 
     * @return AliasName Alias of the preset smart erasing template.
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set Alias of the preset smart erasing template.
     * @param AliasName Alias of the preset smart erasing template.
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    public SmartEraseTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseTemplateItem(SmartEraseTemplateItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EraseType", this.EraseType);
        this.setParamObj(map, prefix + "EraseSubtitleConfig.", this.EraseSubtitleConfig);
        this.setParamObj(map, prefix + "EraseWatermarkConfig.", this.EraseWatermarkConfig);
        this.setParamObj(map, prefix + "ErasePrivacyConfig.", this.ErasePrivacyConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);

    }
}

