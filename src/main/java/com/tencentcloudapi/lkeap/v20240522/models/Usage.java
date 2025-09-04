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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Usage extends AbstractModel {

    /**
    * Number of document pages.
    */
    @SerializedName("TotalPages")
    @Expose
    private Long TotalPages;

    /**
    * Number of input tokens.
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * Number of output tokens.
    */
    @SerializedName("OutputTokens")
    @Expose
    private Long OutputTokens;

    /**
    * Total number of tokens.
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get Number of document pages. 
     * @return TotalPages Number of document pages.
     */
    public Long getTotalPages() {
        return this.TotalPages;
    }

    /**
     * Set Number of document pages.
     * @param TotalPages Number of document pages.
     */
    public void setTotalPages(Long TotalPages) {
        this.TotalPages = TotalPages;
    }

    /**
     * Get Number of input tokens. 
     * @return InputTokens Number of input tokens.
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set Number of input tokens.
     * @param InputTokens Number of input tokens.
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get Number of output tokens. 
     * @return OutputTokens Number of output tokens.
     */
    public Long getOutputTokens() {
        return this.OutputTokens;
    }

    /**
     * Set Number of output tokens.
     * @param OutputTokens Number of output tokens.
     */
    public void setOutputTokens(Long OutputTokens) {
        this.OutputTokens = OutputTokens;
    }

    /**
     * Get Total number of tokens. 
     * @return TotalTokens Total number of tokens.
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set Total number of tokens.
     * @param TotalTokens Total number of tokens.
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public Usage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Usage(Usage source) {
        if (source.TotalPages != null) {
            this.TotalPages = new Long(source.TotalPages);
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.OutputTokens != null) {
            this.OutputTokens = new Long(source.OutputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPages", this.TotalPages);
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "OutputTokens", this.OutputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

