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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest extends AbstractModel {

    /**
    * Instance disk size in GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Instance memory size in GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Specifies the instance ID, such as postgres-hez4fh0v. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Instance billing type. Valid value: `POSTPAID_BY_HOUR` (pay-as-you-go hourly)
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Specifies the instance Cpu size in unit Core.
If this parameter is not input, the Cpu is set based on the corresponding sales specification determined by Memory. for example, if Memory is 2 and the supported sales specification is 1-core 2GiB, the Cpu defaults to 1 when not input.
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get Instance disk size in GB 
     * @return Storage Instance disk size in GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Instance disk size in GB
     * @param Storage Instance disk size in GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Instance memory size in GB 
     * @return Memory Instance memory size in GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Instance memory size in GB
     * @param Memory Instance memory size in GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Specifies the instance ID, such as postgres-hez4fh0v. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Specifies the instance ID, such as postgres-hez4fh0v. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Specifies the instance ID, such as postgres-hez4fh0v. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Specifies the instance ID, such as postgres-hez4fh0v. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Instance billing type. Valid value: `POSTPAID_BY_HOUR` (pay-as-you-go hourly) 
     * @return InstanceChargeType Instance billing type. Valid value: `POSTPAID_BY_HOUR` (pay-as-you-go hourly)
     * @deprecated
     */
    @Deprecated
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Instance billing type. Valid value: `POSTPAID_BY_HOUR` (pay-as-you-go hourly)
     * @param InstanceChargeType Instance billing type. Valid value: `POSTPAID_BY_HOUR` (pay-as-you-go hourly)
     * @deprecated
     */
    @Deprecated
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Specifies the instance Cpu size in unit Core.
If this parameter is not input, the Cpu is set based on the corresponding sales specification determined by Memory. for example, if Memory is 2 and the supported sales specification is 1-core 2GiB, the Cpu defaults to 1 when not input. 
     * @return Cpu Specifies the instance Cpu size in unit Core.
If this parameter is not input, the Cpu is set based on the corresponding sales specification determined by Memory. for example, if Memory is 2 and the supported sales specification is 1-core 2GiB, the Cpu defaults to 1 when not input.
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set Specifies the instance Cpu size in unit Core.
If this parameter is not input, the Cpu is set based on the corresponding sales specification determined by Memory. for example, if Memory is 2 and the supported sales specification is 1-core 2GiB, the Cpu defaults to 1 when not input.
     * @param Cpu Specifies the instance Cpu size in unit Core.
If this parameter is not input, the Cpu is set based on the corresponding sales specification determined by Memory. for example, if Memory is 2 and the supported sales specification is 1-core 2GiB, the Cpu defaults to 1 when not input.
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public InquiryPriceUpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeDBInstanceRequest(InquiryPriceUpgradeDBInstanceRequest source) {
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

