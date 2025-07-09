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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotResult extends AbstractModel {

    /**
    * Task execution error code.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * Task execution error message.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * Number of generated snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * List of URLs of the snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Snapshots")
    @Expose
    private String [] Snapshots;

    /**
     * Get Task execution error code.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return ErrorCode Task execution error code.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set Task execution error code.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param ErrorCode Task execution error code.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get Task execution error message.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return ErrorMessage Task execution error message.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set Task execution error message.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param ErrorMessage Task execution error message.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get Number of generated snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Total Number of generated snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Number of generated snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Total Number of generated snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get List of URLs of the snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Snapshots List of URLs of the snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String [] getSnapshots() {
        return this.Snapshots;
    }

    /**
     * Set List of URLs of the snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Snapshots List of URLs of the snapshot images.
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshots(String [] Snapshots) {
        this.Snapshots = Snapshots;
    }

    public SnapshotResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotResult(SnapshotResult source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Snapshots != null) {
            this.Snapshots = new String[source.Snapshots.length];
            for (int i = 0; i < source.Snapshots.length; i++) {
                this.Snapshots[i] = new String(source.Snapshots[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArraySimple(map, prefix + "Snapshots.", this.Snapshots);

    }
}

