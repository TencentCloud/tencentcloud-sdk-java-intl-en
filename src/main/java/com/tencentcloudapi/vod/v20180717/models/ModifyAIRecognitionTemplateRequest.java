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
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfoForUpdate HeadTailConfigure;

    /**
    * 
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfoForUpdate SegmentConfigure;

    /**
    * 
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfoForUpdate FaceConfigure;

    /**
    * 
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure;

    /**
    * 
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfoForUpdate OcrWordsConfigure;

    /**
    * 
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure;

    /**
    * 
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfoForUpdate AsrWordsConfigure;

    /**
    * 
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfoForUpdate AsrTranslateConfigure;

    /**
    * 
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfoForUpdate ObjectConfigure;

    /**
    * 
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Comment 
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 
     * @param Comment 
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get  
     * @return HeadTailConfigure 
     */
    public HeadTailConfigureInfoForUpdate getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set 
     * @param HeadTailConfigure 
     */
    public void setHeadTailConfigure(HeadTailConfigureInfoForUpdate HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get  
     * @return SegmentConfigure 
     */
    public SegmentConfigureInfoForUpdate getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set 
     * @param SegmentConfigure 
     */
    public void setSegmentConfigure(SegmentConfigureInfoForUpdate SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get  
     * @return FaceConfigure 
     */
    public FaceConfigureInfoForUpdate getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set 
     * @param FaceConfigure 
     */
    public void setFaceConfigure(FaceConfigureInfoForUpdate FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get  
     * @return OcrFullTextConfigure 
     */
    public OcrFullTextConfigureInfoForUpdate getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set 
     * @param OcrFullTextConfigure 
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfoForUpdate OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get  
     * @return OcrWordsConfigure 
     */
    public OcrWordsConfigureInfoForUpdate getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set 
     * @param OcrWordsConfigure 
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfoForUpdate OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get  
     * @return AsrFullTextConfigure 
     */
    public AsrFullTextConfigureInfoForUpdate getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set 
     * @param AsrFullTextConfigure 
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfoForUpdate AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get  
     * @return AsrWordsConfigure 
     */
    public AsrWordsConfigureInfoForUpdate getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set 
     * @param AsrWordsConfigure 
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfoForUpdate AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get  
     * @return AsrTranslateConfigure 
     */
    public AsrTranslateConfigureInfoForUpdate getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set 
     * @param AsrTranslateConfigure 
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfoForUpdate AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get  
     * @return ObjectConfigure 
     */
    public ObjectConfigureInfoForUpdate getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set 
     * @param ObjectConfigure 
     */
    public void setObjectConfigure(ObjectConfigureInfoForUpdate ObjectConfigure) {
        this.ObjectConfigure = ObjectConfigure;
    }

    /**
     * Get  
     * @return ScreenshotInterval 
     */
    public Float getScreenshotInterval() {
        return this.ScreenshotInterval;
    }

    /**
     * Set 
     * @param ScreenshotInterval 
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

