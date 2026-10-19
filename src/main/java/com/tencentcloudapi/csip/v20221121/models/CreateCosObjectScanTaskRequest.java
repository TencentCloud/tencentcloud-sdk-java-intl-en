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

public class CreateCosObjectScanTaskRequest extends AbstractModel {

    /**
    * <p>1: Sensitive data identification 2: Malicious file scanning 3: Batch scan sensitive data</p>
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
    * <p>Task parameter</p>
    */
    @SerializedName("TaskArgs")
    @Expose
    private String TaskArgs;

    /**
    * <p>Whether to scan all</p>
    */
    @SerializedName("IsScanAll")
    @Expose
    private Boolean IsScanAll;

    /**
    * <p>Buckets to remove during scanning</p>
    */
    @SerializedName("DeleteBucketSet")
    @Expose
    private String [] DeleteBucketSet;

    /**
     * Get <p>1: Sensitive data identification 2: Malicious file scanning 3: Batch scan sensitive data</p> 
     * @return TaskType <p>1: Sensitive data identification 2: Malicious file scanning 3: Batch scan sensitive data</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>1: Sensitive data identification 2: Malicious file scanning 3: Batch scan sensitive data</p>
     * @param TaskType <p>1: Sensitive data identification 2: Malicious file scanning 3: Batch scan sensitive data</p>
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

    /**
     * Get <p>Task parameter</p> 
     * @return TaskArgs <p>Task parameter</p>
     */
    public String getTaskArgs() {
        return this.TaskArgs;
    }

    /**
     * Set <p>Task parameter</p>
     * @param TaskArgs <p>Task parameter</p>
     */
    public void setTaskArgs(String TaskArgs) {
        this.TaskArgs = TaskArgs;
    }

    /**
     * Get <p>Whether to scan all</p> 
     * @return IsScanAll <p>Whether to scan all</p>
     */
    public Boolean getIsScanAll() {
        return this.IsScanAll;
    }

    /**
     * Set <p>Whether to scan all</p>
     * @param IsScanAll <p>Whether to scan all</p>
     */
    public void setIsScanAll(Boolean IsScanAll) {
        this.IsScanAll = IsScanAll;
    }

    /**
     * Get <p>Buckets to remove during scanning</p> 
     * @return DeleteBucketSet <p>Buckets to remove during scanning</p>
     */
    public String [] getDeleteBucketSet() {
        return this.DeleteBucketSet;
    }

    /**
     * Set <p>Buckets to remove during scanning</p>
     * @param DeleteBucketSet <p>Buckets to remove during scanning</p>
     */
    public void setDeleteBucketSet(String [] DeleteBucketSet) {
        this.DeleteBucketSet = DeleteBucketSet;
    }

    public CreateCosObjectScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosObjectScanTaskRequest(CreateCosObjectScanTaskRequest source) {
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
        if (source.TaskArgs != null) {
            this.TaskArgs = new String(source.TaskArgs);
        }
        if (source.IsScanAll != null) {
            this.IsScanAll = new Boolean(source.IsScanAll);
        }
        if (source.DeleteBucketSet != null) {
            this.DeleteBucketSet = new String[source.DeleteBucketSet.length];
            for (int i = 0; i < source.DeleteBucketSet.length; i++) {
                this.DeleteBucketSet[i] = new String(source.DeleteBucketSet[i]);
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
        this.setParamSimple(map, prefix + "TaskArgs", this.TaskArgs);
        this.setParamSimple(map, prefix + "IsScanAll", this.IsScanAll);
        this.setParamArraySimple(map, prefix + "DeleteBucketSet.", this.DeleteBucketSet);

    }
}

