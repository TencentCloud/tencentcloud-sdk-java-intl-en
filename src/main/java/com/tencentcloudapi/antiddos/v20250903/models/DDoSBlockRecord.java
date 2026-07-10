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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSBlockRecord extends AbstractModel {

    /**
    * <p>Blocked resources, public IP address, for example:</p><ul><li>Public IP address: 117.175.94.231.</li></ul>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>The time when it was blocked.</p>
    */
    @SerializedName("BlockTime")
    @Expose
    private String BlockTime;

    /**
    * <p>Blocking and unblocking status.</p><p>Enumeration value:</p><ul><li>Blocked: Blocked;</li><li>Unblocking: Unblocking;</li><li>Unblocked: Unblocked.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Blocked resources, public IP address, for example:</p><ul><li>Public IP address: 117.175.94.231.</li></ul> 
     * @return Resource <p>Blocked resources, public IP address, for example:</p><ul><li>Public IP address: 117.175.94.231.</li></ul>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Blocked resources, public IP address, for example:</p><ul><li>Public IP address: 117.175.94.231.</li></ul>
     * @param Resource <p>Blocked resources, public IP address, for example:</p><ul><li>Public IP address: 117.175.94.231.</li></ul>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>The time when it was blocked.</p> 
     * @return BlockTime <p>The time when it was blocked.</p>
     */
    public String getBlockTime() {
        return this.BlockTime;
    }

    /**
     * Set <p>The time when it was blocked.</p>
     * @param BlockTime <p>The time when it was blocked.</p>
     */
    public void setBlockTime(String BlockTime) {
        this.BlockTime = BlockTime;
    }

    /**
     * Get <p>Blocking and unblocking status.</p><p>Enumeration value:</p><ul><li>Blocked: Blocked;</li><li>Unblocking: Unblocking;</li><li>Unblocked: Unblocked.</li></ul> 
     * @return Status <p>Blocking and unblocking status.</p><p>Enumeration value:</p><ul><li>Blocked: Blocked;</li><li>Unblocking: Unblocking;</li><li>Unblocked: Unblocked.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Blocking and unblocking status.</p><p>Enumeration value:</p><ul><li>Blocked: Blocked;</li><li>Unblocking: Unblocking;</li><li>Unblocked: Unblocked.</li></ul>
     * @param Status <p>Blocking and unblocking status.</p><p>Enumeration value:</p><ul><li>Blocked: Blocked;</li><li>Unblocking: Unblocking;</li><li>Unblocked: Unblocked.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DDoSBlockRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSBlockRecord(DDoSBlockRecord source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.BlockTime != null) {
            this.BlockTime = new String(source.BlockTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "BlockTime", this.BlockTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

