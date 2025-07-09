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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpdateInstanceRequest extends AbstractModel {

    /**
    * Time unit of scaling. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Duration of scaling, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Target node specification.
    */
    @SerializedName("UpdateSpec")
    @Expose
    private UpdateInstanceSettings UpdateSpec;

    /**
    * Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Currency.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * The resource ID list for batch configuration change.
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
     * Get Time unit of scaling. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li> 
     * @return TimeUnit Time unit of scaling. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit of scaling. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     * @param TimeUnit Time unit of scaling. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Duration of scaling, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li> 
     * @return TimeSpan Duration of scaling, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Duration of scaling, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
     * @param TimeSpan Duration of scaling, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Target node specification. 
     * @return UpdateSpec Target node specification.
     */
    public UpdateInstanceSettings getUpdateSpec() {
        return this.UpdateSpec;
    }

    /**
     * Set Target node specification.
     * @param UpdateSpec Target node specification.
     */
    public void setUpdateSpec(UpdateInstanceSettings UpdateSpec) {
        this.UpdateSpec = UpdateSpec;
    }

    /**
     * Get Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li> 
     * @return PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     * @param PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance. 
     * @return Placement Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     * @param Placement Instance location. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Currency. 
     * @return Currency Currency.
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency.
     * @param Currency Currency.
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get The resource ID list for batch configuration change. 
     * @return ResourceIdList The resource ID list for batch configuration change.
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set The resource ID list for batch configuration change.
     * @param ResourceIdList The resource ID list for batch configuration change.
     */
    public void setResourceIdList(String [] ResourceIdList) {
        this.ResourceIdList = ResourceIdList;
    }

    public InquiryPriceUpdateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpdateInstanceRequest(InquiryPriceUpdateInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.UpdateSpec != null) {
            this.UpdateSpec = new UpdateInstanceSettings(source.UpdateSpec);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.ResourceIdList != null) {
            this.ResourceIdList = new String[source.ResourceIdList.length];
            for (int i = 0; i < source.ResourceIdList.length; i++) {
                this.ResourceIdList[i] = new String(source.ResourceIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamObj(map, prefix + "UpdateSpec.", this.UpdateSpec);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);

    }
}

