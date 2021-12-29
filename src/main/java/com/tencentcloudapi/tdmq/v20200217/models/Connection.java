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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Connection extends AbstractModel{

    /**
    * Producer address.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Topic partition.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * Producer version.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * Producer name.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * Producer ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerId")
    @Expose
    private String ProducerId;

    /**
    * Average message size in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private String AverageMsgSize;

    /**
    * Production rate in bytes/sec.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private String MsgThroughputIn;

    /**
     * Get Producer address.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Address Producer address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Producer address.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Address Producer address.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Topic partition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Partitions Topic partition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Topic partition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Partitions Topic partition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Producer version.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClientVersion Producer version.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set Producer version.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClientVersion Producer version.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get Producer name.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProducerName Producer name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set Producer name.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProducerName Producer name.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get Producer ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProducerId Producer ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProducerId() {
        return this.ProducerId;
    }

    /**
     * Set Producer ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProducerId Producer ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProducerId(String ProducerId) {
        this.ProducerId = ProducerId;
    }

    /**
     * Get Average message size in bytes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AverageMsgSize Average message size in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set Average message size in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AverageMsgSize Average message size in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageMsgSize(String AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get Production rate in bytes/sec.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgThroughputIn Production rate in bytes/sec.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set Production rate in bytes/sec.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgThroughputIn Production rate in bytes/sec.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputIn(String MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    public Connection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Connection(Connection source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.ProducerId != null) {
            this.ProducerId = new String(source.ProducerId);
        }
        if (source.AverageMsgSize != null) {
            this.AverageMsgSize = new String(source.AverageMsgSize);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new String(source.MsgThroughputIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ProducerId", this.ProducerId);
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);

    }
}

