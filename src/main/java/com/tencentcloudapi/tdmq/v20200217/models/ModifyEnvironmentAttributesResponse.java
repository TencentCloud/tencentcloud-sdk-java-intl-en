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

public class ModifyEnvironmentAttributesResponse extends AbstractModel{

    /**
    * Namespace name.
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * TTL for unconsumed messages in seconds.
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Namespace ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Namespace name. 
     * @return EnvironmentId Namespace name.
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Namespace name.
     * @param EnvironmentId Namespace name.
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get TTL for unconsumed messages in seconds. 
     * @return MsgTTL TTL for unconsumed messages in seconds.
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set TTL for unconsumed messages in seconds.
     * @param MsgTTL TTL for unconsumed messages in seconds.
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks (up to 128 characters).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Namespace ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceId Namespace ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NamespaceId Namespace ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
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

    public ModifyEnvironmentAttributesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEnvironmentAttributesResponse(ModifyEnvironmentAttributesResponse source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

