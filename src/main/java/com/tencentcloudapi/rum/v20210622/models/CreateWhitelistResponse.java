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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWhitelistResponse extends AbstractModel{

    /**
    * Message
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * Allowlist ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Message 
     * @return Msg Message
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Message
     * @param Msg Message
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get Allowlist ID 
     * @return ID Allowlist ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Allowlist ID
     * @param ID Allowlist ID
     */
    public void setID(Long ID) {
        this.ID = ID;
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

    public CreateWhitelistResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhitelistResponse(CreateWhitelistResponse source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

