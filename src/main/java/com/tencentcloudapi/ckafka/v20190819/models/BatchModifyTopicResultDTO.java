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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyTopicResultDTO extends AbstractModel {

    /**
    * Instance ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Status code.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * Message status.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Instance ID.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Topic name.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return TopicName Topic name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param TopicName Topic name.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Status code.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ReturnCode Status code.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Status code.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ReturnCode Status code.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get Message status. 
     * @return Message Message status.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Message status.
     * @param Message Message status.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public BatchModifyTopicResultDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyTopicResultDTO(BatchModifyTopicResultDTO source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

