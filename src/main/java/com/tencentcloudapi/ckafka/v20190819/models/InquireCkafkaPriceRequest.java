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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquireCkafkaPriceRequest extends AbstractModel {

    /**
    * `standard`: Standard Edition; `profession`: Pro Edition
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Billing mode for instance purchase/renewal. If this parameter is left empty when you purchase an instance, the fees for one month under the monthly subscription mode will be displayed by default.
    */
    @SerializedName("InstanceChargeParam")
    @Expose
    private InstanceChargeParam InstanceChargeParam;

    /**
    * The number of instances to be purchased or renewed. If this parameter is left empty, the default value is `1`.
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * Private network bandwidth in MB/sec, which is required when you purchase an instance.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Disk type and size, which is required when you purchase an instance.
    */
    @SerializedName("InquiryDiskParam")
    @Expose
    private InquiryDiskParam InquiryDiskParam;

    /**
    * Message retention period in hours, which is required when you purchase an instance.
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * The number of instance topics to be purchased, which is required when you purchase an instance.
    */
    @SerializedName("Topic")
    @Expose
    private Long Topic;

    /**
    * The number of instance partitions to be purchased, which is required when you purchase an instance.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * The region for instance purchase, which can be obtained via the `DescribeCkafkaZone` API.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Operation type flag. `purchase`: Making new purchases; `renew`: Renewing an instance. The default value is `purchase` if this parameter is left empty.
    */
    @SerializedName("CategoryAction")
    @Expose
    private String CategoryAction;

    /**
    * This field is not required.
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * Billing mode for public network bandwidth, which is required when you purchase public network bandwidth. Currently, public network bandwidth is only supported for Pro Edition.
    */
    @SerializedName("PublicNetworkParam")
    @Expose
    private InquiryPublicNetworkParam PublicNetworkParam;

    /**
    * ID of the instance to be renewed, which is required when you renew an instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get `standard`: Standard Edition; `profession`: Pro Edition 
     * @return InstanceType `standard`: Standard Edition; `profession`: Pro Edition
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set `standard`: Standard Edition; `profession`: Pro Edition
     * @param InstanceType `standard`: Standard Edition; `profession`: Pro Edition
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Billing mode for instance purchase/renewal. If this parameter is left empty when you purchase an instance, the fees for one month under the monthly subscription mode will be displayed by default. 
     * @return InstanceChargeParam Billing mode for instance purchase/renewal. If this parameter is left empty when you purchase an instance, the fees for one month under the monthly subscription mode will be displayed by default.
     */
    public InstanceChargeParam getInstanceChargeParam() {
        return this.InstanceChargeParam;
    }

    /**
     * Set Billing mode for instance purchase/renewal. If this parameter is left empty when you purchase an instance, the fees for one month under the monthly subscription mode will be displayed by default.
     * @param InstanceChargeParam Billing mode for instance purchase/renewal. If this parameter is left empty when you purchase an instance, the fees for one month under the monthly subscription mode will be displayed by default.
     */
    public void setInstanceChargeParam(InstanceChargeParam InstanceChargeParam) {
        this.InstanceChargeParam = InstanceChargeParam;
    }

    /**
     * Get The number of instances to be purchased or renewed. If this parameter is left empty, the default value is `1`. 
     * @return InstanceNum The number of instances to be purchased or renewed. If this parameter is left empty, the default value is `1`.
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set The number of instances to be purchased or renewed. If this parameter is left empty, the default value is `1`.
     * @param InstanceNum The number of instances to be purchased or renewed. If this parameter is left empty, the default value is `1`.
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get Private network bandwidth in MB/sec, which is required when you purchase an instance. 
     * @return Bandwidth Private network bandwidth in MB/sec, which is required when you purchase an instance.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Private network bandwidth in MB/sec, which is required when you purchase an instance.
     * @param Bandwidth Private network bandwidth in MB/sec, which is required when you purchase an instance.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Disk type and size, which is required when you purchase an instance. 
     * @return InquiryDiskParam Disk type and size, which is required when you purchase an instance.
     */
    public InquiryDiskParam getInquiryDiskParam() {
        return this.InquiryDiskParam;
    }

    /**
     * Set Disk type and size, which is required when you purchase an instance.
     * @param InquiryDiskParam Disk type and size, which is required when you purchase an instance.
     */
    public void setInquiryDiskParam(InquiryDiskParam InquiryDiskParam) {
        this.InquiryDiskParam = InquiryDiskParam;
    }

    /**
     * Get Message retention period in hours, which is required when you purchase an instance. 
     * @return MessageRetention Message retention period in hours, which is required when you purchase an instance.
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set Message retention period in hours, which is required when you purchase an instance.
     * @param MessageRetention Message retention period in hours, which is required when you purchase an instance.
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get The number of instance topics to be purchased, which is required when you purchase an instance. 
     * @return Topic The number of instance topics to be purchased, which is required when you purchase an instance.
     */
    public Long getTopic() {
        return this.Topic;
    }

    /**
     * Set The number of instance topics to be purchased, which is required when you purchase an instance.
     * @param Topic The number of instance topics to be purchased, which is required when you purchase an instance.
     */
    public void setTopic(Long Topic) {
        this.Topic = Topic;
    }

    /**
     * Get The number of instance partitions to be purchased, which is required when you purchase an instance. 
     * @return Partition The number of instance partitions to be purchased, which is required when you purchase an instance.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set The number of instance partitions to be purchased, which is required when you purchase an instance.
     * @param Partition The number of instance partitions to be purchased, which is required when you purchase an instance.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get The region for instance purchase, which can be obtained via the `DescribeCkafkaZone` API. 
     * @return ZoneIds The region for instance purchase, which can be obtained via the `DescribeCkafkaZone` API.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set The region for instance purchase, which can be obtained via the `DescribeCkafkaZone` API.
     * @param ZoneIds The region for instance purchase, which can be obtained via the `DescribeCkafkaZone` API.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Operation type flag. `purchase`: Making new purchases; `renew`: Renewing an instance. The default value is `purchase` if this parameter is left empty. 
     * @return CategoryAction Operation type flag. `purchase`: Making new purchases; `renew`: Renewing an instance. The default value is `purchase` if this parameter is left empty.
     */
    public String getCategoryAction() {
        return this.CategoryAction;
    }

    /**
     * Set Operation type flag. `purchase`: Making new purchases; `renew`: Renewing an instance. The default value is `purchase` if this parameter is left empty.
     * @param CategoryAction Operation type flag. `purchase`: Making new purchases; `renew`: Renewing an instance. The default value is `purchase` if this parameter is left empty.
     */
    public void setCategoryAction(String CategoryAction) {
        this.CategoryAction = CategoryAction;
    }

    /**
     * Get This field is not required. 
     * @return BillType This field is not required.
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set This field is not required.
     * @param BillType This field is not required.
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get Billing mode for public network bandwidth, which is required when you purchase public network bandwidth. Currently, public network bandwidth is only supported for Pro Edition. 
     * @return PublicNetworkParam Billing mode for public network bandwidth, which is required when you purchase public network bandwidth. Currently, public network bandwidth is only supported for Pro Edition.
     */
    public InquiryPublicNetworkParam getPublicNetworkParam() {
        return this.PublicNetworkParam;
    }

    /**
     * Set Billing mode for public network bandwidth, which is required when you purchase public network bandwidth. Currently, public network bandwidth is only supported for Pro Edition.
     * @param PublicNetworkParam Billing mode for public network bandwidth, which is required when you purchase public network bandwidth. Currently, public network bandwidth is only supported for Pro Edition.
     */
    public void setPublicNetworkParam(InquiryPublicNetworkParam PublicNetworkParam) {
        this.PublicNetworkParam = PublicNetworkParam;
    }

    /**
     * Get ID of the instance to be renewed, which is required when you renew an instance. 
     * @return InstanceId ID of the instance to be renewed, which is required when you renew an instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be renewed, which is required when you renew an instance.
     * @param InstanceId ID of the instance to be renewed, which is required when you renew an instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public InquireCkafkaPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquireCkafkaPriceRequest(InquireCkafkaPriceRequest source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceChargeParam != null) {
            this.InstanceChargeParam = new InstanceChargeParam(source.InstanceChargeParam);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.InquiryDiskParam != null) {
            this.InquiryDiskParam = new InquiryDiskParam(source.InquiryDiskParam);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.Topic != null) {
            this.Topic = new Long(source.Topic);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.CategoryAction != null) {
            this.CategoryAction = new String(source.CategoryAction);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.PublicNetworkParam != null) {
            this.PublicNetworkParam = new InquiryPublicNetworkParam(source.PublicNetworkParam);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "InstanceChargeParam.", this.InstanceChargeParam);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamObj(map, prefix + "InquiryDiskParam.", this.InquiryDiskParam);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "CategoryAction", this.CategoryAction);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamObj(map, prefix + "PublicNetworkParam.", this.PublicNetworkParam);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

