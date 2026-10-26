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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDeviceSnapshotsRequest extends AbstractModel {

    /**
    * Channel ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Device ID (this field is not effective yet)
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * Query start time. Default query: on the day.
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * Query end time. Default query: on the day.
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * Page number, which is 1 by default.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Pagination size. Default: 200. Maximum: 2000
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get Channel ID 
     * @return ChannelId Channel ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID
     * @param ChannelId Channel ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Device ID (this field is not effective yet) 
     * @return DeviceId Device ID (this field is not effective yet)
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set Device ID (this field is not effective yet)
     * @param DeviceId Device ID (this field is not effective yet)
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get Query start time. Default query: on the day. 
     * @return Start Query start time. Default query: on the day.
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set Query start time. Default query: on the day.
     * @param Start Query start time. Default query: on the day.
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get Query end time. Default query: on the day. 
     * @return End Query end time. Default query: on the day.
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set Query end time. Default query: on the day.
     * @param End Query end time. Default query: on the day.
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get Page number, which is 1 by default. 
     * @return PageNumber Page number, which is 1 by default.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number, which is 1 by default.
     * @param PageNumber Page number, which is 1 by default.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Pagination size. Default: 200. Maximum: 2000 
     * @return PageSize Pagination size. Default: 200. Maximum: 2000
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Pagination size. Default: 200. Maximum: 2000
     * @param PageSize Pagination size. Default: 200. Maximum: 2000
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListDeviceSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDeviceSnapshotsRequest(ListDeviceSnapshotsRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

