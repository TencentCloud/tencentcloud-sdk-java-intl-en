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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrtcRoomUsageRequest extends AbstractModel {

    /**
    * The `SDKAppID` of the room.
    */
    @SerializedName("SdkAppid")
    @Expose
    private Long SdkAppid;

    /**
    * The start time in the format of `YYYY-MM-DD HH:MM` (accurate to the minute).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time in the format of `YYYY-MM-DD HH:MM`. The start and end time cannot be more than 24 hours apart.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get The `SDKAppID` of the room. 
     * @return SdkAppid The `SDKAppID` of the room.
     */
    public Long getSdkAppid() {
        return this.SdkAppid;
    }

    /**
     * Set The `SDKAppID` of the room.
     * @param SdkAppid The `SDKAppID` of the room.
     */
    public void setSdkAppid(Long SdkAppid) {
        this.SdkAppid = SdkAppid;
    }

    /**
     * Get The start time in the format of `YYYY-MM-DD HH:MM` (accurate to the minute). 
     * @return StartTime The start time in the format of `YYYY-MM-DD HH:MM` (accurate to the minute).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time in the format of `YYYY-MM-DD HH:MM` (accurate to the minute).
     * @param StartTime The start time in the format of `YYYY-MM-DD HH:MM` (accurate to the minute).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time in the format of `YYYY-MM-DD HH:MM`. The start and end time cannot be more than 24 hours apart. 
     * @return EndTime The end time in the format of `YYYY-MM-DD HH:MM`. The start and end time cannot be more than 24 hours apart.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time in the format of `YYYY-MM-DD HH:MM`. The start and end time cannot be more than 24 hours apart.
     * @param EndTime The end time in the format of `YYYY-MM-DD HH:MM`. The start and end time cannot be more than 24 hours apart.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTrtcRoomUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrtcRoomUsageRequest(DescribeTrtcRoomUsageRequest source) {
        if (source.SdkAppid != null) {
            this.SdkAppid = new Long(source.SdkAppid);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppid", this.SdkAppid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

