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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApmInstanceRequest extends AbstractModel {

    /**
    * Business system name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Business system description information.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Retention period of trace data (unit: days, the default storage duration is 3 days).
    */
    @SerializedName("TraceDuration")
    @Expose
    private Long TraceDuration;

    /**
    * Business system tag list.
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * The report quota value of the business system. the default value is 0, indicating no limit on the report quota. (obsolete).
    */
    @SerializedName("SpanDailyCounters")
    @Expose
    private Long SpanDailyCounters;

    /**
    * Billing model of the business system (0: pay-as-you-go, 1: prepaid).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Whether it is a free edition business system (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition).
    */
    @SerializedName("Free")
    @Expose
    private Long Free;

    /**
     * Get Business system name. 
     * @return Name Business system name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Business system name.
     * @param Name Business system name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Business system description information. 
     * @return Description Business system description information.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Business system description information.
     * @param Description Business system description information.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Retention period of trace data (unit: days, the default storage duration is 3 days). 
     * @return TraceDuration Retention period of trace data (unit: days, the default storage duration is 3 days).
     */
    public Long getTraceDuration() {
        return this.TraceDuration;
    }

    /**
     * Set Retention period of trace data (unit: days, the default storage duration is 3 days).
     * @param TraceDuration Retention period of trace data (unit: days, the default storage duration is 3 days).
     */
    public void setTraceDuration(Long TraceDuration) {
        this.TraceDuration = TraceDuration;
    }

    /**
     * Get Business system tag list. 
     * @return Tags Business system tag list.
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Business system tag list.
     * @param Tags Business system tag list.
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get The report quota value of the business system. the default value is 0, indicating no limit on the report quota. (obsolete). 
     * @return SpanDailyCounters The report quota value of the business system. the default value is 0, indicating no limit on the report quota. (obsolete).
     */
    public Long getSpanDailyCounters() {
        return this.SpanDailyCounters;
    }

    /**
     * Set The report quota value of the business system. the default value is 0, indicating no limit on the report quota. (obsolete).
     * @param SpanDailyCounters The report quota value of the business system. the default value is 0, indicating no limit on the report quota. (obsolete).
     */
    public void setSpanDailyCounters(Long SpanDailyCounters) {
        this.SpanDailyCounters = SpanDailyCounters;
    }

    /**
     * Get Billing model of the business system (0: pay-as-you-go, 1: prepaid). 
     * @return PayMode Billing model of the business system (0: pay-as-you-go, 1: prepaid).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing model of the business system (0: pay-as-you-go, 1: prepaid).
     * @param PayMode Billing model of the business system (0: pay-as-you-go, 1: prepaid).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether it is a free edition business system (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition). 
     * @return Free Whether it is a free edition business system (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition).
     */
    public Long getFree() {
        return this.Free;
    }

    /**
     * Set Whether it is a free edition business system (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition).
     * @param Free Whether it is a free edition business system (0 = paid edition; 1 = tsf restricted free edition; 2 = free edition).
     */
    public void setFree(Long Free) {
        this.Free = Free;
    }

    public CreateApmInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApmInstanceRequest(CreateApmInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.TraceDuration != null) {
            this.TraceDuration = new Long(source.TraceDuration);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.SpanDailyCounters != null) {
            this.SpanDailyCounters = new Long(source.SpanDailyCounters);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Free != null) {
            this.Free = new Long(source.Free);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TraceDuration", this.TraceDuration);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SpanDailyCounters", this.SpanDailyCounters);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Free", this.Free);

    }
}

