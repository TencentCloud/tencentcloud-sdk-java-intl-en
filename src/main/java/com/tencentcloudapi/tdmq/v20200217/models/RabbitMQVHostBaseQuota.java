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

public class RabbitMQVHostBaseQuota extends AbstractModel {

    /**
    * Maximum number of connections allowed in each vhost.
    */
    @SerializedName("MaxConnectionPerVhost")
    @Expose
    private Long MaxConnectionPerVhost;

    /**
    * Maximum number of exchanges allowed in each vhost.
    */
    @SerializedName("MaxExchangePerVhost")
    @Expose
    private Long MaxExchangePerVhost;

    /**
    * Maximum number of queues allowed in a single vhost.
    */
    @SerializedName("MaxQueuePerVhost")
    @Expose
    private Long MaxQueuePerVhost;

    /**
     * Get Maximum number of connections allowed in each vhost. 
     * @return MaxConnectionPerVhost Maximum number of connections allowed in each vhost.
     */
    public Long getMaxConnectionPerVhost() {
        return this.MaxConnectionPerVhost;
    }

    /**
     * Set Maximum number of connections allowed in each vhost.
     * @param MaxConnectionPerVhost Maximum number of connections allowed in each vhost.
     */
    public void setMaxConnectionPerVhost(Long MaxConnectionPerVhost) {
        this.MaxConnectionPerVhost = MaxConnectionPerVhost;
    }

    /**
     * Get Maximum number of exchanges allowed in each vhost. 
     * @return MaxExchangePerVhost Maximum number of exchanges allowed in each vhost.
     */
    public Long getMaxExchangePerVhost() {
        return this.MaxExchangePerVhost;
    }

    /**
     * Set Maximum number of exchanges allowed in each vhost.
     * @param MaxExchangePerVhost Maximum number of exchanges allowed in each vhost.
     */
    public void setMaxExchangePerVhost(Long MaxExchangePerVhost) {
        this.MaxExchangePerVhost = MaxExchangePerVhost;
    }

    /**
     * Get Maximum number of queues allowed in a single vhost. 
     * @return MaxQueuePerVhost Maximum number of queues allowed in a single vhost.
     */
    public Long getMaxQueuePerVhost() {
        return this.MaxQueuePerVhost;
    }

    /**
     * Set Maximum number of queues allowed in a single vhost.
     * @param MaxQueuePerVhost Maximum number of queues allowed in a single vhost.
     */
    public void setMaxQueuePerVhost(Long MaxQueuePerVhost) {
        this.MaxQueuePerVhost = MaxQueuePerVhost;
    }

    public RabbitMQVHostBaseQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVHostBaseQuota(RabbitMQVHostBaseQuota source) {
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
        this.setParamSimple(map, prefix + "MaxConnectionPerVhost", this.MaxConnectionPerVhost);
        this.setParamSimple(map, prefix + "MaxExchangePerVhost", this.MaxExchangePerVhost);
        this.setParamSimple(map, prefix + "MaxQueuePerVhost", this.MaxQueuePerVhost);

    }
}

