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
    * How long the instance will be renewed for, which needs to be used together with `TimeUnit`.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Instance billing mode.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * List of resource IDs of the node to be renewed. The resource ID is in the format of `emr-vm-xxxxxxxx`. A valid resource ID can be queried in the [console](https://console.cloud.tencent.com/emr/static/hardware).
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * Unit of time for instance renewal.
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * Currency.
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * Location of the instance. This parameter is used to specify the AZ, project, and other attributes of the instance.
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * Whether to change from pay-as-you-go billing to monthly subscription billing. `0`: no; `1`: yes
    */
    @SerializedName("ModifyPayMode")
    @Expose
    private Long ModifyPayMode;

    /**
    * Whether the renewal price for every node is required.
    */
    @SerializedName("NeedDetail")
    @Expose
    private Boolean NeedDetail;

    /**
    * Cluster ID. This parameter can be filled to get renewal information for all yearly/monthly subscription nodes in the cluster.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get How long the instance will be renewed for, which needs to be used together with `TimeUnit`. 
     * @return TimeSpan How long the instance will be renewed for, which needs to be used together with `TimeUnit`.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set How long the instance will be renewed for, which needs to be used together with `TimeUnit`.
     * @param TimeSpan How long the instance will be renewed for, which needs to be used together with `TimeUnit`.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Instance billing mode. 
     * @return PayMode Instance billing mode.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode.
     * @param PayMode Instance billing mode.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get List of resource IDs of the node to be renewed. The resource ID is in the format of `emr-vm-xxxxxxxx`. A valid resource ID can be queried in the [console](https://console.cloud.tencent.com/emr/static/hardware). 
     * @return ResourceIds List of resource IDs of the node to be renewed. The resource ID is in the format of `emr-vm-xxxxxxxx`. A valid resource ID can be queried in the [console](https://console.cloud.tencent.com/emr/static/hardware).
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set List of resource IDs of the node to be renewed. The resource ID is in the format of `emr-vm-xxxxxxxx`. A valid resource ID can be queried in the [console](https://console.cloud.tencent.com/emr/static/hardware).
     * @param ResourceIds List of resource IDs of the node to be renewed. The resource ID is in the format of `emr-vm-xxxxxxxx`. A valid resource ID can be queried in the [console](https://console.cloud.tencent.com/emr/static/hardware).
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get Unit of time for instance renewal. 
     * @return TimeUnit Unit of time for instance renewal.
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set Unit of time for instance renewal.
     * @param TimeUnit Unit of time for instance renewal.
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
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
     * Get Location of the instance. This parameter is used to specify the AZ, project, and other attributes of the instance. 
     * @return Placement Location of the instance. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set Location of the instance. This parameter is used to specify the AZ, project, and other attributes of the instance.
     * @param Placement Location of the instance. This parameter is used to specify the AZ, project, and other attributes of the instance.
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get Whether to change from pay-as-you-go billing to monthly subscription billing. `0`: no; `1`: yes 
     * @return ModifyPayMode Whether to change from pay-as-you-go billing to monthly subscription billing. `0`: no; `1`: yes
     */
    public Long getModifyPayMode() {
        return this.ModifyPayMode;
    }

    /**
     * Set Whether to change from pay-as-you-go billing to monthly subscription billing. `0`: no; `1`: yes
     * @param ModifyPayMode Whether to change from pay-as-you-go billing to monthly subscription billing. `0`: no; `1`: yes
     */
    public void setModifyPayMode(Long ModifyPayMode) {
        this.ModifyPayMode = ModifyPayMode;
    }

    /**
     * Get Whether the renewal price for every node is required. 
     * @return NeedDetail Whether the renewal price for every node is required.
     */
    public Boolean getNeedDetail() {
        return this.NeedDetail;
    }

    /**
     * Set Whether the renewal price for every node is required.
     * @param NeedDetail Whether the renewal price for every node is required.
     */
    public void setNeedDetail(Boolean NeedDetail) {
        this.NeedDetail = NeedDetail;
    }

    /**
     * Get Cluster ID. This parameter can be filled to get renewal information for all yearly/monthly subscription nodes in the cluster. 
     * @return InstanceId Cluster ID. This parameter can be filled to get renewal information for all yearly/monthly subscription nodes in the cluster.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID. This parameter can be filled to get renewal information for all yearly/monthly subscription nodes in the cluster.
     * @param InstanceId Cluster ID. This parameter can be filled to get renewal information for all yearly/monthly subscription nodes in the cluster.
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

