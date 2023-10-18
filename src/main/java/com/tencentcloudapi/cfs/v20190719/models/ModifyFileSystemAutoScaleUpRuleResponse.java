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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFileSystemAutoScaleUpRuleResponse extends AbstractModel {

    /**
    * File system ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Rule status. Valid values: `0` (disabled) and `1` (enabled).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Threshold for triggering scaling. Value range: 10-90
    */
    @SerializedName("ScaleUpThreshold")
    @Expose
    private Long ScaleUpThreshold;

    /**
    * Target threshold after scaling. Value range: 10-90
    */
    @SerializedName("TargetThreshold")
    @Expose
    private Long TargetThreshold;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get File system ID 
     * @return FileSystemId File system ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID
     * @param FileSystemId File system ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get Rule status. Valid values: `0` (disabled) and `1` (enabled). 
     * @return Status Rule status. Valid values: `0` (disabled) and `1` (enabled).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Rule status. Valid values: `0` (disabled) and `1` (enabled).
     * @param Status Rule status. Valid values: `0` (disabled) and `1` (enabled).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Threshold for triggering scaling. Value range: 10-90 
     * @return ScaleUpThreshold Threshold for triggering scaling. Value range: 10-90
     */
    public Long getScaleUpThreshold() {
        return this.ScaleUpThreshold;
    }

    /**
     * Set Threshold for triggering scaling. Value range: 10-90
     * @param ScaleUpThreshold Threshold for triggering scaling. Value range: 10-90
     */
    public void setScaleUpThreshold(Long ScaleUpThreshold) {
        this.ScaleUpThreshold = ScaleUpThreshold;
    }

    /**
     * Get Target threshold after scaling. Value range: 10-90 
     * @return TargetThreshold Target threshold after scaling. Value range: 10-90
     */
    public Long getTargetThreshold() {
        return this.TargetThreshold;
    }

    /**
     * Set Target threshold after scaling. Value range: 10-90
     * @param TargetThreshold Target threshold after scaling. Value range: 10-90
     */
    public void setTargetThreshold(Long TargetThreshold) {
        this.TargetThreshold = TargetThreshold;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyFileSystemAutoScaleUpRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileSystemAutoScaleUpRuleResponse(ModifyFileSystemAutoScaleUpRuleResponse source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScaleUpThreshold != null) {
            this.ScaleUpThreshold = new Long(source.ScaleUpThreshold);
        }
        if (source.TargetThreshold != null) {
            this.TargetThreshold = new Long(source.TargetThreshold);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScaleUpThreshold", this.ScaleUpThreshold);
        this.setParamSimple(map, prefix + "TargetThreshold", this.TargetThreshold);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

