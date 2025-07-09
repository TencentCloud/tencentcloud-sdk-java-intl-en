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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageInfo extends AbstractModel {

    /**
    * The ID of bucket.
    */
    @SerializedName("BucketId")
    @Expose
    private String BucketId;

    /**
    * The name of bucket.
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * The region of storage.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * The status of the internet access domain name is stored. Valid values: <li>ONLINE: Active;</li> <li>DEPLOYING: In deployment.</li>
    */
    @SerializedName("InternetAccessDomainStatus")
    @Expose
    private String InternetAccessDomainStatus;

    /**
    * The internet access domain name of storage.
    */
    @SerializedName("InternetAccessDomain")
    @Expose
    private String InternetAccessDomain;

    /**
    * The creation time of the storage.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get The ID of bucket. 
     * @return BucketId The ID of bucket.
     */
    public String getBucketId() {
        return this.BucketId;
    }

    /**
     * Set The ID of bucket.
     * @param BucketId The ID of bucket.
     */
    public void setBucketId(String BucketId) {
        this.BucketId = BucketId;
    }

    /**
     * Get The name of bucket. 
     * @return StorageName The name of bucket.
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set The name of bucket.
     * @param StorageName The name of bucket.
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get The region of storage. 
     * @return StorageRegion The region of storage.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set The region of storage.
     * @param StorageRegion The region of storage.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get The status of the internet access domain name is stored. Valid values: <li>ONLINE: Active;</li> <li>DEPLOYING: In deployment.</li> 
     * @return InternetAccessDomainStatus The status of the internet access domain name is stored. Valid values: <li>ONLINE: Active;</li> <li>DEPLOYING: In deployment.</li>
     */
    public String getInternetAccessDomainStatus() {
        return this.InternetAccessDomainStatus;
    }

    /**
     * Set The status of the internet access domain name is stored. Valid values: <li>ONLINE: Active;</li> <li>DEPLOYING: In deployment.</li>
     * @param InternetAccessDomainStatus The status of the internet access domain name is stored. Valid values: <li>ONLINE: Active;</li> <li>DEPLOYING: In deployment.</li>
     */
    public void setInternetAccessDomainStatus(String InternetAccessDomainStatus) {
        this.InternetAccessDomainStatus = InternetAccessDomainStatus;
    }

    /**
     * Get The internet access domain name of storage. 
     * @return InternetAccessDomain The internet access domain name of storage.
     */
    public String getInternetAccessDomain() {
        return this.InternetAccessDomain;
    }

    /**
     * Set The internet access domain name of storage.
     * @param InternetAccessDomain The internet access domain name of storage.
     */
    public void setInternetAccessDomain(String InternetAccessDomain) {
        this.InternetAccessDomain = InternetAccessDomain;
    }

    /**
     * Get The creation time of the storage. 
     * @return CreateTime The creation time of the storage.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time of the storage.
     * @param CreateTime The creation time of the storage.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public StorageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageInfo(StorageInfo source) {
        if (source.BucketId != null) {
            this.BucketId = new String(source.BucketId);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.InternetAccessDomainStatus != null) {
            this.InternetAccessDomainStatus = new String(source.InternetAccessDomainStatus);
        }
        if (source.InternetAccessDomain != null) {
            this.InternetAccessDomain = new String(source.InternetAccessDomain);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketId", this.BucketId);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "InternetAccessDomainStatus", this.InternetAccessDomainStatus);
        this.setParamSimple(map, prefix + "InternetAccessDomain", this.InternetAccessDomain);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

