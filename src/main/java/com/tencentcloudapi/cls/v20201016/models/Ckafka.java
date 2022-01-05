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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ckafka extends AbstractModel{

    /**
    * CKafka VIP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * CKafka Vport
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * CKafka instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * CKafka instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * CKafka topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * CKafka topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get CKafka VIP 
     * @return Vip CKafka VIP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set CKafka VIP
     * @param Vip CKafka VIP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get CKafka Vport 
     * @return Vport CKafka Vport
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set CKafka Vport
     * @param Vport CKafka Vport
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get CKafka instance ID 
     * @return InstanceId CKafka instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CKafka instance ID
     * @param InstanceId CKafka instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get CKafka instance name 
     * @return InstanceName CKafka instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set CKafka instance name
     * @param InstanceName CKafka instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get CKafka topic ID 
     * @return TopicId CKafka topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set CKafka topic ID
     * @param TopicId CKafka topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get CKafka topic name 
     * @return TopicName CKafka topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set CKafka topic name
     * @param TopicName CKafka topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public Ckafka() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ckafka(Ckafka source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

