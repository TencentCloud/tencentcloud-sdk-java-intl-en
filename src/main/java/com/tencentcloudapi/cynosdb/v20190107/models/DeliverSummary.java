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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverSummary extends AbstractModel {

    /**
    * Select the delivery type, storage class, message channel.
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * Specifies the delivery subtype: cls, ckafka.
    */
    @SerializedName("DeliverSubType")
    @Expose
    private String DeliverSubType;

    /**
    * Sender.
    */
    @SerializedName("DeliverConsumer")
    @Expose
    private String DeliverConsumer;

    /**
    * Specifies the name of the sender.
    */
    @SerializedName("DeliverConsumerName")
    @Expose
    private String DeliverConsumerName;

    /**
     * Get Select the delivery type, storage class, message channel. 
     * @return DeliverType Select the delivery type, storage class, message channel.
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set Select the delivery type, storage class, message channel.
     * @param DeliverType Select the delivery type, storage class, message channel.
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get Specifies the delivery subtype: cls, ckafka. 
     * @return DeliverSubType Specifies the delivery subtype: cls, ckafka.
     */
    public String getDeliverSubType() {
        return this.DeliverSubType;
    }

    /**
     * Set Specifies the delivery subtype: cls, ckafka.
     * @param DeliverSubType Specifies the delivery subtype: cls, ckafka.
     */
    public void setDeliverSubType(String DeliverSubType) {
        this.DeliverSubType = DeliverSubType;
    }

    /**
     * Get Sender. 
     * @return DeliverConsumer Sender.
     */
    public String getDeliverConsumer() {
        return this.DeliverConsumer;
    }

    /**
     * Set Sender.
     * @param DeliverConsumer Sender.
     */
    public void setDeliverConsumer(String DeliverConsumer) {
        this.DeliverConsumer = DeliverConsumer;
    }

    /**
     * Get Specifies the name of the sender. 
     * @return DeliverConsumerName Specifies the name of the sender.
     */
    public String getDeliverConsumerName() {
        return this.DeliverConsumerName;
    }

    /**
     * Set Specifies the name of the sender.
     * @param DeliverConsumerName Specifies the name of the sender.
     */
    public void setDeliverConsumerName(String DeliverConsumerName) {
        this.DeliverConsumerName = DeliverConsumerName;
    }

    public DeliverSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverSummary(DeliverSummary source) {
        if (source.DeliverType != null) {
            this.DeliverType = new String(source.DeliverType);
        }
        if (source.DeliverSubType != null) {
            this.DeliverSubType = new String(source.DeliverSubType);
        }
        if (source.DeliverConsumer != null) {
            this.DeliverConsumer = new String(source.DeliverConsumer);
        }
        if (source.DeliverConsumerName != null) {
            this.DeliverConsumerName = new String(source.DeliverConsumerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeliverType", this.DeliverType);
        this.setParamSimple(map, prefix + "DeliverSubType", this.DeliverSubType);
        this.setParamSimple(map, prefix + "DeliverConsumer", this.DeliverConsumer);
        this.setParamSimple(map, prefix + "DeliverConsumerName", this.DeliverConsumerName);

    }
}

