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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotByTimeOffsetTask2017 extends AbstractModel {

    /**
    * Screenshot job ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Screenshot file ID.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Screenshot specification. See [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Screenshot result info.
    */
    @SerializedName("SnapshotInfoSet")
    @Expose
    private SnapshotByTimeOffset2017 [] SnapshotInfoSet;

    /**
     * Get Screenshot job ID. 
     * @return TaskId Screenshot job ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Screenshot job ID.
     * @param TaskId Screenshot job ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Screenshot file ID. 
     * @return FileId Screenshot file ID.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Screenshot file ID.
     * @param FileId Screenshot file ID.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Screenshot specification. See [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF). 
     * @return Definition Screenshot specification. See [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Screenshot specification. See [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     * @param Definition Screenshot specification. See [SnapshotByTimeOffset parameter template](https://www.tencentcloud.com/document/product/266/33480?from_cn_redirect=1#.E6.97.B6.E9.97.B4.E7.82.B9.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Screenshot result info. 
     * @return SnapshotInfoSet Screenshot result info.
     */
    public SnapshotByTimeOffset2017 [] getSnapshotInfoSet() {
        return this.SnapshotInfoSet;
    }

    /**
     * Set Screenshot result info.
     * @param SnapshotInfoSet Screenshot result info.
     */
    public void setSnapshotInfoSet(SnapshotByTimeOffset2017 [] SnapshotInfoSet) {
        this.SnapshotInfoSet = SnapshotInfoSet;
    }

    public SnapshotByTimeOffsetTask2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTask2017(SnapshotByTimeOffsetTask2017 source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SnapshotInfoSet != null) {
            this.SnapshotInfoSet = new SnapshotByTimeOffset2017[source.SnapshotInfoSet.length];
            for (int i = 0; i < source.SnapshotInfoSet.length; i++) {
                this.SnapshotInfoSet[i] = new SnapshotByTimeOffset2017(source.SnapshotInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "SnapshotInfoSet.", this.SnapshotInfoSet);

    }
}

