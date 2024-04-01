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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRoomsRequest extends AbstractModel {

    /**
    * The SDKAppID assigned by LCIC.

    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * The start time. The default start time is 30 minutes before the current time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time. The default end time is 30 minutes after the current time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The page to return records from. Pagination starts from 1.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The number of records per page. The default is 10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Classroom status. Default display all classes, 0 is not started, 1 is in class, 2 is finished, 3 is expired
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get The SDKAppID assigned by LCIC.
 
     * @return SdkAppId The SDKAppID assigned by LCIC.

     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.

     * @param SdkAppId The SDKAppID assigned by LCIC.

     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get The start time. The default start time is 30 minutes before the current time. 
     * @return StartTime The start time. The default start time is 30 minutes before the current time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time. The default start time is 30 minutes before the current time.
     * @param StartTime The start time. The default start time is 30 minutes before the current time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time. The default end time is 30 minutes after the current time. 
     * @return EndTime The end time. The default end time is 30 minutes after the current time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time. The default end time is 30 minutes after the current time.
     * @param EndTime The end time. The default end time is 30 minutes after the current time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The page to return records from. Pagination starts from 1. 
     * @return Page The page to return records from. Pagination starts from 1.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The page to return records from. Pagination starts from 1.
     * @param Page The page to return records from. Pagination starts from 1.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The number of records per page. The default is 10. 
     * @return Limit The number of records per page. The default is 10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of records per page. The default is 10.
     * @param Limit The number of records per page. The default is 10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Classroom status. Default display all classes, 0 is not started, 1 is in class, 2 is finished, 3 is expired 
     * @return Status Classroom status. Default display all classes, 0 is not started, 1 is in class, 2 is finished, 3 is expired
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Classroom status. Default display all classes, 0 is not started, 1 is in class, 2 is finished, 3 is expired
     * @param Status Classroom status. Default display all classes, 0 is not started, 1 is in class, 2 is finished, 3 is expired
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public GetRoomsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRoomsRequest(GetRoomsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

