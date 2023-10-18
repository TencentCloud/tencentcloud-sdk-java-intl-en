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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioResultDetailLanguageResult extends AbstractModel {

    /**
    * Language
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Score
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Start time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * End time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
    * Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubLabelCode")
    @Expose
    private String SubLabelCode;

    /**
     * Get Language
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Label Language
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Language
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Label Language
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Score
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Score Score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Score
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Score Score
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Start time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTime Start time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubLabelCode Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubLabelCode() {
        return this.SubLabelCode;
    }

    /**
     * Set Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubLabelCode Subtag under the current tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubLabelCode(String SubLabelCode) {
        this.SubLabelCode = SubLabelCode;
    }

    public AudioResultDetailLanguageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioResultDetailLanguageResult(AudioResultDetailLanguageResult source) {
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

    }
}

