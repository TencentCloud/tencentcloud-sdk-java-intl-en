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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetsResponse extends AbstractModel {

    /**
    * Information of real servers bound to the listener.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Listeners")
    @Expose
    private ListenerBackend [] Listeners;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of real servers bound to the listener.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Listeners Information of real servers bound to the listener.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ListenerBackend [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set Information of real servers bound to the listener.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Listeners Information of real servers bound to the listener.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setListeners(ListenerBackend [] Listeners) {
        this.Listeners = Listeners;
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

    public DescribeTargetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetsResponse(DescribeTargetsResponse source) {
        if (source.Listeners != null) {
            this.Listeners = new ListenerBackend[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ListenerBackend(source.Listeners[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

