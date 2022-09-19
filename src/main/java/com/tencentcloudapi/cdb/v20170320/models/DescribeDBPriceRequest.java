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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBPriceRequest extends AbstractModel{

    /**
    * AZ information in the format of "ap-guangzhou-2". You can use the <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> API to query the values that can be set.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Number of instances. Value range: 1-100. Default value: 1.
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * Instance memory size in MB.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Instance disk size in GB.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Billing method. Value range: PRE_PAID (monthly subscribed), HOUR_PAID (pay-as-you-go).
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * Instance validity period in months. Value range: 1-36. This field is invalid when querying prices of pay-as-you-go instances.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Instance type. Value range: master (master instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * Data replication mode. Value range: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
     * Get AZ information in the format of "ap-guangzhou-2". You can use the <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> API to query the values that can be set. 
     * @return Zone AZ information in the format of "ap-guangzhou-2". You can use the <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> API to query the values that can be set.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ information in the format of "ap-guangzhou-2". You can use the <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> API to query the values that can be set.
     * @param Zone AZ information in the format of "ap-guangzhou-2". You can use the <a href="https://cloud.tencent.com/document/api/236/17229">DescribeDBZoneConfig</a> API to query the values that can be set.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Number of instances. Value range: 1-100. Default value: 1. 
     * @return GoodsNum Number of instances. Value range: 1-100. Default value: 1.
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set Number of instances. Value range: 1-100. Default value: 1.
     * @param GoodsNum Number of instances. Value range: 1-100. Default value: 1.
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * Get Instance memory size in MB. 
     * @return Memory Instance memory size in MB.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in MB.
     * @param Memory Instance memory size in MB.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Instance disk size in GB. 
     * @return Volume Instance disk size in GB.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Instance disk size in GB.
     * @param Volume Instance disk size in GB.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Billing method. Value range: PRE_PAID (monthly subscribed), HOUR_PAID (pay-as-you-go). 
     * @return PayType Billing method. Value range: PRE_PAID (monthly subscribed), HOUR_PAID (pay-as-you-go).
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * Set Billing method. Value range: PRE_PAID (monthly subscribed), HOUR_PAID (pay-as-you-go).
     * @param PayType Billing method. Value range: PRE_PAID (monthly subscribed), HOUR_PAID (pay-as-you-go).
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * Get Instance validity period in months. Value range: 1-36. This field is invalid when querying prices of pay-as-you-go instances. 
     * @return Period Instance validity period in months. Value range: 1-36. This field is invalid when querying prices of pay-as-you-go instances.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Instance validity period in months. Value range: 1-36. This field is invalid when querying prices of pay-as-you-go instances.
     * @param Period Instance validity period in months. Value range: 1-36. This field is invalid when querying prices of pay-as-you-go instances.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Instance type. Value range: master (master instance), dr (disaster recovery instance), ro (read-only instance). Default value: master. 
     * @return InstanceRole Instance type. Value range: master (master instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set Instance type. Value range: master (master instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
     * @param InstanceRole Instance type. Value range: master (master instance), dr (disaster recovery instance), ro (read-only instance). Default value: master.
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get Data replication mode. Value range: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0. 
     * @return ProtectMode Data replication mode. Value range: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set Data replication mode. Value range: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
     * @param ProtectMode Data replication mode. Value range: 0 (async), 1 (semi-sync), 2 (strong sync). Default value: 0.
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    public DescribeDBPriceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBPriceRequest(DescribeDBPriceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.PayType != null) {
            this.PayType = new String(source.PayType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);

    }
}

