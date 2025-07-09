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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteListenersResponse extends AbstractModel {

    /**
    * ID list of listeners failed to be deleted
    */
    @SerializedName("OperationFailedListenerSet")
    @Expose
    private String [] OperationFailedListenerSet;

    /**
    * ID list of listeners deleted successfully
    */
    @SerializedName("OperationSucceedListenerSet")
    @Expose
    private String [] OperationSucceedListenerSet;

    /**
    * ID list of invalid listeners. For example: the listener does not exist, or the instance corresponding to the listener does not match.
    */
    @SerializedName("InvalidStatusListenerSet")
    @Expose
    private String [] InvalidStatusListenerSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID list of listeners failed to be deleted 
     * @return OperationFailedListenerSet ID list of listeners failed to be deleted
     */
    public String [] getOperationFailedListenerSet() {
        return this.OperationFailedListenerSet;
    }

    /**
     * Set ID list of listeners failed to be deleted
     * @param OperationFailedListenerSet ID list of listeners failed to be deleted
     */
    public void setOperationFailedListenerSet(String [] OperationFailedListenerSet) {
        this.OperationFailedListenerSet = OperationFailedListenerSet;
    }

    /**
     * Get ID list of listeners deleted successfully 
     * @return OperationSucceedListenerSet ID list of listeners deleted successfully
     */
    public String [] getOperationSucceedListenerSet() {
        return this.OperationSucceedListenerSet;
    }

    /**
     * Set ID list of listeners deleted successfully
     * @param OperationSucceedListenerSet ID list of listeners deleted successfully
     */
    public void setOperationSucceedListenerSet(String [] OperationSucceedListenerSet) {
        this.OperationSucceedListenerSet = OperationSucceedListenerSet;
    }

    /**
     * Get ID list of invalid listeners. For example: the listener does not exist, or the instance corresponding to the listener does not match. 
     * @return InvalidStatusListenerSet ID list of invalid listeners. For example: the listener does not exist, or the instance corresponding to the listener does not match.
     */
    public String [] getInvalidStatusListenerSet() {
        return this.InvalidStatusListenerSet;
    }

    /**
     * Set ID list of invalid listeners. For example: the listener does not exist, or the instance corresponding to the listener does not match.
     * @param InvalidStatusListenerSet ID list of invalid listeners. For example: the listener does not exist, or the instance corresponding to the listener does not match.
     */
    public void setInvalidStatusListenerSet(String [] InvalidStatusListenerSet) {
        this.InvalidStatusListenerSet = InvalidStatusListenerSet;
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

    public DeleteListenersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteListenersResponse(DeleteListenersResponse source) {
        if (source.OperationFailedListenerSet != null) {
            this.OperationFailedListenerSet = new String[source.OperationFailedListenerSet.length];
            for (int i = 0; i < source.OperationFailedListenerSet.length; i++) {
                this.OperationFailedListenerSet[i] = new String(source.OperationFailedListenerSet[i]);
            }
        }
        if (source.OperationSucceedListenerSet != null) {
            this.OperationSucceedListenerSet = new String[source.OperationSucceedListenerSet.length];
            for (int i = 0; i < source.OperationSucceedListenerSet.length; i++) {
                this.OperationSucceedListenerSet[i] = new String(source.OperationSucceedListenerSet[i]);
            }
        }
        if (source.InvalidStatusListenerSet != null) {
            this.InvalidStatusListenerSet = new String[source.InvalidStatusListenerSet.length];
            for (int i = 0; i < source.InvalidStatusListenerSet.length; i++) {
                this.InvalidStatusListenerSet[i] = new String(source.InvalidStatusListenerSet[i]);
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
        this.setParamArraySimple(map, prefix + "OperationFailedListenerSet.", this.OperationFailedListenerSet);
        this.setParamArraySimple(map, prefix + "OperationSucceedListenerSet.", this.OperationSucceedListenerSet);
        this.setParamArraySimple(map, prefix + "InvalidStatusListenerSet.", this.InvalidStatusListenerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

