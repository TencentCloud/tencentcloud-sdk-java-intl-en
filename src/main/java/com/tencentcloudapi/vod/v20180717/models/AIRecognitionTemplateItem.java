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

public class AIRecognitionTemplateItem extends AbstractModel {

    /**
    * Unique ID of a video content recognition template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Video content recognition template name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the video content recognition template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Head and tail recognition control parameter.
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfo HeadTailConfigure;

    /**
    * Segmentation recognition control parameter.
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfo SegmentConfigure;

    /**
    * Face recognition control parameter.
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfo FaceConfigure;

    /**
    * Text Full-text Recognition Control Parameters.
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * Text keyword recognition control parameters.
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. Use the AsrTranslateConfigure parameter to initiate speech translation recognition (if DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full speech recognition).</font>
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfo AsrFullTextConfigure;

    /**
    * Voice keyword recognition control parameters.
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfo AsrWordsConfigure;

    /**
    * Voice translation recognition control parameters.
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfo AsrTranslateConfigure;

    /**
    * Object recognition control parameter.
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfo ObjectConfigure;

    /**
    * Screenshot interval. Measurement unit: second.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of a video content recognition template. 
     * @return Definition Unique ID of a video content recognition template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of a video content recognition template.
     * @param Definition Unique ID of a video content recognition template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Video content recognition template name. 
     * @return Name Video content recognition template name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Video content recognition template name.
     * @param Name Video content recognition template name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the video content recognition template. 
     * @return Comment Description of the video content recognition template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of the video content recognition template.
     * @param Comment Description of the video content recognition template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Head and tail recognition control parameter. 
     * @return HeadTailConfigure Head and tail recognition control parameter.
     */
    public HeadTailConfigureInfo getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set Head and tail recognition control parameter.
     * @param HeadTailConfigure Head and tail recognition control parameter.
     */
    public void setHeadTailConfigure(HeadTailConfigureInfo HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get Segmentation recognition control parameter. 
     * @return SegmentConfigure Segmentation recognition control parameter.
     */
    public SegmentConfigureInfo getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set Segmentation recognition control parameter.
     * @param SegmentConfigure Segmentation recognition control parameter.
     */
    public void setSegmentConfigure(SegmentConfigureInfo SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get Face recognition control parameter. 
     * @return FaceConfigure Face recognition control parameter.
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Face recognition control parameter.
     * @param FaceConfigure Face recognition control parameter.
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get Text Full-text Recognition Control Parameters. 
     * @return OcrFullTextConfigure Text Full-text Recognition Control Parameters.
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set Text Full-text Recognition Control Parameters.
     * @param OcrFullTextConfigure Text Full-text Recognition Control Parameters.
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get Text keyword recognition control parameters. 
     * @return OcrWordsConfigure Text keyword recognition control parameters.
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set Text keyword recognition control parameters.
     * @param OcrWordsConfigure Text keyword recognition control parameters.
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. Use the AsrTranslateConfigure parameter to initiate speech translation recognition (if DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full speech recognition).</font> 
     * @return AsrFullTextConfigure Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. Use the AsrTranslateConfigure parameter to initiate speech translation recognition (if DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full speech recognition).</font>
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. Use the AsrTranslateConfigure parameter to initiate speech translation recognition (if DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full speech recognition).</font>
     * @param AsrFullTextConfigure Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. Use the AsrTranslateConfigure parameter to initiate speech translation recognition (if DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full speech recognition).</font>
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get Voice keyword recognition control parameters. 
     * @return AsrWordsConfigure Voice keyword recognition control parameters.
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set Voice keyword recognition control parameters.
     * @param AsrWordsConfigure Voice keyword recognition control parameters.
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get Voice translation recognition control parameters. 
     * @return AsrTranslateConfigure Voice translation recognition control parameters.
     */
    public AsrTranslateConfigureInfo getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set Voice translation recognition control parameters.
     * @param AsrTranslateConfigure Voice translation recognition control parameters.
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfo AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get Object recognition control parameter. 
     * @return ObjectConfigure Object recognition control parameter.
     */
    public ObjectConfigureInfo getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set Object recognition control parameter.
     * @param ObjectConfigure Object recognition control parameter.
     */
    public void setObjectConfigure(ObjectConfigureInfo ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get Screenshot interval. Measurement unit: second. 
     * @return ScreenshotInterval Screenshot interval. Measurement unit: second.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Screenshot interval. Measurement unit: second.
     * @param ScreenshotInterval Screenshot interval. Measurement unit: second.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Template creation time in ISO date format (https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Template last modified time, use [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AIRecognitionTemplateItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIRecognitionTemplateItem(AIRecognitionTemplateItem source) {
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
        if (source.HeadTailConfigure != null) {
            this.HeadTailConfigure = new HeadTailConfigureInfo(source.HeadTailConfigure);
        }
        if (source.SegmentConfigure != null) {
            this.SegmentConfigure = new SegmentConfigureInfo(source.SegmentConfigure);
        }
        if (source.FaceConfigure != null) {
            this.FaceConfigure = new FaceConfigureInfo(source.FaceConfigure);
        }
        if (source.OcrFullTextConfigure != null) {
            this.OcrFullTextConfigure = new OcrFullTextConfigureInfo(source.OcrFullTextConfigure);
        }
        if (source.OcrWordsConfigure != null) {
            this.OcrWordsConfigure = new OcrWordsConfigureInfo(source.OcrWordsConfigure);
        }
        if (source.AsrFullTextConfigure != null) {
            this.AsrFullTextConfigure = new AsrFullTextConfigureInfo(source.AsrFullTextConfigure);
        }
        if (source.AsrWordsConfigure != null) {
            this.AsrWordsConfigure = new AsrWordsConfigureInfo(source.AsrWordsConfigure);
        }
        if (source.AsrTranslateConfigure != null) {
            this.AsrTranslateConfigure = new AsrTranslateConfigureInfo(source.AsrTranslateConfigure);
        }
        if (source.ObjectConfigure != null) {
            this.ObjectConfigure = new ObjectConfigureInfo(source.ObjectConfigure);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamObj(map, prefix + "HeadTailConfigure.", this.HeadTailConfigure);
        this.setParamObj(map, prefix + "SegmentConfigure.", this.SegmentConfigure);
        this.setParamObj(map, prefix + "FaceConfigure.", this.FaceConfigure);
        this.setParamObj(map, prefix + "OcrFullTextConfigure.", this.OcrFullTextConfigure);
        this.setParamObj(map, prefix + "OcrWordsConfigure.", this.OcrWordsConfigure);
        this.setParamObj(map, prefix + "AsrFullTextConfigure.", this.AsrFullTextConfigure);
        this.setParamObj(map, prefix + "AsrWordsConfigure.", this.AsrWordsConfigure);
        this.setParamObj(map, prefix + "AsrTranslateConfigure.", this.AsrTranslateConfigure);
        this.setParamObj(map, prefix + "ObjectConfigure.", this.ObjectConfigure);
        this.setParamSimple(map, prefix + "ScreenshotInterval", this.ScreenshotInterval);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

