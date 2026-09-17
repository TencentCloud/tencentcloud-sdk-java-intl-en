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
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

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
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("HeadTailConfigure")
    @Expose
    private HeadTailConfigureInfo HeadTailConfigure;

    /**
    * 
    */
    @SerializedName("SegmentConfigure")
    @Expose
    private SegmentConfigureInfo SegmentConfigure;

    /**
    * 
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfo FaceConfigure;

    /**
    * 
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * 
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * 
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfo AsrFullTextConfigure;

    /**
    * 
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfo AsrWordsConfigure;

    /**
    * 
    */
    @SerializedName("AsrTranslateConfigure")
    @Expose
    private AsrTranslateConfigureInfo AsrTranslateConfigure;

    /**
    * 
    */
    @SerializedName("ObjectConfigure")
    @Expose
    private ObjectConfigureInfo ObjectConfigure;

    /**
    * 
    */
    @SerializedName("ScreenshotInterval")
    @Expose
    private Float ScreenshotInterval;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

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
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return HeadTailConfigure 
     */
    public HeadTailConfigureInfo getHeadTailConfigure() {
        return this.HeadTailConfigure;
    }

    /**
     * Set 
     * @param HeadTailConfigure 
     */
    public void setHeadTailConfigure(HeadTailConfigureInfo HeadTailConfigure) {
        this.HeadTailConfigure = HeadTailConfigure;
    }

    /**
     * Get  
     * @return SegmentConfigure 
     */
    public SegmentConfigureInfo getSegmentConfigure() {
        return this.SegmentConfigure;
    }

    /**
     * Set 
     * @param SegmentConfigure 
     */
    public void setSegmentConfigure(SegmentConfigureInfo SegmentConfigure) {
        this.SegmentConfigure = SegmentConfigure;
    }

    /**
     * Get  
     * @return FaceConfigure 
     */
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set 
     * @param FaceConfigure 
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get  
     * @return OcrFullTextConfigure 
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set 
     * @param OcrFullTextConfigure 
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get  
     * @return OcrWordsConfigure 
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set 
     * @param OcrWordsConfigure 
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get  
     * @return AsrFullTextConfigure 
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set 
     * @param AsrFullTextConfigure 
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get  
     * @return AsrWordsConfigure 
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set 
     * @param AsrWordsConfigure 
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
    }

    /**
     * Get  
     * @return AsrTranslateConfigure 
     */
    public AsrTranslateConfigureInfo getAsrTranslateConfigure() {
        return this.AsrTranslateConfigure;
    }

    /**
     * Set 
     * @param AsrTranslateConfigure 
     */
    public void setAsrTranslateConfigure(AsrTranslateConfigureInfo AsrTranslateConfigure) {
        this.AsrTranslateConfigure = AsrTranslateConfigure;
    }

    /**
     * Get  
     * @return ObjectConfigure 
     */
    public ObjectConfigureInfo getObjectConfigure() {
        return this.ObjectConfigure;
    }

    /**
     * Set 
     * @param ObjectConfigure 
     */
    public void setObjectConfigure(ObjectConfigureInfo ObjectConfigure) {
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

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
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

