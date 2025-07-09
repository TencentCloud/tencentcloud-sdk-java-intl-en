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
    * Notification type:

"CMQ": Callback messages are written to the CMQ queue; 
"URL": When a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. The callback protocol is http+json. The content of the packet body is the same as the output parameters of the [ParseLiveStreamProcessNotification API](https://intl.cloud.tencent.com/document/product/862/39229?from_cn_redirect=1).

<font color="red">Note: If left blank, it is CMQ by default. To use the other type, you need to fill in the corresponding type value.</font>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * HTTP callback URL, required if `NotifyType` is set to `URL`
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

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
    * Key used to generate a callback signature.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NotifyKey")
    @Expose
    private String NotifyKey;

    /**
     * Get Notification type:

"CMQ": Callback messages are written to the CMQ queue; 
"URL": When a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. The callback protocol is http+json. The content of the packet body is the same as the output parameters of the [ParseLiveStreamProcessNotification API](https://intl.cloud.tencent.com/document/product/862/39229?from_cn_redirect=1).

<font color="red">Note: If left blank, it is CMQ by default. To use the other type, you need to fill in the corresponding type value.</font> 
     * @return NotifyType Notification type:

"CMQ": Callback messages are written to the CMQ queue; 
"URL": When a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. The callback protocol is http+json. The content of the packet body is the same as the output parameters of the [ParseLiveStreamProcessNotification API](https://intl.cloud.tencent.com/document/product/862/39229?from_cn_redirect=1).

<font color="red">Note: If left blank, it is CMQ by default. To use the other type, you need to fill in the corresponding type value.</font>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set Notification type:

"CMQ": Callback messages are written to the CMQ queue; 
"URL": When a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. The callback protocol is http+json. The content of the packet body is the same as the output parameters of the [ParseLiveStreamProcessNotification API](https://intl.cloud.tencent.com/document/product/862/39229?from_cn_redirect=1).

<font color="red">Note: If left blank, it is CMQ by default. To use the other type, you need to fill in the corresponding type value.</font>
     * @param NotifyType Notification type:

"CMQ": Callback messages are written to the CMQ queue; 
"URL": When a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. The callback protocol is http+json. The content of the packet body is the same as the output parameters of the [ParseLiveStreamProcessNotification API](https://intl.cloud.tencent.com/document/product/862/39229?from_cn_redirect=1).

<font color="red">Note: If left blank, it is CMQ by default. To use the other type, you need to fill in the corresponding type value.</font>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get HTTP callback URL, required if `NotifyType` is set to `URL` 
     * @return NotifyUrl HTTP callback URL, required if `NotifyType` is set to `URL`
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set HTTP callback URL, required if `NotifyType` is set to `URL`
     * @param NotifyUrl HTTP callback URL, required if `NotifyType` is set to `URL`
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

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

    /**
     * Get Key used to generate a callback signature.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NotifyKey Key used to generate a callback signature.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNotifyKey() {
        return this.NotifyKey;
    }

    /**
     * Set Key used to generate a callback signature.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NotifyKey Key used to generate a callback signature.
Note: This field may return null, indicating that no valid values can be obtained.
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

