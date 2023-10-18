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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVirtualHostStatistics extends AbstractModel {

    /**
    * The number of queues in the current vhost
    */
    @SerializedName("CurrentQueues")
    @Expose
    private Long CurrentQueues;

    /**
    * The number of exchanges in the current vhost
    */
    @SerializedName("CurrentExchanges")
    @Expose
    private Long CurrentExchanges;

    /**
    * The number of connections in the current vhost
    */
    @SerializedName("CurrentConnections")
    @Expose
    private Long CurrentConnections;

    /**
    * The number of channels in the current vhost
    */
    @SerializedName("CurrentChannels")
    @Expose
    private Long CurrentChannels;

    /**
    * The number of users in the current vhost
    */
    @SerializedName("CurrentUsers")
    @Expose
    private Long CurrentUsers;

    /**
     * Get The number of queues in the current vhost 
     * @return CurrentQueues The number of queues in the current vhost
     */
    public Long getCurrentQueues() {
        return this.CurrentQueues;
    }

    /**
     * Set The number of queues in the current vhost
     * @param CurrentQueues The number of queues in the current vhost
     */
    public void setCurrentQueues(Long CurrentQueues) {
        this.CurrentQueues = CurrentQueues;
    }

    /**
     * Get The number of exchanges in the current vhost 
     * @return CurrentExchanges The number of exchanges in the current vhost
     */
    public Long getCurrentExchanges() {
        return this.CurrentExchanges;
    }

    /**
     * Set The number of exchanges in the current vhost
     * @param CurrentExchanges The number of exchanges in the current vhost
     */
    public void setCurrentExchanges(Long CurrentExchanges) {
        this.CurrentExchanges = CurrentExchanges;
    }

    /**
     * Get The number of connections in the current vhost 
     * @return CurrentConnections The number of connections in the current vhost
     */
    public Long getCurrentConnections() {
        return this.CurrentConnections;
    }

    /**
     * Set The number of connections in the current vhost
     * @param CurrentConnections The number of connections in the current vhost
     */
    public void setCurrentConnections(Long CurrentConnections) {
        this.CurrentConnections = CurrentConnections;
    }

    /**
     * Get The number of channels in the current vhost 
     * @return CurrentChannels The number of channels in the current vhost
     */
    public Long getCurrentChannels() {
        return this.CurrentChannels;
    }

    /**
     * Set The number of channels in the current vhost
     * @param CurrentChannels The number of channels in the current vhost
     */
    public void setCurrentChannels(Long CurrentChannels) {
        this.CurrentChannels = CurrentChannels;
    }

    /**
     * Get The number of users in the current vhost 
     * @return CurrentUsers The number of users in the current vhost
     */
    public Long getCurrentUsers() {
        return this.CurrentUsers;
    }

    /**
     * Set The number of users in the current vhost
     * @param CurrentUsers The number of users in the current vhost
     */
    public void setCurrentUsers(Long CurrentUsers) {
        this.CurrentUsers = CurrentUsers;
    }

    public RabbitMQVirtualHostStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVirtualHostStatistics(RabbitMQVirtualHostStatistics source) {
        if (source.CurrentQueues != null) {
            this.CurrentQueues = new Long(source.CurrentQueues);
        }
        if (source.CurrentExchanges != null) {
            this.CurrentExchanges = new Long(source.CurrentExchanges);
        }
        if (source.CurrentConnections != null) {
            this.CurrentConnections = new Long(source.CurrentConnections);
        }
        if (source.CurrentChannels != null) {
            this.CurrentChannels = new Long(source.CurrentChannels);
        }
        if (source.CurrentUsers != null) {
            this.CurrentUsers = new Long(source.CurrentUsers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentQueues", this.CurrentQueues);
        this.setParamSimple(map, prefix + "CurrentExchanges", this.CurrentExchanges);
        this.setParamSimple(map, prefix + "CurrentConnections", this.CurrentConnections);
        this.setParamSimple(map, prefix + "CurrentChannels", this.CurrentChannels);
        this.setParamSimple(map, prefix + "CurrentUsers", this.CurrentUsers);

    }
}

