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

public class VulFixItem extends AbstractModel {

    /**
    * <p>Instance ID list of hosts requiring fixing<br>Input parameter limitation: Up to 1,000 instance IDs per single item</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Vulnerability ID. Choose either VulId or KBId.</p>
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * <p>Patch ID. Choose either VulId or KBId.</p>
    */
    @SerializedName("KBId")
    @Expose
    private Long KBId;

    /**
     * Get <p>Instance ID list of hosts requiring fixing<br>Input parameter limitation: Up to 1,000 instance IDs per single item</p> 
     * @return InstanceIds <p>Instance ID list of hosts requiring fixing<br>Input parameter limitation: Up to 1,000 instance IDs per single item</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>Instance ID list of hosts requiring fixing<br>Input parameter limitation: Up to 1,000 instance IDs per single item</p>
     * @param InstanceIds <p>Instance ID list of hosts requiring fixing<br>Input parameter limitation: Up to 1,000 instance IDs per single item</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Vulnerability ID. Choose either VulId or KBId.</p> 
     * @return VulId <p>Vulnerability ID. Choose either VulId or KBId.</p>
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set <p>Vulnerability ID. Choose either VulId or KBId.</p>
     * @param VulId <p>Vulnerability ID. Choose either VulId or KBId.</p>
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get <p>Patch ID. Choose either VulId or KBId.</p> 
     * @return KBId <p>Patch ID. Choose either VulId or KBId.</p>
     */
    public Long getKBId() {
        return this.KBId;
    }

    /**
     * Set <p>Patch ID. Choose either VulId or KBId.</p>
     * @param KBId <p>Patch ID. Choose either VulId or KBId.</p>
     */
    public void setKBId(Long KBId) {
        this.KBId = KBId;
    }

    public VulFixItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixItem(VulFixItem source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.KBId != null) {
            this.KBId = new Long(source.KBId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "KBId", this.KBId);

    }
}

