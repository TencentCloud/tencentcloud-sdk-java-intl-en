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

public class ProducerLog extends AbstractModel {

    /**
    * Message ID.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * Producer name.
    */
    @SerializedName("ProducerName")
    @Expose
    private String ProducerName;

    /**
    * Message production time.
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * Producer client.
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

    /**
    * Production time cost (in seconds).
    */
    @SerializedName("ProduceUseTime")
    @Expose
    private Long ProduceUseTime;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Message ID. 
     * @return MsgId Message ID.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID.
     * @param MsgId Message ID.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
    }

    /**
     * Get Producer name. 
     * @return ProducerName Producer name.
     */
    public String getProducerName() {
        return this.ProducerName;
    }

    /**
     * Set Producer name.
     * @param ProducerName Producer name.
     */
    public void setProducerName(String ProducerName) {
        this.ProducerName = ProducerName;
    }

    /**
     * Get Message production time. 
     * @return ProduceTime Message production time.
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Message production time.
     * @param ProduceTime Message production time.
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get Producer client. 
     * @return ProducerAddr Producer client.
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set Producer client.
     * @param ProducerAddr Producer client.
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    /**
     * Get Production time cost (in seconds). 
     * @return ProduceUseTime Production time cost (in seconds).
     */
    public Long getProduceUseTime() {
        return this.ProduceUseTime;
    }

    /**
     * Set Production time cost (in seconds).
     * @param ProduceUseTime Production time cost (in seconds).
     */
    public void setProduceUseTime(Long ProduceUseTime) {
        this.ProduceUseTime = ProduceUseTime;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ProducerLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProducerLog(ProducerLog source) {
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.ProducerName != null) {
            this.ProducerName = new String(source.ProducerName);
        }
        if (source.ProduceTime != null) {
            this.ProduceTime = new String(source.ProduceTime);
        }
        if (source.ProducerAddr != null) {
            this.ProducerAddr = new String(source.ProducerAddr);
        }
        if (source.ProduceUseTime != null) {
            this.ProduceUseTime = new Long(source.ProduceUseTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);
        this.setParamSimple(map, prefix + "ProduceUseTime", this.ProduceUseTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

