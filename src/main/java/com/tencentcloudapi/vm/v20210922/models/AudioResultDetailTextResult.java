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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResultDetailTextResult extends AbstractModel{

    /**
    * This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return the keyword information hit by the text content recognized with ASR and indicate the specific cause of content non-compliance (such as "Friend me on WeChat"). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibId")
    @Expose
    private String LibId;

    /**
    * This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibName")
    @Expose
    private String LibName;

    /**
    * This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the dictionary type of a custom keyword. Valid values: **1** (blocklist/allowlist), **2** (custom keyword dictionary). If no custom keyword dictionary is configured, the default value will be 1 (blocklist/allowlist).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LibType")
    @Expose
    private Long LibType;

    /**
    * This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * This field is used to return a subtag under the current tag (Lable).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
     * Get This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label This field is used to return the maliciousness tag in the detection result.<br>Returned values: **Normal**: normal; **Porn**: pornographic; **Abuse**: abusive; **Ad**: advertising; **Custom**: custom type of non-compliant content and other offensive, unsafe, or inappropriate types of content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is used to return the keyword information hit by the text content recognized with ASR and indicate the specific cause of content non-compliance (such as "Friend me on WeChat"). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keywords This field is used to return the keyword information hit by the text content recognized with ASR and indicate the specific cause of content non-compliance (such as "Friend me on WeChat"). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set This field is used to return the keyword information hit by the text content recognized with ASR and indicate the specific cause of content non-compliance (such as "Friend me on WeChat"). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keywords This field is used to return the keyword information hit by the text content recognized with ASR and indicate the specific cause of content non-compliance (such as "Friend me on WeChat"). This parameter may have multiple returned values representing multiple hit keywords. If the returned value is empty, but `Score` is not empty, the maliciousness tag (Label) that corresponds to the recognition result derives from the returned value determined by the semantic model.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLibId() {
        return this.LibId;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LibId This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the ID of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLibId(String LibId) {
        this.LibId = LibId;
    }

    /**
     * Get This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLibName() {
        return this.LibName;
    }

    /**
     * Set This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LibName This field is **valid only when `Label` is `Custom` (custom keyword)**. It is used to return the name of the custom library for easier custom library management and configuration.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLibName(String LibName) {
        this.LibName = LibName;
    }

    /**
     * Get This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Score This field is used to return the confidence under the current tag. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the text is more likely to fall into the category of the current returned tag; for example, *Porn 99* indicates that the text is highly likely to be pornographic.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the dictionary type of a custom keyword. Valid values: **1** (blocklist/allowlist), **2** (custom keyword dictionary). If no custom keyword dictionary is configured, the default value will be 1 (blocklist/allowlist).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LibType This field is used to return the dictionary type of a custom keyword. Valid values: **1** (blocklist/allowlist), **2** (custom keyword dictionary). If no custom keyword dictionary is configured, the default value will be 1 (blocklist/allowlist).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLibType() {
        return this.LibType;
    }

    /**
     * Set This field is used to return the dictionary type of a custom keyword. Valid values: **1** (blocklist/allowlist), **2** (custom keyword dictionary). If no custom keyword dictionary is configured, the default value will be 1 (blocklist/allowlist).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LibType This field is used to return the dictionary type of a custom keyword. Valid values: **1** (blocklist/allowlist), **2** (custom keyword dictionary). If no custom keyword dictionary is configured, the default value will be 1 (blocklist/allowlist).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLibType(Long LibType) {
        this.LibType = LibType;
    }

    /**
     * Get This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Suggestion This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Suggestion This field is used to return the operation suggestion. When you get the determination result, the returned value indicates the suggested operation.<br>
Returned values: **Block**, **Review**, **Pass**.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get This field is used to return a subtag under the current tag (Lable).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubLabel This field is used to return a subtag under the current tag (Lable).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return a subtag under the current tag (Lable).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubLabel This field is used to return a subtag under the current tag (Lable).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    public AudioResultDetailTextResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResultDetailTextResult(AudioResultDetailTextResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.LibId != null) {
            this.LibId = new String(source.LibId);
        }
        if (source.LibName != null) {
            this.LibName = new String(source.LibName);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.LibType != null) {
            this.LibType = new Long(source.LibType);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "LibId", this.LibId);
        this.setParamSimple(map, prefix + "LibName", this.LibName);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "LibType", this.LibType);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);

    }
}

