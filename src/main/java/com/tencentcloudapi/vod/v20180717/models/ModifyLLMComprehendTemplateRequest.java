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

public class ModifyLLMComprehendTemplateRequest extends AbstractModel {

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
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 
    */
    @SerializedName("Summary")
    @Expose
    private LLMComprehendSummaryForUpdate Summary;

    /**
    * 
    */
    @SerializedName("Asr")
    @Expose
    private LLMComprehendAsrForUpdate Asr;

    /**
    * 
    */
    @SerializedName("FaceRecognition")
    @Expose
    private LLMComprehendFaceRecognitionForUpdate FaceRecognition;

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
     * @return Model 
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 
     * @param Model 
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get  
     * @return Summary 
     */
    public LLMComprehendSummaryForUpdate getSummary() {
        return this.Summary;
    }

    /**
     * Set 
     * @param Summary 
     */
    public void setSummary(LLMComprehendSummaryForUpdate Summary) {
        this.Summary = Summary;
    }

    /**
     * Get  
     * @return Asr 
     */
    public LLMComprehendAsrForUpdate getAsr() {
        return this.Asr;
    }

    /**
     * Set 
     * @param Asr 
     */
    public void setAsr(LLMComprehendAsrForUpdate Asr) {
        this.Asr = Asr;
    }

    /**
     * Get  
     * @return FaceRecognition 
     */
    public LLMComprehendFaceRecognitionForUpdate getFaceRecognition() {
        return this.FaceRecognition;
    }

    /**
     * Set 
     * @param FaceRecognition 
     */
    public void setFaceRecognition(LLMComprehendFaceRecognitionForUpdate FaceRecognition) {
        this.FaceRecognition = FaceRecognition;
    }

    public ModifyLLMComprehendTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMComprehendTemplateRequest(ModifyLLMComprehendTemplateRequest source) {
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
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Summary != null) {
            this.Summary = new LLMComprehendSummaryForUpdate(source.Summary);
        }
        if (source.Asr != null) {
            this.Asr = new LLMComprehendAsrForUpdate(source.Asr);
        }
        if (source.FaceRecognition != null) {
            this.FaceRecognition = new LLMComprehendFaceRecognitionForUpdate(source.FaceRecognition);
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
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamObj(map, prefix + "Asr.", this.Asr);
        this.setParamObj(map, prefix + "FaceRecognition.", this.FaceRecognition);

    }
}

