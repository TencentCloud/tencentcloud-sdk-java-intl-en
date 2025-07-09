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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVirtualHostStatistics extends AbstractModel {

    /**
    * Number of queues of the current vhost.
    */
    @SerializedName("CurrentQueues")
    @Expose
    private Long CurrentQueues;

    /**
    * Number of exchanges in the current vhost.
    */
    @SerializedName("CurrentExchanges")
    @Expose
    private Long CurrentExchanges;

    /**
    * Number of current connections of the vhost.
    */
    @SerializedName("CurrentConnections")
    @Expose
    private Long CurrentConnections;

    /**
    * Number of channels for the current vhost.
    */
    @SerializedName("CurrentChannels")
    @Expose
    private Long CurrentChannels;

    /**
    * Number of users of the current vhost.
    */
    @SerializedName("CurrentUsers")
    @Expose
    private Long CurrentUsers;

    /**
     * Get Number of queues of the current vhost. 
     * @return CurrentQueues Number of queues of the current vhost.
     */
    public Long getCurrentQueues() {
        return this.CurrentQueues;
    }

    /**
     * Set Number of queues of the current vhost.
     * @param CurrentQueues Number of queues of the current vhost.
     */
    public void setCurrentQueues(Long CurrentQueues) {
        this.CurrentQueues = CurrentQueues;
    }

    /**
     * Get Number of exchanges in the current vhost. 
     * @return CurrentExchanges Number of exchanges in the current vhost.
     */
    public Long getCurrentExchanges() {
        return this.CurrentExchanges;
    }

    /**
     * Set Number of exchanges in the current vhost.
     * @param CurrentExchanges Number of exchanges in the current vhost.
     */
    public void setCurrentExchanges(Long CurrentExchanges) {
        this.CurrentExchanges = CurrentExchanges;
    }

    /**
     * Get Number of current connections of the vhost. 
     * @return CurrentConnections Number of current connections of the vhost.
     */
    public Long getCurrentConnections() {
        return this.CurrentConnections;
    }

    /**
     * Set Number of current connections of the vhost.
     * @param CurrentConnections Number of current connections of the vhost.
     */
    public void setCurrentConnections(Long CurrentConnections) {
        this.CurrentConnections = CurrentConnections;
    }

    /**
     * Get Number of channels for the current vhost. 
     * @return CurrentChannels Number of channels for the current vhost.
     */
    public Long getCurrentChannels() {
        return this.CurrentChannels;
    }

    /**
     * Set Number of channels for the current vhost.
     * @param CurrentChannels Number of channels for the current vhost.
     */
    public void setCurrentChannels(Long CurrentChannels) {
        this.CurrentChannels = CurrentChannels;
    }

    /**
     * Get Number of users of the current vhost. 
     * @return CurrentUsers Number of users of the current vhost.
     */
    public Long getCurrentUsers() {
        return this.CurrentUsers;
    }

    /**
     * Set Number of users of the current vhost.
     * @param CurrentUsers Number of users of the current vhost.
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

