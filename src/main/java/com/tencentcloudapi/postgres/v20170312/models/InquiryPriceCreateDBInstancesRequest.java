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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDBInstancesRequest extends AbstractModel{

    /**
    * AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * Storage capacity size in GB.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Number of instances. Maximum value: 100. If you need to create more instances at a time, please contact customer service.
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Billing ID, which can be obtained through the `Pid` field in the returned value of the `DescribeProductConfig` API.
    */
    @SerializedName("Pid")
    @Expose
    private Long Pid;

    /**
    * Instance billing type. Valid value: POSTPAID_BY_HOUR (pay-as-you-go)
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
     * Get AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API. 
     * @return Zone AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     * @param Zone AZ ID, which can be obtained through the `Zone` field in the returned value of the `DescribeZones` API.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API. 
     * @return SpecCode Specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set Specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
     * @param SpecCode Specification ID, which can be obtained through the `SpecCode` field in the returned value of the `DescribeProductConfig` API.
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get Storage capacity size in GB. 
     * @return Storage Storage capacity size in GB.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage capacity size in GB.
     * @param Storage Storage capacity size in GB.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Number of instances. Maximum value: 100. If you need to create more instances at a time, please contact customer service. 
     * @return InstanceCount Number of instances. Maximum value: 100. If you need to create more instances at a time, please contact customer service.
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Number of instances. Maximum value: 100. If you need to create more instances at a time, please contact customer service.
     * @param InstanceCount Number of instances. Maximum value: 100. If you need to create more instances at a time, please contact customer service.
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported. 
     * @return Period Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
     * @param Period Length of purchase in months. Currently, only 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36 are supported.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Billing ID, which can be obtained through the `Pid` field in the returned value of the `DescribeProductConfig` API. 
     * @return Pid Billing ID, which can be obtained through the `Pid` field in the returned value of the `DescribeProductConfig` API.
     */
    public Long getPid() {
        return this.Pid;
    }

    /**
     * Set Billing ID, which can be obtained through the `Pid` field in the returned value of the `DescribeProductConfig` API.
     * @param Pid Billing ID, which can be obtained through the `Pid` field in the returned value of the `DescribeProductConfig` API.
     */
    public void setPid(Long Pid) {
        this.Pid = Pid;
    }

    /**
     * Get Instance billing type. Valid value: POSTPAID_BY_HOUR (pay-as-you-go) 
     * @return InstanceChargeType Instance billing type. Valid value: POSTPAID_BY_HOUR (pay-as-you-go)
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type. Valid value: POSTPAID_BY_HOUR (pay-as-you-go)
     * @param InstanceChargeType Instance billing type. Valid value: POSTPAID_BY_HOUR (pay-as-you-go)
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

