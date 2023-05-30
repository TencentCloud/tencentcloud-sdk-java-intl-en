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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTIWDailyUsageRequest extends AbstractModel{

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording, in minutes.

Note: Dynamic transcoding multiplies the number of pages of a document by eight times. Static transcoding does not change the number of pages of a document.
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * Start date in the format of YYYY-MM-DD. The start date is included in the query period.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording, in minutes.

Note: Dynamic transcoding multiplies the number of pages of a document by eight times. Static transcoding does not change the number of pages of a document. 
     * @return SubProduct Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording, in minutes.

Note: Dynamic transcoding multiplies the number of pages of a document by eight times. Static transcoding does not change the number of pages of a document.
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording, in minutes.

Note: Dynamic transcoding multiplies the number of pages of a document by eight times. Static transcoding does not change the number of pages of a document.
     * @param SubProduct Subproduct usage to be queried. The following parameters are supported:
- sp_tiw_board: The duration of use of whiteboards, in minutes.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording, in minutes.

Note: Dynamic transcoding multiplies the number of pages of a document by eight times. Static transcoding does not change the number of pages of a document.
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get Start date in the format of YYYY-MM-DD. The start date is included in the query period. 
     * @return StartTime Start date in the format of YYYY-MM-DD. The start date is included in the query period.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date in the format of YYYY-MM-DD. The start date is included in the query period.
     * @param StartTime Start date in the format of YYYY-MM-DD. The start date is included in the query period.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days. 
     * @return EndTime End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
     * @param EndTime End date in the format of YYYY-MM-DD. The end date is included in the query period. The period queried per request cannot be longer than 31 days.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTIWDailyUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTIWDailyUsageRequest(DescribeTIWDailyUsageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
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
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

