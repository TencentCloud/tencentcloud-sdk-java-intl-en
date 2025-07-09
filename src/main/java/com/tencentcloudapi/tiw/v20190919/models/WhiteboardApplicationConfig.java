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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhiteboardApplicationConfig extends AbstractModel {

    /**
    * Task type.

recording: Real-time recording.
transcode: Document transcoding.
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * Bucket name.
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Region of the bucket.
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
    * Destination CDN domain name.
    */
    @SerializedName("ResultDomain")
    @Expose
    private String ResultDomain;

    /**
    * Callback URL.
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * Callback authentication key.
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * IM admin user ID.
    */
    @SerializedName("AdminUserId")
    @Expose
    private String AdminUserId;

    /**
    * IM admin user signature.
    */
    @SerializedName("AdminUserSig")
    @Expose
    private String AdminUserSig;

    /**
     * Get Task type.

recording: Real-time recording.
transcode: Document transcoding. 
     * @return TaskType Task type.

recording: Real-time recording.
transcode: Document transcoding.
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set Task type.

recording: Real-time recording.
transcode: Document transcoding.
     * @param TaskType Task type.

recording: Real-time recording.
transcode: Document transcoding.
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get Bucket name. 
     * @return BucketName Bucket name.
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name.
     * @param BucketName Bucket name.
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Region of the bucket. 
     * @return BucketLocation Region of the bucket.
     */
    public String getBucketLocation() {
        return this.BucketLocation;
    }

    /**
     * Set Region of the bucket.
     * @param BucketLocation Region of the bucket.
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
     * Get Destination CDN domain name. 
     * @return ResultDomain Destination CDN domain name.
     */
    public String getResultDomain() {
        return this.ResultDomain;
    }

    /**
     * Set Destination CDN domain name.
     * @param ResultDomain Destination CDN domain name.
     */
    public void setResultDomain(String ResultDomain) {
        this.ResultDomain = ResultDomain;
    }

    /**
     * Get Callback URL. 
     * @return Callback Callback URL.
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Callback URL.
     * @param Callback Callback URL.
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get Callback authentication key. 
     * @return CallbackKey Callback authentication key.
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Callback authentication key.
     * @param CallbackKey Callback authentication key.
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
    }

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
     * Get IM admin user ID. 
     * @return AdminUserId IM admin user ID.
     */
    public String getAdminUserId() {
        return this.AdminUserId;
    }

    /**
     * Set IM admin user ID.
     * @param AdminUserId IM admin user ID.
     */
    public void setAdminUserId(String AdminUserId) {
        this.AdminUserId = AdminUserId;
    }

    /**
     * Get IM admin user signature. 
     * @return AdminUserSig IM admin user signature.
     */
    public String getAdminUserSig() {
        return this.AdminUserSig;
    }

    /**
     * Set IM admin user signature.
     * @param AdminUserSig IM admin user signature.
     */
    public void setAdminUserSig(String AdminUserSig) {
        this.AdminUserSig = AdminUserSig;
    }

    public WhiteboardApplicationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhiteboardApplicationConfig(WhiteboardApplicationConfig source) {
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
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AdminUserId != null) {
            this.AdminUserId = new String(source.AdminUserId);
        }
        if (source.AdminUserSig != null) {
            this.AdminUserSig = new String(source.AdminUserSig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketLocation", this.BucketLocation);
        this.setParamSimple(map, prefix + "BucketPrefix", this.BucketPrefix);
        this.setParamSimple(map, prefix + "ResultDomain", this.ResultDomain);
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AdminUserId", this.AdminUserId);
        this.setParamSimple(map, prefix + "AdminUserSig", this.AdminUserSig);

    }
}

