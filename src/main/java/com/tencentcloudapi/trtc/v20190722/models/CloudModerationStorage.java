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

public class CloudModerationStorage extends AbstractModel {

    /**
    * Information about Tencent COS and third-party cloud storage accounts.
0: Tencent COS.
1: AWS S3.
2: Alibaba Cloud OSS.
Example value: 0.
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * [Region information](https://www.tencentcloud.comom/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent COS.
Example value: cn-shanghai-1.

[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3.
Example value: ap-southeast-3.	
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Cloud bucket name.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * access_key account information of the cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key fields in the link.
Example value: test-accesskey.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * secret_key account information of cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.
Example value: test-secretkey.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Specified location of the cloud bucket, which consists of arrays of strings. Value range for the strings is lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (_-). For example, under the feature of ["prefix1", "prefix2"], the audio slicing file (xxx.mp3) is stored as prefix1/prefix2/{taskId}/{userId}/audios/{sdkappid}_{roomId}_{userid}_{UTC time}.ogg, while the video frame is stored as prefix1/prefix2/{taskId}/{userId}/images/{sdkappid}_{roomId}_{userid}_{UTC time}.png.
    */
    @SerializedName("FileNamePrefix")
    @Expose
    private String [] FileNamePrefix;

    /**
     * Get Information about Tencent COS and third-party cloud storage accounts.
0: Tencent COS.
1: AWS S3.
2: Alibaba Cloud OSS.
Example value: 0. 
     * @return Vendor Information about Tencent COS and third-party cloud storage accounts.
0: Tencent COS.
1: AWS S3.
2: Alibaba Cloud OSS.
Example value: 0.
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set Information about Tencent COS and third-party cloud storage accounts.
0: Tencent COS.
1: AWS S3.
2: Alibaba Cloud OSS.
Example value: 0.
     * @param Vendor Information about Tencent COS and third-party cloud storage accounts.
0: Tencent COS.
1: AWS S3.
2: Alibaba Cloud OSS.
Example value: 0.
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get [Region information](https://www.tencentcloud.comom/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent COS.
Example value: cn-shanghai-1.

[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3.
Example value: ap-southeast-3.	 
     * @return Region [Region information](https://www.tencentcloud.comom/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent COS.
Example value: cn-shanghai-1.

[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3.
Example value: ap-southeast-3.	
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set [Region information](https://www.tencentcloud.comom/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent COS.
Example value: cn-shanghai-1.

[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3.
Example value: ap-southeast-3.	
     * @param Region [Region information](https://www.tencentcloud.comom/document/product/436/6224?from_cn_redirect=1#.E5.9C.B0.E5.9F.9F) of Tencent COS.
Example value: cn-shanghai-1.

[Region information](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-regions) of AWS S3.
Example value: ap-southeast-3.	
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Cloud bucket name. 
     * @return Bucket Cloud bucket name.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Cloud bucket name.
     * @param Bucket Cloud bucket name.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get access_key account information of the cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key fields in the link.
Example value: test-accesskey. 
     * @return AccessKey access_key account information of the cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key fields in the link.
Example value: test-accesskey.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set access_key account information of the cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key fields in the link.
Example value: test-accesskey.
     * @param AccessKey access_key account information of the cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretId value corresponding to the key fields in the link.
Example value: test-accesskey.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get secret_key account information of cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.
Example value: test-secretkey. 
     * @return SecretKey secret_key account information of cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.
Example value: test-secretkey.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set secret_key account information of cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.
Example value: test-secretkey.
     * @param SecretKey secret_key account information of cloud storage.
To store files to Tencent COS, visit https://console.cloud.tencent.com/cam/capi to view or create the SecretKey value corresponding to the key fields in the link.
Example value: test-secretkey.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Specified location of the cloud bucket, which consists of arrays of strings. Value range for the strings is lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (_-). For example, under the feature of ["prefix1", "prefix2"], the audio slicing file (xxx.mp3) is stored as prefix1/prefix2/{taskId}/{userId}/audios/{sdkappid}_{roomId}_{userid}_{UTC time}.ogg, while the video frame is stored as prefix1/prefix2/{taskId}/{userId}/images/{sdkappid}_{roomId}_{userid}_{UTC time}.png. 
     * @return FileNamePrefix Specified location of the cloud bucket, which consists of arrays of strings. Value range for the strings is lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (_-). For example, under the feature of ["prefix1", "prefix2"], the audio slicing file (xxx.mp3) is stored as prefix1/prefix2/{taskId}/{userId}/audios/{sdkappid}_{roomId}_{userid}_{UTC time}.ogg, while the video frame is stored as prefix1/prefix2/{taskId}/{userId}/images/{sdkappid}_{roomId}_{userid}_{UTC time}.png.
     */
    public String [] getFileNamePrefix() {
        return this.FileNamePrefix;
    }

    /**
     * Set Specified location of the cloud bucket, which consists of arrays of strings. Value range for the strings is lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (_-). For example, under the feature of ["prefix1", "prefix2"], the audio slicing file (xxx.mp3) is stored as prefix1/prefix2/{taskId}/{userId}/audios/{sdkappid}_{roomId}_{userid}_{UTC time}.ogg, while the video frame is stored as prefix1/prefix2/{taskId}/{userId}/images/{sdkappid}_{roomId}_{userid}_{UTC time}.png.
     * @param FileNamePrefix Specified location of the cloud bucket, which consists of arrays of strings. Value range for the strings is lowercase letters (a–z), uppercase letters (A–Z), digits (0–9), and special characters (_-). For example, under the feature of ["prefix1", "prefix2"], the audio slicing file (xxx.mp3) is stored as prefix1/prefix2/{taskId}/{userId}/audios/{sdkappid}_{roomId}_{userid}_{UTC time}.ogg, while the video frame is stored as prefix1/prefix2/{taskId}/{userId}/images/{sdkappid}_{roomId}_{userid}_{UTC time}.png.
     */
    public void setFileNamePrefix(String [] FileNamePrefix) {
        this.FileNamePrefix = FileNamePrefix;
    }

    public CloudModerationStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudModerationStorage(CloudModerationStorage source) {
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

    }
}

