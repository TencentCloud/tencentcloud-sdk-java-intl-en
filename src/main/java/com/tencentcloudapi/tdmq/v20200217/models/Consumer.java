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

public class Consumer extends AbstractModel {

    /**
    * The time when the consumer started connecting.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * Consumer address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerAddr")
    @Expose
    private String ConsumerAddr;

    /**
    * Consumer name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerName")
    @Expose
    private String ConsumerName;

    /**
    * Consumer version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * Serial number of the topic partition connected to the consumer.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get The time when the consumer started connecting.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConnectedSince The time when the consumer started connecting.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set The time when the consumer started connecting.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConnectedSince The time when the consumer started connecting.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get Consumer address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerAddr Consumer address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerAddr() {
        return this.ConsumerAddr;
    }

    /**
     * Set Consumer address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerAddr Consumer address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerAddr(String ConsumerAddr) {
        this.ConsumerAddr = ConsumerAddr;
    }

    /**
     * Get Consumer name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerName Consumer name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerName() {
        return this.ConsumerName;
    }

    /**
     * Set Consumer name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConsumerName Consumer name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerName(String ConsumerName) {
        this.ConsumerName = ConsumerName;
    }

    /**
     * Get Consumer version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientVersion Consumer version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set Consumer version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientVersion Consumer version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get Serial number of the topic partition connected to the consumer.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partition Serial number of the topic partition connected to the consumer.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Serial number of the topic partition connected to the consumer.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partition Serial number of the topic partition connected to the consumer.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public Consumer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Consumer(Consumer source) {
        if (source.ConnectedSince != null) {
            this.ConnectedSince = new String(source.ConnectedSince);
        }
        if (source.ConsumerAddr != null) {
            this.ConsumerAddr = new String(source.ConsumerAddr);
        }
        if (source.ConsumerName != null) {
            this.ConsumerName = new String(source.ConsumerName);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "ConsumerAddr", this.ConsumerAddr);
        this.setParamSimple(map, prefix + "ConsumerName", this.ConsumerName);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

