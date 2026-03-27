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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateRsp extends AbstractModel {

    /**
    * Operation failure code at the instance dimension
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Failure reason for operating related resources
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Operation failure code at the instance dimension
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Code Operation failure code at the instance dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Operation failure code at the instance dimension
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Code Operation failure code at the instance dimension
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Failure reason for operating related resources
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Failure reason for operating related resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Failure reason for operating related resources
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Failure reason for operating related resources
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Instance ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Instance ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public OperateRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateRsp(OperateRsp source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

