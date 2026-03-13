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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * List of file system ids to be unbound, separated by ",". file system ids can be obtained by querying the file system list through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
    */
    @SerializedName("FileSystemIds")
    @Expose
    private String FileSystemIds;

    /**
    * Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
     * Get List of file system ids to be unbound, separated by ",". file system ids can be obtained by querying the file system list through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api. 
     * @return FileSystemIds List of file system ids to be unbound, separated by ",". file system ids can be obtained by querying the file system list through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     */
    public String getFileSystemIds() {
        return this.FileSystemIds;
    }

    /**
     * Set List of file system ids to be unbound, separated by ",". file system ids can be obtained by querying the file system list through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     * @param FileSystemIds List of file system ids to be unbound, separated by ",". file system ids can be obtained by querying the file system list through the [DescribeCfsFileSystems](https://www.tencentcloud.com/document/product/582/38170?from_cn_redirect=1) api.
     */
    public void setFileSystemIds(String FileSystemIds) {
        this.FileSystemIds = FileSystemIds;
    }

    /**
     * Get Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api. 
     * @return AutoSnapshotPolicyId Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
     * @param AutoSnapshotPolicyId Unbound snapshot policy ID, which can be obtained by querying through the [DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1) api.
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    public UnbindAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindAutoSnapshotPolicyRequest(UnbindAutoSnapshotPolicyRequest source) {
        if (source.FileSystemIds != null) {
            this.FileSystemIds = new String(source.FileSystemIds);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemIds", this.FileSystemIds);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);

    }
}

