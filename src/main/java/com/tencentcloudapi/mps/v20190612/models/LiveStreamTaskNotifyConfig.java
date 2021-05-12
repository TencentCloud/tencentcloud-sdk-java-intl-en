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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamTaskNotifyConfig extends AbstractModel{

    /**
    * CMQ model. There are two types: `Queue` and `Topic`. Currently, only `Queue` is supported.
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * CMQ region, such as `sh` and `bj`.
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * This parameter is valid when the model is `Queue`, indicating the name of the CMQ queue for receiving event notifications.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * This parameter is valid when the model is `Topic`, indicating the name of the CMQ topic for receiving event notifications.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get CMQ model. There are two types: `Queue` and `Topic`. Currently, only `Queue` is supported. 
     * @return CmqModel CMQ model. There are two types: `Queue` and `Topic`. Currently, only `Queue` is supported.
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set CMQ model. There are two types: `Queue` and `Topic`. Currently, only `Queue` is supported.
     * @param CmqModel CMQ model. There are two types: `Queue` and `Topic`. Currently, only `Queue` is supported.
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get CMQ region, such as `sh` and `bj`. 
     * @return CmqRegion CMQ region, such as `sh` and `bj`.
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set CMQ region, such as `sh` and `bj`.
     * @param CmqRegion CMQ region, such as `sh` and `bj`.
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get This parameter is valid when the model is `Queue`, indicating the name of the CMQ queue for receiving event notifications. 
     * @return QueueName This parameter is valid when the model is `Queue`, indicating the name of the CMQ queue for receiving event notifications.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set This parameter is valid when the model is `Queue`, indicating the name of the CMQ queue for receiving event notifications.
     * @param QueueName This parameter is valid when the model is `Queue`, indicating the name of the CMQ queue for receiving event notifications.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get This parameter is valid when the model is `Topic`, indicating the name of the CMQ topic for receiving event notifications. 
     * @return TopicName This parameter is valid when the model is `Topic`, indicating the name of the CMQ topic for receiving event notifications.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set This parameter is valid when the model is `Topic`, indicating the name of the CMQ topic for receiving event notifications.
     * @param TopicName This parameter is valid when the model is `Topic`, indicating the name of the CMQ topic for receiving event notifications.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public LiveStreamTaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTaskNotifyConfig(LiveStreamTaskNotifyConfig source) {
        if (source.CmqModel != null) {
            this.CmqModel = new String(source.CmqModel);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

