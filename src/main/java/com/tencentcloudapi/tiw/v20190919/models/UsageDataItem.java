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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UsageDataItem extends AbstractModel {

    /**
    * Start date in the format of YYYY-MM-DD.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Subproduct usage information, which is consistent with the corresponding request parameters.
- sp_tiw_board: The duration of use of whiteboards.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording.
    */
    @SerializedName("SubProduct")
    @Expose
    private String SubProduct;

    /**
    * Usage values.
- The unit of sp_tiw_dt and sp_tiw_st is pages.
- The unit of sp_tiw_board and sp_tiw_ric is minutes.
    */
    @SerializedName("Value")
    @Expose
    private Float Value;

    /**
     * Get Start date in the format of YYYY-MM-DD. 
     * @return Time Start date in the format of YYYY-MM-DD.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Start date in the format of YYYY-MM-DD.
     * @param Time Start date in the format of YYYY-MM-DD.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

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
     * Get Subproduct usage information, which is consistent with the corresponding request parameters.
- sp_tiw_board: The duration of use of whiteboards.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording. 
     * @return SubProduct Subproduct usage information, which is consistent with the corresponding request parameters.
- sp_tiw_board: The duration of use of whiteboards.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording.
     */
    public String getSubProduct() {
        return this.SubProduct;
    }

    /**
     * Set Subproduct usage information, which is consistent with the corresponding request parameters.
- sp_tiw_board: The duration of use of whiteboards.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording.
     * @param SubProduct Subproduct usage information, which is consistent with the corresponding request parameters.
- sp_tiw_board: The duration of use of whiteboards.
- sp_tiw_dt: The number of pages dynamically transcoded.
- sp_tiw_st: The number of pages statically transcoded.
- sp_tiw_ric: The duration of real-time recording.
     */
    public void setSubProduct(String SubProduct) {
        this.SubProduct = SubProduct;
    }

    /**
     * Get Usage values.
- The unit of sp_tiw_dt and sp_tiw_st is pages.
- The unit of sp_tiw_board and sp_tiw_ric is minutes. 
     * @return Value Usage values.
- The unit of sp_tiw_dt and sp_tiw_st is pages.
- The unit of sp_tiw_board and sp_tiw_ric is minutes.
     */
    public Float getValue() {
        return this.Value;
    }

    /**
     * Set Usage values.
- The unit of sp_tiw_dt and sp_tiw_st is pages.
- The unit of sp_tiw_board and sp_tiw_ric is minutes.
     * @param Value Usage values.
- The unit of sp_tiw_dt and sp_tiw_st is pages.
- The unit of sp_tiw_board and sp_tiw_ric is minutes.
     */
    public void setValue(Float Value) {
        this.Value = Value;
    }

    public UsageDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageDataItem(UsageDataItem source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.SubProduct != null) {
            this.SubProduct = new String(source.SubProduct);
        }
        if (source.Value != null) {
            this.Value = new Float(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "SubProduct", this.SubProduct);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

