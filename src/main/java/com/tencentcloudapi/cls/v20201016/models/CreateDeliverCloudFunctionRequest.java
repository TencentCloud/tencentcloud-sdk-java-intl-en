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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeliverCloudFunctionRequest extends AbstractModel {

    /**
    * Topic id belonging to the delivery rule
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Cloud Function name for delivery
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function version
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Maximum waiting time for delivery. Unit: seconds
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Maximum number of messages to deliver
    */
    @SerializedName("MaxMsgNum")
    @Expose
    private Long MaxMsgNum;

    /**
     * Get Topic id belonging to the delivery rule 
     * @return TopicId Topic id belonging to the delivery rule
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic id belonging to the delivery rule
     * @param TopicId Topic id belonging to the delivery rule
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Cloud Function name for delivery 
     * @return FunctionName Cloud Function name for delivery
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Cloud Function name for delivery
     * @param FunctionName Cloud Function name for delivery
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function version 
     * @return Qualifier Function version
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version
     * @param Qualifier Function version
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Maximum waiting time for delivery. Unit: seconds 
     * @return Timeout Maximum waiting time for delivery. Unit: seconds
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Maximum waiting time for delivery. Unit: seconds
     * @param Timeout Maximum waiting time for delivery. Unit: seconds
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Maximum number of messages to deliver 
     * @return MaxMsgNum Maximum number of messages to deliver
     */
    public Long getMaxMsgNum() {
        return this.MaxMsgNum;
    }

    /**
     * Set Maximum number of messages to deliver
     * @param MaxMsgNum Maximum number of messages to deliver
     */
    public void setMaxMsgNum(Long MaxMsgNum) {
        this.MaxMsgNum = MaxMsgNum;
    }

    public CreateDeliverCloudFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeliverCloudFunctionRequest(CreateDeliverCloudFunctionRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.MaxMsgNum != null) {
            this.MaxMsgNum = new Long(source.MaxMsgNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "MaxMsgNum", this.MaxMsgNum);

    }
}

