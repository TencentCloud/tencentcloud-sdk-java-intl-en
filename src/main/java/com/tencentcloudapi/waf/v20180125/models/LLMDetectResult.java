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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMDetectResult extends AbstractModel {

    /**
    * <p>Output only: Sensitive information</p>
    */
    @SerializedName("SensitiveResult")
    @Expose
    private LLMSensitiveValueLevel [] SensitiveResult;

    /**
    * <p>Both input and output: Keyword library hit information</p>
    */
    @SerializedName("KeyWordsResult")
    @Expose
    private KeyWordInfo [] KeyWordsResult;

    /**
    * <p>Both input and output: Data classification and grading result</p>
    */
    @SerializedName("DataCategoryResult")
    @Expose
    private String [] DataCategoryResult;

    /**
    * <p>Input only: prompt injection detection result</p>
    */
    @SerializedName("PromptInjectionResult")
    @Expose
    private PromptDetectResult PromptInjectionResult;

    /**
    * <p>ID of the hit rule</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>Name of the hit rule</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Rule action</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>Attack payload</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>Masked content. Returned when Action is mask. If no masked evidence is generated, the original text is returned.</p>
    */
    @SerializedName("Desensitization")
    @Expose
    private String Desensitization;

    /**
    * <p>Image detection result</p>
    */
    @SerializedName("ImageResult")
    @Expose
    private ImageResult [] ImageResult;

    /**
    * <p>id of the message to be answered on behalf. This message id is used as an input parameter of the GenerateLLMSecAnswer API.</p>
    */
    @SerializedName("MsgID")
    @Expose
    private String MsgID;

    /**
    * <p>Tool call detection result</p>
    */
    @SerializedName("ToolCallResult")
    @Expose
    private ToolCallResult ToolCallResult;

    /**
    * <p>Intent detection result</p>
    */
    @SerializedName("IntentDetectResult")
    @Expose
    private IntentDetectResult IntentDetectResult;

    /**
    * <p>Malicious URL detection result</p>
    */
    @SerializedName("UrlDetectResult")
    @Expose
    private UrlDetectResult UrlDetectResult;

    /**
     * Get <p>Output only: Sensitive information</p> 
     * @return SensitiveResult <p>Output only: Sensitive information</p>
     */
    public LLMSensitiveValueLevel [] getSensitiveResult() {
        return this.SensitiveResult;
    }

    /**
     * Set <p>Output only: Sensitive information</p>
     * @param SensitiveResult <p>Output only: Sensitive information</p>
     */
    public void setSensitiveResult(LLMSensitiveValueLevel [] SensitiveResult) {
        this.SensitiveResult = SensitiveResult;
    }

    /**
     * Get <p>Both input and output: Keyword library hit information</p> 
     * @return KeyWordsResult <p>Both input and output: Keyword library hit information</p>
     */
    public KeyWordInfo [] getKeyWordsResult() {
        return this.KeyWordsResult;
    }

    /**
     * Set <p>Both input and output: Keyword library hit information</p>
     * @param KeyWordsResult <p>Both input and output: Keyword library hit information</p>
     */
    public void setKeyWordsResult(KeyWordInfo [] KeyWordsResult) {
        this.KeyWordsResult = KeyWordsResult;
    }

    /**
     * Get <p>Both input and output: Data classification and grading result</p> 
     * @return DataCategoryResult <p>Both input and output: Data classification and grading result</p>
     */
    public String [] getDataCategoryResult() {
        return this.DataCategoryResult;
    }

    /**
     * Set <p>Both input and output: Data classification and grading result</p>
     * @param DataCategoryResult <p>Both input and output: Data classification and grading result</p>
     */
    public void setDataCategoryResult(String [] DataCategoryResult) {
        this.DataCategoryResult = DataCategoryResult;
    }

    /**
     * Get <p>Input only: prompt injection detection result</p> 
     * @return PromptInjectionResult <p>Input only: prompt injection detection result</p>
     */
    public PromptDetectResult getPromptInjectionResult() {
        return this.PromptInjectionResult;
    }

    /**
     * Set <p>Input only: prompt injection detection result</p>
     * @param PromptInjectionResult <p>Input only: prompt injection detection result</p>
     */
    public void setPromptInjectionResult(PromptDetectResult PromptInjectionResult) {
        this.PromptInjectionResult = PromptInjectionResult;
    }

    /**
     * Get <p>ID of the hit rule</p> 
     * @return RuleId <p>ID of the hit rule</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>ID of the hit rule</p>
     * @param RuleId <p>ID of the hit rule</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Name of the hit rule</p> 
     * @return RuleName <p>Name of the hit rule</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>Name of the hit rule</p>
     * @param RuleName <p>Name of the hit rule</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Rule action</p> 
     * @return Action <p>Rule action</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Rule action</p>
     * @param Action <p>Rule action</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>Attack payload</p> 
     * @return Payload <p>Attack payload</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>Attack payload</p>
     * @param Payload <p>Attack payload</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>Masked content. Returned when Action is mask. If no masked evidence is generated, the original text is returned.</p> 
     * @return Desensitization <p>Masked content. Returned when Action is mask. If no masked evidence is generated, the original text is returned.</p>
     */
    public String getDesensitization() {
        return this.Desensitization;
    }

    /**
     * Set <p>Masked content. Returned when Action is mask. If no masked evidence is generated, the original text is returned.</p>
     * @param Desensitization <p>Masked content. Returned when Action is mask. If no masked evidence is generated, the original text is returned.</p>
     */
    public void setDesensitization(String Desensitization) {
        this.Desensitization = Desensitization;
    }

    /**
     * Get <p>Image detection result</p> 
     * @return ImageResult <p>Image detection result</p>
     */
    public ImageResult [] getImageResult() {
        return this.ImageResult;
    }

    /**
     * Set <p>Image detection result</p>
     * @param ImageResult <p>Image detection result</p>
     */
    public void setImageResult(ImageResult [] ImageResult) {
        this.ImageResult = ImageResult;
    }

    /**
     * Get <p>id of the message to be answered on behalf. This message id is used as an input parameter of the GenerateLLMSecAnswer API.</p> 
     * @return MsgID <p>id of the message to be answered on behalf. This message id is used as an input parameter of the GenerateLLMSecAnswer API.</p>
     */
    public String getMsgID() {
        return this.MsgID;
    }

    /**
     * Set <p>id of the message to be answered on behalf. This message id is used as an input parameter of the GenerateLLMSecAnswer API.</p>
     * @param MsgID <p>id of the message to be answered on behalf. This message id is used as an input parameter of the GenerateLLMSecAnswer API.</p>
     */
    public void setMsgID(String MsgID) {
        this.MsgID = MsgID;
    }

    /**
     * Get <p>Tool call detection result</p> 
     * @return ToolCallResult <p>Tool call detection result</p>
     */
    public ToolCallResult getToolCallResult() {
        return this.ToolCallResult;
    }

    /**
     * Set <p>Tool call detection result</p>
     * @param ToolCallResult <p>Tool call detection result</p>
     */
    public void setToolCallResult(ToolCallResult ToolCallResult) {
        this.ToolCallResult = ToolCallResult;
    }

    /**
     * Get <p>Intent detection result</p> 
     * @return IntentDetectResult <p>Intent detection result</p>
     */
    public IntentDetectResult getIntentDetectResult() {
        return this.IntentDetectResult;
    }

    /**
     * Set <p>Intent detection result</p>
     * @param IntentDetectResult <p>Intent detection result</p>
     */
    public void setIntentDetectResult(IntentDetectResult IntentDetectResult) {
        this.IntentDetectResult = IntentDetectResult;
    }

    /**
     * Get <p>Malicious URL detection result</p> 
     * @return UrlDetectResult <p>Malicious URL detection result</p>
     */
    public UrlDetectResult getUrlDetectResult() {
        return this.UrlDetectResult;
    }

    /**
     * Set <p>Malicious URL detection result</p>
     * @param UrlDetectResult <p>Malicious URL detection result</p>
     */
    public void setUrlDetectResult(UrlDetectResult UrlDetectResult) {
        this.UrlDetectResult = UrlDetectResult;
    }

    public LLMDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDetectResult(LLMDetectResult source) {
        if (source.SensitiveResult != null) {
            this.SensitiveResult = new LLMSensitiveValueLevel[source.SensitiveResult.length];
            for (int i = 0; i < source.SensitiveResult.length; i++) {
                this.SensitiveResult[i] = new LLMSensitiveValueLevel(source.SensitiveResult[i]);
            }
        }
        if (source.KeyWordsResult != null) {
            this.KeyWordsResult = new KeyWordInfo[source.KeyWordsResult.length];
            for (int i = 0; i < source.KeyWordsResult.length; i++) {
                this.KeyWordsResult[i] = new KeyWordInfo(source.KeyWordsResult[i]);
            }
        }
        if (source.DataCategoryResult != null) {
            this.DataCategoryResult = new String[source.DataCategoryResult.length];
            for (int i = 0; i < source.DataCategoryResult.length; i++) {
                this.DataCategoryResult[i] = new String(source.DataCategoryResult[i]);
            }
        }
        if (source.PromptInjectionResult != null) {
            this.PromptInjectionResult = new PromptDetectResult(source.PromptInjectionResult);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.Desensitization != null) {
            this.Desensitization = new String(source.Desensitization);
        }
        if (source.ImageResult != null) {
            this.ImageResult = new ImageResult[source.ImageResult.length];
            for (int i = 0; i < source.ImageResult.length; i++) {
                this.ImageResult[i] = new ImageResult(source.ImageResult[i]);
            }
        }
        if (source.MsgID != null) {
            this.MsgID = new String(source.MsgID);
        }
        if (source.ToolCallResult != null) {
            this.ToolCallResult = new ToolCallResult(source.ToolCallResult);
        }
        if (source.IntentDetectResult != null) {
            this.IntentDetectResult = new IntentDetectResult(source.IntentDetectResult);
        }
        if (source.UrlDetectResult != null) {
            this.UrlDetectResult = new UrlDetectResult(source.UrlDetectResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SensitiveResult.", this.SensitiveResult);
        this.setParamArrayObj(map, prefix + "KeyWordsResult.", this.KeyWordsResult);
        this.setParamArraySimple(map, prefix + "DataCategoryResult.", this.DataCategoryResult);
        this.setParamObj(map, prefix + "PromptInjectionResult.", this.PromptInjectionResult);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "Desensitization", this.Desensitization);
        this.setParamArrayObj(map, prefix + "ImageResult.", this.ImageResult);
        this.setParamSimple(map, prefix + "MsgID", this.MsgID);
        this.setParamObj(map, prefix + "ToolCallResult.", this.ToolCallResult);
        this.setParamObj(map, prefix + "IntentDetectResult.", this.IntentDetectResult);
        this.setParamObj(map, prefix + "UrlDetectResult.", this.UrlDetectResult);

    }
}

