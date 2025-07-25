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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveWatermarkRequest extends AbstractModel {

    /**
    * Watermark ID.
Watermark ID obtained in the returned value of the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API call.
Watermark ID returned by the `DescribeLiveWatermarks` API.
    */
    @SerializedName("WatermarkId")
    @Expose
    private Long WatermarkId;

    /**
     * Get Watermark ID.
Watermark ID obtained in the returned value of the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API call.
Watermark ID returned by the `DescribeLiveWatermarks` API. 
     * @return WatermarkId Watermark ID.
Watermark ID obtained in the returned value of the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API call.
Watermark ID returned by the `DescribeLiveWatermarks` API.
     */
    public Long getWatermarkId() {
        return this.WatermarkId;
    }

    /**
     * Set Watermark ID.
Watermark ID obtained in the returned value of the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API call.
Watermark ID returned by the `DescribeLiveWatermarks` API.
     * @param WatermarkId Watermark ID.
Watermark ID obtained in the returned value of the [AddLiveWatermark](https://intl.cloud.tencent.com/document/product/267/30154?from_cn_redirect=1) API call.
Watermark ID returned by the `DescribeLiveWatermarks` API.
     */
    public void setWatermarkId(Long WatermarkId) {
        this.WatermarkId = WatermarkId;
    }

    public DeleteLiveWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLiveWatermarkRequest(DeleteLiveWatermarkRequest source) {
        if (source.WatermarkId != null) {
            this.WatermarkId = new Long(source.WatermarkId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WatermarkId", this.WatermarkId);

    }
}

