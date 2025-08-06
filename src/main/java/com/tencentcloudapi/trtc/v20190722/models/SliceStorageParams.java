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

public class SliceStorageParams extends AbstractModel {

    /**
    * Information about Tencent COS and third-party cloud storage accounts.
    */
    @SerializedName("CloudSliceStorage")
    @Expose
    private CloudSliceStorage CloudSliceStorage;

    /**
     * Get Information about Tencent COS and third-party cloud storage accounts. 
     * @return CloudSliceStorage Information about Tencent COS and third-party cloud storage accounts.
     */
    public CloudSliceStorage getCloudSliceStorage() {
        return this.CloudSliceStorage;
    }

    /**
     * Set Information about Tencent COS and third-party cloud storage accounts.
     * @param CloudSliceStorage Information about Tencent COS and third-party cloud storage accounts.
     */
    public void setCloudSliceStorage(CloudSliceStorage CloudSliceStorage) {
        this.CloudSliceStorage = CloudSliceStorage;
    }

    public SliceStorageParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SliceStorageParams(SliceStorageParams source) {
        if (source.CloudSliceStorage != null) {
            this.CloudSliceStorage = new CloudSliceStorage(source.CloudSliceStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CloudSliceStorage.", this.CloudSliceStorage);

    }
}

