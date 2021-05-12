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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionProvisionedConcurrencyInfo extends AbstractModel{

    /**
    * Set provisioned concurrency amount.
    */
    @SerializedName("AllocatedProvisionedConcurrencyNum")
    @Expose
    private Long AllocatedProvisionedConcurrencyNum;

    /**
    * Currently available provisioned concurrency amount.
    */
    @SerializedName("AvailableProvisionedConcurrencyNum")
    @Expose
    private Long AvailableProvisionedConcurrencyNum;

    /**
    * Provisioned concurrency setting task status. `Done`: completed; `InProgress`: in progress; `Failed`: partially or completely failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status description of provisioned concurrency setting task.
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * Function version number
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get Set provisioned concurrency amount. 
     * @return AllocatedProvisionedConcurrencyNum Set provisioned concurrency amount.
     */
    public Long getAllocatedProvisionedConcurrencyNum() {
        return this.AllocatedProvisionedConcurrencyNum;
    }

    /**
     * Set Set provisioned concurrency amount.
     * @param AllocatedProvisionedConcurrencyNum Set provisioned concurrency amount.
     */
    public void setAllocatedProvisionedConcurrencyNum(Long AllocatedProvisionedConcurrencyNum) {
        this.AllocatedProvisionedConcurrencyNum = AllocatedProvisionedConcurrencyNum;
    }

    /**
     * Get Currently available provisioned concurrency amount. 
     * @return AvailableProvisionedConcurrencyNum Currently available provisioned concurrency amount.
     */
    public Long getAvailableProvisionedConcurrencyNum() {
        return this.AvailableProvisionedConcurrencyNum;
    }

    /**
     * Set Currently available provisioned concurrency amount.
     * @param AvailableProvisionedConcurrencyNum Currently available provisioned concurrency amount.
     */
    public void setAvailableProvisionedConcurrencyNum(Long AvailableProvisionedConcurrencyNum) {
        this.AvailableProvisionedConcurrencyNum = AvailableProvisionedConcurrencyNum;
    }

    /**
     * Get Provisioned concurrency setting task status. `Done`: completed; `InProgress`: in progress; `Failed`: partially or completely failed. 
     * @return Status Provisioned concurrency setting task status. `Done`: completed; `InProgress`: in progress; `Failed`: partially or completely failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Provisioned concurrency setting task status. `Done`: completed; `InProgress`: in progress; `Failed`: partially or completely failed.
     * @param Status Provisioned concurrency setting task status. `Done`: completed; `InProgress`: in progress; `Failed`: partially or completely failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status description of provisioned concurrency setting task. 
     * @return StatusReason Status description of provisioned concurrency setting task.
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set Status description of provisioned concurrency setting task.
     * @param StatusReason Status description of provisioned concurrency setting task.
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get Function version number 
     * @return Qualifier Function version number
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version number
     * @param Qualifier Function version number
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public VersionProvisionedConcurrencyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionProvisionedConcurrencyInfo(VersionProvisionedConcurrencyInfo source) {
        if (source.AllocatedProvisionedConcurrencyNum != null) {
            this.AllocatedProvisionedConcurrencyNum = new Long(source.AllocatedProvisionedConcurrencyNum);
        }
        if (source.AvailableProvisionedConcurrencyNum != null) {
            this.AvailableProvisionedConcurrencyNum = new Long(source.AvailableProvisionedConcurrencyNum);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedProvisionedConcurrencyNum", this.AllocatedProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "AvailableProvisionedConcurrencyNum", this.AvailableProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

