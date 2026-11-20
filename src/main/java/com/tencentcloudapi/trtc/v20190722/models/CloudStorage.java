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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorage extends AbstractModel {

    /**
    * <p>Information about Tencent Cloud object storage COS and third-party cloud storage accounts<br>0: Tencent Cloud object storage COS<br>1: AWS<br>[Note] Currently, only AWS is supported for third-party cloud storage. More third-party cloud storage options are being added.</p>
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * <p>[Region information](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent Cloud object storage.<br>Example value: cn-shanghai-1</p><p>[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Cloud bucket name.</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>access key account information for cloud storage.<br>To store files to tencent cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key field in the link.</p>
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * <p>The secret_key account information for cloud storage.<br>To store files to Tencent Cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * <p>The user-specified location in the cloud storage bucket consists of an array of strings. Valid string range: az, az, 0-9, '_' and '-'. For example, with ["prefix1", "prefix2"], the recording file xxx.m3u8 becomes prefix1/prefix2/TaskId/xxx.m3u8.</p>
    */
    @SerializedName("FileNamePrefix")
    @Expose
    private String [] FileNamePrefix;

    /**
    * <p>When this parameter is set up for an S3-compatible endpoint override (for example, Cloudflare R2), the client will use this endpoint rather than the default AWS S3 endpoint. Example: "account_id.R2.cloudflarestorage.com"</p>
    */
    @SerializedName("EndpointUrl")
    @Expose
    private String EndpointUrl;

    /**
     * Get <p>Information about Tencent Cloud object storage COS and third-party cloud storage accounts<br>0: Tencent Cloud object storage COS<br>1: AWS<br>[Note] Currently, only AWS is supported for third-party cloud storage. More third-party cloud storage options are being added.</p> 
     * @return Vendor <p>Information about Tencent Cloud object storage COS and third-party cloud storage accounts<br>0: Tencent Cloud object storage COS<br>1: AWS<br>[Note] Currently, only AWS is supported for third-party cloud storage. More third-party cloud storage options are being added.</p>
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>Information about Tencent Cloud object storage COS and third-party cloud storage accounts<br>0: Tencent Cloud object storage COS<br>1: AWS<br>[Note] Currently, only AWS is supported for third-party cloud storage. More third-party cloud storage options are being added.</p>
     * @param Vendor <p>Information about Tencent Cloud object storage COS and third-party cloud storage accounts<br>0: Tencent Cloud object storage COS<br>1: AWS<br>[Note] Currently, only AWS is supported for third-party cloud storage. More third-party cloud storage options are being added.</p>
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>[Region information](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent Cloud object storage.<br>Example value: cn-shanghai-1</p><p>[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3</p> 
     * @return Region <p>[Region information](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent Cloud object storage.<br>Example value: cn-shanghai-1</p><p>[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>[Region information](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent Cloud object storage.<br>Example value: cn-shanghai-1</p><p>[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3</p>
     * @param Region <p>[Region information](https://www.tencentcloud.com/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent Cloud object storage.<br>Example value: cn-shanghai-1</p><p>[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Cloud bucket name.</p> 
     * @return Bucket <p>Cloud bucket name.</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>Cloud bucket name.</p>
     * @param Bucket <p>Cloud bucket name.</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>access key account information for cloud storage.<br>To store files to tencent cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key field in the link.</p> 
     * @return AccessKey <p>access key account information for cloud storage.<br>To store files to tencent cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key field in the link.</p>
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set <p>access key account information for cloud storage.<br>To store files to tencent cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key field in the link.</p>
     * @param AccessKey <p>access key account information for cloud storage.<br>To store files to tencent cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key field in the link.</p>
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get <p>The secret_key account information for cloud storage.<br>To store files to Tencent Cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.</p> 
     * @return SecretKey <p>The secret_key account information for cloud storage.<br>To store files to Tencent Cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>The secret_key account information for cloud storage.<br>To store files to Tencent Cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.</p>
     * @param SecretKey <p>The secret_key account information for cloud storage.<br>To store files to Tencent Cloud Object Storage (COS), visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get <p>The user-specified location in the cloud storage bucket consists of an array of strings. Valid string range: az, az, 0-9, '_' and '-'. For example, with ["prefix1", "prefix2"], the recording file xxx.m3u8 becomes prefix1/prefix2/TaskId/xxx.m3u8.</p> 
     * @return FileNamePrefix <p>The user-specified location in the cloud storage bucket consists of an array of strings. Valid string range: az, az, 0-9, '_' and '-'. For example, with ["prefix1", "prefix2"], the recording file xxx.m3u8 becomes prefix1/prefix2/TaskId/xxx.m3u8.</p>
     */
    public String [] getFileNamePrefix() {
        return this.FileNamePrefix;
    }

    /**
     * Set <p>The user-specified location in the cloud storage bucket consists of an array of strings. Valid string range: az, az, 0-9, '_' and '-'. For example, with ["prefix1", "prefix2"], the recording file xxx.m3u8 becomes prefix1/prefix2/TaskId/xxx.m3u8.</p>
     * @param FileNamePrefix <p>The user-specified location in the cloud storage bucket consists of an array of strings. Valid string range: az, az, 0-9, '_' and '-'. For example, with ["prefix1", "prefix2"], the recording file xxx.m3u8 becomes prefix1/prefix2/TaskId/xxx.m3u8.</p>
     */
    public void setFileNamePrefix(String [] FileNamePrefix) {
        this.FileNamePrefix = FileNamePrefix;
    }

    /**
     * Get <p>When this parameter is set up for an S3-compatible endpoint override (for example, Cloudflare R2), the client will use this endpoint rather than the default AWS S3 endpoint. Example: "account_id.R2.cloudflarestorage.com"</p> 
     * @return EndpointUrl <p>When this parameter is set up for an S3-compatible endpoint override (for example, Cloudflare R2), the client will use this endpoint rather than the default AWS S3 endpoint. Example: "account_id.R2.cloudflarestorage.com"</p>
     */
    public String getEndpointUrl() {
        return this.EndpointUrl;
    }

    /**
     * Set <p>When this parameter is set up for an S3-compatible endpoint override (for example, Cloudflare R2), the client will use this endpoint rather than the default AWS S3 endpoint. Example: "account_id.R2.cloudflarestorage.com"</p>
     * @param EndpointUrl <p>When this parameter is set up for an S3-compatible endpoint override (for example, Cloudflare R2), the client will use this endpoint rather than the default AWS S3 endpoint. Example: "account_id.R2.cloudflarestorage.com"</p>
     */
    public void setEndpointUrl(String EndpointUrl) {
        this.EndpointUrl = EndpointUrl;
    }

    public CloudStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStorage(CloudStorage source) {
        if (source.Vendor != null) {
            this.Vendor = new Long(source.Vendor);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.FileNamePrefix != null) {
            this.FileNamePrefix = new String[source.FileNamePrefix.length];
            for (int i = 0; i < source.FileNamePrefix.length; i++) {
                this.FileNamePrefix[i] = new String(source.FileNamePrefix[i]);
            }
        }
        if (source.EndpointUrl != null) {
            this.EndpointUrl = new String(source.EndpointUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamArraySimple(map, prefix + "FileNamePrefix.", this.FileNamePrefix);
        this.setParamSimple(map, prefix + "EndpointUrl", this.EndpointUrl);

    }
}

