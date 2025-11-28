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

public class MsgLog extends AbstractModel {

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
    * Production time.
    */
    @SerializedName("ProduceTime")
    @Expose
    private String ProduceTime;

    /**
    * Producer client address.
    */
    @SerializedName("ProducerAddr")
    @Expose
    private String ProducerAddr;

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
     * Get Production time. 
     * @return ProduceTime Production time.
     */
    public String getProduceTime() {
        return this.ProduceTime;
    }

    /**
     * Set Production time.
     * @param ProduceTime Production time.
     */
    public void setProduceTime(String ProduceTime) {
        this.ProduceTime = ProduceTime;
    }

    /**
     * Get Producer client address. 
     * @return ProducerAddr Producer client address.
     */
    public String getProducerAddr() {
        return this.ProducerAddr;
    }

    /**
     * Set Producer client address.
     * @param ProducerAddr Producer client address.
     */
    public void setProducerAddr(String ProducerAddr) {
        this.ProducerAddr = ProducerAddr;
    }

    public MsgLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgLog(MsgLog source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "ProducerName", this.ProducerName);
        this.setParamSimple(map, prefix + "ProduceTime", this.ProduceTime);
        this.setParamSimple(map, prefix + "ProducerAddr", this.ProducerAddr);

    }
}

