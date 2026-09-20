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

public class CreateAIRecognitionTemplateRequest extends AbstractModel {

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
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
    * Description of the audio/video content recognition template, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Control parameters for video opening and closing recognition.
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfo HeadTailConfigure;

    /**
    * Video split recognition control parameters.
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfo SegmentConfigure;

    /**
    * Control parameters for face recognition.
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
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate speech translation recognition (when DstLanguage is not filled in or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
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
    * Speech translation recognition control parameters.
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfo AsrTranslateConfigure;

    /**
    * Control parameters for object recognition.
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfo ObjectConfigure;

    /**
    * Frame interception interval in seconds. If not specified, the default frame interval is 1 second, with a minimum value of 0.5 seconds.
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD services after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
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
     * Get Control parameters for video opening and closing recognition. 
     * @return HeadTailConfigure Control parameters for video opening and closing recognition.
     */
    public HeadTailConfigureInfo getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set Control parameters for video opening and closing recognition.
     * @param HeadTailConfigure Control parameters for video opening and closing recognition.
     */
    public void setHeadTailConfigure(HeadTailConfigureInfo HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get Video split recognition control parameters. 
     * @return SegmentConfigure Video split recognition control parameters.
     */
    public SegmentConfigureInfo getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set Video split recognition control parameters.
     * @param SegmentConfigure Video split recognition control parameters.
     */
    public void setSegmentConfigure(SegmentConfigureInfo SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get Control parameters for face recognition. 
     * @return FaceConfigure Control parameters for face recognition.
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Control parameters for face recognition.
     * @param FaceConfigure Control parameters for face recognition.
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
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate speech translation recognition (when DstLanguage is not filled in or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font> 
     * @return AsrFullTextConfigure Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate speech translation recognition (when DstLanguage is not filled in or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate speech translation recognition (when DstLanguage is not filled in or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
     * @param AsrFullTextConfigure Voice full-text recognition control parameters.
<font color=red>Note: This parameter is no longer maintained. It is recommended to use the AsrTranslateConfigure parameter to initiate speech translation recognition (when DstLanguage is not filled in or is an empty string, no translation is performed, and the billing item is the same as full text speech recognition).</font>
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
     * Get Speech translation recognition control parameters. 
     * @return AsrTranslateConfigure Speech translation recognition control parameters.
     */
    public AsrTranslateConfigureInfo getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set Speech translation recognition control parameters.
     * @param AsrTranslateConfigure Speech translation recognition control parameters.
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfo AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get Control parameters for object recognition. 
     * @return ObjectConfigure Control parameters for object recognition.
     */
    public ObjectConfigureInfo getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set Control parameters for object recognition.
     * @param ObjectConfigure Control parameters for object recognition.
     */
    public void setObjectConfigure(ObjectConfigureInfo ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get Frame interception interval in seconds. If not specified, the default frame interval is 1 second, with a minimum value of 0.5 seconds. 
     * @return ScreenshotInterval Frame interception interval in seconds. If not specified, the default frame interval is 1 second, with a minimum value of 0.5 seconds.
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set Frame interception interval in seconds. If not specified, the default frame interval is 1 second, with a minimum value of 0.5 seconds.
     * @param ScreenshotInterval Frame interception interval in seconds. If not specified, the default frame interval is 1 second, with a minimum value of 0.5 seconds.
     */
    public void setScreenshotInterval(Float ScreenshotInterval) {
        this.ScreenshotInterval = ScreenshotInterval;
    }

    public CreateAIRecognitionTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIRecognitionTemplateRequest(CreateAIRecognitionTemplateRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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

