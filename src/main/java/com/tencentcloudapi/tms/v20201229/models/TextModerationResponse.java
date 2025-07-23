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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationResponse extends AbstractModel {

    /**
    * This field returns the BizType of the request parameters
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * This field returns the **negative label with the highest priority** in the moderation results (DetailResults), which indicates the moderation result recommended by the model. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Normal**: normal content; **Porn**: pornographic content; **Abuse**: abusive content; **Ad**: advertising content; **Custom**: custom violating content, and others such as objectionable, insecure or inappropriate content.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field returns the follow-up moderation suggestions. The returned value indicates the recommended operation after obtaining the moderation result. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Block**: block; **Review**: human moderation; **Pass**: pass
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field returns the keywords matched with the libraries in the moderated text under the current label to mark the specific violations (for example, *Friend me*). This parameter may have multiple returned values, indicating multiple keywords are matched. If the returned value is empty and the `Score` is not empty, it means that the negative label corresponding to the moderation result is a value returned from the semantic model judgment
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * This field returns the confidence level under the current label. Value range: 0 (**the lowest confidence level**) - 100 (**the highest confidence level**). The higher the value, the more likely the text is to belong to the category indicated by the current label. For example, *pornographic 99* indicates that the text is very likely to be pornographic, and *pornographic 0* indicates that the text is not pornographic
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field returns the moderation results based on the text libraries. For details, see `DetailResults` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("DetailResults")
    @Expose
    private DetailResults [] DetailResults;

    /**
    * This field returns the detection results of violating accounts at risk, mainly including violation categories and risk levels. For details, see `RiskDetails` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("RiskDetails")
    @Expose
    private RiskDetails [] RiskDetails;

    /**
    * This field returns the extra information configured according to your needs. If it's not configured, the returned value is empty by default. <br>Note: the returned information varies based on different customers or Biztypes. If you need to configure this field, please submit a ticket or contact after-sales manager
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * This field returns the `DataId` in the request parameter corresponding to the moderated object
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * Returns the context text.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContextText")
    @Expose
    private String ContextText;

    /**
    * 
    */
    @SerializedName("SentimentAnalysis")
    @Expose
    private SentimentAnalysis SentimentAnalysis;

    /**
    * 
    */
    @SerializedName("HitType")
    @Expose
    private String HitType;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get This field returns the BizType of the request parameters 
     * @return BizType This field returns the BizType of the request parameters
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set This field returns the BizType of the request parameters
     * @param BizType This field returns the BizType of the request parameters
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get This field returns the **negative label with the highest priority** in the moderation results (DetailResults), which indicates the moderation result recommended by the model. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Normal**: normal content; **Porn**: pornographic content; **Abuse**: abusive content; **Ad**: advertising content; **Custom**: custom violating content, and others such as objectionable, insecure or inappropriate content. 
     * @return Label This field returns the **negative label with the highest priority** in the moderation results (DetailResults), which indicates the moderation result recommended by the model. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Normal**: normal content; **Porn**: pornographic content; **Abuse**: abusive content; **Ad**: advertising content; **Custom**: custom violating content, and others such as objectionable, insecure or inappropriate content.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field returns the **negative label with the highest priority** in the moderation results (DetailResults), which indicates the moderation result recommended by the model. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Normal**: normal content; **Porn**: pornographic content; **Abuse**: abusive content; **Ad**: advertising content; **Custom**: custom violating content, and others such as objectionable, insecure or inappropriate content.
     * @param Label This field returns the **negative label with the highest priority** in the moderation results (DetailResults), which indicates the moderation result recommended by the model. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Normal**: normal content; **Porn**: pornographic content; **Abuse**: abusive content; **Ad**: advertising content; **Custom**: custom violating content, and others such as objectionable, insecure or inappropriate content.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field returns the follow-up moderation suggestions. The returned value indicates the recommended operation after obtaining the moderation result. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Block**: block; **Review**: human moderation; **Pass**: pass 
     * @return Suggestion This field returns the follow-up moderation suggestions. The returned value indicates the recommended operation after obtaining the moderation result. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Block**: block; **Review**: human moderation; **Pass**: pass
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field returns the follow-up moderation suggestions. The returned value indicates the recommended operation after obtaining the moderation result. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Block**: block; **Review**: human moderation; **Pass**: pass
     * @param Suggestion This field returns the follow-up moderation suggestions. The returned value indicates the recommended operation after obtaining the moderation result. It is recommended that you handle different violations with the suggested values according to your business needs. <br>Returned values: **Block**: block; **Review**: human moderation; **Pass**: pass
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field returns the keywords matched with the libraries in the moderated text under the current label to mark the specific violations (for example, *Friend me*). This parameter may have multiple returned values, indicating multiple keywords are matched. If the returned value is empty and the `Score` is not empty, it means that the negative label corresponding to the moderation result is a value returned from the semantic model judgment
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Keywords This field returns the keywords matched with the libraries in the moderated text under the current label to mark the specific violations (for example, *Friend me*). This parameter may have multiple returned values, indicating multiple keywords are matched. If the returned value is empty and the `Score` is not empty, it means that the negative label corresponding to the moderation result is a value returned from the semantic model judgment
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set This field returns the keywords matched with the libraries in the moderated text under the current label to mark the specific violations (for example, *Friend me*). This parameter may have multiple returned values, indicating multiple keywords are matched. If the returned value is empty and the `Score` is not empty, it means that the negative label corresponding to the moderation result is a value returned from the semantic model judgment
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Keywords This field returns the keywords matched with the libraries in the moderated text under the current label to mark the specific violations (for example, *Friend me*). This parameter may have multiple returned values, indicating multiple keywords are matched. If the returned value is empty and the `Score` is not empty, it means that the negative label corresponding to the moderation result is a value returned from the semantic model judgment
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get This field returns the confidence level under the current label. Value range: 0 (**the lowest confidence level**) - 100 (**the highest confidence level**). The higher the value, the more likely the text is to belong to the category indicated by the current label. For example, *pornographic 99* indicates that the text is very likely to be pornographic, and *pornographic 0* indicates that the text is not pornographic 
     * @return Score This field returns the confidence level under the current label. Value range: 0 (**the lowest confidence level**) - 100 (**the highest confidence level**). The higher the value, the more likely the text is to belong to the category indicated by the current label. For example, *pornographic 99* indicates that the text is very likely to be pornographic, and *pornographic 0* indicates that the text is not pornographic
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field returns the confidence level under the current label. Value range: 0 (**the lowest confidence level**) - 100 (**the highest confidence level**). The higher the value, the more likely the text is to belong to the category indicated by the current label. For example, *pornographic 99* indicates that the text is very likely to be pornographic, and *pornographic 0* indicates that the text is not pornographic
     * @param Score This field returns the confidence level under the current label. Value range: 0 (**the lowest confidence level**) - 100 (**the highest confidence level**). The higher the value, the more likely the text is to belong to the category indicated by the current label. For example, *pornographic 99* indicates that the text is very likely to be pornographic, and *pornographic 0* indicates that the text is not pornographic
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field returns the moderation results based on the text libraries. For details, see `DetailResults` in the data structure
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return DetailResults This field returns the moderation results based on the text libraries. For details, see `DetailResults` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public DetailResults [] getDetailResults() {
        return this.DetailResults;
    }

    /**
     * Set This field returns the moderation results based on the text libraries. For details, see `DetailResults` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
     * @param DetailResults This field returns the moderation results based on the text libraries. For details, see `DetailResults` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setDetailResults(DetailResults [] DetailResults) {
        this.DetailResults = DetailResults;
    }

    /**
     * Get This field returns the detection results of violating accounts at risk, mainly including violation categories and risk levels. For details, see `RiskDetails` in the data structure
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return RiskDetails This field returns the detection results of violating accounts at risk, mainly including violation categories and risk levels. For details, see `RiskDetails` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public RiskDetails [] getRiskDetails() {
        return this.RiskDetails;
    }

    /**
     * Set This field returns the detection results of violating accounts at risk, mainly including violation categories and risk levels. For details, see `RiskDetails` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
     * @param RiskDetails This field returns the detection results of violating accounts at risk, mainly including violation categories and risk levels. For details, see `RiskDetails` in the data structure
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setRiskDetails(RiskDetails [] RiskDetails) {
        this.RiskDetails = RiskDetails;
    }

    /**
     * Get This field returns the extra information configured according to your needs. If it's not configured, the returned value is empty by default. <br>Note: the returned information varies based on different customers or Biztypes. If you need to configure this field, please submit a ticket or contact after-sales manager
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Extra This field returns the extra information configured according to your needs. If it's not configured, the returned value is empty by default. <br>Note: the returned information varies based on different customers or Biztypes. If you need to configure this field, please submit a ticket or contact after-sales manager
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set This field returns the extra information configured according to your needs. If it's not configured, the returned value is empty by default. <br>Note: the returned information varies based on different customers or Biztypes. If you need to configure this field, please submit a ticket or contact after-sales manager
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Extra This field returns the extra information configured according to your needs. If it's not configured, the returned value is empty by default. <br>Note: the returned information varies based on different customers or Biztypes. If you need to configure this field, please submit a ticket or contact after-sales manager
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get This field returns the `DataId` in the request parameter corresponding to the moderated object
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return DataId This field returns the `DataId` in the request parameter corresponding to the moderated object
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set This field returns the `DataId` in the request parameter corresponding to the moderated object
Note: This field may return `null`, indicating that no valid value can be found.
     * @param DataId This field returns the `DataId` in the request parameter corresponding to the moderated object
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return SubLabel The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
     * @param SubLabel The field returns the second-level labels under the current label.
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get Returns the context text.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContextText Returns the context text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getContextText() {
        return this.ContextText;
    }

    /**
     * Set Returns the context text.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContextText Returns the context text.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContextText(String ContextText) {
        this.ContextText = ContextText;
    }

    /**
     * Get  
     * @return SentimentAnalysis 
     */
    public SentimentAnalysis getSentimentAnalysis() {
        return this.SentimentAnalysis;
    }

    /**
     * Set 
     * @param SentimentAnalysis 
     */
    public void setSentimentAnalysis(SentimentAnalysis SentimentAnalysis) {
        this.SentimentAnalysis = SentimentAnalysis;
    }

    /**
     * Get  
     * @return HitType 
     */
    public String getHitType() {
        return this.HitType;
    }

    /**
     * Set 
     * @param HitType 
     */
    public void setHitType(String HitType) {
        this.HitType = HitType;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public TextModerationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextModerationResponse(TextModerationResponse source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.DetailResults != null) {
            this.DetailResults = new DetailResults[source.DetailResults.length];
            for (int i = 0; i < source.DetailResults.length; i++) {
                this.DetailResults[i] = new DetailResults(source.DetailResults[i]);
            }
        }
        if (source.RiskDetails != null) {
            this.RiskDetails = new RiskDetails[source.RiskDetails.length];
            for (int i = 0; i < source.RiskDetails.length; i++) {
                this.RiskDetails[i] = new RiskDetails(source.RiskDetails[i]);
            }
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.ContextText != null) {
            this.ContextText = new String(source.ContextText);
        }
        if (source.SentimentAnalysis != null) {
            this.SentimentAnalysis = new SentimentAnalysis(source.SentimentAnalysis);
        }
        if (source.HitType != null) {
            this.HitType = new String(source.HitType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamArrayObj(map, prefix + "DetailResults.", this.DetailResults);
        this.setParamArrayObj(map, prefix + "RiskDetails.", this.RiskDetails);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "ContextText", this.ContextText);
        this.setParamObj(map, prefix + "SentimentAnalysis.", this.SentimentAnalysis);
        this.setParamSimple(map, prefix + "HitType", this.HitType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

