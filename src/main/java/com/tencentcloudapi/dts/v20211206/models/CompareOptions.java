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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareOptions extends AbstractModel {

    /**
    * Comparative Method: dataCheck (Complete Data Comparison), sampleDataCheck (Sampling Data Comparison), rowsCount (Row Count Comparison)Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Sampling rate. Value range: 0-100%.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * The number of threads, which defaults to 1. Value range: 1-5.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThreadCount")
    @Expose
    private Long ThreadCount;

    /**
     * Get Comparative Method: dataCheck (Complete Data Comparison), sampleDataCheck (Sampling Data Comparison), rowsCount (Row Count Comparison)Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Method Comparative Method: dataCheck (Complete Data Comparison), sampleDataCheck (Sampling Data Comparison), rowsCount (Row Count Comparison)Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Comparative Method: dataCheck (Complete Data Comparison), sampleDataCheck (Sampling Data Comparison), rowsCount (Row Count Comparison)Note: This field may return null, indicating that no valid value can be obtained.
     * @param Method Comparative Method: dataCheck (Complete Data Comparison), sampleDataCheck (Sampling Data Comparison), rowsCount (Row Count Comparison)Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Sampling rate. Value range: 0-100%.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SampleRate Sampling rate. Value range: 0-100%.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling rate. Value range: 0-100%.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SampleRate Sampling rate. Value range: 0-100%.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get The number of threads, which defaults to 1. Value range: 1-5.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThreadCount The number of threads, which defaults to 1. Value range: 1-5.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getThreadCount() {
        return this.ThreadCount;
    }

    /**
     * Set The number of threads, which defaults to 1. Value range: 1-5.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThreadCount The number of threads, which defaults to 1. Value range: 1-5.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThreadCount(Long ThreadCount) {
        this.ThreadCount = ThreadCount;
    }

    public CompareOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareOptions(CompareOptions source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ThreadCount != null) {
            this.ThreadCount = new Long(source.ThreadCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ThreadCount", this.ThreadCount);

    }
}

