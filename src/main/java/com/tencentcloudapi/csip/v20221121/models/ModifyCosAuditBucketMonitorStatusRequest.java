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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCosAuditBucketMonitorStatusRequest extends AbstractModel {

    /**
    * Bucket collection
    */
    @SerializedName("BucketNameSet")
    @Expose
    private String [] BucketNameSet;

    /**
    * 0: disabled, 1: enabled.
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
     * Get Bucket collection 
     * @return BucketNameSet Bucket collection
     */
    public String [] getBucketNameSet() {
        return this.BucketNameSet;
    }

    /**
     * Set Bucket collection
     * @param BucketNameSet Bucket collection
     */
    public void setBucketNameSet(String [] BucketNameSet) {
        this.BucketNameSet = BucketNameSet;
    }

    /**
     * Get 0: disabled, 1: enabled. 
     * @return MonitorStatus 0: disabled, 1: enabled.
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 0: disabled, 1: enabled.
     * @param MonitorStatus 0: disabled, 1: enabled.
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    public ModifyCosAuditBucketMonitorStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditBucketMonitorStatusRequest(ModifyCosAuditBucketMonitorStatusRequest source) {
        if (source.BucketNameSet != null) {
            this.BucketNameSet = new String[source.BucketNameSet.length];
            for (int i = 0; i < source.BucketNameSet.length; i++) {
                this.BucketNameSet[i] = new String(source.BucketNameSet[i]);
            }
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BucketNameSet.", this.BucketNameSet);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);

    }
}

