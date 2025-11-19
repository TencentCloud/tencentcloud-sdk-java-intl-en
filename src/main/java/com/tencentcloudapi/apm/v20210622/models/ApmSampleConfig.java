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

public class ApmSampleConfig extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * Service name.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Sampling name
    */
    @SerializedName("SampleName")
    @Expose
    private String SampleName;

    /**
    * API name.
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * Number of spans sampled
    */
    @SerializedName("SpanNum")
    @Expose
    private Long SpanNum;

    /**
    * Sampling configuration switch. 0: Off; 1: On
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Tag array
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private APMKVItem [] Tags;

    /**
    * Sampling rate.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Specifies the matching method. 0: exact match (default); 1: prefix match; 2: suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * Configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Instance ID. 
     * @return InstanceKey Instance ID.
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set Instance ID.
     * @param InstanceKey Instance ID.
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get Service name. 
     * @return ServiceName Service name.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Service name.
     * @param ServiceName Service name.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Sampling name 
     * @return SampleName Sampling name
     */
    public String getSampleName() {
        return this.SampleName;
    }

    /**
     * Set Sampling name
     * @param SampleName Sampling name
     */
    public void setSampleName(String SampleName) {
        this.SampleName = SampleName;
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
     * Get Number of spans sampled 
     * @return SpanNum Number of spans sampled
     */
    public Long getSpanNum() {
        return this.SpanNum;
    }

    /**
     * Set Number of spans sampled
     * @param SpanNum Number of spans sampled
     */
    public void setSpanNum(Long SpanNum) {
        this.SpanNum = SpanNum;
    }

    /**
     * Get Sampling configuration switch. 0: Off; 1: On 
     * @return Status Sampling configuration switch. 0: Off; 1: On
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Sampling configuration switch. 0: Off; 1: On
     * @param Status Sampling configuration switch. 0: Off; 1: On
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Tag array
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public APMKVItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag array
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag array
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(APMKVItem [] Tags) {
        this.Tags = Tags;
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
     * Get Specifies the matching method. 0: exact match (default); 1: prefix match; 2: suffix match.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OperationType Specifies the matching method. 0: exact match (default); 1: prefix match; 2: suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set Specifies the matching method. 0: exact match (default); 1: prefix match; 2: suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OperationType Specifies the matching method. 0: exact match (default); 1: prefix match; 2: suffix match.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get Configuration ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Configuration ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public ApmSampleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmSampleConfig(ApmSampleConfig source) {
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.SampleName != null) {
            this.SampleName = new String(source.SampleName);
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.SpanNum != null) {
            this.SpanNum = new Long(source.SpanNum);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new APMKVItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new APMKVItem(source.Tags[i]);
            }
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "SampleName", this.SampleName);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamSimple(map, prefix + "SpanNum", this.SpanNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

