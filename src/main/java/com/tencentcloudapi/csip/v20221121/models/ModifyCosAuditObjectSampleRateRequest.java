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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCosAuditObjectSampleRateRequest extends AbstractModel {

    /**
    * <p>Bucket asset id set</p>
    */
    @SerializedName("BucketIdSet")
    @Expose
    private Long [] BucketIdSet;

    /**
    * <p>Sampling rate collection</p>
    */
    @SerializedName("SampleRateSet")
    @Expose
    private Float [] SampleRateSet;

    /**
    * <p>appid; required when passing DefaultSampleRate; selectable when only modifying existing buckets</p>
    */
    @SerializedName("TargetAppId")
    @Expose
    private Long TargetAppId;

    /**
    * <p>Modify the default value of the newly-added bucket for TargetAppId when passed in; do not modify the default value when not passed in</p><p>Value range: [0.001, 1]</p>
    */
    @SerializedName("DefaultSampleRate")
    @Expose
    private Float DefaultSampleRate;

    /**
     * Get <p>Bucket asset id set</p> 
     * @return BucketIdSet <p>Bucket asset id set</p>
     */
    public Long [] getBucketIdSet() {
        return this.BucketIdSet;
    }

    /**
     * Set <p>Bucket asset id set</p>
     * @param BucketIdSet <p>Bucket asset id set</p>
     */
    public void setBucketIdSet(Long [] BucketIdSet) {
        this.BucketIdSet = BucketIdSet;
    }

    /**
     * Get <p>Sampling rate collection</p> 
     * @return SampleRateSet <p>Sampling rate collection</p>
     */
    public Float [] getSampleRateSet() {
        return this.SampleRateSet;
    }

    /**
     * Set <p>Sampling rate collection</p>
     * @param SampleRateSet <p>Sampling rate collection</p>
     */
    public void setSampleRateSet(Float [] SampleRateSet) {
        this.SampleRateSet = SampleRateSet;
    }

    /**
     * Get <p>appid; required when passing DefaultSampleRate; selectable when only modifying existing buckets</p> 
     * @return TargetAppId <p>appid; required when passing DefaultSampleRate; selectable when only modifying existing buckets</p>
     */
    public Long getTargetAppId() {
        return this.TargetAppId;
    }

    /**
     * Set <p>appid; required when passing DefaultSampleRate; selectable when only modifying existing buckets</p>
     * @param TargetAppId <p>appid; required when passing DefaultSampleRate; selectable when only modifying existing buckets</p>
     */
    public void setTargetAppId(Long TargetAppId) {
        this.TargetAppId = TargetAppId;
    }

    /**
     * Get <p>Modify the default value of the newly-added bucket for TargetAppId when passed in; do not modify the default value when not passed in</p><p>Value range: [0.001, 1]</p> 
     * @return DefaultSampleRate <p>Modify the default value of the newly-added bucket for TargetAppId when passed in; do not modify the default value when not passed in</p><p>Value range: [0.001, 1]</p>
     */
    public Float getDefaultSampleRate() {
        return this.DefaultSampleRate;
    }

    /**
     * Set <p>Modify the default value of the newly-added bucket for TargetAppId when passed in; do not modify the default value when not passed in</p><p>Value range: [0.001, 1]</p>
     * @param DefaultSampleRate <p>Modify the default value of the newly-added bucket for TargetAppId when passed in; do not modify the default value when not passed in</p><p>Value range: [0.001, 1]</p>
     */
    public void setDefaultSampleRate(Float DefaultSampleRate) {
        this.DefaultSampleRate = DefaultSampleRate;
    }

    public ModifyCosAuditObjectSampleRateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditObjectSampleRateRequest(ModifyCosAuditObjectSampleRateRequest source) {
        if (source.BucketIdSet != null) {
            this.BucketIdSet = new Long[source.BucketIdSet.length];
            for (int i = 0; i < source.BucketIdSet.length; i++) {
                this.BucketIdSet[i] = new Long(source.BucketIdSet[i]);
            }
        }
        if (source.SampleRateSet != null) {
            this.SampleRateSet = new Float[source.SampleRateSet.length];
            for (int i = 0; i < source.SampleRateSet.length; i++) {
                this.SampleRateSet[i] = new Float(source.SampleRateSet[i]);
            }
        }
        if (source.TargetAppId != null) {
            this.TargetAppId = new Long(source.TargetAppId);
        }
        if (source.DefaultSampleRate != null) {
            this.DefaultSampleRate = new Float(source.DefaultSampleRate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BucketIdSet.", this.BucketIdSet);
        this.setParamArraySimple(map, prefix + "SampleRateSet.", this.SampleRateSet);
        this.setParamSimple(map, prefix + "TargetAppId", this.TargetAppId);
        this.setParamSimple(map, prefix + "DefaultSampleRate", this.DefaultSampleRate);

    }
}

