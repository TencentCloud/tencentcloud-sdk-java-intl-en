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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDiskAssociatedAutoSnapshotPolicyRequest extends AbstractModel{

    /**
    * The ID of the queried cloud disk.
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get The ID of the queried cloud disk. 
     * @return DiskId The ID of the queried cloud disk.
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set The ID of the queried cloud disk.
     * @param DiskId The ID of the queried cloud disk.
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public DescribeDiskAssociatedAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskAssociatedAutoSnapshotPolicyRequest(DescribeDiskAssociatedAutoSnapshotPolicyRequest source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

