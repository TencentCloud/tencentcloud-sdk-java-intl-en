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

public class InquiryPriceRenewInstanceRequest extends AbstractModel {

    /**
    * Duration of instance renewal. It is used together with TimeUnit. 1 indicates renewal for one month.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Instance billing mode. Only the value 1 is supported, indicating yearly/monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Resource ID list for nodes pending renewal. Resource ID format: emr-vm-xxxxxxxx. You can query valid resource IDs by logging in to the [console](https://console.cloud.tencent.com/emr).
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Time unit for instance renewal. Valid values:
<li>m: indicates month.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Currency type. Valid values:
<li>CNY: RMB</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * 
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Whether to convert from pay-as-you-go to yearly/monthly subscription. Valid values: 0 (no) and 1 (yes).
    */
    @SerializedName("ModifyPayMode")
    @Expose
    private Long ModifyPayMode;

    /**
    * Whether to return the renewal price for each node.
    */
    @SerializedName("NeedDetail")
    @Expose
    private Boolean NeedDetail;

    /**
    * Cluster ID. Specify this parameter if you need renewal information for all yearly/monthly subscription nodes in the cluster.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Duration of instance renewal. It is used together with TimeUnit. 1 indicates renewal for one month. 
     * @return TimeSpan Duration of instance renewal. It is used together with TimeUnit. 1 indicates renewal for one month.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Duration of instance renewal. It is used together with TimeUnit. 1 indicates renewal for one month.
     * @param TimeSpan Duration of instance renewal. It is used together with TimeUnit. 1 indicates renewal for one month.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Instance billing mode. Only the value 1 is supported, indicating yearly/monthly subscription. 
     * @return PayMode Instance billing mode. Only the value 1 is supported, indicating yearly/monthly subscription.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Only the value 1 is supported, indicating yearly/monthly subscription.
     * @param PayMode Instance billing mode. Only the value 1 is supported, indicating yearly/monthly subscription.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Resource ID list for nodes pending renewal. Resource ID format: emr-vm-xxxxxxxx. You can query valid resource IDs by logging in to the [console](https://console.cloud.tencent.com/emr). 
     * @return ResourceIds Resource ID list for nodes pending renewal. Resource ID format: emr-vm-xxxxxxxx. You can query valid resource IDs by logging in to the [console](https://console.cloud.tencent.com/emr).
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set Resource ID list for nodes pending renewal. Resource ID format: emr-vm-xxxxxxxx. You can query valid resource IDs by logging in to the [console](https://console.cloud.tencent.com/emr).
     * @param ResourceIds Resource ID list for nodes pending renewal. Resource ID format: emr-vm-xxxxxxxx. You can query valid resource IDs by logging in to the [console](https://console.cloud.tencent.com/emr).
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Time unit for instance renewal. Valid values:
<li>m: indicates month.</li> 
     * @return TimeUnit Time unit for instance renewal. Valid values:
<li>m: indicates month.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Time unit for instance renewal. Valid values:
<li>m: indicates month.</li>
     * @param TimeUnit Time unit for instance renewal. Valid values:
<li>m: indicates month.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
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
     * Get Whether to convert from pay-as-you-go to yearly/monthly subscription. Valid values: 0 (no) and 1 (yes). 
     * @return ModifyPayMode Whether to convert from pay-as-you-go to yearly/monthly subscription. Valid values: 0 (no) and 1 (yes).
     */
    public Long getModifyPayMode() {
        return this.ModifyPayMode;
    }

    /**
     * Set Whether to convert from pay-as-you-go to yearly/monthly subscription. Valid values: 0 (no) and 1 (yes).
     * @param ModifyPayMode Whether to convert from pay-as-you-go to yearly/monthly subscription. Valid values: 0 (no) and 1 (yes).
     */
    public void setModifyPayMode(Long ModifyPayMode) {
        this.ModifyPayMode = ModifyPayMode;
    }

    /**
     * Get Whether to return the renewal price for each node. 
     * @return NeedDetail Whether to return the renewal price for each node.
     */
    public Boolean getNeedDetail() {
        return this.NeedDetail;
    }

    /**
     * Set Whether to return the renewal price for each node.
     * @param NeedDetail Whether to return the renewal price for each node.
     */
    public void setNeedDetail(Boolean NeedDetail) {
        this.NeedDetail = NeedDetail;
    }

    /**
     * Get Cluster ID. Specify this parameter if you need renewal information for all yearly/monthly subscription nodes in the cluster. 
     * @return InstanceId Cluster ID. Specify this parameter if you need renewal information for all yearly/monthly subscription nodes in the cluster.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID. Specify this parameter if you need renewal information for all yearly/monthly subscription nodes in the cluster.
     * @param InstanceId Cluster ID. Specify this parameter if you need renewal information for all yearly/monthly subscription nodes in the cluster.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public InquiryPriceRenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewInstanceRequest(InquiryPriceRenewInstanceRequest source) {
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.ModifyPayMode != null) {
            this.ModifyPayMode = new Long(source.ModifyPayMode);
        }
        if (source.NeedDetail != null) {
            this.NeedDetail = new Boolean(source.NeedDetail);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ModifyPayMode", this.ModifyPayMode);
        this.setParamSimple(map, prefix + "NeedDetail", this.NeedDetail);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

