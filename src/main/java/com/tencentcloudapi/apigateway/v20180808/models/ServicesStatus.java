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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServicesStatus extends AbstractModel {

    /**
    * Total number of services in list.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Service list details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceSet")
    @Expose
    private Service [] ServiceSet;

    /**
     * Get Total number of services in list.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of services in list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of services in list.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of services in list.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Service list details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ServiceSet Service list details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Service [] getServiceSet() {
        return this.ServiceSet;
    }

    /**
     * Set Service list details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ServiceSet Service list details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceSet(Service [] ServiceSet) {
        this.ServiceSet = ServiceSet;
    }

    public ServicesStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServicesStatus(ServicesStatus source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ServiceSet != null) {
            this.ServiceSet = new Service[source.ServiceSet.length];
            for (int i = 0; i < source.ServiceSet.length; i++) {
                this.ServiceSet[i] = new Service(source.ServiceSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ServiceSet.", this.ServiceSet);

    }
}

