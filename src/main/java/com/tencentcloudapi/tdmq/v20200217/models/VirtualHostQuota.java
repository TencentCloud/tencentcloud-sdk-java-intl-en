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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirtualHostQuota extends AbstractModel {

    /**
    * 
    */
    @SerializedName("MaxVirtualHost")
    @Expose
    private Long MaxVirtualHost;

    /**
    * Number of created vhosts.
    */
    @SerializedName("UsedVirtualHost")
    @Expose
    private Long UsedVirtualHost;

    /**
    * Specifies the maximum number of connections allowed per vhost.
    */
    @SerializedName("MaxConnectionPerVhost")
    @Expose
    private Long MaxConnectionPerVhost;

    /**
    * Specifies the maximum number of switches allowed in one vhost.
    */
    @SerializedName("MaxExchangePerVhost")
    @Expose
    private Long MaxExchangePerVhost;

    /**
    * Specifies the maximum number of queue machines allowed in one vhost.
    */
    @SerializedName("MaxQueuePerVhost")
    @Expose
    private Long MaxQueuePerVhost;

    /**
     * Get  
     * @return MaxVirtualHost 
     */
    public Long getMaxVirtualHost() {
        return this.MaxVirtualHost;
    }

    /**
     * Set 
     * @param MaxVirtualHost 
     */
    public void setMaxVirtualHost(Long MaxVirtualHost) {
        this.MaxVirtualHost = MaxVirtualHost;
    }

    /**
     * Get Number of created vhosts. 
     * @return UsedVirtualHost Number of created vhosts.
     */
    public Long getUsedVirtualHost() {
        return this.UsedVirtualHost;
    }

    /**
     * Set Number of created vhosts.
     * @param UsedVirtualHost Number of created vhosts.
     */
    public void setUsedVirtualHost(Long UsedVirtualHost) {
        this.UsedVirtualHost = UsedVirtualHost;
    }

    /**
     * Get Specifies the maximum number of connections allowed per vhost. 
     * @return MaxConnectionPerVhost Specifies the maximum number of connections allowed per vhost.
     */
    public Long getMaxConnectionPerVhost() {
        return this.MaxConnectionPerVhost;
    }

    /**
     * Set Specifies the maximum number of connections allowed per vhost.
     * @param MaxConnectionPerVhost Specifies the maximum number of connections allowed per vhost.
     */
    public void setMaxConnectionPerVhost(Long MaxConnectionPerVhost) {
        this.MaxConnectionPerVhost = MaxConnectionPerVhost;
    }

    /**
     * Get Specifies the maximum number of switches allowed in one vhost. 
     * @return MaxExchangePerVhost Specifies the maximum number of switches allowed in one vhost.
     */
    public Long getMaxExchangePerVhost() {
        return this.MaxExchangePerVhost;
    }

    /**
     * Set Specifies the maximum number of switches allowed in one vhost.
     * @param MaxExchangePerVhost Specifies the maximum number of switches allowed in one vhost.
     */
    public void setMaxExchangePerVhost(Long MaxExchangePerVhost) {
        this.MaxExchangePerVhost = MaxExchangePerVhost;
    }

    /**
     * Get Specifies the maximum number of queue machines allowed in one vhost. 
     * @return MaxQueuePerVhost Specifies the maximum number of queue machines allowed in one vhost.
     */
    public Long getMaxQueuePerVhost() {
        return this.MaxQueuePerVhost;
    }

    /**
     * Set Specifies the maximum number of queue machines allowed in one vhost.
     * @param MaxQueuePerVhost Specifies the maximum number of queue machines allowed in one vhost.
     */
    public void setMaxQueuePerVhost(Long MaxQueuePerVhost) {
        this.MaxQueuePerVhost = MaxQueuePerVhost;
    }

    public VirtualHostQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualHostQuota(VirtualHostQuota source) {
        if (source.MaxVirtualHost != null) {
            this.MaxVirtualHost = new Long(source.MaxVirtualHost);
        }
        if (source.UsedVirtualHost != null) {
            this.UsedVirtualHost = new Long(source.UsedVirtualHost);
        }
        if (source.MaxConnectionPerVhost != null) {
            this.MaxConnectionPerVhost = new Long(source.MaxConnectionPerVhost);
        }
        if (source.MaxExchangePerVhost != null) {
            this.MaxExchangePerVhost = new Long(source.MaxExchangePerVhost);
        }
        if (source.MaxQueuePerVhost != null) {
            this.MaxQueuePerVhost = new Long(source.MaxQueuePerVhost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxVirtualHost", this.MaxVirtualHost);
        this.setParamSimple(map, prefix + "UsedVirtualHost", this.UsedVirtualHost);
        this.setParamSimple(map, prefix + "MaxConnectionPerVhost", this.MaxConnectionPerVhost);
        this.setParamSimple(map, prefix + "MaxExchangePerVhost", this.MaxExchangePerVhost);
        this.setParamSimple(map, prefix + "MaxQueuePerVhost", this.MaxQueuePerVhost);

    }
}

