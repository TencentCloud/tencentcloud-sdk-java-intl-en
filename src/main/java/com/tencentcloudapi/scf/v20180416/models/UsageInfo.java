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

public class UsageInfo extends AbstractModel{

    /**
    * Number of namespaces
    */
    @SerializedName("NamespacesCount")
    @Expose
    private Long NamespacesCount;

    /**
    * Namespace details
    */
    @SerializedName("Namespace")
    @Expose
    private NamespaceUsage [] Namespace;

    /**
    * Upper limit of user concurrency memory in the current region
    */
    @SerializedName("TotalConcurrencyMem")
    @Expose
    private Long TotalConcurrencyMem;

    /**
    * Quota of configured user concurrency memory in the current region
    */
    @SerializedName("TotalAllocatedConcurrencyMem")
    @Expose
    private Long TotalAllocatedConcurrencyMem;

    /**
    * Quota of account concurrency actually configured by user
    */
    @SerializedName("UserConcurrencyMemLimit")
    @Expose
    private Long UserConcurrencyMemLimit;

    /**
     * Get Number of namespaces 
     * @return NamespacesCount Number of namespaces
     */
    public Long getNamespacesCount() {
        return this.NamespacesCount;
    }

    /**
     * Set Number of namespaces
     * @param NamespacesCount Number of namespaces
     */
    public void setNamespacesCount(Long NamespacesCount) {
        this.NamespacesCount = NamespacesCount;
    }

    /**
     * Get Namespace details 
     * @return Namespace Namespace details
     */
    public NamespaceUsage [] getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace details
     * @param Namespace Namespace details
     */
    public void setNamespace(NamespaceUsage [] Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Upper limit of user concurrency memory in the current region 
     * @return TotalConcurrencyMem Upper limit of user concurrency memory in the current region
     */
    public Long getTotalConcurrencyMem() {
        return this.TotalConcurrencyMem;
    }

    /**
     * Set Upper limit of user concurrency memory in the current region
     * @param TotalConcurrencyMem Upper limit of user concurrency memory in the current region
     */
    public void setTotalConcurrencyMem(Long TotalConcurrencyMem) {
        this.TotalConcurrencyMem = TotalConcurrencyMem;
    }

    /**
     * Get Quota of configured user concurrency memory in the current region 
     * @return TotalAllocatedConcurrencyMem Quota of configured user concurrency memory in the current region
     */
    public Long getTotalAllocatedConcurrencyMem() {
        return this.TotalAllocatedConcurrencyMem;
    }

    /**
     * Set Quota of configured user concurrency memory in the current region
     * @param TotalAllocatedConcurrencyMem Quota of configured user concurrency memory in the current region
     */
    public void setTotalAllocatedConcurrencyMem(Long TotalAllocatedConcurrencyMem) {
        this.TotalAllocatedConcurrencyMem = TotalAllocatedConcurrencyMem;
    }

    /**
     * Get Quota of account concurrency actually configured by user 
     * @return UserConcurrencyMemLimit Quota of account concurrency actually configured by user
     */
    public Long getUserConcurrencyMemLimit() {
        return this.UserConcurrencyMemLimit;
    }

    /**
     * Set Quota of account concurrency actually configured by user
     * @param UserConcurrencyMemLimit Quota of account concurrency actually configured by user
     */
    public void setUserConcurrencyMemLimit(Long UserConcurrencyMemLimit) {
        this.UserConcurrencyMemLimit = UserConcurrencyMemLimit;
    }

    public UsageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UsageInfo(UsageInfo source) {
        if (source.NamespacesCount != null) {
            this.NamespacesCount = new Long(source.NamespacesCount);
        }
        if (source.Namespace != null) {
            this.Namespace = new NamespaceUsage[source.Namespace.length];
            for (int i = 0; i < source.Namespace.length; i++) {
                this.Namespace[i] = new NamespaceUsage(source.Namespace[i]);
            }
        }
        if (source.TotalConcurrencyMem != null) {
            this.TotalConcurrencyMem = new Long(source.TotalConcurrencyMem);
        }
        if (source.TotalAllocatedConcurrencyMem != null) {
            this.TotalAllocatedConcurrencyMem = new Long(source.TotalAllocatedConcurrencyMem);
        }
        if (source.UserConcurrencyMemLimit != null) {
            this.UserConcurrencyMemLimit = new Long(source.UserConcurrencyMemLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespacesCount", this.NamespacesCount);
        this.setParamArrayObj(map, prefix + "Namespace.", this.Namespace);
        this.setParamSimple(map, prefix + "TotalConcurrencyMem", this.TotalConcurrencyMem);
        this.setParamSimple(map, prefix + "TotalAllocatedConcurrencyMem", this.TotalAllocatedConcurrencyMem);
        this.setParamSimple(map, prefix + "UserConcurrencyMemLimit", this.UserConcurrencyMemLimit);

    }
}

