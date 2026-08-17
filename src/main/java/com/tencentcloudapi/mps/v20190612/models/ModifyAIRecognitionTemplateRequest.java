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

public class ModifyAIRecognitionTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of a video content recognition template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Video content recognition template name, length limited to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Video Content Recognition template description, length limited to 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Face Recognition Control Parameter.
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
    * Voice translation control parameters.
    */
    @SerializedName("TranslateConfigure")
    @Expose
    private TranslateConfigureInfoForUpdate TranslateConfigure;

    /**
     * Get Unique identifier of a video content recognition template. 
     * @return Definition Unique identifier of a video content recognition template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of a video content recognition template.
     * @param Definition Unique identifier of a video content recognition template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Video content recognition template name, length limited to 64 characters. 
     * @return Name Video content recognition template name, length limited to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Video content recognition template name, length limited to 64 characters.
     * @param Name Video content recognition template name, length limited to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Video Content Recognition template description, length limited to 256 characters. 
     * @return Comment Video Content Recognition template description, length limited to 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Video Content Recognition template description, length limited to 256 characters.
     * @param Comment Video Content Recognition template description, length limited to 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Face Recognition Control Parameter. 
     * @return FaceConfigure Face Recognition Control Parameter.
     */
    public FaceConfigureInfoForUpdate getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Face Recognition Control Parameter.
     * @param FaceConfigure Face Recognition Control Parameter.
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
     * @return AsrFullTextConfigure Voice full-text recognition control parameters.
     */
    public AsrFullTextConfigureInfoForUpdate getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Voice full-text recognition control parameters.
     * @param AsrFullTextConfigure Voice full-text recognition control parameters.
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
     * Get Voice translation control parameters. 
     * @return TranslateConfigure Voice translation control parameters.
     */
    public TranslateConfigureInfoForUpdate getTranslateConfigure() {
        return this.TranslateConfigure;
    }

    /**
     * Set Voice translation control parameters.
     * @param TranslateConfigure Voice translation control parameters.
     */
    public void setTranslateConfigure(TranslateConfigureInfoForUpdate TranslateConfigure) {
        this.TranslateConfigure = TranslateConfigure;
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        if (source.TranslateConfigure != null) {
            this.TranslateConfigure = new TranslateConfigureInfoForUpdate(source.TranslateConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "FaceConfigure.", this.FaceConfigure);
        this.setParamObj(map, prefix + "OcrFullTextConfigure.", this.OcrFullTextConfigure);
        this.setParamObj(map, prefix + "OcrWordsConfigure.", this.OcrWordsConfigure);
        this.setParamObj(map, prefix + "AsrFullTextConfigure.", this.AsrFullTextConfigure);
        this.setParamObj(map, prefix + "AsrWordsConfigure.", this.AsrWordsConfigure);
        this.setParamObj(map, prefix + "TranslateConfigure.", this.TranslateConfigure);

    }
}

