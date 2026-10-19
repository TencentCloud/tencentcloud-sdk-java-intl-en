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

public class CosBucketTaskInfo extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Bucket name</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>Task ID.</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>Last scan time</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private Long LastScanTime;

    /**
    * <p>Number of recognized files</p>
    */
    @SerializedName("IdentifyFileCount")
    @Expose
    private Long IdentifyFileCount;

    /**
    * <p>Number of sensitive files</p>
    */
    @SerializedName("SensitiveFileCount")
    @Expose
    private Long SensitiveFileCount;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Bucket name</p> 
     * @return BucketName <p>Bucket name</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>Bucket name</p>
     * @param BucketName <p>Bucket name</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>Task ID.</p> 
     * @return TaskId <p>Task ID.</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>Task ID.</p>
     * @param TaskId <p>Task ID.</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>Last scan time</p> 
     * @return LastScanTime <p>Last scan time</p>
     */
    public Long getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>Last scan time</p>
     * @param LastScanTime <p>Last scan time</p>
     */
    public void setLastScanTime(Long LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get <p>Number of recognized files</p> 
     * @return IdentifyFileCount <p>Number of recognized files</p>
     */
    public Long getIdentifyFileCount() {
        return this.IdentifyFileCount;
    }

    /**
     * Set <p>Number of recognized files</p>
     * @param IdentifyFileCount <p>Number of recognized files</p>
     */
    public void setIdentifyFileCount(Long IdentifyFileCount) {
        this.IdentifyFileCount = IdentifyFileCount;
    }

    /**
     * Get <p>Number of sensitive files</p> 
     * @return SensitiveFileCount <p>Number of sensitive files</p>
     */
    public Long getSensitiveFileCount() {
        return this.SensitiveFileCount;
    }

    /**
     * Set <p>Number of sensitive files</p>
     * @param SensitiveFileCount <p>Number of sensitive files</p>
     */
    public void setSensitiveFileCount(Long SensitiveFileCount) {
        this.SensitiveFileCount = SensitiveFileCount;
    }

    public CosBucketTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketTaskInfo(CosBucketTaskInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new Long(source.LastScanTime);
        }
        if (source.IdentifyFileCount != null) {
            this.IdentifyFileCount = new Long(source.IdentifyFileCount);
        }
        if (source.SensitiveFileCount != null) {
            this.SensitiveFileCount = new Long(source.SensitiveFileCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "IdentifyFileCount", this.IdentifyFileCount);
        this.setParamSimple(map, prefix + "SensitiveFileCount", this.SensitiveFileCount);

    }
}

