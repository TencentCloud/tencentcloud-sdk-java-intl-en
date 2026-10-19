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

public class ModifyCosAuditMonitorAccountRequest extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * appid information to monitor
    */
    @SerializedName("MonitorAppIdSet")
    @Expose
    private Long [] MonitorAppIdSet;

    /**
    * Select a bucket mapping relationship
    */
    @SerializedName("BindBucket")
    @Expose
    private CosBucketId [] BindBucket;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get appid information to monitor 
     * @return MonitorAppIdSet appid information to monitor
     */
    public Long [] getMonitorAppIdSet() {
        return this.MonitorAppIdSet;
    }

    /**
     * Set appid information to monitor
     * @param MonitorAppIdSet appid information to monitor
     */
    public void setMonitorAppIdSet(Long [] MonitorAppIdSet) {
        this.MonitorAppIdSet = MonitorAppIdSet;
    }

    /**
     * Get Select a bucket mapping relationship 
     * @return BindBucket Select a bucket mapping relationship
     */
    public CosBucketId [] getBindBucket() {
        return this.BindBucket;
    }

    /**
     * Set Select a bucket mapping relationship
     * @param BindBucket Select a bucket mapping relationship
     */
    public void setBindBucket(CosBucketId [] BindBucket) {
        this.BindBucket = BindBucket;
    }

    public ModifyCosAuditMonitorAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditMonitorAccountRequest(ModifyCosAuditMonitorAccountRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MonitorAppIdSet != null) {
            this.MonitorAppIdSet = new Long[source.MonitorAppIdSet.length];
            for (int i = 0; i < source.MonitorAppIdSet.length; i++) {
                this.MonitorAppIdSet[i] = new Long(source.MonitorAppIdSet[i]);
            }
        }
        if (source.BindBucket != null) {
            this.BindBucket = new CosBucketId[source.BindBucket.length];
            for (int i = 0; i < source.BindBucket.length; i++) {
                this.BindBucket[i] = new CosBucketId(source.BindBucket[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "MonitorAppIdSet.", this.MonitorAppIdSet);
        this.setParamArrayObj(map, prefix + "BindBucket.", this.BindBucket);

    }
}

