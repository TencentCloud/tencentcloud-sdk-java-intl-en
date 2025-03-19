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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProtectedTelCdrRequest extends AbstractModel {

    /**
    * Start timestamp. unix second-level timestamp.
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * End timestamp. unix second-level timestamp.
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * For the application id, you can check https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Page size, upper limit 100.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number starting from 0.
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get Start timestamp. unix second-level timestamp. 
     * @return StartTimeStamp Start timestamp. unix second-level timestamp.
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set Start timestamp. unix second-level timestamp.
     * @param StartTimeStamp Start timestamp. unix second-level timestamp.
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get End timestamp. unix second-level timestamp. 
     * @return EndTimeStamp End timestamp. unix second-level timestamp.
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set End timestamp. unix second-level timestamp.
     * @param EndTimeStamp End timestamp. unix second-level timestamp.
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get For the application id, you can check https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId For the application id, you can check https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set For the application id, you can check https://console.cloud.tencent.com/ccc.
     * @param SdkAppId For the application id, you can check https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Page size, upper limit 100. 
     * @return PageSize Page size, upper limit 100.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size, upper limit 100.
     * @param PageSize Page size, upper limit 100.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number starting from 0. 
     * @return PageNumber Page number starting from 0.
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number starting from 0.
     * @param PageNumber Page number starting from 0.
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeProtectedTelCdrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProtectedTelCdrRequest(DescribeProtectedTelCdrRequest source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Long(source.EndTimeStamp);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

