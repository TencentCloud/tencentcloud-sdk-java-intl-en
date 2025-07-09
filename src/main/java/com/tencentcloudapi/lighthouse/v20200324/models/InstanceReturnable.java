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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceReturnable extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Whether the instance can be returned.
    */
    @SerializedName("IsReturnable")
    @Expose
    private Boolean IsReturnable;

    /**
    * Error code of instance return failure.
    */
    @SerializedName("ReturnFailCode")
    @Expose
    private Long ReturnFailCode;

    /**
    * Error message of instance return failure.
    */
    @SerializedName("ReturnFailMessage")
    @Expose
    private String ReturnFailMessage;

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
     * Get Whether the instance can be returned. 
     * @return IsReturnable Whether the instance can be returned.
     */
    public Boolean getIsReturnable() {
        return this.IsReturnable;
    }

    /**
     * Set Whether the instance can be returned.
     * @param IsReturnable Whether the instance can be returned.
     */
    public void setIsReturnable(Boolean IsReturnable) {
        this.IsReturnable = IsReturnable;
    }

    /**
     * Get Error code of instance return failure. 
     * @return ReturnFailCode Error code of instance return failure.
     */
    public Long getReturnFailCode() {
        return this.ReturnFailCode;
    }

    /**
     * Set Error code of instance return failure.
     * @param ReturnFailCode Error code of instance return failure.
     */
    public void setReturnFailCode(Long ReturnFailCode) {
        this.ReturnFailCode = ReturnFailCode;
    }

    /**
     * Get Error message of instance return failure. 
     * @return ReturnFailMessage Error message of instance return failure.
     */
    public String getReturnFailMessage() {
        return this.ReturnFailMessage;
    }

    /**
     * Set Error message of instance return failure.
     * @param ReturnFailMessage Error message of instance return failure.
     */
    public void setReturnFailMessage(String ReturnFailMessage) {
        this.ReturnFailMessage = ReturnFailMessage;
    }

    public InstanceReturnable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceReturnable(InstanceReturnable source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IsReturnable != null) {
            this.IsReturnable = new Boolean(source.IsReturnable);
        }
        if (source.ReturnFailCode != null) {
            this.ReturnFailCode = new Long(source.ReturnFailCode);
        }
        if (source.ReturnFailMessage != null) {
            this.ReturnFailMessage = new String(source.ReturnFailMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IsReturnable", this.IsReturnable);
        this.setParamSimple(map, prefix + "ReturnFailCode", this.ReturnFailCode);
        this.setParamSimple(map, prefix + "ReturnFailMessage", this.ReturnFailMessage);

    }
}

