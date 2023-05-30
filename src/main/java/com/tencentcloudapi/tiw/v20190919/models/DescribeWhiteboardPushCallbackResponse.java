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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWhiteboardPushCallbackResponse extends AbstractModel{

    /**
    * Callback URL of the whiteboard push event. If no callback URL is set, this parameter is null.
    */
    @SerializedName("Callback")
    @Expose
    private String Callback;

    /**
    * Callback authentication key for whiteboard push.
    */
    @SerializedName("CallbackKey")
    @Expose
    private String CallbackKey;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Callback URL of the whiteboard push event. If no callback URL is set, this parameter is null. 
     * @return Callback Callback URL of the whiteboard push event. If no callback URL is set, this parameter is null.
     */
    public String getCallback() {
        return this.Callback;
    }

    /**
     * Set Callback URL of the whiteboard push event. If no callback URL is set, this parameter is null.
     * @param Callback Callback URL of the whiteboard push event. If no callback URL is set, this parameter is null.
     */
    public void setCallback(String Callback) {
        this.Callback = Callback;
    }

    /**
     * Get Callback authentication key for whiteboard push. 
     * @return CallbackKey Callback authentication key for whiteboard push.
     */
    public String getCallbackKey() {
        return this.CallbackKey;
    }

    /**
     * Set Callback authentication key for whiteboard push.
     * @param CallbackKey Callback authentication key for whiteboard push.
     */
    public void setCallbackKey(String CallbackKey) {
        this.CallbackKey = CallbackKey;
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

    public DescribeWhiteboardPushCallbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWhiteboardPushCallbackResponse(DescribeWhiteboardPushCallbackResponse source) {
        if (source.Callback != null) {
            this.Callback = new String(source.Callback);
        }
        if (source.CallbackKey != null) {
            this.CallbackKey = new String(source.CallbackKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Callback", this.Callback);
        this.setParamSimple(map, prefix + "CallbackKey", this.CallbackKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

