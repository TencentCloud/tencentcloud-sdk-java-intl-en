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

public class Publisher extends AbstractModel {

    /**
    * Producer ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerId")
    @Expose
    private Long ProducerId;

    /**
    * Producer name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * Producer address.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Client version.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * Message production rate (message/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateIn")
    @Expose
    private Float MsgRateIn;

    /**
    * Message production throughput rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private Float MsgThroughputIn;

    /**
    * Average message size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private Float AverageMsgSize;

    /**
    * Connection time.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectedSince")
    @Expose
    private String ConnectedSince;

    /**
    * Serial number of the topic partition connected to the producer.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
     * Get Producer ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ProducerId Producer ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getProducerId() {
        return this.ProducerId;
    }

    /**
     * Set Producer ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ProducerId Producer ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProducerId(Long ProducerId) {
        this.ProducerId = ProducerId;
    }

    /**
     * Get Producer name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ProducerName Producer name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set Producer name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ProducerName Producer name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get Producer address.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Address Producer address.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Producer address.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Address Producer address.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Client version.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ClientVersion Client version.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set Client version.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ClientVersion Client version.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get Message production rate (message/sec).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MsgRateIn Message production rate (message/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set Message production rate (message/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MsgRateIn Message production rate (message/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMsgRateIn(Float MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get Message production throughput rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return MsgThroughputIn Message production throughput rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set Message production throughput rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param MsgThroughputIn Message production throughput rate (byte/sec).
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputIn(Float MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get Average message size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return AverageMsgSize Average message size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set Average message size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param AverageMsgSize Average message size in bytes.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAverageMsgSize(Float AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get Connection time.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ConnectedSince Connection time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getConnectedSince() {
        return this.ConnectedSince;
    }

    /**
     * Set Connection time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ConnectedSince Connection time.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setConnectedSince(String ConnectedSince) {
        this.ConnectedSince = ConnectedSince;
    }

    /**
     * Get Serial number of the topic partition connected to the producer.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Partition Serial number of the topic partition connected to the producer.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Serial number of the topic partition connected to the producer.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Partition Serial number of the topic partition connected to the producer.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    public Publisher() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Publisher(Publisher source) {
        if (source.ProducerId != null) {
            this.ProducerId = new Long(source.ProducerId);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new Float(source.MsgRateIn);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new Float(source.MsgThroughputIn);
        }
        if (source.AverageMsgSize != null) {
            this.AverageMsgSize = new Float(source.AverageMsgSize);
        }
        if (source.ConnectedSince != null) {
            this.ConnectedSince = new String(source.ConnectedSince);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProducerId", this.ProducerId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "ConnectedSince", this.ConnectedSince);
        this.setParamSimple(map, prefix + "Partition", this.Partition);

    }
}

