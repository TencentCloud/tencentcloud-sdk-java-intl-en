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

public class TaskNotifyConfig extends AbstractModel{

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
    * Workflow notification method. Valid values: Finish, Change. If this parameter is left empty, `Finish` will be used.
    */
    @SerializedName("NotifyMode")
    @Expose
    private String NotifyMode;

    /**
    * The notification type. Valid values:
<li>`CMQ`: This value is no longer used. Please use `TDMQ-CMQ` instead.</li>
<li>`TDMQ-CMQ`: Message queue</li>
<li>`URL`: If `NotifyType` is set to `URL`, HTTP callbacks are sent to the URL specified by `NotifyUrl`. HTTP and JSON are used for the callbacks. The packet contains the response parameters of the `ParseNotification` API.</li>
<li>`SCF`: This notification type is not recommended. You need to configure it in the SCF console.</li>
<font color="red">Note: If you do not pass this parameter or pass in an empty string, `CMQ` will be used. To use a different notification type, specify this parameter accordingly.</font>
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
     * Get The notification type. Valid values:
<li>`CMQ`: This value is no longer used. Please use `TDMQ-CMQ` instead.</li>
<li>`TDMQ-CMQ`: Message queue</li>
<li>`URL`: If `NotifyType` is set to `URL`, HTTP callbacks are sent to the URL specified by `NotifyUrl`. HTTP and JSON are used for the callbacks. The packet contains the response parameters of the `ParseNotification` API.</li>
<li>`SCF`: This notification type is not recommended. You need to configure it in the SCF console.</li>
<font color="red">Note: If you do not pass this parameter or pass in an empty string, `CMQ` will be used. To use a different notification type, specify this parameter accordingly.</font> 
     * @return NotifyType The notification type. Valid values:
<li>`CMQ`: This value is no longer used. Please use `TDMQ-CMQ` instead.</li>
<li>`TDMQ-CMQ`: Message queue</li>
<li>`URL`: If `NotifyType` is set to `URL`, HTTP callbacks are sent to the URL specified by `NotifyUrl`. HTTP and JSON are used for the callbacks. The packet contains the response parameters of the `ParseNotification` API.</li>
<li>`SCF`: This notification type is not recommended. You need to configure it in the SCF console.</li>
<font color="red">Note: If you do not pass this parameter or pass in an empty string, `CMQ` will be used. To use a different notification type, specify this parameter accordingly.</font>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set The notification type. Valid values:
<li>`CMQ`: This value is no longer used. Please use `TDMQ-CMQ` instead.</li>
<li>`TDMQ-CMQ`: Message queue</li>
<li>`URL`: If `NotifyType` is set to `URL`, HTTP callbacks are sent to the URL specified by `NotifyUrl`. HTTP and JSON are used for the callbacks. The packet contains the response parameters of the `ParseNotification` API.</li>
<li>`SCF`: This notification type is not recommended. You need to configure it in the SCF console.</li>
<font color="red">Note: If you do not pass this parameter or pass in an empty string, `CMQ` will be used. To use a different notification type, specify this parameter accordingly.</font>
     * @param NotifyType The notification type. Valid values:
<li>`CMQ`: This value is no longer used. Please use `TDMQ-CMQ` instead.</li>
<li>`TDMQ-CMQ`: Message queue</li>
<li>`URL`: If `NotifyType` is set to `URL`, HTTP callbacks are sent to the URL specified by `NotifyUrl`. HTTP and JSON are used for the callbacks. The packet contains the response parameters of the `ParseNotification` API.</li>
<li>`SCF`: This notification type is not recommended. You need to configure it in the SCF console.</li>
<font color="red">Note: If you do not pass this parameter or pass in an empty string, `CMQ` will be used. To use a different notification type, specify this parameter accordingly.</font>
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

    public TaskNotifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskNotifyConfig(TaskNotifyConfig source) {
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
        if (source.NotifyMode != null) {
            this.NotifyMode = new String(source.NotifyMode);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmqModel", this.CmqModel);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "NotifyMode", this.NotifyMode);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);

    }
}

