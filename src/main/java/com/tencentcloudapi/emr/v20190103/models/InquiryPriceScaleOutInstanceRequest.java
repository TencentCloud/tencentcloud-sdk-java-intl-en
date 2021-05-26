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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceScaleOutInstanceRequest extends AbstractModel{

    /**
    * Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Duration of scale-out, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * ID of the AZ where an instance resides.
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Instance billing mode. Valid values:
<li>0: pay-as-you-go.</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of core nodes added.
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * Number of task nodes added.
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * Currency.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Number of router nodes added.
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * Number of master nodes to add
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
     * Get Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li> 
     * @return TimeUnit Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     * @param TimeUnit Time unit of scale-out. Valid values:
<li>s: seconds. When `PayMode` is 0, `TimeUnit` can only be `s`.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get Duration of scale-out, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li> 
     * @return TimeSpan Duration of scale-out, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Duration of scale-out, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
     * @param TimeSpan Duration of scale-out, which needs to be used together with `TimeUnit`.
<li>When `PayMode` is 0, `TimeSpan` can only be 3,600.</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get ID of the AZ where an instance resides. 
     * @return ZoneId ID of the AZ where an instance resides.
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the AZ where an instance resides.
     * @param ZoneId ID of the AZ where an instance resides.
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
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
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Number of core nodes added. 
     * @return CoreCount Number of core nodes added.
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set Number of core nodes added.
     * @param CoreCount Number of core nodes added.
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get Number of task nodes added. 
     * @return TaskCount Number of task nodes added.
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set Number of task nodes added.
     * @param TaskCount Number of task nodes added.
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
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
     * Get Number of router nodes added. 
     * @return RouterCount Number of router nodes added.
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set Number of router nodes added.
     * @param RouterCount Number of router nodes added.
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get Number of master nodes to add 
     * @return MasterCount Number of master nodes to add
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set Number of master nodes to add
     * @param MasterCount Number of master nodes to add
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    public InquiryPriceScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceScaleOutInstanceRequest(InquiryPriceScaleOutInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.RouterCount != null) {
            this.RouterCount = new Long(source.RouterCount);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "RouterCount", this.RouterCount);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);

    }
}

