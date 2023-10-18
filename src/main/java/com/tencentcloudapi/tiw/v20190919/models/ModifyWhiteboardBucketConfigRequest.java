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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWhiteboardBucketConfigRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Task type to be queried.
recording: Real-time recording.
transcode: Document transcoding.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Name of the COS bucket.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Region of the COS bucket.
    */
    @SerializedName("BucketLocation")
    @Expose
    private String BucketLocation;

    /**
    * Resource prefix of the bucket.
    */
    @SerializedName("BucketPrefix")
    @Expose
    private String BucketPrefix;

    /**
    * Domain name of the URL of the bucket.
    */
    @SerializedName("ResultDomain")
    @Expose
    private String ResultDomain;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Task type to be queried.
recording: Real-time recording.
transcode: Document transcoding. 
     * @return TaskType Task type to be queried.
recording: Real-time recording.
transcode: Document transcoding.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type to be queried.
recording: Real-time recording.
transcode: Document transcoding.
     * @param TaskType Task type to be queried.
recording: Real-time recording.
transcode: Document transcoding.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Name of the COS bucket. 
     * @return BucketName Name of the COS bucket.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Name of the COS bucket.
     * @param BucketName Name of the COS bucket.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Region of the COS bucket. 
     * @return BucketLocation Region of the COS bucket.
     */
    public String getBucketLocation() {
        return this.BucketLocation;
    }

    /**
     * Set Region of the COS bucket.
     * @param BucketLocation Region of the COS bucket.
     */
    public void setBucketLocation(String BucketLocation) {
        this.BucketLocation = BucketLocation;
    }

    /**
     * Get Resource prefix of the bucket. 
     * @return BucketPrefix Resource prefix of the bucket.
     */
    public String getBucketPrefix() {
        return this.BucketPrefix;
    }

    /**
     * Set Resource prefix of the bucket.
     * @param BucketPrefix Resource prefix of the bucket.
     */
    public void setBucketPrefix(String BucketPrefix) {
        this.BucketPrefix = BucketPrefix;
    }

    /**
     * Get Domain name of the URL of the bucket. 
     * @return ResultDomain Domain name of the URL of the bucket.
     */
    public String getResultDomain() {
        return this.ResultDomain;
    }

    /**
     * Set Domain name of the URL of the bucket.
     * @param ResultDomain Domain name of the URL of the bucket.
     */
    public void setResultDomain(String ResultDomain) {
        this.ResultDomain = ResultDomain;
    }

    public ModifyWhiteboardBucketConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWhiteboardBucketConfigRequest(ModifyWhiteboardBucketConfigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketLocation != null) {
            this.BucketLocation = new String(source.BucketLocation);
        }
        if (source.BucketPrefix != null) {
            this.BucketPrefix = new String(source.BucketPrefix);
        }
        if (source.ResultDomain != null) {
            this.ResultDomain = new String(source.ResultDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketLocation", this.BucketLocation);
        this.setParamSimple(map, prefix + "BucketPrefix", this.BucketPrefix);
        this.setParamSimple(map, prefix + "ResultDomain", this.ResultDomain);

    }
}

