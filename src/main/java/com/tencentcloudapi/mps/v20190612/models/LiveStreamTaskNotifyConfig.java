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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveStreamTaskNotifyConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * 
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * 
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * 
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 
    */
    @SerializedName("NotifyKey")
    @Expose
    private String NotifyKey;

    /**
     * Get  
     * @return NotifyType 
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 
     * @param NotifyType 
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get  
     * @return NotifyUrl 
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 
     * @param NotifyUrl 
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get  
     * @return CmqModel 
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set 
     * @param CmqModel 
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get  
     * @return CmqRegion 
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set 
     * @param CmqRegion 
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get  
     * @return QueueName 
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 
     * @param QueueName 
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get  
     * @return TopicName 
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 
     * @param TopicName 
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get  
     * @return NotifyKey 
     */
    public String getNotifyKey() {
        return this.NotifyKey;
    }

    /**
     * Set 
     * @param NotifyKey 
     */
    public void setNotifyKey(String NotifyKey) {
        this.NotifyKey = NotifyKey;
    }

    public LiveStreamTaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamTaskNotifyConfig(LiveStreamTaskNotifyConfig source) {
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
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
        if (source.NotifyKey != null) {
            this.NotifyKey = new String(source.NotifyKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "NotifyKey", this.NotifyKey);

    }
}

