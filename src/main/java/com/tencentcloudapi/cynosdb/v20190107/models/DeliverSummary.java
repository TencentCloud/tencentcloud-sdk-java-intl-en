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
    * Delivery type. Valid values: `store` (storage class), `mq` (message channel).
    */
    @SerializedName("DeliverType")
    @Expose
    private String DeliverType;

    /**
    * Delivery subtype: cls, ckafka.
    */
    @SerializedName("DeliverSubType")
    @Expose
    private String DeliverSubType;

    /**
    * Submitter
    */
    @SerializedName("DeliverConsumer")
    @Expose
    private String DeliverConsumer;

    /**
    * Submitter name
    */
    @SerializedName("DeliverConsumerName")
    @Expose
    private String DeliverConsumerName;

    /**
    * Submission exception error
    */
    @SerializedName("DeliverError")
    @Expose
    private String DeliverError;

    /**
     * Get Delivery type. Valid values: `store` (storage class), `mq` (message channel). 
     * @return DeliverType Delivery type. Valid values: `store` (storage class), `mq` (message channel).
     */
    public String getDeliverType() {
        return this.DeliverType;
    }

    /**
     * Set Delivery type. Valid values: `store` (storage class), `mq` (message channel).
     * @param DeliverType Delivery type. Valid values: `store` (storage class), `mq` (message channel).
     */
    public void setDeliverType(String DeliverType) {
        this.DeliverType = DeliverType;
    }

    /**
     * Get Delivery subtype: cls, ckafka. 
     * @return DeliverSubType Delivery subtype: cls, ckafka.
     */
    public String getDeliverSubType() {
        return this.DeliverSubType;
    }

    /**
     * Set Delivery subtype: cls, ckafka.
     * @param DeliverSubType Delivery subtype: cls, ckafka.
     */
    public void setDeliverSubType(String DeliverSubType) {
        this.DeliverSubType = DeliverSubType;
    }

    /**
     * Get Submitter 
     * @return DeliverConsumer Submitter
     */
    public String getDeliverConsumer() {
        return this.DeliverConsumer;
    }

    /**
     * Set Submitter
     * @param DeliverConsumer Submitter
     */
    public void setDeliverConsumer(String DeliverConsumer) {
        this.DeliverConsumer = DeliverConsumer;
    }

    /**
     * Get Submitter name 
     * @return DeliverConsumerName Submitter name
     */
    public String getDeliverConsumerName() {
        return this.DeliverConsumerName;
    }

    /**
     * Set Submitter name
     * @param DeliverConsumerName Submitter name
     */
    public void setDeliverConsumerName(String DeliverConsumerName) {
        this.DeliverConsumerName = DeliverConsumerName;
    }

    /**
     * Get Submission exception error 
     * @return DeliverError Submission exception error
     */
    public String getDeliverError() {
        return this.DeliverError;
    }

    /**
     * Set Submission exception error
     * @param DeliverError Submission exception error
     */
    public void setDeliverError(String DeliverError) {
        this.DeliverError = DeliverError;
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
        if (source.DeliverError != null) {
            this.DeliverError = new String(source.DeliverError);
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
        this.setParamSimple(map, prefix + "DeliverError", this.DeliverError);

    }
}

