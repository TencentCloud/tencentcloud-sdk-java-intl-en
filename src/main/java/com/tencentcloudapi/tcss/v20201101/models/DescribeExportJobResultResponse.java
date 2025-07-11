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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExportJobResultResponse extends AbstractModel {

    /**
    * Export status. Valid values: `SUCCESS`, `FAILURE`, `RUNNING`.
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * Download URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
    * Export progress when `ExportStatus` is `RUNNING`. Value range: Floating points between `0` and `100`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExportProgress")
    @Expose
    private Float ExportProgress;

    /**
    * Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailureMsg")
    @Expose
    private String FailureMsg;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Export status. Valid values: `SUCCESS`, `FAILURE`, `RUNNING`. 
     * @return ExportStatus Export status. Valid values: `SUCCESS`, `FAILURE`, `RUNNING`.
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set Export status. Valid values: `SUCCESS`, `FAILURE`, `RUNNING`.
     * @param ExportStatus Export status. Valid values: `SUCCESS`, `FAILURE`, `RUNNING`.
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
    }

    /**
     * Get Download URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DownloadURL Download URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set Download URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DownloadURL Download URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    /**
     * Get Export progress when `ExportStatus` is `RUNNING`. Value range: Floating points between `0` and `100`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExportProgress Export progress when `ExportStatus` is `RUNNING`. Value range: Floating points between `0` and `100`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getExportProgress() {
        return this.ExportProgress;
    }

    /**
     * Set Export progress when `ExportStatus` is `RUNNING`. Value range: Floating points between `0` and `100`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExportProgress Export progress when `ExportStatus` is `RUNNING`. Value range: Floating points between `0` and `100`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExportProgress(Float ExportProgress) {
        this.ExportProgress = ExportProgress;
    }

    /**
     * Get Failure cause
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailureMsg Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFailureMsg() {
        return this.FailureMsg;
    }

    /**
     * Set Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailureMsg Failure cause
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailureMsg(String FailureMsg) {
        this.FailureMsg = FailureMsg;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeExportJobResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportJobResultResponse(DescribeExportJobResultResponse source) {
        if (source.ExportStatus != null) {
            this.ExportStatus = new String(source.ExportStatus);
        }
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
        if (source.ExportProgress != null) {
            this.ExportProgress = new Float(source.ExportProgress);
        }
        if (source.FailureMsg != null) {
            this.FailureMsg = new String(source.FailureMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "DownloadURL", this.DownloadURL);
        this.setParamSimple(map, prefix + "ExportProgress", this.ExportProgress);
        this.setParamSimple(map, prefix + "FailureMsg", this.FailureMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

