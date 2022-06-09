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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStorage extends AbstractModel{

    /**
    * The cloud storage provider.
0: Tencent Cloud COS. The storage services of other providers are not supported currently.
    */
    @SerializedName("Vendor")
    @Expose
    private Long Vendor;

    /**
    * The region of cloud storage.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The storage bucket.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * The access_key of the cloud storage account.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * The secret_key of the cloud storage account.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * The bucket to save data, which is an array of strings that can contain letters (a-z and A-Z), numbers (0-9), underscores (_), and hyphens (-). For example, if the value of this parameter is `["prefix1", "prefix2"]`, the recording file `xxx.m3u8` will be saved as `prefix1/prefix2/TaskId/xxx.m3u8`.
    */
    @SerializedName("FileNamePrefix")
    @Expose
    private String [] FileNamePrefix;

    /**
     * Get The cloud storage provider.
0: Tencent Cloud COS. The storage services of other providers are not supported currently. 
     * @return Vendor The cloud storage provider.
0: Tencent Cloud COS. The storage services of other providers are not supported currently.
     */
    public Long getVendor() {
        return this.Vendor;
    }

    /**
     * Set The cloud storage provider.
0: Tencent Cloud COS. The storage services of other providers are not supported currently.
     * @param Vendor The cloud storage provider.
0: Tencent Cloud COS. The storage services of other providers are not supported currently.
     */
    public void setVendor(Long Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get The region of cloud storage. 
     * @return Region The region of cloud storage.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region of cloud storage.
     * @param Region The region of cloud storage.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The storage bucket. 
     * @return Bucket The storage bucket.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set The storage bucket.
     * @param Bucket The storage bucket.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get The access_key of the cloud storage account. 
     * @return AccessKey The access_key of the cloud storage account.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set The access_key of the cloud storage account.
     * @param AccessKey The access_key of the cloud storage account.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get The secret_key of the cloud storage account. 
     * @return SecretKey The secret_key of the cloud storage account.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set The secret_key of the cloud storage account.
     * @param SecretKey The secret_key of the cloud storage account.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get The bucket to save data, which is an array of strings that can contain letters (a-z and A-Z), numbers (0-9), underscores (_), and hyphens (-). For example, if the value of this parameter is `["prefix1", "prefix2"]`, the recording file `xxx.m3u8` will be saved as `prefix1/prefix2/TaskId/xxx.m3u8`. 
     * @return FileNamePrefix The bucket to save data, which is an array of strings that can contain letters (a-z and A-Z), numbers (0-9), underscores (_), and hyphens (-). For example, if the value of this parameter is `["prefix1", "prefix2"]`, the recording file `xxx.m3u8` will be saved as `prefix1/prefix2/TaskId/xxx.m3u8`.
     */
    public String [] getFileNamePrefix() {
        return this.FileNamePrefix;
    }

    /**
     * Set The bucket to save data, which is an array of strings that can contain letters (a-z and A-Z), numbers (0-9), underscores (_), and hyphens (-). For example, if the value of this parameter is `["prefix1", "prefix2"]`, the recording file `xxx.m3u8` will be saved as `prefix1/prefix2/TaskId/xxx.m3u8`.
     * @param FileNamePrefix The bucket to save data, which is an array of strings that can contain letters (a-z and A-Z), numbers (0-9), underscores (_), and hyphens (-). For example, if the value of this parameter is `["prefix1", "prefix2"]`, the recording file `xxx.m3u8` will be saved as `prefix1/prefix2/TaskId/xxx.m3u8`.
     */
    public void setFileNamePrefix(String [] FileNamePrefix) {
        this.FileNamePrefix = FileNamePrefix;
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

