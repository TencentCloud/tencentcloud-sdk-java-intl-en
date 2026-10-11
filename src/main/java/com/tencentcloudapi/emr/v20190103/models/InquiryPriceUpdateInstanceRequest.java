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
    * Time unit for the configuration change. Valid values:
<li>s: second. When PayMode is set to 0, TimeUnit can only be set to s.</li>
<li>m: month. When PayMode is set to 1, TimeUnit can only be set to m.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Configuration change duration, which is used together with TimeUnit.
<li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li>
<li>When TimeUnit is set to m, the number entered for this parameter indicates the purchase duration of a yearly/monthly subscription instance. For example, the value 1 indicates one month.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Instance billing mode. Valid values:
<li>0: pay-as-you-go</li>
<li>1: monthly subscription</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 
    */
    @SerializedName("UpdateSpec")
    @Expose
    private UpdateInstanceSettings UpdateSpec;

    /**
    * 
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Currency type. Valid values:
<li>CNY: RMB</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * ID list of resources modified in batches.
    */
    @SerializedName("ResourceIdList")
    @Expose
    private String [] ResourceIdList;

    /**
     * Get Time unit for the configuration change. Valid values:
<li>s: second. When PayMode is set to 0, TimeUnit can only be set to s.</li>
<li>m: month. When PayMode is set to 1, TimeUnit can only be set to m.</li> 
     * @return TimeUnit Time unit for the configuration change. Valid values:
<li>s: second. When PayMode is set to 0, TimeUnit can only be set to s.</li>
<li>m: month. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit for the configuration change. Valid values:
<li>s: second. When PayMode is set to 0, TimeUnit can only be set to s.</li>
<li>m: month. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     * @param TimeUnit Time unit for the configuration change. Valid values:
<li>s: second. When PayMode is set to 0, TimeUnit can only be set to s.</li>
<li>m: month. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Configuration change duration, which is used together with TimeUnit.
<li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li>
<li>When TimeUnit is set to m, the number entered for this parameter indicates the purchase duration of a yearly/monthly subscription instance. For example, the value 1 indicates one month.</li> 
     * @return TimeSpan Configuration change duration, which is used together with TimeUnit.
<li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li>
<li>When TimeUnit is set to m, the number entered for this parameter indicates the purchase duration of a yearly/monthly subscription instance. For example, the value 1 indicates one month.</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Configuration change duration, which is used together with TimeUnit.
<li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li>
<li>When TimeUnit is set to m, the number entered for this parameter indicates the purchase duration of a yearly/monthly subscription instance. For example, the value 1 indicates one month.</li>
     * @param TimeSpan Configuration change duration, which is used together with TimeUnit.
<li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li>
<li>When TimeUnit is set to m, the number entered for this parameter indicates the purchase duration of a yearly/monthly subscription instance. For example, the value 1 indicates one month.</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Instance billing mode. Valid values:
<li>0: pay-as-you-go</li>
<li>1: monthly subscription</li> 
     * @return PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go</li>
<li>1: monthly subscription</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Valid values:
<li>0: pay-as-you-go</li>
<li>1: monthly subscription</li>
     * @param PayMode Instance billing mode. Valid values:
<li>0: pay-as-you-go</li>
<li>1: monthly subscription</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get  
     * @return UpdateSpec 
     */
    public UpdateInstanceSettings getUpdateSpec() {
        return this.UpdateSpec;
    }

    /**
     * Set 
     * @param UpdateSpec 
     */
    public void setUpdateSpec(UpdateInstanceSettings UpdateSpec) {
        this.UpdateSpec = UpdateSpec;
    }

    /**
     * Get  
     * @return Placement 
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 
     * @param Placement 
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Currency type. Valid values:
<li>CNY: RMB</li> 
     * @return Currency Currency type. Valid values:
<li>CNY: RMB</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set Currency type. Valid values:
<li>CNY: RMB</li>
     * @param Currency Currency type. Valid values:
<li>CNY: RMB</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get ID list of resources modified in batches. 
     * @return ResourceIdList ID list of resources modified in batches.
     */
    public String [] getResourceIdList() {
        return this.ResourceIdList;
    }

    /**
     * Set ID list of resources modified in batches.
     * @param ResourceIdList ID list of resources modified in batches.
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
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.UpdateSpec != null) {
            this.UpdateSpec = new UpdateInstanceSettings(source.UpdateSpec);
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "UpdateSpec.", this.UpdateSpec);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamArraySimple(map, prefix + "ResourceIdList.", this.ResourceIdList);

    }
}

