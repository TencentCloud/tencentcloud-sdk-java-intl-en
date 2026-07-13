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

public class ModifyRabbitMQServerlessQueueRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost parameter.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Queue name.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Newly modified remark.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * MessageTTL parameter in milliseconds, dedicated to classic event type	
    */
    @SerializedName("MessageTTL")
    @Expose
    private Long MessageTTL;

    /**
    * DeadLetterExchange parameter. It specifies that expired or rejected messages can be delivered to the specified dead letter exchange.
    */
    @SerializedName("DeadLetterExchange")
    @Expose
    private String DeadLetterExchange;

    /**
    * DeadLetterRoutingKey parameter. The value can only contain letters, digits, periods (.), hyphens (-), at signs (@), and underscores (_).
    */
    @SerializedName("DeadLetterRoutingKey")
    @Expose
    private String DeadLetterRoutingKey;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost parameter. 
     * @return VirtualHost Vhost parameter.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost parameter.
     * @param VirtualHost Vhost parameter.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Queue name. 
     * @return QueueName Queue name.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Queue name.
     * @param QueueName Queue name.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Newly modified remark. 
     * @return Remark Newly modified remark.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Newly modified remark.
     * @param Remark Newly modified remark.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get MessageTTL parameter in milliseconds, dedicated to classic event type	 
     * @return MessageTTL MessageTTL parameter in milliseconds, dedicated to classic event type	
     */
    public Long getMessageTTL() {
        return this.MessageTTL;
    }

    /**
     * Set MessageTTL parameter in milliseconds, dedicated to classic event type	
     * @param MessageTTL MessageTTL parameter in milliseconds, dedicated to classic event type	
     */
    public void setMessageTTL(Long MessageTTL) {
        this.MessageTTL = MessageTTL;
    }

    /**
     * Get DeadLetterExchange parameter. It specifies that expired or rejected messages can be delivered to the specified dead letter exchange. 
     * @return DeadLetterExchange DeadLetterExchange parameter. It specifies that expired or rejected messages can be delivered to the specified dead letter exchange.
     */
    public String getDeadLetterExchange() {
        return this.DeadLetterExchange;
    }

    /**
     * Set DeadLetterExchange parameter. It specifies that expired or rejected messages can be delivered to the specified dead letter exchange.
     * @param DeadLetterExchange DeadLetterExchange parameter. It specifies that expired or rejected messages can be delivered to the specified dead letter exchange.
     */
    public void setDeadLetterExchange(String DeadLetterExchange) {
        this.DeadLetterExchange = DeadLetterExchange;
    }

    /**
     * Get DeadLetterRoutingKey parameter. The value can only contain letters, digits, periods (.), hyphens (-), at signs (@), and underscores (_). 
     * @return DeadLetterRoutingKey DeadLetterRoutingKey parameter. The value can only contain letters, digits, periods (.), hyphens (-), at signs (@), and underscores (_).
     */
    public String getDeadLetterRoutingKey() {
        return this.DeadLetterRoutingKey;
    }

    /**
     * Set DeadLetterRoutingKey parameter. The value can only contain letters, digits, periods (.), hyphens (-), at signs (@), and underscores (_).
     * @param DeadLetterRoutingKey DeadLetterRoutingKey parameter. The value can only contain letters, digits, periods (.), hyphens (-), at signs (@), and underscores (_).
     */
    public void setDeadLetterRoutingKey(String DeadLetterRoutingKey) {
        this.DeadLetterRoutingKey = DeadLetterRoutingKey;
    }

    public ModifyRabbitMQServerlessQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRabbitMQServerlessQueueRequest(ModifyRabbitMQServerlessQueueRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.MessageTTL != null) {
            this.MessageTTL = new Long(source.MessageTTL);
        }
        if (source.DeadLetterExchange != null) {
            this.DeadLetterExchange = new String(source.DeadLetterExchange);
        }
        if (source.DeadLetterRoutingKey != null) {
            this.DeadLetterRoutingKey = new String(source.DeadLetterRoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "MessageTTL", this.MessageTTL);
        this.setParamSimple(map, prefix + "DeadLetterExchange", this.DeadLetterExchange);
        this.setParamSimple(map, prefix + "DeadLetterRoutingKey", this.DeadLetterRoutingKey);

    }
}

