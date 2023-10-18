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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendRocketMQMessageResponse extends AbstractModel {

    /**
    * Message sending result
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * Message ID
Note: u200dThis field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgId")
    @Expose
    private String MsgId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Message sending result 
     * @return Result Message sending result
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set Message sending result
     * @param Result Message sending result
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get Message ID
Note: u200dThis field may return null, indicating that no valid values can be obtained. 
     * @return MsgId Message ID
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgId() {
        return this.MsgId;
    }

    /**
     * Set Message ID
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     * @param MsgId Message ID
Note: u200dThis field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgId(String MsgId) {
        this.MsgId = MsgId;
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

    public SendRocketMQMessageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendRocketMQMessageResponse(SendRocketMQMessageResponse source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.MsgId != null) {
            this.MsgId = new String(source.MsgId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "MsgId", this.MsgId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

