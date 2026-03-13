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

public class UpdateCfsSnapshotAttributeRequest extends AbstractModel {

    /**
    * Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * File system snapshot name, must fill in either this or AliveDays. snapshot name supports no more than 64 characters in length, supports chinese, numbers, _, and -.
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * File system snapshot retention days. either this or SnapshotName must be specified. if the original setting has permanent retention attribute, it is not allowed to be modified to short-term validity.
    */
    @SerializedName("AliveDays")
    @Expose
    private Long AliveDays;

    /**
     * Get Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api. 
     * @return SnapshotId Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
     * @param SnapshotId Snapshot ID, which can be obtained by querying through the [DescribeCfsSnapshots](https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1) api.
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get File system snapshot name, must fill in either this or AliveDays. snapshot name supports no more than 64 characters in length, supports chinese, numbers, _, and -. 
     * @return SnapshotName File system snapshot name, must fill in either this or AliveDays. snapshot name supports no more than 64 characters in length, supports chinese, numbers, _, and -.
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set File system snapshot name, must fill in either this or AliveDays. snapshot name supports no more than 64 characters in length, supports chinese, numbers, _, and -.
     * @param SnapshotName File system snapshot name, must fill in either this or AliveDays. snapshot name supports no more than 64 characters in length, supports chinese, numbers, _, and -.
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get File system snapshot retention days. either this or SnapshotName must be specified. if the original setting has permanent retention attribute, it is not allowed to be modified to short-term validity. 
     * @return AliveDays File system snapshot retention days. either this or SnapshotName must be specified. if the original setting has permanent retention attribute, it is not allowed to be modified to short-term validity.
     */
    public Long getAliveDays() {
        return this.AliveDays;
    }

    /**
     * Set File system snapshot retention days. either this or SnapshotName must be specified. if the original setting has permanent retention attribute, it is not allowed to be modified to short-term validity.
     * @param AliveDays File system snapshot retention days. either this or SnapshotName must be specified. if the original setting has permanent retention attribute, it is not allowed to be modified to short-term validity.
     */
    public void setAliveDays(Long AliveDays) {
        this.AliveDays = AliveDays;
    }

    public UpdateCfsSnapshotAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCfsSnapshotAttributeRequest(UpdateCfsSnapshotAttributeRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.AliveDays != null) {
            this.AliveDays = new Long(source.AliveDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "AliveDays", this.AliveDays);

    }
}

