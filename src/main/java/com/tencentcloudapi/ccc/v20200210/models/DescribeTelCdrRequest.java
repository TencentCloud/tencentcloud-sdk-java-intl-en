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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCdrRequest extends AbstractModel {

    /**
    * Start timestamp, unix timestamp in seconds. supports up to the past 180 days.
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * End timestamp, unix timestamp in seconds. the range between the end time and start time is less than 90 days.
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * Instance id (deprecated).
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * Maximum number of returned entries (deprecated).
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset (deprecated).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Page size (required), up to 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <Page number (required), starting from 0.>.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Filter by phone number.
    */
    @SerializedName("Phones")
    @Expose
    private String [] Phones;

    /**
    * Filter by sessionid.
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
     * Get Start timestamp, unix timestamp in seconds. supports up to the past 180 days. 
     * @return StartTimeStamp Start timestamp, unix timestamp in seconds. supports up to the past 180 days.
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set Start timestamp, unix timestamp in seconds. supports up to the past 180 days.
     * @param StartTimeStamp Start timestamp, unix timestamp in seconds. supports up to the past 180 days.
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get End timestamp, unix timestamp in seconds. the range between the end time and start time is less than 90 days. 
     * @return EndTimeStamp End timestamp, unix timestamp in seconds. the range between the end time and start time is less than 90 days.
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set End timestamp, unix timestamp in seconds. the range between the end time and start time is less than 90 days.
     * @param EndTimeStamp End timestamp, unix timestamp in seconds. the range between the end time and start time is less than 90 days.
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get Instance id (deprecated). 
     * @return InstanceId Instance id (deprecated).
     * @deprecated
     */
    @Deprecated
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance id (deprecated).
     * @param InstanceId Instance id (deprecated).
     * @deprecated
     */
    @Deprecated
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Maximum number of returned entries (deprecated). 
     * @return Limit Maximum number of returned entries (deprecated).
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of returned entries (deprecated).
     * @param Limit Maximum number of returned entries (deprecated).
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset (deprecated). 
     * @return Offset Offset (deprecated).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset (deprecated).
     * @param Offset Offset (deprecated).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Page size (required), up to 100. 
     * @return PageSize Page size (required), up to 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size (required), up to 100.
     * @param PageSize Page size (required), up to 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <Page number (required), starting from 0.>. 
     * @return PageNumber <Page number (required), starting from 0.>.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <Page number (required), starting from 0.>.
     * @param PageNumber <Page number (required), starting from 0.>.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Filter by phone number. 
     * @return Phones Filter by phone number.
     */
    public String [] getPhones() {
        return this.Phones;
    }

    /**
     * Set Filter by phone number.
     * @param Phones Filter by phone number.
     */
    public void setPhones(String [] Phones) {
        this.Phones = Phones;
    }

    /**
     * Get Filter by sessionid. 
     * @return SessionIds Filter by sessionid.
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set Filter by sessionid.
     * @param SessionIds Filter by sessionid.
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    public DescribeTelCdrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelCdrRequest(DescribeTelCdrRequest source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Long(source.EndTimeStamp);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Phones != null) {
            this.Phones = new String[source.Phones.length];
            for (int i = 0; i < source.Phones.length; i++) {
                this.Phones[i] = new String(source.Phones[i]);
            }
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArraySimple(map, prefix + "Phones.", this.Phones);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);

    }
}

