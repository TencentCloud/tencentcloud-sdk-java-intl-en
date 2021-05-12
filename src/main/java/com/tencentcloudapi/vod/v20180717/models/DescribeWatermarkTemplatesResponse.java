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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWatermarkTemplatesResponse extends AbstractModel{

    /**
    * Number of eligible entries.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of watermarking template details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WatermarkTemplateSet")
    @Expose
    private WatermarkTemplate [] WatermarkTemplateSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible entries. 
     * @return TotalCount Number of eligible entries.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible entries.
     * @param TotalCount Number of eligible entries.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of watermarking template details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WatermarkTemplateSet List of watermarking template details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WatermarkTemplate [] getWatermarkTemplateSet() {
        return this.WatermarkTemplateSet;
    }

    /**
     * Set List of watermarking template details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WatermarkTemplateSet List of watermarking template details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWatermarkTemplateSet(WatermarkTemplate [] WatermarkTemplateSet) {
        this.WatermarkTemplateSet = WatermarkTemplateSet;
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

    public DescribeWatermarkTemplatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWatermarkTemplatesResponse(DescribeWatermarkTemplatesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.WatermarkTemplateSet != null) {
            this.WatermarkTemplateSet = new WatermarkTemplate[source.WatermarkTemplateSet.length];
            for (int i = 0; i < source.WatermarkTemplateSet.length; i++) {
                this.WatermarkTemplateSet[i] = new WatermarkTemplate(source.WatermarkTemplateSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "WatermarkTemplateSet.", this.WatermarkTemplateSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

