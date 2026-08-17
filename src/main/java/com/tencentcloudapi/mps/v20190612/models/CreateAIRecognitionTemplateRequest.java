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

public class CreateAIRecognitionTemplateRequest extends AbstractModel {

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
    private FaceConfigureInfo FaceConfigure;

    /**
    * Full Text Recognition Control Parameter.
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * Text keyword recognition control.
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * Speech Full-text Recognition Control Parameter.
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
    * Voice translation control parameters.
    */
    @SerializedName("TranslateConfigure")
    @Expose
    private TranslateConfigureInfo TranslateConfigure;

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
    public FaceConfigureInfo getFaceConfigure() {
        return this.FaceConfigure;
    }

    /**
     * Set Face Recognition Control Parameter.
     * @param FaceConfigure Face Recognition Control Parameter.
     */
    public void setFaceConfigure(FaceConfigureInfo FaceConfigure) {
        this.FaceConfigure = FaceConfigure;
    }

    /**
     * Get Full Text Recognition Control Parameter. 
     * @return OcrFullTextConfigure Full Text Recognition Control Parameter.
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set Full Text Recognition Control Parameter.
     * @param OcrFullTextConfigure Full Text Recognition Control Parameter.
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get Text keyword recognition control. 
     * @return OcrWordsConfigure Text keyword recognition control.
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set Text keyword recognition control.
     * @param OcrWordsConfigure Text keyword recognition control.
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get Speech Full-text Recognition Control Parameter. 
     * @return AsrFullTextConfigure Speech Full-text Recognition Control Parameter.
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Speech Full-text Recognition Control Parameter.
     * @param AsrFullTextConfigure Speech Full-text Recognition Control Parameter.
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
     * Get Voice translation control parameters. 
     * @return TranslateConfigure Voice translation control parameters.
     */
    public TranslateConfigureInfo getTranslateConfigure() {
        return this.TranslateConfigure;
    }

    /**
     * Set Voice translation control parameters.
     * @param TranslateConfigure Voice translation control parameters.
     */
    public void setTranslateConfigure(TranslateConfigureInfo TranslateConfigure) {
        this.TranslateConfigure = TranslateConfigure;
    }

    public CreateAIRecognitionTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIRecognitionTemplateRequest(CreateAIRecognitionTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        if (source.TranslateConfigure != null) {
            this.TranslateConfigure = new TranslateConfigureInfo(source.TranslateConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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

