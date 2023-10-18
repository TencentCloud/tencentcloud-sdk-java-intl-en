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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Tag extends AbstractModel {

    /**
    * The value of this parameter varies by `Label`.
When `Label` is `Teenager`, `Name` can be `Teenager`. 
When `Label` is `Gender`, `Name` can be `Male` and `Female`.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Start time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * End time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private Float EndTime;

    /**
     * Get The value of this parameter varies by `Label`.
When `Label` is `Teenager`, `Name` can be `Teenager`. 
When `Label` is `Gender`, `Name` can be `Male` and `Female`.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Name The value of this parameter varies by `Label`.
When `Label` is `Teenager`, `Name` can be `Teenager`. 
When `Label` is `Gender`, `Name` can be `Male` and `Female`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The value of this parameter varies by `Label`.
When `Label` is `Teenager`, `Name` can be `Teenager`. 
When `Label` is `Gender`, `Name` can be `Male` and `Female`.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Name The value of this parameter varies by `Label`.
When `Label` is `Teenager`, `Name` can be `Teenager`. 
When `Label` is `Gender`, `Name` can be `Male` and `Female`.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Score Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid value was found.
     * @param Score Confidence score. Value: 1 to 100. 
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Start time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return StartTime Start time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param StartTime Start time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EndTime End time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Float getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EndTime End time for the recognition (ms)
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEndTime(Float EndTime) {
        this.EndTime = EndTime;
    }

    public Tag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Tag(Tag source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

