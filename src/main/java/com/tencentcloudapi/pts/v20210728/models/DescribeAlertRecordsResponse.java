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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlertRecordsResponse extends AbstractModel {

    /**
    * Alert records list.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AlertRecordSet")
    @Expose
    private AlertRecord [] AlertRecordSet;

    /**
    * Total number of Alert records.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Alert records list.

Note: This field may return null, indicating that no valid value is found. 
     * @return AlertRecordSet Alert records list.

Note: This field may return null, indicating that no valid value is found.
     */
    public AlertRecord [] getAlertRecordSet() {
        return this.AlertRecordSet;
    }

    /**
     * Set Alert records list.

Note: This field may return null, indicating that no valid value is found.
     * @param AlertRecordSet Alert records list.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAlertRecordSet(AlertRecord [] AlertRecordSet) {
        this.AlertRecordSet = AlertRecordSet;
    }

    /**
     * Get Total number of Alert records.

Note: This field may return null, indicating that no valid value is found. 
     * @return Total Total number of Alert records.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of Alert records.

Note: This field may return null, indicating that no valid value is found.
     * @param Total Total number of Alert records.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeAlertRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertRecordsResponse(DescribeAlertRecordsResponse source) {
        if (source.AlertRecordSet != null) {
            this.AlertRecordSet = new AlertRecord[source.AlertRecordSet.length];
            for (int i = 0; i < source.AlertRecordSet.length; i++) {
                this.AlertRecordSet[i] = new AlertRecord(source.AlertRecordSet[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AlertRecordSet.", this.AlertRecordSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

