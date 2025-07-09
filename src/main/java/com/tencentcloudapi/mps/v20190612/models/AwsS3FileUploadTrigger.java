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

public class AwsS3FileUploadTrigger extends AbstractModel {

    /**
    * The AWS S3 bucket bound to the scheme.
    */
    @SerializedName("S3Bucket")
    @Expose
    private String S3Bucket;

    /**
    * The region of the AWS S3 bucket.
    */
    @SerializedName("S3Region")
    @Expose
    private String S3Region;

    /**
    * The bucket directory bound. It must be an absolute path that starts and ends with `/`, such as `/movie/201907/`. If you do not specify this, the root directory will be bound.	
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * The file formats that will trigger the scheme, such as ["mp4", "flv", "mov"]. If you do not specify this, the upload of files in any format will trigger the scheme.	
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
    * The key ID of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("S3SecretId")
    @Expose
    private String S3SecretId;

    /**
    * The key of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("S3SecretKey")
    @Expose
    private String S3SecretKey;

    /**
    * The SQS queue of the AWS S3 bucket.
Note: The queue must be in the same region as the bucket.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AwsSQS")
    @Expose
    private AwsSQS AwsSQS;

    /**
     * Get The AWS S3 bucket bound to the scheme. 
     * @return S3Bucket The AWS S3 bucket bound to the scheme.
     */
    public String getS3Bucket() {
        return this.S3Bucket;
    }

    /**
     * Set The AWS S3 bucket bound to the scheme.
     * @param S3Bucket The AWS S3 bucket bound to the scheme.
     */
    public void setS3Bucket(String S3Bucket) {
        this.S3Bucket = S3Bucket;
    }

    /**
     * Get The region of the AWS S3 bucket. 
     * @return S3Region The region of the AWS S3 bucket.
     */
    public String getS3Region() {
        return this.S3Region;
    }

    /**
     * Set The region of the AWS S3 bucket.
     * @param S3Region The region of the AWS S3 bucket.
     */
    public void setS3Region(String S3Region) {
        this.S3Region = S3Region;
    }

    /**
     * Get The bucket directory bound. It must be an absolute path that starts and ends with `/`, such as `/movie/201907/`. If you do not specify this, the root directory will be bound.	 
     * @return Dir The bucket directory bound. It must be an absolute path that starts and ends with `/`, such as `/movie/201907/`. If you do not specify this, the root directory will be bound.	
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set The bucket directory bound. It must be an absolute path that starts and ends with `/`, such as `/movie/201907/`. If you do not specify this, the root directory will be bound.	
     * @param Dir The bucket directory bound. It must be an absolute path that starts and ends with `/`, such as `/movie/201907/`. If you do not specify this, the root directory will be bound.	
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get The file formats that will trigger the scheme, such as ["mp4", "flv", "mov"]. If you do not specify this, the upload of files in any format will trigger the scheme.	 
     * @return Formats The file formats that will trigger the scheme, such as ["mp4", "flv", "mov"]. If you do not specify this, the upload of files in any format will trigger the scheme.	
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set The file formats that will trigger the scheme, such as ["mp4", "flv", "mov"]. If you do not specify this, the upload of files in any format will trigger the scheme.	
     * @param Formats The file formats that will trigger the scheme, such as ["mp4", "flv", "mov"]. If you do not specify this, the upload of files in any format will trigger the scheme.	
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    /**
     * Get The key ID of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return S3SecretId The key ID of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getS3SecretId() {
        return this.S3SecretId;
    }

    /**
     * Set The key ID of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param S3SecretId The key ID of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setS3SecretId(String S3SecretId) {
        this.S3SecretId = S3SecretId;
    }

    /**
     * Get The key of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return S3SecretKey The key of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getS3SecretKey() {
        return this.S3SecretKey;
    }

    /**
     * Set The key of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param S3SecretKey The key of the AWS S3 bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setS3SecretKey(String S3SecretKey) {
        this.S3SecretKey = S3SecretKey;
    }

    /**
     * Get The SQS queue of the AWS S3 bucket.
Note: The queue must be in the same region as the bucket.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AwsSQS The SQS queue of the AWS S3 bucket.
Note: The queue must be in the same region as the bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AwsSQS getAwsSQS() {
        return this.AwsSQS;
    }

    /**
     * Set The SQS queue of the AWS S3 bucket.
Note: The queue must be in the same region as the bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AwsSQS The SQS queue of the AWS S3 bucket.
Note: The queue must be in the same region as the bucket.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAwsSQS(AwsSQS AwsSQS) {
        this.AwsSQS = AwsSQS;
    }

    public AwsS3FileUploadTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AwsS3FileUploadTrigger(AwsS3FileUploadTrigger source) {
        if (source.S3Bucket != null) {
            this.S3Bucket = new String(source.S3Bucket);
        }
        if (source.S3Region != null) {
            this.S3Region = new String(source.S3Region);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
        if (source.Formats != null) {
            this.Formats = new String[source.Formats.length];
            for (int i = 0; i < source.Formats.length; i++) {
                this.Formats[i] = new String(source.Formats[i]);
            }
        }
        if (source.S3SecretId != null) {
            this.S3SecretId = new String(source.S3SecretId);
        }
        if (source.S3SecretKey != null) {
            this.S3SecretKey = new String(source.S3SecretKey);
        }
        if (source.AwsSQS != null) {
            this.AwsSQS = new AwsSQS(source.AwsSQS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "S3Bucket", this.S3Bucket);
        this.setParamSimple(map, prefix + "S3Region", this.S3Region);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);
        this.setParamSimple(map, prefix + "S3SecretId", this.S3SecretId);
        this.setParamSimple(map, prefix + "S3SecretKey", this.S3SecretKey);
        this.setParamObj(map, prefix + "AwsSQS.", this.AwsSQS);

    }
}

