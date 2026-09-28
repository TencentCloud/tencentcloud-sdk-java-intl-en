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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerOperationLocksItem extends AbstractModel {

    /**
    * The causes for the lock. Valid when **LoadBalancerStatus** is **Abnormal**.
    */
    @SerializedName("LockReason")
    @Expose
    private String LockReason;

    /**
    * Lock type. Valid values:

- **SecurityLocked**: Security lock.

- **RelatedResourceLocked**: Related resource locked.

- **FinancialLocked**: Locked due to arrears.

- **ResidualLocked**: residual lock.
    */
    @SerializedName("LockType")
    @Expose
    private String LockType;

    /**
     * Get The causes for the lock. Valid when **LoadBalancerStatus** is **Abnormal**. 
     * @return LockReason The causes for the lock. Valid when **LoadBalancerStatus** is **Abnormal**.
     */
    public String getLockReason() {
        return this.LockReason;
    }

    /**
     * Set The causes for the lock. Valid when **LoadBalancerStatus** is **Abnormal**.
     * @param LockReason The causes for the lock. Valid when **LoadBalancerStatus** is **Abnormal**.
     */
    public void setLockReason(String LockReason) {
        this.LockReason = LockReason;
    }

    /**
     * Get Lock type. Valid values:

- **SecurityLocked**: Security lock.

- **RelatedResourceLocked**: Related resource locked.

- **FinancialLocked**: Locked due to arrears.

- **ResidualLocked**: residual lock. 
     * @return LockType Lock type. Valid values:

- **SecurityLocked**: Security lock.

- **RelatedResourceLocked**: Related resource locked.

- **FinancialLocked**: Locked due to arrears.

- **ResidualLocked**: residual lock.
     */
    public String getLockType() {
        return this.LockType;
    }

    /**
     * Set Lock type. Valid values:

- **SecurityLocked**: Security lock.

- **RelatedResourceLocked**: Related resource locked.

- **FinancialLocked**: Locked due to arrears.

- **ResidualLocked**: residual lock.
     * @param LockType Lock type. Valid values:

- **SecurityLocked**: Security lock.

- **RelatedResourceLocked**: Related resource locked.

- **FinancialLocked**: Locked due to arrears.

- **ResidualLocked**: residual lock.
     */
    public void setLockType(String LockType) {
        this.LockType = LockType;
    }

    public LoadBalancerOperationLocksItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerOperationLocksItem(LoadBalancerOperationLocksItem source) {
        if (source.LockReason != null) {
            this.LockReason = new String(source.LockReason);
        }
        if (source.LockType != null) {
            this.LockType = new String(source.LockType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LockReason", this.LockReason);
        this.setParamSimple(map, prefix + "LockType", this.LockType);

    }
}

