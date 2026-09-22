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

public class ModifyAIRecognitionTemplateRequest extends AbstractModel {

    /**
    * Unique ID of the audio/video content recognition template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Audio/Video content recognition template name, with a length limit of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the audio/video content recognition template, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Video opening and closing recognition control parameter.
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfoForUpdate HeadTailConfigure;

    /**
    * Video split recognition control parameters.
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfoForUpdate SegmentConfigure;

    /**
    * Face recognition control parameter.
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfoForUpdate FaceConfigure;

    /**
    * Text Full-text Recognition Control Parameters.
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure;

    /**
    * Text keyword recognition control parameters.
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfoForUpdate OcrWordsConfigure;

    /**
    * Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate voice translation recognition (when DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure;

    /**
    * Voice keyword recognition control parameters.
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfoForUpdate AsrWordsConfigure;

    /**
    * Voice translation recognition control parameters.
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfoForUpdate AsrTranslateConfigure;

    /**
    * Object recognition control parameter.
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfoForUpdate ObjectConfigure;

    /**
    * Frame interval in seconds, with a minimum value of 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
     * Get Unique ID of the audio/video content recognition template. 
     * @return Definition Unique ID of the audio/video content recognition template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of the audio/video content recognition template.
     * @param Definition Unique ID of the audio/video content recognition template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Audio/Video content recognition template name, with a length limit of 64 characters. 
     * @return Name Audio/Video content recognition template name, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Audio/Video content recognition template name, with a length limit of 64 characters.
     * @param Name Audio/Video content recognition template name, with a length limit of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the audio/video content recognition template, with a length limit of 256 characters. 
     * @return Comment Description of the audio/video content recognition template, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of the audio/video content recognition template, with a length limit of 256 characters.
     * @param Comment Description of the audio/video content recognition template, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Video opening and closing recognition control parameter. 
     * @return HeadTailConfigure Video opening and closing recognition control parameter.
     */
    public HeadTailConfigureInfoForUpdate getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set Video opening and closing recognition control parameter.
     * @param HeadTailConfigure Video opening and closing recognition control parameter.
     */
    public void setHeadTailConfigure(HeadTailConfigureInfoForUpdate HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get Video split recognition control parameters. 
     * @return SegmentConfigure Video split recognition control parameters.
     */
    public SegmentConfigureInfoForUpdate getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set Video split recognition control parameters.
     * @param SegmentConfigure Video split recognition control parameters.
     */
    public void setSegmentConfigure(SegmentConfigureInfoForUpdate SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get Face recognition control parameter. 
     * @return FaceConfigure Face recognition control parameter.
     */
    public FaceConfigureInfoForUpdate getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Face recognition control parameter.
     * @param FaceConfigure Face recognition control parameter.
     */
    public void setFaceConfigure(FaceConfigureInfoForUpdate FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get Text Full-text Recognition Control Parameters. 
     * @return OcrFullTextConfigure Text Full-text Recognition Control Parameters.
     */
    public OcrFullTextConfigureInfoForUpdate getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set Text Full-text Recognition Control Parameters.
     * @param OcrFullTextConfigure Text Full-text Recognition Control Parameters.
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get Text keyword recognition control parameters. 
     * @return OcrWordsConfigure Text keyword recognition control parameters.
     */
    public OcrWordsConfigureInfoForUpdate getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set Text keyword recognition control parameters.
     * @param OcrWordsConfigure Text keyword recognition control parameters.
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfoForUpdate OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate voice translation recognition (when DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font> 
     * @return AsrFullTextConfigure Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate voice translation recognition (when DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
     */
    public AsrFullTextConfigureInfoForUpdate getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate voice translation recognition (when DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
     * @param AsrFullTextConfigure Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate voice translation recognition (when DstLanguage is not specified or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get Voice keyword recognition control parameters. 
     * @return AsrWordsConfigure Voice keyword recognition control parameters.
     */
    public AsrWordsConfigureInfoForUpdate getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set Voice keyword recognition control parameters.
     * @param AsrWordsConfigure Voice keyword recognition control parameters.
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfoForUpdate AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get Voice translation recognition control parameters. 
     * @return AsrTranslateConfigure Voice translation recognition control parameters.
     */
    public AsrTranslateConfigureInfoForUpdate getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set Voice translation recognition control parameters.
     * @param AsrTranslateConfigure Voice translation recognition control parameters.
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfoForUpdate AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get Object recognition control parameter. 
     * @return ObjectConfigure Object recognition control parameter.
     */
    public ObjectConfigureInfoForUpdate getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set Object recognition control parameter.
     * @param ObjectConfigure Object recognition control parameter.
     */
    public void setObjectConfigure(ObjectConfigureInfoForUpdate ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get Frame interval in seconds, with a minimum value of 0.5 seconds. 
     * @return ScreenshotInterval Frame interval in seconds, with a minimum value of 0.5 seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame interval in seconds, with a minimum value of 0.5 seconds.
     * @param ScreenshotInterval Frame interval in seconds, with a minimum value of 0.5 seconds.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    public ModifyAIRecognitionTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIRecognitionTemplateRequest(ModifyAIRecognitionTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.HeadTailConfigure != null) {
            this.HeadTailConfigure = new HeadTailConfigureInfoForUpdate(source.HeadTailConfigure);
        }
        if (source.SegmentConfigure != null) {
            this.SegmentConfigure = new SegmentConfigureInfoForUpdate(source.SegmentConfigure);
        }
        if (source.FaceConfigure != null) {
            this.FaceConfigure = new FaceConfigureInfoForUpdate(source.FaceConfigure);
        }
        if (source.OcrFullTextConfigure != null) {
            this.OcrFullTextConfigure = new OcrFullTextConfigureInfoForUpdate(source.OcrFullTextConfigure);
        }
        if (source.OcrWordsConfigure != null) {
            this.OcrWordsConfigure = new OcrWordsConfigureInfoForUpdate(source.OcrWordsConfigure);
        }
        if (source.AsrFullTextConfigure != null) {
            this.AsrFullTextConfigure = new AsrFullTextConfigureInfoForUpdate(source.AsrFullTextConfigure);
        }
        if (source.AsrWordsConfigure != null) {
            this.AsrWordsConfigure = new AsrWordsConfigureInfoForUpdate(source.AsrWordsConfigure);
        }
        if (source.AsrTranslateConfigure != null) {
            this.AsrTranslateConfigure = new AsrTranslateConfigureInfoForUpdate(source.AsrTranslateConfigure);
        }
        if (source.ObjectConfigure != null) {
            this.ObjectConfigure = new ObjectConfigureInfoForUpdate(source.ObjectConfigure);
        }
        if (source.ScreenshotInterval != null) {
            this.ScreenshotInterval = new Float(source.ScreenshotInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
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

    }
}

