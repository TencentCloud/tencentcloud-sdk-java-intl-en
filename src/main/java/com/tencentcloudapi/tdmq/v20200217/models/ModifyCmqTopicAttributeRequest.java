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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCmqTopicAttributeRequest extends AbstractModel{

    /**
    * Topic name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Message retention period. Value range: 60–86400 seconds (i.e., 1 minute–1 day). Default value: 86400.
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * Whether to enable message trace. true: yes; false: no. If this field is left empty, the feature will not be enabled.
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get Topic name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter. 
     * @return TopicName Topic name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
     * @param TopicName Topic name, which must be unique under the same account in the same region. It can contain up to 64 letters, digits, and hyphens and must begin with a letter.
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536. 
     * @return MaxMsgSize Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
     * @param MaxMsgSize Maximum message length. Value range: 1024–65536 bytes (i.e., 1–64 KB). Default value: 65536.
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Message retention period. Value range: 60–86400 seconds (i.e., 1 minute–1 day). Default value: 86400. 
     * @return MsgRetentionSeconds Message retention period. Value range: 60–86400 seconds (i.e., 1 minute–1 day). Default value: 86400.
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set Message retention period. Value range: 60–86400 seconds (i.e., 1 minute–1 day). Default value: 86400.
     * @param MsgRetentionSeconds Message retention period. Value range: 60–86400 seconds (i.e., 1 minute–1 day). Default value: 86400.
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get Whether to enable message trace. true: yes; false: no. If this field is left empty, the feature will not be enabled. 
     * @return Trace Whether to enable message trace. true: yes; false: no. If this field is left empty, the feature will not be enabled.
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set Whether to enable message trace. true: yes; false: no. If this field is left empty, the feature will not be enabled.
     * @param Trace Whether to enable message trace. true: yes; false: no. If this field is left empty, the feature will not be enabled.
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    public ModifyCmqTopicAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCmqTopicAttributeRequest(ModifyCmqTopicAttributeRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "Trace", this.Trace);

    }
}

