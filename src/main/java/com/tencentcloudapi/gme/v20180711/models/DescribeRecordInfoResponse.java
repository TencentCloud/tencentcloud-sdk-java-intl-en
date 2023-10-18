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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordInfoResponse extends AbstractModel {

    /**
    * Information about the recording task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecordInfo")
    @Expose
    private RecordInfo [] RecordInfo;

    /**
    * Recording mode. Valid values: `1`: single stream; `2`: mixed streams; `3`: single stream and mixed streams.
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * Room ID.
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information about the recording task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecordInfo Information about the recording task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RecordInfo [] getRecordInfo() {
        return this.RecordInfo;
    }

    /**
     * Set Information about the recording task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecordInfo Information about the recording task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecordInfo(RecordInfo [] RecordInfo) {
        this.RecordInfo = RecordInfo;
    }

    /**
     * Get Recording mode. Valid values: `1`: single stream; `2`: mixed streams; `3`: single stream and mixed streams. 
     * @return RecordMode Recording mode. Valid values: `1`: single stream; `2`: mixed streams; `3`: single stream and mixed streams.
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set Recording mode. Valid values: `1`: single stream; `2`: mixed streams; `3`: single stream and mixed streams.
     * @param RecordMode Recording mode. Valid values: `1`: single stream; `2`: mixed streams; `3`: single stream and mixed streams.
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get Room ID. 
     * @return RoomId Room ID.
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID.
     * @param RoomId Room ID.
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
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

    public DescribeRecordInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordInfoResponse(DescribeRecordInfoResponse source) {
        if (source.RecordInfo != null) {
            this.RecordInfo = new RecordInfo[source.RecordInfo.length];
            for (int i = 0; i < source.RecordInfo.length; i++) {
                this.RecordInfo[i] = new RecordInfo(source.RecordInfo[i]);
            }
        }
        if (source.RecordMode != null) {
            this.RecordMode = new Long(source.RecordMode);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordInfo.", this.RecordInfo);
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

