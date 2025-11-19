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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApmSampleConfigRequest extends AbstractModel {

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sampling rate.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Application name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Sampling rule name.
    */
    @SerializedName("SampleName")
    @Expose
    private String SampleName;

    /**
    * Sampling tags
    */
    @SerializedName("Tags")
    @Expose
    private APMKVItem [] Tags;

    /**
    * API name.
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * 0: exact match (default); 1: prefix match; 2: suffix match.
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Sampling rate. 
     * @return SampleRate Sampling rate.
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set Sampling rate.
     * @param SampleRate Sampling rate.
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get Application name 
     * @return ServiceName Application name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name
     * @param ServiceName Application name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Sampling rule name. 
     * @return SampleName Sampling rule name.
     */
    public String getSampleName() {
        return this.SampleName;
    }

    /**
     * Set Sampling rule name.
     * @param SampleName Sampling rule name.
     */
    public void setSampleName(String SampleName) {
        this.SampleName = SampleName;
    }

    /**
     * Get Sampling tags 
     * @return Tags Sampling tags
     */
    public APMKVItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Sampling tags
     * @param Tags Sampling tags
     */
    public void setTags(APMKVItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get API name. 
     * @return OperationName API name.
     */
    public String getOperationName() {
        return this.OperationName;
    }

    /**
     * Set API name.
     * @param OperationName API name.
     */
    public void setOperationName(String OperationName) {
        this.OperationName = OperationName;
    }

    /**
     * Get 0: exact match (default); 1: prefix match; 2: suffix match. 
     * @return OperationType 0: exact match (default); 1: prefix match; 2: suffix match.
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 0: exact match (default); 1: prefix match; 2: suffix match.
     * @param OperationType 0: exact match (default); 1: prefix match; 2: suffix match.
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    public CreateApmSampleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApmSampleConfigRequest(CreateApmSampleConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.SampleName != null) {
            this.SampleName = new String(source.SampleName);
        }
        if (source.Tags != null) {
            this.Tags = new APMKVItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new APMKVItem(source.Tags[i]);
            }
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "SampleName", this.SampleName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

