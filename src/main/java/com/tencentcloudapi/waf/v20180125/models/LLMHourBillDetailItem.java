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

public class LLMHourBillDetailItem extends AbstractModel {

    /**
    * Hour range, for example, 00:00-01:00.
    */
    @SerializedName("TimeRange")
    @Expose
    private String TimeRange;

    /**
    * Prompt attack protection metering value (in tokens)
    */
    @SerializedName("PromptAttackUsage")
    @Expose
    private Long PromptAttackUsage;

    /**
    * Content compliance detection (text) metering value (in tokens)
    */
    @SerializedName("ContentTextUsage")
    @Expose
    private Long ContentTextUsage;

    /**
    * Content compliance detection (image) metering value (in images)
    */
    @SerializedName("ContentImageUsage")
    @Expose
    private Long ContentImageUsage;

    /**
    * Sensitive data detection metering value (in tokens)
    */
    @SerializedName("SensitiveDataUsage")
    @Expose
    private Long SensitiveDataUsage;

    /**
    * Prompt attack protection cost for the hour (in CNY)
    */
    @SerializedName("PromptAttackFee")
    @Expose
    private String PromptAttackFee;

    /**
    * Content compliance detection (text) cost for the hour (in CNY)
    */
    @SerializedName("ContentTextFee")
    @Expose
    private String ContentTextFee;

    /**
    * Content compliance detection (image) cost for the hour (in CNY)
    */
    @SerializedName("ContentImageFee")
    @Expose
    private String ContentImageFee;

    /**
    * Sensitive data detection cost for the hour (in CNY)
    */
    @SerializedName("SensitiveDataFee")
    @Expose
    private String SensitiveDataFee;

    /**
    * Total bill amount for the hour (in CNY, net cost)
    */
    @SerializedName("TotalFee")
    @Expose
    private String TotalFee;

    /**
     * Get Hour range, for example, 00:00-01:00. 
     * @return TimeRange Hour range, for example, 00:00-01:00.
     */
    public String getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set Hour range, for example, 00:00-01:00.
     * @param TimeRange Hour range, for example, 00:00-01:00.
     */
    public void setTimeRange(String TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get Prompt attack protection metering value (in tokens) 
     * @return PromptAttackUsage Prompt attack protection metering value (in tokens)
     */
    public Long getPromptAttackUsage() {
        return this.PromptAttackUsage;
    }

    /**
     * Set Prompt attack protection metering value (in tokens)
     * @param PromptAttackUsage Prompt attack protection metering value (in tokens)
     */
    public void setPromptAttackUsage(Long PromptAttackUsage) {
        this.PromptAttackUsage = PromptAttackUsage;
    }

    /**
     * Get Content compliance detection (text) metering value (in tokens) 
     * @return ContentTextUsage Content compliance detection (text) metering value (in tokens)
     */
    public Long getContentTextUsage() {
        return this.ContentTextUsage;
    }

    /**
     * Set Content compliance detection (text) metering value (in tokens)
     * @param ContentTextUsage Content compliance detection (text) metering value (in tokens)
     */
    public void setContentTextUsage(Long ContentTextUsage) {
        this.ContentTextUsage = ContentTextUsage;
    }

    /**
     * Get Content compliance detection (image) metering value (in images) 
     * @return ContentImageUsage Content compliance detection (image) metering value (in images)
     */
    public Long getContentImageUsage() {
        return this.ContentImageUsage;
    }

    /**
     * Set Content compliance detection (image) metering value (in images)
     * @param ContentImageUsage Content compliance detection (image) metering value (in images)
     */
    public void setContentImageUsage(Long ContentImageUsage) {
        this.ContentImageUsage = ContentImageUsage;
    }

    /**
     * Get Sensitive data detection metering value (in tokens) 
     * @return SensitiveDataUsage Sensitive data detection metering value (in tokens)
     */
    public Long getSensitiveDataUsage() {
        return this.SensitiveDataUsage;
    }

    /**
     * Set Sensitive data detection metering value (in tokens)
     * @param SensitiveDataUsage Sensitive data detection metering value (in tokens)
     */
    public void setSensitiveDataUsage(Long SensitiveDataUsage) {
        this.SensitiveDataUsage = SensitiveDataUsage;
    }

    /**
     * Get Prompt attack protection cost for the hour (in CNY) 
     * @return PromptAttackFee Prompt attack protection cost for the hour (in CNY)
     */
    public String getPromptAttackFee() {
        return this.PromptAttackFee;
    }

    /**
     * Set Prompt attack protection cost for the hour (in CNY)
     * @param PromptAttackFee Prompt attack protection cost for the hour (in CNY)
     */
    public void setPromptAttackFee(String PromptAttackFee) {
        this.PromptAttackFee = PromptAttackFee;
    }

    /**
     * Get Content compliance detection (text) cost for the hour (in CNY) 
     * @return ContentTextFee Content compliance detection (text) cost for the hour (in CNY)
     */
    public String getContentTextFee() {
        return this.ContentTextFee;
    }

    /**
     * Set Content compliance detection (text) cost for the hour (in CNY)
     * @param ContentTextFee Content compliance detection (text) cost for the hour (in CNY)
     */
    public void setContentTextFee(String ContentTextFee) {
        this.ContentTextFee = ContentTextFee;
    }

    /**
     * Get Content compliance detection (image) cost for the hour (in CNY) 
     * @return ContentImageFee Content compliance detection (image) cost for the hour (in CNY)
     */
    public String getContentImageFee() {
        return this.ContentImageFee;
    }

    /**
     * Set Content compliance detection (image) cost for the hour (in CNY)
     * @param ContentImageFee Content compliance detection (image) cost for the hour (in CNY)
     */
    public void setContentImageFee(String ContentImageFee) {
        this.ContentImageFee = ContentImageFee;
    }

    /**
     * Get Sensitive data detection cost for the hour (in CNY) 
     * @return SensitiveDataFee Sensitive data detection cost for the hour (in CNY)
     */
    public String getSensitiveDataFee() {
        return this.SensitiveDataFee;
    }

    /**
     * Set Sensitive data detection cost for the hour (in CNY)
     * @param SensitiveDataFee Sensitive data detection cost for the hour (in CNY)
     */
    public void setSensitiveDataFee(String SensitiveDataFee) {
        this.SensitiveDataFee = SensitiveDataFee;
    }

    /**
     * Get Total bill amount for the hour (in CNY, net cost) 
     * @return TotalFee Total bill amount for the hour (in CNY, net cost)
     */
    public String getTotalFee() {
        return this.TotalFee;
    }

    /**
     * Set Total bill amount for the hour (in CNY, net cost)
     * @param TotalFee Total bill amount for the hour (in CNY, net cost)
     */
    public void setTotalFee(String TotalFee) {
        this.TotalFee = TotalFee;
    }

    public LLMHourBillDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMHourBillDetailItem(LLMHourBillDetailItem source) {
        if (source.TimeRange != null) {
            this.TimeRange = new String(source.TimeRange);
        }
        if (source.PromptAttackUsage != null) {
            this.PromptAttackUsage = new Long(source.PromptAttackUsage);
        }
        if (source.ContentTextUsage != null) {
            this.ContentTextUsage = new Long(source.ContentTextUsage);
        }
        if (source.ContentImageUsage != null) {
            this.ContentImageUsage = new Long(source.ContentImageUsage);
        }
        if (source.SensitiveDataUsage != null) {
            this.SensitiveDataUsage = new Long(source.SensitiveDataUsage);
        }
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
        if (source.TotalFee != null) {
            this.TotalFee = new String(source.TotalFee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "PromptAttackUsage", this.PromptAttackUsage);
        this.setParamSimple(map, prefix + "ContentTextUsage", this.ContentTextUsage);
        this.setParamSimple(map, prefix + "ContentImageUsage", this.ContentImageUsage);
        this.setParamSimple(map, prefix + "SensitiveDataUsage", this.SensitiveDataUsage);
        this.setParamSimple(map, prefix + "PromptAttackFee", this.PromptAttackFee);
        this.setParamSimple(map, prefix + "ContentTextFee", this.ContentTextFee);
        this.setParamSimple(map, prefix + "ContentImageFee", this.ContentImageFee);
        this.setParamSimple(map, prefix + "SensitiveDataFee", this.SensitiveDataFee);
        this.setParamSimple(map, prefix + "TotalFee", this.TotalFee);

    }
}

