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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResultDetailMoanResult extends AbstractModel {

    /**
    * This field is used to return the type of the content to be detected. It is fixed at **Moan** here to call the moan detection feature.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field is used to return the confidence of moan detection. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the audio is more likely to fall into the category of moan.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * This field is used to return the start time of the segment of an audio file under the corresponding moan tag in milliseconds.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * This field is used to return the end time of the segment of an audio file under the corresponding moan tag in milliseconds.
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
    * *This field is in beta test. Stay tuned*
    */
    @SerializedName("SubLabelCode")
    @Expose
    private String SubLabelCode;

    /**
    * This field is used to return a subtag under the current tag (Lable).
    */
    @SerializedName("SubLabel")
    @Expose
    private String SubLabel;

    /**
    * This field returns the suggested action according to the check result. <br>Values: `Block`, `Review`, `Pass`.
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
     * Get This field is used to return the type of the content to be detected. It is fixed at **Moan** here to call the moan detection feature.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Label This field is used to return the type of the content to be detected. It is fixed at **Moan** here to call the moan detection feature.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field is used to return the type of the content to be detected. It is fixed at **Moan** here to call the moan detection feature.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Label This field is used to return the type of the content to be detected. It is fixed at **Moan** here to call the moan detection feature.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field is used to return the confidence of moan detection. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the audio is more likely to fall into the category of moan. 
     * @return Score This field is used to return the confidence of moan detection. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the audio is more likely to fall into the category of moan.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set This field is used to return the confidence of moan detection. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the audio is more likely to fall into the category of moan.
     * @param Score This field is used to return the confidence of moan detection. Value range: 0 (**the lowest confidence**)–100 (**the highest confidence**), where a higher value indicates that the audio is more likely to fall into the category of moan.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get This field is used to return the start time of the segment of an audio file under the corresponding moan tag in milliseconds. 
     * @return StartTime This field is used to return the start time of the segment of an audio file under the corresponding moan tag in milliseconds.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set This field is used to return the start time of the segment of an audio file under the corresponding moan tag in milliseconds.
     * @param StartTime This field is used to return the start time of the segment of an audio file under the corresponding moan tag in milliseconds.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get This field is used to return the end time of the segment of an audio file under the corresponding moan tag in milliseconds. 
     * @return EndTime This field is used to return the end time of the segment of an audio file under the corresponding moan tag in milliseconds.
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set This field is used to return the end time of the segment of an audio file under the corresponding moan tag in milliseconds.
     * @param EndTime This field is used to return the end time of the segment of an audio file under the corresponding moan tag in milliseconds.
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get *This field is in beta test. Stay tuned* 
     * @return SubLabelCode *This field is in beta test. Stay tuned*
     */
    public String getSubLabelCode() {
        return this.SubLabelCode;
    }

    /**
     * Set *This field is in beta test. Stay tuned*
     * @param SubLabelCode *This field is in beta test. Stay tuned*
     */
    public void setSubLabelCode(String SubLabelCode) {
        this.SubLabelCode = SubLabelCode;
    }

    /**
     * Get This field is used to return a subtag under the current tag (Lable). 
     * @return SubLabel This field is used to return a subtag under the current tag (Lable).
     */
    public String getSubLabel() {
        return this.SubLabel;
    }

    /**
     * Set This field is used to return a subtag under the current tag (Lable).
     * @param SubLabel This field is used to return a subtag under the current tag (Lable).
     */
    public void setSubLabel(String SubLabel) {
        this.SubLabel = SubLabel;
    }

    /**
     * Get This field returns the suggested action according to the check result. <br>Values: `Block`, `Review`, `Pass`. 
     * @return Suggestion This field returns the suggested action according to the check result. <br>Values: `Block`, `Review`, `Pass`.
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set This field returns the suggested action according to the check result. <br>Values: `Block`, `Review`, `Pass`.
     * @param Suggestion This field returns the suggested action according to the check result. <br>Values: `Block`, `Review`, `Pass`.
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    public AudioResultDetailMoanResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResultDetailMoanResult(AudioResultDetailMoanResult source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.StartTime != null) {
            this.StartTime = new Float(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Float(source.EndTime);
        }
        if (source.SubLabelCode != null) {
            this.SubLabelCode = new String(source.SubLabelCode);
        }
        if (source.SubLabel != null) {
            this.SubLabel = new String(source.SubLabel);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubLabelCode", this.SubLabelCode);
        this.setParamSimple(map, prefix + "SubLabel", this.SubLabel);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);

    }
}

