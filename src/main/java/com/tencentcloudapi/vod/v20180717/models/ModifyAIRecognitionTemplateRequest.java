/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Unique ID of video content recognition template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Video content recognition template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of video content recognition template. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Control parameter of video opening and ending credits recognition.
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfoForUpdate HeadTailConfigure;

    /**
    * Control parameter of video splitting recognition.
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfoForUpdate SegmentConfigure;

    /**
    * Control parameter of face recognition.
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfoForUpdate FaceConfigure;

    /**
    * Control parameter of full text recognition.
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure;

    /**
    * Control parameter of text keyword recognition.
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfoForUpdate OcrWordsConfigure;

    /**
    * Control parameter of full speech recognition.
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure;

    /**
    * Control parameter of speech keyword recognition.
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfoForUpdate AsrWordsConfigure;

    /**
    * Control parameter of voice translation.
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfoForUpdate AsrTranslateConfigure;

    /**
    * Control parameter of object recognition.
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfoForUpdate ObjectConfigure;

    /**
    * Frame capturing interval in seconds. Minimum value: 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

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
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Video content recognition template name. Length limit: 64 characters. 
     * @return Name Video content recognition template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Video content recognition template name. Length limit: 64 characters.
     * @param Name Video content recognition template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of video content recognition template. Length limit: 256 characters. 
     * @return Comment Description of video content recognition template. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of video content recognition template. Length limit: 256 characters.
     * @param Comment Description of video content recognition template. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Control parameter of video opening and ending credits recognition. 
     * @return HeadTailConfigure Control parameter of video opening and ending credits recognition.
     */
    public HeadTailConfigureInfoForUpdate getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set Control parameter of video opening and ending credits recognition.
     * @param HeadTailConfigure Control parameter of video opening and ending credits recognition.
     */
    public void setHeadTailConfigure(HeadTailConfigureInfoForUpdate HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get Control parameter of video splitting recognition. 
     * @return SegmentConfigure Control parameter of video splitting recognition.
     */
    public SegmentConfigureInfoForUpdate getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set Control parameter of video splitting recognition.
     * @param SegmentConfigure Control parameter of video splitting recognition.
     */
    public void setSegmentConfigure(SegmentConfigureInfoForUpdate SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get Control parameter of face recognition. 
     * @return FaceConfigure Control parameter of face recognition.
     */
    public FaceConfigureInfoForUpdate getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Control parameter of face recognition.
     * @param FaceConfigure Control parameter of face recognition.
     */
    public void setFaceConfigure(FaceConfigureInfoForUpdate FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get Control parameter of full text recognition. 
     * @return OcrFullTextConfigure Control parameter of full text recognition.
     */
    public OcrFullTextConfigureInfoForUpdate getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set Control parameter of full text recognition.
     * @param OcrFullTextConfigure Control parameter of full text recognition.
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get Control parameter of text keyword recognition. 
     * @return OcrWordsConfigure Control parameter of text keyword recognition.
     */
    public OcrWordsConfigureInfoForUpdate getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set Control parameter of text keyword recognition.
     * @param OcrWordsConfigure Control parameter of text keyword recognition.
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfoForUpdate OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get Control parameter of full speech recognition. 
     * @return AsrFullTextConfigure Control parameter of full speech recognition.
     */
    public AsrFullTextConfigureInfoForUpdate getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Control parameter of full speech recognition.
     * @param AsrFullTextConfigure Control parameter of full speech recognition.
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get Control parameter of speech keyword recognition. 
     * @return AsrWordsConfigure Control parameter of speech keyword recognition.
     */
    public AsrWordsConfigureInfoForUpdate getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set Control parameter of speech keyword recognition.
     * @param AsrWordsConfigure Control parameter of speech keyword recognition.
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfoForUpdate AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get Control parameter of voice translation. 
     * @return AsrTranslateConfigure Control parameter of voice translation.
     */
    public AsrTranslateConfigureInfoForUpdate getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set Control parameter of voice translation.
     * @param AsrTranslateConfigure Control parameter of voice translation.
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfoForUpdate AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get Control parameter of object recognition. 
     * @return ObjectConfigure Control parameter of object recognition.
     */
    public ObjectConfigureInfoForUpdate getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set Control parameter of object recognition.
     * @param ObjectConfigure Control parameter of object recognition.
     */
    public void setObjectConfigure(ObjectConfigureInfoForUpdate ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get Frame capturing interval in seconds. Minimum value: 0.5 seconds. 
     * @return ScreenshotInterval Frame capturing interval in seconds. Minimum value: 0.5 seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame capturing interval in seconds. Minimum value: 0.5 seconds.
     * @param ScreenshotInterval Frame capturing interval in seconds. Minimum value: 0.5 seconds.
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

