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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class S3 extends AbstractModel {

    /**
    * The URL without bucket name or path, for example: `https://storage.googleapis.com`, `https://s3.ap-northeast-2.amazonaws.com`, and `https://cos.ap-nanjing.myqcloud.com`.
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * The region where the bucket is located, for example: `ap-northeast-2`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The bucket name and log storage directory, for example: `your_bucket_name/EO-logs/`. If the directory does not exist in the bucket, it will be created automatically.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * The Access Key ID used to access the bucket.
    */
    @SerializedName("AccessId")
    @Expose
    private String AccessId;

    /**
    * The secret key used to access the bucket.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * The data compress type. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get The URL without bucket name or path, for example: `https://storage.googleapis.com`, `https://s3.ap-northeast-2.amazonaws.com`, and `https://cos.ap-nanjing.myqcloud.com`. 
     * @return Endpoint The URL without bucket name or path, for example: `https://storage.googleapis.com`, `https://s3.ap-northeast-2.amazonaws.com`, and `https://cos.ap-nanjing.myqcloud.com`.
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set The URL without bucket name or path, for example: `https://storage.googleapis.com`, `https://s3.ap-northeast-2.amazonaws.com`, and `https://cos.ap-nanjing.myqcloud.com`.
     * @param Endpoint The URL without bucket name or path, for example: `https://storage.googleapis.com`, `https://s3.ap-northeast-2.amazonaws.com`, and `https://cos.ap-nanjing.myqcloud.com`.
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get The region where the bucket is located, for example: `ap-northeast-2`. 
     * @return Region The region where the bucket is located, for example: `ap-northeast-2`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region where the bucket is located, for example: `ap-northeast-2`.
     * @param Region The region where the bucket is located, for example: `ap-northeast-2`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The bucket name and log storage directory, for example: `your_bucket_name/EO-logs/`. If the directory does not exist in the bucket, it will be created automatically. 
     * @return Bucket The bucket name and log storage directory, for example: `your_bucket_name/EO-logs/`. If the directory does not exist in the bucket, it will be created automatically.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set The bucket name and log storage directory, for example: `your_bucket_name/EO-logs/`. If the directory does not exist in the bucket, it will be created automatically.
     * @param Bucket The bucket name and log storage directory, for example: `your_bucket_name/EO-logs/`. If the directory does not exist in the bucket, it will be created automatically.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get The Access Key ID used to access the bucket. 
     * @return AccessId The Access Key ID used to access the bucket.
     */
    public String getAccessId() {
        return this.AccessId;
    }

    /**
     * Set The Access Key ID used to access the bucket.
     * @param AccessId The Access Key ID used to access the bucket.
     */
    public void setAccessId(String AccessId) {
        this.AccessId = AccessId;
    }

    /**
     * Get The secret key used to access the bucket. 
     * @return AccessKey The secret key used to access the bucket.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set The secret key used to access the bucket.
     * @param AccessKey The secret key used to access the bucket.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get The data compress type. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled. 
     * @return CompressType The data compress type. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set The data compress type. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
     * @param CompressType The data compress type. Valid values:<li>gzip: gzip compression.</li>If this field is not filled in, compression is disabled.
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    public S3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public S3(S3 source) {
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.AccessId != null) {
            this.AccessId = new String(source.AccessId);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "AccessId", this.AccessId);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

