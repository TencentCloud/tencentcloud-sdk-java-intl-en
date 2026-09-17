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

public class AigcVideoTaskUsage extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * 
    */
    @SerializedName("ThoughtTokens")
    @Expose
    private Long ThoughtTokens;

    /**
    * 
    */
    @SerializedName("InputImageCount")
    @Expose
    private Long InputImageCount;

    /**
    * 
    */
    @SerializedName("InputSeconds")
    @Expose
    private Long InputSeconds;

    /**
    * 
    */
    @SerializedName("OutputSeconds")
    @Expose
    private Long OutputSeconds;

    /**
    * 
    */
    @SerializedName("TotalSeconds")
    @Expose
    private Long TotalSeconds;

    /**
     * Get  
     * @return InputTokens 
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set 
     * @param InputTokens 
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get  
     * @return ThoughtTokens 
     */
    public Long getThoughtTokens() {
        return this.ThoughtTokens;
    }

    /**
     * Set 
     * @param ThoughtTokens 
     */
    public void setThoughtTokens(Long ThoughtTokens) {
        this.ThoughtTokens = ThoughtTokens;
    }

    /**
     * Get  
     * @return InputImageCount 
     */
    public Long getInputImageCount() {
        return this.InputImageCount;
    }

    /**
     * Set 
     * @param InputImageCount 
     */
    public void setInputImageCount(Long InputImageCount) {
        this.InputImageCount = InputImageCount;
    }

    /**
     * Get  
     * @return InputSeconds 
     */
    public Long getInputSeconds() {
        return this.InputSeconds;
    }

    /**
     * Set 
     * @param InputSeconds 
     */
    public void setInputSeconds(Long InputSeconds) {
        this.InputSeconds = InputSeconds;
    }

    /**
     * Get  
     * @return OutputSeconds 
     */
    public Long getOutputSeconds() {
        return this.OutputSeconds;
    }

    /**
     * Set 
     * @param OutputSeconds 
     */
    public void setOutputSeconds(Long OutputSeconds) {
        this.OutputSeconds = OutputSeconds;
    }

    /**
     * Get  
     * @return TotalSeconds 
     */
    public Long getTotalSeconds() {
        return this.TotalSeconds;
    }

    /**
     * Set 
     * @param TotalSeconds 
     */
    public void setTotalSeconds(Long TotalSeconds) {
        this.TotalSeconds = TotalSeconds;
    }

    public AigcVideoTaskUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskUsage(AigcVideoTaskUsage source) {
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.ThoughtTokens != null) {
            this.ThoughtTokens = new Long(source.ThoughtTokens);
        }
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
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "ThoughtTokens", this.ThoughtTokens);
        this.setParamSimple(map, prefix + "InputImageCount", this.InputImageCount);
        this.setParamSimple(map, prefix + "InputSeconds", this.InputSeconds);
        this.setParamSimple(map, prefix + "OutputSeconds", this.OutputSeconds);
        this.setParamSimple(map, prefix + "TotalSeconds", this.TotalSeconds);

    }
}

