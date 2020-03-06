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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIRecognitionTemplateRequest extends AbstractModel{

    /**
    * Name of a video content recognition template. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of a video content recognition template. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Face recognition control parameter.
    */
    @SerializedName("FaceConfigure")
    @Expose
    private FaceConfigureInfo FaceConfigure;

    /**
    * Full text recognition control parameter.
    */
    @SerializedName("OcrFullTextConfigure")
    @Expose
    private OcrFullTextConfigureInfo OcrFullTextConfigure;

    /**
    * Text keyword recognition control parameter.
    */
    @SerializedName("OcrWordsConfigure")
    @Expose
    private OcrWordsConfigureInfo OcrWordsConfigure;

    /**
    * Full speech recognition control parameter.
    */
    @SerializedName("AsrFullTextConfigure")
    @Expose
    private AsrFullTextConfigureInfo AsrFullTextConfigure;

    /**
    * Speech keyword recognition control parameter.
    */
    @SerializedName("AsrWordsConfigure")
    @Expose
    private AsrWordsConfigureInfo AsrWordsConfigure;

    /**
     * Get Name of a video content recognition template. Length limit: 64 characters. 
     * @return Name Name of a video content recognition template. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a video content recognition template. Length limit: 64 characters.
     * @param Name Name of a video content recognition template. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of a video content recognition template. Length limit: 256 characters. 
     * @return Comment Description of a video content recognition template. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of a video content recognition template. Length limit: 256 characters.
     * @param Comment Description of a video content recognition template. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
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
     * Get Full text recognition control parameter. 
     * @return OcrFullTextConfigure Full text recognition control parameter.
     */
    public OcrFullTextConfigureInfo getOcrFullTextConfigure() {
        return this.OcrFullTextConfigure;
    }

    /**
     * Set Full text recognition control parameter.
     * @param OcrFullTextConfigure Full text recognition control parameter.
     */
    public void setOcrFullTextConfigure(OcrFullTextConfigureInfo OcrFullTextConfigure) {
        this.OcrFullTextConfigure = OcrFullTextConfigure;
    }

    /**
     * Get Text keyword recognition control parameter. 
     * @return OcrWordsConfigure Text keyword recognition control parameter.
     */
    public OcrWordsConfigureInfo getOcrWordsConfigure() {
        return this.OcrWordsConfigure;
    }

    /**
     * Set Text keyword recognition control parameter.
     * @param OcrWordsConfigure Text keyword recognition control parameter.
     */
    public void setOcrWordsConfigure(OcrWordsConfigureInfo OcrWordsConfigure) {
        this.OcrWordsConfigure = OcrWordsConfigure;
    }

    /**
     * Get Full speech recognition control parameter. 
     * @return AsrFullTextConfigure Full speech recognition control parameter.
     */
    public AsrFullTextConfigureInfo getAsrFullTextConfigure() {
        return this.AsrFullTextConfigure;
    }

    /**
     * Set Full speech recognition control parameter.
     * @param AsrFullTextConfigure Full speech recognition control parameter.
     */
    public void setAsrFullTextConfigure(AsrFullTextConfigureInfo AsrFullTextConfigure) {
        this.AsrFullTextConfigure = AsrFullTextConfigure;
    }

    /**
     * Get Speech keyword recognition control parameter. 
     * @return AsrWordsConfigure Speech keyword recognition control parameter.
     */
    public AsrWordsConfigureInfo getAsrWordsConfigure() {
        return this.AsrWordsConfigure;
    }

    /**
     * Set Speech keyword recognition control parameter.
     * @param AsrWordsConfigure Speech keyword recognition control parameter.
     */
    public void setAsrWordsConfigure(AsrWordsConfigureInfo AsrWordsConfigure) {
        this.AsrWordsConfigure = AsrWordsConfigure;
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

    }
}

