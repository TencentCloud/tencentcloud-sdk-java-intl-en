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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanDetail extends AbstractModel{

    /**
    * Violation scenario. For more information, please see the definition of <a href="https://intl.cloud.tencent.com/document/product/607/37622?from_cn_redirect=1#Label_Value">Label</a>.
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Confidence score in scenario. Value range: [0.00,100.00]. The higher the score, the more likely the content is non-compliant.
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * Non-compliant keyword
    */
    @SerializedName("KeyWord")
    @Expose
    private String KeyWord;

    /**
    * Start time offset of keyword from 0 in audio (in milliseconds)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time offset of keyword from 0 in audio (in milliseconds)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Violation scenario. For more information, please see the definition of <a href="https://intl.cloud.tencent.com/document/product/607/37622?from_cn_redirect=1#Label_Value">Label</a>. 
     * @return Label Violation scenario. For more information, please see the definition of <a href="https://intl.cloud.tencent.com/document/product/607/37622?from_cn_redirect=1#Label_Value">Label</a>.
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Violation scenario. For more information, please see the definition of <a href="https://intl.cloud.tencent.com/document/product/607/37622?from_cn_redirect=1#Label_Value">Label</a>.
     * @param Label Violation scenario. For more information, please see the definition of <a href="https://intl.cloud.tencent.com/document/product/607/37622?from_cn_redirect=1#Label_Value">Label</a>.
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Confidence score in scenario. Value range: [0.00,100.00]. The higher the score, the more likely the content is non-compliant. 
     * @return Rate Confidence score in scenario. Value range: [0.00,100.00]. The higher the score, the more likely the content is non-compliant.
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set Confidence score in scenario. Value range: [0.00,100.00]. The higher the score, the more likely the content is non-compliant.
     * @param Rate Confidence score in scenario. Value range: [0.00,100.00]. The higher the score, the more likely the content is non-compliant.
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get Non-compliant keyword 
     * @return KeyWord Non-compliant keyword
     */
    public String getKeyWord() {
        return this.KeyWord;
    }

    /**
     * Set Non-compliant keyword
     * @param KeyWord Non-compliant keyword
     */
    public void setKeyWord(String KeyWord) {
        this.KeyWord = KeyWord;
    }

    /**
     * Get Start time offset of keyword from 0 in audio (in milliseconds) 
     * @return StartTime Start time offset of keyword from 0 in audio (in milliseconds)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time offset of keyword from 0 in audio (in milliseconds)
     * @param StartTime Start time offset of keyword from 0 in audio (in milliseconds)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time offset of keyword from 0 in audio (in milliseconds) 
     * @return EndTime End time offset of keyword from 0 in audio (in milliseconds)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time offset of keyword from 0 in audio (in milliseconds)
     * @param EndTime End time offset of keyword from 0 in audio (in milliseconds)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public ScanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanDetail(ScanDetail source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.KeyWord != null) {
            this.KeyWord = new String(source.KeyWord);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "KeyWord", this.KeyWord);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

