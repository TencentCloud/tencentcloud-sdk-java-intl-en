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
    * <p>Notification type. Valid values:</p><li>CMQ: Removed. We recommend that you switch to TDMQ-CMQ.</li><li>TDMQ-CMQ: TDMQ.</li><li>URL: If URL is specified, HTTP callbacks are pushed to the URL specified in NotifyUrl. The callback protocol is HTTP and JSON. The packet body is the same as the output parameter of the event parsing notification API.</li><li>SCF: This is not recommended. Additional configuration for SCF is required in the console.</li><li>AWS-SQS: AWS queue. This is only suitable for AWS tasks in the same region.</li><font color="red"> Note: The default value is TDMQ-CMQ if this is not specified or empty. To use another type, you need to specify the corresponding value. If TDMQ-CMQ is used, oversized task response may cause failure to write to the queue. </font>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * <p>Workflow notification mode. Valid values are Finish and Change. If this is not specified, the default value is Finish.</p>
    */
    @SerializedName("NotifyMode")
    @Expose
    private String NotifyMode;

    /**
    * <p>HTTP callback URL. This is required if NotifyType is URL.</p>
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * <p>CMQ or TDMQ for CMQ model. Valid values are Queue and Topic.</p>
    */
    @SerializedName("CmqModel")
    @Expose
    private String CmqModel;

    /**
    * <p>CMQ or TDMQ for CMQ region, such as sh or bj.</p>
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
    * <p>This field takes effect if the model is Topic. It indicates the topic name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>This field takes effect if the model is Queue. It indicates the queue name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>AWS SQS callback. This is required if NotifyType is AWS-SQS.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AwsSQS")
    @Expose
    private AwsSQS AwsSQS;

    /**
    * <p>Key used to generate the callback signature.</p>
    */
    @SerializedName("NotifyKey")
    @Expose
    private String NotifyKey;

    /**
     * Get <p>Notification type. Valid values:</p><li>CMQ: Removed. We recommend that you switch to TDMQ-CMQ.</li><li>TDMQ-CMQ: TDMQ.</li><li>URL: If URL is specified, HTTP callbacks are pushed to the URL specified in NotifyUrl. The callback protocol is HTTP and JSON. The packet body is the same as the output parameter of the event parsing notification API.</li><li>SCF: This is not recommended. Additional configuration for SCF is required in the console.</li><li>AWS-SQS: AWS queue. This is only suitable for AWS tasks in the same region.</li><font color="red"> Note: The default value is TDMQ-CMQ if this is not specified or empty. To use another type, you need to specify the corresponding value. If TDMQ-CMQ is used, oversized task response may cause failure to write to the queue. </font> 
     * @return NotifyType <p>Notification type. Valid values:</p><li>CMQ: Removed. We recommend that you switch to TDMQ-CMQ.</li><li>TDMQ-CMQ: TDMQ.</li><li>URL: If URL is specified, HTTP callbacks are pushed to the URL specified in NotifyUrl. The callback protocol is HTTP and JSON. The packet body is the same as the output parameter of the event parsing notification API.</li><li>SCF: This is not recommended. Additional configuration for SCF is required in the console.</li><li>AWS-SQS: AWS queue. This is only suitable for AWS tasks in the same region.</li><font color="red"> Note: The default value is TDMQ-CMQ if this is not specified or empty. To use another type, you need to specify the corresponding value. If TDMQ-CMQ is used, oversized task response may cause failure to write to the queue. </font>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set <p>Notification type. Valid values:</p><li>CMQ: Removed. We recommend that you switch to TDMQ-CMQ.</li><li>TDMQ-CMQ: TDMQ.</li><li>URL: If URL is specified, HTTP callbacks are pushed to the URL specified in NotifyUrl. The callback protocol is HTTP and JSON. The packet body is the same as the output parameter of the event parsing notification API.</li><li>SCF: This is not recommended. Additional configuration for SCF is required in the console.</li><li>AWS-SQS: AWS queue. This is only suitable for AWS tasks in the same region.</li><font color="red"> Note: The default value is TDMQ-CMQ if this is not specified or empty. To use another type, you need to specify the corresponding value. If TDMQ-CMQ is used, oversized task response may cause failure to write to the queue. </font>
     * @param NotifyType <p>Notification type. Valid values:</p><li>CMQ: Removed. We recommend that you switch to TDMQ-CMQ.</li><li>TDMQ-CMQ: TDMQ.</li><li>URL: If URL is specified, HTTP callbacks are pushed to the URL specified in NotifyUrl. The callback protocol is HTTP and JSON. The packet body is the same as the output parameter of the event parsing notification API.</li><li>SCF: This is not recommended. Additional configuration for SCF is required in the console.</li><li>AWS-SQS: AWS queue. This is only suitable for AWS tasks in the same region.</li><font color="red"> Note: The default value is TDMQ-CMQ if this is not specified or empty. To use another type, you need to specify the corresponding value. If TDMQ-CMQ is used, oversized task response may cause failure to write to the queue. </font>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get <p>Workflow notification mode. Valid values are Finish and Change. If this is not specified, the default value is Finish.</p> 
     * @return NotifyMode <p>Workflow notification mode. Valid values are Finish and Change. If this is not specified, the default value is Finish.</p>
     */
    public String getNotifyMode() {
        return this.NotifyMode;
    }

    /**
     * Set <p>Workflow notification mode. Valid values are Finish and Change. If this is not specified, the default value is Finish.</p>
     * @param NotifyMode <p>Workflow notification mode. Valid values are Finish and Change. If this is not specified, the default value is Finish.</p>
     */
    public void setNotifyMode(String NotifyMode) {
        this.NotifyMode = NotifyMode;
    }

    /**
     * Get <p>HTTP callback URL. This is required if NotifyType is URL.</p> 
     * @return NotifyUrl <p>HTTP callback URL. This is required if NotifyType is URL.</p>
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set <p>HTTP callback URL. This is required if NotifyType is URL.</p>
     * @param NotifyUrl <p>HTTP callback URL. This is required if NotifyType is URL.</p>
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get <p>CMQ or TDMQ for CMQ model. Valid values are Queue and Topic.</p> 
     * @return CmqModel <p>CMQ or TDMQ for CMQ model. Valid values are Queue and Topic.</p>
     */
    public String getCmqModel() {
        return this.CmqModel;
    }

    /**
     * Set <p>CMQ or TDMQ for CMQ model. Valid values are Queue and Topic.</p>
     * @param CmqModel <p>CMQ or TDMQ for CMQ model. Valid values are Queue and Topic.</p>
     */
    public void setCmqModel(String CmqModel) {
        this.CmqModel = CmqModel;
    }

    /**
     * Get <p>CMQ or TDMQ for CMQ region, such as sh or bj.</p> 
     * @return CmqRegion <p>CMQ or TDMQ for CMQ region, such as sh or bj.</p>
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set <p>CMQ or TDMQ for CMQ region, such as sh or bj.</p>
     * @param CmqRegion <p>CMQ or TDMQ for CMQ region, such as sh or bj.</p>
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    /**
     * Get <p>This field takes effect if the model is Topic. It indicates the topic name of the CMQ or TDMQ for CMQ for receiving event notifications.</p> 
     * @return TopicName <p>This field takes effect if the model is Topic. It indicates the topic name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>This field takes effect if the model is Topic. It indicates the topic name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
     * @param TopicName <p>This field takes effect if the model is Topic. It indicates the topic name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>This field takes effect if the model is Queue. It indicates the queue name of the CMQ or TDMQ for CMQ for receiving event notifications.</p> 
     * @return QueueName <p>This field takes effect if the model is Queue. It indicates the queue name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>This field takes effect if the model is Queue. It indicates the queue name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
     * @param QueueName <p>This field takes effect if the model is Queue. It indicates the queue name of the CMQ or TDMQ for CMQ for receiving event notifications.</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>AWS SQS callback. This is required if NotifyType is AWS-SQS.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AwsSQS <p>AWS SQS callback. This is required if NotifyType is AWS-SQS.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AwsSQS getAwsSQS() {
        return this.AwsSQS;
    }

    /**
     * Set <p>AWS SQS callback. This is required if NotifyType is AWS-SQS.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AwsSQS <p>AWS SQS callback. This is required if NotifyType is AWS-SQS.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAwsSQS(AwsSQS AwsSQS) {
        this.AwsSQS = AwsSQS;
    }

    /**
     * Get <p>Key used to generate the callback signature.</p> 
     * @return NotifyKey <p>Key used to generate the callback signature.</p>
     */
    public String getNotifyKey() {
        return this.NotifyKey;
    }

    /**
     * Set <p>Key used to generate the callback signature.</p>
     * @param NotifyKey <p>Key used to generate the callback signature.</p>
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

