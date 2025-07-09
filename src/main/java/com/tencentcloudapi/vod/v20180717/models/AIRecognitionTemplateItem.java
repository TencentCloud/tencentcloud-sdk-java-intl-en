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
    * Unique ID of video content recognition template.
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
    * Video content recognition template description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type, values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Control parameter of opening and closing credits recognition.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfo HeadTailConfigure;

    /**
    * Control parameter of splitting recognition.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfo SegmentConfigure;

    /**
    * Face recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfo FaceConfigure;

    /**
    * Full text recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * Text keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * Full speech recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfo AsrFullTextConfigure;

    /**
    * Speech keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfo AsrWordsConfigure;

    /**
    * Voice translation control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfo AsrTranslateConfigure;

    /**
    * Control parameter of object recognition.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfo ObjectConfigure;

    /**
    * Screencapturing interval in seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique ID of video content recognition template. 
     * @return Definition Unique ID of video content recognition template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of video content recognition template.
     * @param Definition Unique ID of video content recognition template.
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
     * Get Video content recognition template description. 
     * @return Comment Video content recognition template description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Video content recognition template description.
     * @param Comment Video content recognition template description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type, values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li> 
     * @return Type Template type, values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type, values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
     * @param Type Template type, values:
<li>Preset: system preset template;</li>
<li>Custom: user-defined template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Control parameter of opening and closing credits recognition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeadTailConfigure Control parameter of opening and closing credits recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public HeadTailConfigureInfo getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set Control parameter of opening and closing credits recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeadTailConfigure Control parameter of opening and closing credits recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeadTailConfigure(HeadTailConfigureInfo HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get Control parameter of splitting recognition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SegmentConfigure Control parameter of splitting recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public SegmentConfigureInfo getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set Control parameter of splitting recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SegmentConfigure Control parameter of splitting recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentConfigure(SegmentConfigureInfo SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get Face recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceConfigure Face recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Face recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceConfigure Face recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get Full text recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrFullTextConfigure Full text recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set Full text recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrFullTextConfigure Full text recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get Text keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return OcrWordsConfigure Text keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set Text keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param OcrWordsConfigure Text keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get Full speech recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrFullTextConfigure Full speech recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Full speech recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrFullTextConfigure Full speech recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get Speech keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrWordsConfigure Speech keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set Speech keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrWordsConfigure Speech keyword recognition control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get Voice translation control parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AsrTranslateConfigure Voice translation control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AsrTranslateConfigureInfo getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set Voice translation control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AsrTranslateConfigure Voice translation control parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfo AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get Control parameter of object recognition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ObjectConfigure Control parameter of object recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ObjectConfigureInfo getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set Control parameter of object recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ObjectConfigure Control parameter of object recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectConfigure(ObjectConfigureInfo ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get Screencapturing interval in seconds. 
     * @return ScreenshotInterval Screencapturing interval in seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Screencapturing interval in seconds.
     * @param ScreenshotInterval Screencapturing interval in seconds.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    /**
     * Get Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
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

