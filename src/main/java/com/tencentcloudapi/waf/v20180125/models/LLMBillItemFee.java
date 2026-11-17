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

public class LLMBillItemFee extends AbstractModel {

    /**
    * Prompt attack protection cost (in CNY)
    */
    @SerializedName("PromptAttackFee")
    @Expose
    private String PromptAttackFee;

    /**
    * Content compliance detection (text) cost (in CNY)
    */
    @SerializedName("ContentTextFee")
    @Expose
    private String ContentTextFee;

    /**
    * Content compliance detection (image) cost (in CNY)
    */
    @SerializedName("ContentImageFee")
    @Expose
    private String ContentImageFee;

    /**
    * Sensitive data detection cost (in CNY)
    */
    @SerializedName("SensitiveDataFee")
    @Expose
    private String SensitiveDataFee;

    /**
     * Get Prompt attack protection cost (in CNY) 
     * @return PromptAttackFee Prompt attack protection cost (in CNY)
     */
    public String getPromptAttackFee() {
        return this.PromptAttackFee;
    }

    /**
     * Set Prompt attack protection cost (in CNY)
     * @param PromptAttackFee Prompt attack protection cost (in CNY)
     */
    public void setPromptAttackFee(String PromptAttackFee) {
        this.PromptAttackFee = PromptAttackFee;
    }

    /**
     * Get Content compliance detection (text) cost (in CNY) 
     * @return ContentTextFee Content compliance detection (text) cost (in CNY)
     */
    public String getContentTextFee() {
        return this.ContentTextFee;
    }

    /**
     * Set Content compliance detection (text) cost (in CNY)
     * @param ContentTextFee Content compliance detection (text) cost (in CNY)
     */
    public void setContentTextFee(String ContentTextFee) {
        this.ContentTextFee = ContentTextFee;
    }

    /**
     * Get Content compliance detection (image) cost (in CNY) 
     * @return ContentImageFee Content compliance detection (image) cost (in CNY)
     */
    public String getContentImageFee() {
        return this.ContentImageFee;
    }

    /**
     * Set Content compliance detection (image) cost (in CNY)
     * @param ContentImageFee Content compliance detection (image) cost (in CNY)
     */
    public void setContentImageFee(String ContentImageFee) {
        this.ContentImageFee = ContentImageFee;
    }

    /**
     * Get Sensitive data detection cost (in CNY) 
     * @return SensitiveDataFee Sensitive data detection cost (in CNY)
     */
    public String getSensitiveDataFee() {
        return this.SensitiveDataFee;
    }

    /**
     * Set Sensitive data detection cost (in CNY)
     * @param SensitiveDataFee Sensitive data detection cost (in CNY)
     */
    public void setSensitiveDataFee(String SensitiveDataFee) {
        this.SensitiveDataFee = SensitiveDataFee;
    }

    public LLMBillItemFee() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMBillItemFee(LLMBillItemFee source) {
        if (source.PromptAttackFee != null) {
            this.PromptAttackFee = new String(source.PromptAttackFee);
        }
        if (source.ContentTextFee != null) {
            this.ContentTextFee = new String(source.ContentTextFee);
        }
        if (source.ContentImageFee != null) {
            this.ContentImageFee = new String(source.ContentImageFee);
        }
        if (source.SensitiveDataFee != null) {
            this.SensitiveDataFee = new String(source.SensitiveDataFee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptAttackFee", this.PromptAttackFee);
        this.setParamSimple(map, prefix + "ContentTextFee", this.ContentTextFee);
        this.setParamSimple(map, prefix + "ContentImageFee", this.ContentImageFee);
        this.setParamSimple(map, prefix + "SensitiveDataFee", this.SensitiveDataFee);

    }
}

