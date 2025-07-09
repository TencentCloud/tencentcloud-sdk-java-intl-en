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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOfflineLogRecordsResponse extends AbstractModel {

    /**
    * API call information
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Array of record IDs
    */
    @SerializedName("RecordSet")
    @Expose
    private String [] RecordSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get API call information 
     * @return Msg API call information
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set API call information
     * @param Msg API call information
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Array of record IDs 
     * @return RecordSet Array of record IDs
     */
    public String [] getRecordSet() {
        return this.RecordSet;
    }

    /**
     * Set Array of record IDs
     * @param RecordSet Array of record IDs
     */
    public void setRecordSet(String [] RecordSet) {
        this.RecordSet = RecordSet;
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

    public DescribeOfflineLogRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOfflineLogRecordsResponse(DescribeOfflineLogRecordsResponse source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RecordSet != null) {
            this.RecordSet = new String[source.RecordSet.length];
            for (int i = 0; i < source.RecordSet.length; i++) {
                this.RecordSet[i] = new String(source.RecordSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamArraySimple(map, prefix + "RecordSet.", this.RecordSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

