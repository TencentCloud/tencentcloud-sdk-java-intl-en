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

public class TaskNotifyConfig extends AbstractModel {

    /**
    * Notification type. available values:.
<li>CMQ: offline. switch to TDMQ-CMQ.</li>.
<Li>TDMQ-CMQ: message queue</li>.
<li>URL: when a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. the callback protocol is HTTP+json. the content of the packet body is the same as the output parameters of the parseeventnotification api.</li>.
<Li>SCF: not recommended. additional configuration is required in the console.</li>.
<Li>AWS-SQS: aws queue, suitable for aws tasks only and requires the same region.</li>.
<font color="red">note: if left blank, it is TDMQ-CMQ by default. to use another type, you need to fill in the corresponding type value. if using TDMQ-CMQ message queue, an excessively large task response may cause queue failure.</font>.
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * Workflow notification method. Valid values: Finish, Change. If this parameter is left empty, `Finish` will be used.
    */
    @SerializedName("NotifyMode")
    @Expose
    private String NotifyMode;

    /**
    * HTTP callback URL, required if `NotifyType` is set to `URL`
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * The CMQ or TDMQ-CMQ model. Valid values: Queue, Topic.
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * The CMQ or TDMQ-CMQ region, such as `sh` (Shanghai) or `bj` (Beijing).
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * The CMQ or TDMQ-CMQ topic to receive notifications. This parameter is valid when `CmqModel` is `Topic`.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * The CMQ or TDMQ-CMQ queue to receive notifications. This parameter is valid when `CmqModel` is `Queue`.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * The AWS SQS queue. This parameter is required if `NotifyType` is `AWS-SQS`.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AwsSQS")
    @Expose
    private AwsSQS AwsSQS;

    /**
    * key used to generate a callback signature.
    */
    @SerializedName("NotifyKey")
    @Expose
    private String NotifyKey;

    /**
     * Get Notification type. available values:.
<li>CMQ: offline. switch to TDMQ-CMQ.</li>.
<Li>TDMQ-CMQ: message queue</li>.
<li>URL: when a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. the callback protocol is HTTP+json. the content of the packet body is the same as the output parameters of the parseeventnotification api.</li>.
<Li>SCF: not recommended. additional configuration is required in the console.</li>.
<Li>AWS-SQS: aws queue, suitable for aws tasks only and requires the same region.</li>.
<font color="red">note: if left blank, it is TDMQ-CMQ by default. to use another type, you need to fill in the corresponding type value. if using TDMQ-CMQ message queue, an excessively large task response may cause queue failure.</font>. 
     * @return NotifyType Notification type. available values:.
<li>CMQ: offline. switch to TDMQ-CMQ.</li>.
<Li>TDMQ-CMQ: message queue</li>.
<li>URL: when a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. the callback protocol is HTTP+json. the content of the packet body is the same as the output parameters of the parseeventnotification api.</li>.
<Li>SCF: not recommended. additional configuration is required in the console.</li>.
<Li>AWS-SQS: aws queue, suitable for aws tasks only and requires the same region.</li>.
<font color="red">note: if left blank, it is TDMQ-CMQ by default. to use another type, you need to fill in the corresponding type value. if using TDMQ-CMQ message queue, an excessively large task response may cause queue failure.</font>.
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set Notification type. available values:.
<li>CMQ: offline. switch to TDMQ-CMQ.</li>.
<Li>TDMQ-CMQ: message queue</li>.
<li>URL: when a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. the callback protocol is HTTP+json. the content of the packet body is the same as the output parameters of the parseeventnotification api.</li>.
<Li>SCF: not recommended. additional configuration is required in the console.</li>.
<Li>AWS-SQS: aws queue, suitable for aws tasks only and requires the same region.</li>.
<font color="red">note: if left blank, it is TDMQ-CMQ by default. to use another type, you need to fill in the corresponding type value. if using TDMQ-CMQ message queue, an excessively large task response may cause queue failure.</font>.
     * @param NotifyType Notification type. available values:.
<li>CMQ: offline. switch to TDMQ-CMQ.</li>.
<Li>TDMQ-CMQ: message queue</li>.
<li>URL: when a URL is specified, the HTTP callback is pushed to the address specified by NotifyUrl. the callback protocol is HTTP+json. the content of the packet body is the same as the output parameters of the parseeventnotification api.</li>.
<Li>SCF: not recommended. additional configuration is required in the console.</li>.
<Li>AWS-SQS: aws queue, suitable for aws tasks only and requires the same region.</li>.
<font color="red">note: if left blank, it is TDMQ-CMQ by default. to use another type, you need to fill in the corresponding type value. if using TDMQ-CMQ message queue, an excessively large task response may cause queue failure.</font>.
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get Workflow notification method. Valid values: Finish, Change. If this parameter is left empty, `Finish` will be used. 
     * @return NotifyMode Workflow notification method. Valid values: Finish, Change. If this parameter is left empty, `Finish` will be used.
     */
    public String getNotifyMode() {
        return this.NotifyMode;
    }

    /**
     * Set Workflow notification method. Valid values: Finish, Change. If this parameter is left empty, `Finish` will be used.
     * @param NotifyMode Workflow notification method. Valid values: Finish, Change. If this parameter is left empty, `Finish` will be used.
     */
    public void setNotifyMode(String NotifyMode) {
        this.NotifyMode = NotifyMode;
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
     * Get The CMQ or TDMQ-CMQ model. Valid values: Queue, Topic. 
     * @return CmqModel The CMQ or TDMQ-CMQ model. Valid values: Queue, Topic.
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set The CMQ or TDMQ-CMQ model. Valid values: Queue, Topic.
     * @param CmqModel The CMQ or TDMQ-CMQ model. Valid values: Queue, Topic.
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get The CMQ or TDMQ-CMQ region, such as `sh` (Shanghai) or `bj` (Beijing). 
     * @return CmqRegion The CMQ or TDMQ-CMQ region, such as `sh` (Shanghai) or `bj` (Beijing).
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set The CMQ or TDMQ-CMQ region, such as `sh` (Shanghai) or `bj` (Beijing).
     * @param CmqRegion The CMQ or TDMQ-CMQ region, such as `sh` (Shanghai) or `bj` (Beijing).
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get The CMQ or TDMQ-CMQ topic to receive notifications. This parameter is valid when `CmqModel` is `Topic`. 
     * @return TopicName The CMQ or TDMQ-CMQ topic to receive notifications. This parameter is valid when `CmqModel` is `Topic`.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set The CMQ or TDMQ-CMQ topic to receive notifications. This parameter is valid when `CmqModel` is `Topic`.
     * @param TopicName The CMQ or TDMQ-CMQ topic to receive notifications. This parameter is valid when `CmqModel` is `Topic`.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get The CMQ or TDMQ-CMQ queue to receive notifications. This parameter is valid when `CmqModel` is `Queue`. 
     * @return QueueName The CMQ or TDMQ-CMQ queue to receive notifications. This parameter is valid when `CmqModel` is `Queue`.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set The CMQ or TDMQ-CMQ queue to receive notifications. This parameter is valid when `CmqModel` is `Queue`.
     * @param QueueName The CMQ or TDMQ-CMQ queue to receive notifications. This parameter is valid when `CmqModel` is `Queue`.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get The AWS SQS queue. This parameter is required if `NotifyType` is `AWS-SQS`.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AwsSQS The AWS SQS queue. This parameter is required if `NotifyType` is `AWS-SQS`.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AwsSQS getAwsSQS() {
        return this.AwsSQS;
    }

    /**
     * Set The AWS SQS queue. This parameter is required if `NotifyType` is `AWS-SQS`.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param AwsSQS The AWS SQS queue. This parameter is required if `NotifyType` is `AWS-SQS`.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAwsSQS(AwsSQS AwsSQS) {
        this.AwsSQS = AwsSQS;
    }

    /**
     * Get key used to generate a callback signature. 
     * @return NotifyKey key used to generate a callback signature.
     */
    public String getNotifyKey() {
        return this.NotifyKey;
    }

    /**
     * Set key used to generate a callback signature.
     * @param NotifyKey key used to generate a callback signature.
     */
    public void setNotifyKey(String NotifyKey) {
        this.NotifyKey = NotifyKey;
    }

    public TaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskNotifyConfig(TaskNotifyConfig source) {
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyMode != null) {
            this.NotifyMode = new String(source.NotifyMode);
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
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.AwsSQS != null) {
            this.AwsSQS = new AwsSQS(source.AwsSQS);
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
        this.setParamSimple(map, prefix + "NotifyMode", this.NotifyMode);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamObj(map, prefix + "AwsSQS.", this.AwsSQS);
        this.setParamSimple(map, prefix + "NotifyKey", this.NotifyKey);

    }
}

