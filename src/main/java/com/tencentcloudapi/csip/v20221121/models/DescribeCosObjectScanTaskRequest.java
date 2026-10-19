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

public class DescribeCosObjectScanTaskRequest extends AbstractModel {

    /**
    * <p>1: sensitive data identification 2: malicious file scanning</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Bucket list</p>
    */
    @SerializedName("BucketSet")
    @Expose
    private String [] BucketSet;

    /**
     * Get <p>1: sensitive data identification 2: malicious file scanning</p> 
     * @return TaskType <p>1: sensitive data identification 2: malicious file scanning</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>1: sensitive data identification 2: malicious file scanning</p>
     * @param TaskType <p>1: sensitive data identification 2: malicious file scanning</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Bucket list</p> 
     * @return BucketSet <p>Bucket list</p>
     */
    public String [] getBucketSet() {
        return this.BucketSet;
    }

    /**
     * Set <p>Bucket list</p>
     * @param BucketSet <p>Bucket list</p>
     */
    public void setBucketSet(String [] BucketSet) {
        this.BucketSet = BucketSet;
    }

    public DescribeCosObjectScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosObjectScanTaskRequest(DescribeCosObjectScanTaskRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.BucketSet != null) {
            this.BucketSet = new String[source.BucketSet.length];
            for (int i = 0; i < source.BucketSet.length; i++) {
                this.BucketSet[i] = new String(source.BucketSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "BucketSet.", this.BucketSet);

    }
}

