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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReleaseResult extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Result value of instance deisolation. A returned value of 0 indicates success.
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Error message for instance deisolation.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Result value of instance deisolation. A returned value of 0 indicates success. 
     * @return Code Result value of instance deisolation. A returned value of 0 indicates success.
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Result value of instance deisolation. A returned value of 0 indicates success.
     * @param Code Result value of instance deisolation. A returned value of 0 indicates success.
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Error message for instance deisolation. 
     * @return Message Error message for instance deisolation.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message for instance deisolation.
     * @param Message Error message for instance deisolation.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ReleaseResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseResult(ReleaseResult source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
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
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

