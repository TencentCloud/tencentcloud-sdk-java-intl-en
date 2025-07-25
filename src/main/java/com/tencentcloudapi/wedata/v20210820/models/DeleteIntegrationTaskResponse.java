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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteIntegrationTaskResponse extends AbstractModel {

    /**
    * Task Deletion Success or Failure Indicator
    */
    @SerializedName("Data")
    @Expose
    private Boolean Data;

    /**
    * Task Deletion Success or Failure Indicator
0 indicates deletion was successful
1 indicates failure, see DeleteErrInfo for the reason
100 indicates running or suspend task can't be deleted, the reason will also be written in DeleteErrInfo
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Long DeleteFlag;

    /**
    * Reason for Deletion Failure
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("DeleteErrInfo")
    @Expose
    private String DeleteErrInfo;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Task Deletion Success or Failure Indicator 
     * @return Data Task Deletion Success or Failure Indicator
     */
    public Boolean getData() {
        return this.Data;
    }

    /**
     * Set Task Deletion Success or Failure Indicator
     * @param Data Task Deletion Success or Failure Indicator
     */
    public void setData(Boolean Data) {
        this.Data = Data;
    }

    /**
     * Get Task Deletion Success or Failure Indicator
0 indicates deletion was successful
1 indicates failure, see DeleteErrInfo for the reason
100 indicates running or suspend task can't be deleted, the reason will also be written in DeleteErrInfo
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DeleteFlag Task Deletion Success or Failure Indicator
0 indicates deletion was successful
1 indicates failure, see DeleteErrInfo for the reason
100 indicates running or suspend task can't be deleted, the reason will also be written in DeleteErrInfo
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set Task Deletion Success or Failure Indicator
0 indicates deletion was successful
1 indicates failure, see DeleteErrInfo for the reason
100 indicates running or suspend task can't be deleted, the reason will also be written in DeleteErrInfo
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DeleteFlag Task Deletion Success or Failure Indicator
0 indicates deletion was successful
1 indicates failure, see DeleteErrInfo for the reason
100 indicates running or suspend task can't be deleted, the reason will also be written in DeleteErrInfo
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeleteFlag(Long DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get Reason for Deletion Failure
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return DeleteErrInfo Reason for Deletion Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDeleteErrInfo() {
        return this.DeleteErrInfo;
    }

    /**
     * Set Reason for Deletion Failure
Note: This field may return null, indicating that no valid value can be obtained.
     * @param DeleteErrInfo Reason for Deletion Failure
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDeleteErrInfo(String DeleteErrInfo) {
        this.DeleteErrInfo = DeleteErrInfo;
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

    public DeleteIntegrationTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIntegrationTaskResponse(DeleteIntegrationTaskResponse source) {
        if (source.Data != null) {
            this.Data = new Boolean(source.Data);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Long(source.DeleteFlag);
        }
        if (source.DeleteErrInfo != null) {
            this.DeleteErrInfo = new String(source.DeleteErrInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "DeleteErrInfo", this.DeleteErrInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

