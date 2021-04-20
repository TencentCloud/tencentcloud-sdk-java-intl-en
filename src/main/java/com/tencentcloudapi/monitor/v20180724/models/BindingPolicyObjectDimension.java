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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindingPolicyObjectDimension extends AbstractModel{

    /**
    * Region name.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region ID.
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Instance dimension information in the following format:
{"unInstanceId":"ins-00jvv9mo"}. The dimension information varies by Tencent Cloud services. For more information, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * Event dimensions.
    */
    @SerializedName("EventDimensions")
    @Expose
    private String EventDimensions;

    /**
     * Get Region name. 
     * @return Region Region name.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name.
     * @param Region Region name.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region ID. 
     * @return RegionId Region ID.
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.
     * @param RegionId Region ID.
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Instance dimension information in the following format:
{"unInstanceId":"ins-00jvv9mo"}. The dimension information varies by Tencent Cloud services. For more information, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1) 
     * @return Dimensions Instance dimension information in the following format:
{"unInstanceId":"ins-00jvv9mo"}. The dimension information varies by Tencent Cloud services. For more information, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Instance dimension information in the following format:
{"unInstanceId":"ins-00jvv9mo"}. The dimension information varies by Tencent Cloud services. For more information, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     * @param Dimensions Instance dimension information in the following format:
{"unInstanceId":"ins-00jvv9mo"}. The dimension information varies by Tencent Cloud services. For more information, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Event dimensions. 
     * @return EventDimensions Event dimensions.
     */
    public String getEventDimensions() {
        return this.EventDimensions;
    }

    /**
     * Set Event dimensions.
     * @param EventDimensions Event dimensions.
     */
    public void setEventDimensions(String EventDimensions) {
        this.EventDimensions = EventDimensions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "EventDimensions", this.EventDimensions);

    }
}

