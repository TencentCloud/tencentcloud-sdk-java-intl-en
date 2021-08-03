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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductSecretResponse extends AbstractModel{

    /**
    * Name of the created credential.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * Tag operation return code. 0: success; 1: internal error; 2: business processing error.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * Tag operation return message.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * ID of the created Tencent Cloud service credential async task.
    */
    @SerializedName("FlowID")
    @Expose
    private Long FlowID;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name of the created credential. 
     * @return SecretName Name of the created credential.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of the created credential.
     * @param SecretName Name of the created credential.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get Tag operation return code. 0: success; 1: internal error; 2: business processing error.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagCode Tag operation return code. 0: success; 1: internal error; 2: business processing error.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set Tag operation return code. 0: success; 1: internal error; 2: business processing error.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagCode Tag operation return code. 0: success; 1: internal error; 2: business processing error.
Note: this field may return null, indicating that no valid values can be obtained.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get Tag operation return message.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagMsg Tag operation return message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set Tag operation return message.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagMsg Tag operation return message.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
    }

    /**
     * Get ID of the created Tencent Cloud service credential async task. 
     * @return FlowID ID of the created Tencent Cloud service credential async task.
     */
    public Long getFlowID() {
        return this.FlowID;
    }

    /**
     * Set ID of the created Tencent Cloud service credential async task.
     * @param FlowID ID of the created Tencent Cloud service credential async task.
     */
    public void setFlowID(Long FlowID) {
        this.FlowID = FlowID;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateProductSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProductSecretResponse(CreateProductSecretResponse source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.TagCode != null) {
            this.TagCode = new Long(source.TagCode);
        }
        if (source.TagMsg != null) {
            this.TagMsg = new String(source.TagMsg);
        }
        if (source.FlowID != null) {
            this.FlowID = new Long(source.FlowID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "FlowID", this.FlowID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

