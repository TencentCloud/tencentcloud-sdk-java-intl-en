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

public class ModifyApmSampleConfigRequest extends AbstractModel {

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Sampling rule name.
    */
    @SerializedName("SampleName")
    @Expose
    private String SampleName;

    /**
    * Sampling rate.
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * Application name. specifies the application name. fill in the blank to take effect on all applications.
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * API name.
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * Sampling tag
    */
    @SerializedName("Tags")
    @Expose
    private APMKVItem [] Tags;

    /**
    * Sampling switch. 0: Off; 1: On; 2: Delete
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Configuration ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
     * Get Application name. specifies the application name. fill in the blank to take effect on all applications. 
     * @return ServiceName Application name. specifies the application name. fill in the blank to take effect on all applications.
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name. specifies the application name. fill in the blank to take effect on all applications.
     * @param ServiceName Application name. specifies the application name. fill in the blank to take effect on all applications.
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
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
     * Get Sampling tag 
     * @return Tags Sampling tag
     */
    public APMKVItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set Sampling tag
     * @param Tags Sampling tag
     */
    public void setTags(APMKVItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Sampling switch. 0: Off; 1: On; 2: Delete 
     * @return Status Sampling switch. 0: Off; 1: On; 2: Delete
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Sampling switch. 0: Off; 1: On; 2: Delete
     * @param Status Sampling switch. 0: Off; 1: On; 2: Delete
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Configuration ID. 
     * @return Id Configuration ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Configuration ID.
     * @param Id Configuration ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
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

    public ModifyApmSampleConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApmSampleConfigRequest(ModifyApmSampleConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SampleName != null) {
            this.SampleName = new String(source.SampleName);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.Tags != null) {
            this.Tags = new APMKVItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new APMKVItem(source.Tags[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamSimple(map, prefix + "SampleName", this.SampleName);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

