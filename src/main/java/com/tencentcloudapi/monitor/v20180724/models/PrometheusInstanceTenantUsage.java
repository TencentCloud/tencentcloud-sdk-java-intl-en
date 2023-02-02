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

public class PrometheusInstanceTenantUsage extends AbstractModel{

    /**
    * Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Billing cycle
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CalcDate")
    @Expose
    private String CalcDate;

    /**
    * Total usage
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Float Total;

    /**
    * Usage of basic (free) metrics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Basic")
    @Expose
    private Float Basic;

    /**
    * Usage of paid metrics
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Fee")
    @Expose
    private Float Fee;

    /**
     * Get Instance ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Billing cycle
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CalcDate Billing cycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCalcDate() {
        return this.CalcDate;
    }

    /**
     * Set Billing cycle
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CalcDate Billing cycle
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCalcDate(String CalcDate) {
        this.CalcDate = CalcDate;
    }

    /**
     * Get Total usage
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total Total usage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTotal() {
        return this.Total;
    }

    /**
     * Set Total usage
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total Total usage
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Float Total) {
        this.Total = Total;
    }

    /**
     * Get Usage of basic (free) metrics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Basic Usage of basic (free) metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getBasic() {
        return this.Basic;
    }

    /**
     * Set Usage of basic (free) metrics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Basic Usage of basic (free) metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBasic(Float Basic) {
        this.Basic = Basic;
    }

    /**
     * Get Usage of paid metrics
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Fee Usage of paid metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getFee() {
        return this.Fee;
    }

    /**
     * Set Usage of paid metrics
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Fee Usage of paid metrics
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFee(Float Fee) {
        this.Fee = Fee;
    }

    public PrometheusInstanceTenantUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusInstanceTenantUsage(PrometheusInstanceTenantUsage source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CalcDate != null) {
            this.CalcDate = new String(source.CalcDate);
        }
        if (source.Total != null) {
            this.Total = new Float(source.Total);
        }
        if (source.Basic != null) {
            this.Basic = new Float(source.Basic);
        }
        if (source.Fee != null) {
            this.Fee = new Float(source.Fee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CalcDate", this.CalcDate);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Basic", this.Basic);
        this.setParamSimple(map, prefix + "Fee", this.Fee);

    }
}

