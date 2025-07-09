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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AwsSQS extends AbstractModel {

    /**
    * The region of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SQSRegion")
    @Expose
    private String SQSRegion;

    /**
    * The name of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SQSQueueName")
    @Expose
    private String SQSQueueName;

    /**
    * The key ID required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("S3SecretId")
    @Expose
    private String S3SecretId;

    /**
    * The key required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("S3SecretKey")
    @Expose
    private String S3SecretKey;

    /**
     * Get The region of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SQSRegion The region of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSQSRegion() {
        return this.SQSRegion;
    }

    /**
     * Set The region of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SQSRegion The region of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSQSRegion(String SQSRegion) {
        this.SQSRegion = SQSRegion;
    }

    /**
     * Get The name of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SQSQueueName The name of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSQSQueueName() {
        return this.SQSQueueName;
    }

    /**
     * Set The name of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SQSQueueName The name of the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSQSQueueName(String SQSQueueName) {
        this.SQSQueueName = SQSQueueName;
    }

    /**
     * Get The key ID required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return S3SecretId The key ID required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getS3SecretId() {
        return this.S3SecretId;
    }

    /**
     * Set The key ID required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param S3SecretId The key ID required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setS3SecretId(String S3SecretId) {
        this.S3SecretId = S3SecretId;
    }

    /**
     * Get The key required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return S3SecretKey The key required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getS3SecretKey() {
        return this.S3SecretKey;
    }

    /**
     * Set The key required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param S3SecretKey The key required to read from/write to the SQS queue.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setS3SecretKey(String S3SecretKey) {
        this.S3SecretKey = S3SecretKey;
    }

    public AwsSQS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AwsSQS(AwsSQS source) {
        if (source.SQSRegion != null) {
            this.SQSRegion = new String(source.SQSRegion);
        }
        if (source.SQSQueueName != null) {
            this.SQSQueueName = new String(source.SQSQueueName);
        }
        if (source.S3SecretId != null) {
            this.S3SecretId = new String(source.S3SecretId);
        }
        if (source.S3SecretKey != null) {
            this.S3SecretKey = new String(source.S3SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SQSRegion", this.SQSRegion);
        this.setParamSimple(map, prefix + "SQSQueueName", this.SQSQueueName);
        this.setParamSimple(map, prefix + "S3SecretId", this.S3SecretId);
        this.setParamSimple(map, prefix + "S3SecretKey", this.S3SecretKey);

    }
}

