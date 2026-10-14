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

public class MediaUsageItem extends AbstractModel {

    /**
    * <p>Number of input images</p><p>Unit: count</p>
    */
    @SerializedName("InputImageCount")
    @Expose
    private Long InputImageCount;

    /**
    * <p>Input seconds</p><p>Unit: seconds</p>
    */
    @SerializedName("InputSeconds")
    @Expose
    private Long InputSeconds;

    /**
    * <p>Output seconds</p><p>Measurement unit: seconds</p>
    */
    @SerializedName("OutputSeconds")
    @Expose
    private Long OutputSeconds;

    /**
    * <p>Total number of seconds</p><p>Unit: seconds</p>
    */
    @SerializedName("TotalSeconds")
    @Expose
    private Long TotalSeconds;

    /**
     * Get <p>Number of input images</p><p>Unit: count</p> 
     * @return InputImageCount <p>Number of input images</p><p>Unit: count</p>
     */
    public Long getInputImageCount() {
        return this.InputImageCount;
    }

    /**
     * Set <p>Number of input images</p><p>Unit: count</p>
     * @param InputImageCount <p>Number of input images</p><p>Unit: count</p>
     */
    public void setInputImageCount(Long InputImageCount) {
        this.InputImageCount = InputImageCount;
    }

    /**
     * Get <p>Input seconds</p><p>Unit: seconds</p> 
     * @return InputSeconds <p>Input seconds</p><p>Unit: seconds</p>
     */
    public Long getInputSeconds() {
        return this.InputSeconds;
    }

    /**
     * Set <p>Input seconds</p><p>Unit: seconds</p>
     * @param InputSeconds <p>Input seconds</p><p>Unit: seconds</p>
     */
    public void setInputSeconds(Long InputSeconds) {
        this.InputSeconds = InputSeconds;
    }

    /**
     * Get <p>Output seconds</p><p>Measurement unit: seconds</p> 
     * @return OutputSeconds <p>Output seconds</p><p>Measurement unit: seconds</p>
     */
    public Long getOutputSeconds() {
        return this.OutputSeconds;
    }

    /**
     * Set <p>Output seconds</p><p>Measurement unit: seconds</p>
     * @param OutputSeconds <p>Output seconds</p><p>Measurement unit: seconds</p>
     */
    public void setOutputSeconds(Long OutputSeconds) {
        this.OutputSeconds = OutputSeconds;
    }

    /**
     * Get <p>Total number of seconds</p><p>Unit: seconds</p> 
     * @return TotalSeconds <p>Total number of seconds</p><p>Unit: seconds</p>
     */
    public Long getTotalSeconds() {
        return this.TotalSeconds;
    }

    /**
     * Set <p>Total number of seconds</p><p>Unit: seconds</p>
     * @param TotalSeconds <p>Total number of seconds</p><p>Unit: seconds</p>
     */
    public void setTotalSeconds(Long TotalSeconds) {
        this.TotalSeconds = TotalSeconds;
    }

    public MediaUsageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaUsageItem(MediaUsageItem source) {
        if (source.InputImageCount != null) {
            this.InputImageCount = new Long(source.InputImageCount);
        }
        if (source.InputSeconds != null) {
            this.InputSeconds = new Long(source.InputSeconds);
        }
        if (source.OutputSeconds != null) {
            this.OutputSeconds = new Long(source.OutputSeconds);
        }
        if (source.TotalSeconds != null) {
            this.TotalSeconds = new Long(source.TotalSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputImageCount", this.InputImageCount);
        this.setParamSimple(map, prefix + "InputSeconds", this.InputSeconds);
        this.setParamSimple(map, prefix + "OutputSeconds", this.OutputSeconds);
        this.setParamSimple(map, prefix + "TotalSeconds", this.TotalSeconds);

    }
}

