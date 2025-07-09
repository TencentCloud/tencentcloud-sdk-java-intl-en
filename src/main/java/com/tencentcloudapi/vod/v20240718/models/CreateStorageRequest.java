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

public class CreateStorageRequest extends AbstractModel {

    /**
    * <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Storage region, which must be a region supported by the system. All storage regions and the regions where storage buckets have already been enabled can be queried using the [DescribeStorageRegions](https://www.tencentcloud.com/document/product/266/46542) API.
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * The name of the storage.
<li>Only lowercase English letters, numbers, hyphens "-", and their combinations are supported.</li>
<li>The storage name cannot start or end with a "-".</li>
<li>The maximum length of the storage name is 64 characters.</li>
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
     * Get <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b> 
     * @return SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     * @param SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Storage region, which must be a region supported by the system. All storage regions and the regions where storage buckets have already been enabled can be queried using the [DescribeStorageRegions](https://www.tencentcloud.com/document/product/266/46542) API. 
     * @return StorageRegion Storage region, which must be a region supported by the system. All storage regions and the regions where storage buckets have already been enabled can be queried using the [DescribeStorageRegions](https://www.tencentcloud.com/document/product/266/46542) API.
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set Storage region, which must be a region supported by the system. All storage regions and the regions where storage buckets have already been enabled can be queried using the [DescribeStorageRegions](https://www.tencentcloud.com/document/product/266/46542) API.
     * @param StorageRegion Storage region, which must be a region supported by the system. All storage regions and the regions where storage buckets have already been enabled can be queried using the [DescribeStorageRegions](https://www.tencentcloud.com/document/product/266/46542) API.
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get The name of the storage.
<li>Only lowercase English letters, numbers, hyphens "-", and their combinations are supported.</li>
<li>The storage name cannot start or end with a "-".</li>
<li>The maximum length of the storage name is 64 characters.</li> 
     * @return StorageName The name of the storage.
<li>Only lowercase English letters, numbers, hyphens "-", and their combinations are supported.</li>
<li>The storage name cannot start or end with a "-".</li>
<li>The maximum length of the storage name is 64 characters.</li>
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set The name of the storage.
<li>Only lowercase English letters, numbers, hyphens "-", and their combinations are supported.</li>
<li>The storage name cannot start or end with a "-".</li>
<li>The maximum length of the storage name is 64 characters.</li>
     * @param StorageName The name of the storage.
<li>Only lowercase English letters, numbers, hyphens "-", and their combinations are supported.</li>
<li>The storage name cannot start or end with a "-".</li>
<li>The maximum length of the storage name is 64 characters.</li>
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    public CreateStorageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStorageRequest(CreateStorageRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);

    }
}

