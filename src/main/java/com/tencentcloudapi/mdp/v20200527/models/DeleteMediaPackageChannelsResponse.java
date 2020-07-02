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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteMediaPackageChannelsResponse extends AbstractModel{

    /**
    * The information list of channels that have been deleted.
    */
    @SerializedName("SuccessInfos")
    @Expose
    private ChannelInfo [] SuccessInfos;

    /**
    * The information list of channels that failed to be deleted.
    */
    @SerializedName("FailInfos")
    @Expose
    private ChannelInfo [] FailInfos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The information list of channels that have been deleted. 
     * @return SuccessInfos The information list of channels that have been deleted.
     */
    public ChannelInfo [] getSuccessInfos() {
        return this.SuccessInfos;
    }

    /**
     * Set The information list of channels that have been deleted.
     * @param SuccessInfos The information list of channels that have been deleted.
     */
    public void setSuccessInfos(ChannelInfo [] SuccessInfos) {
        this.SuccessInfos = SuccessInfos;
    }

    /**
     * Get The information list of channels that failed to be deleted. 
     * @return FailInfos The information list of channels that failed to be deleted.
     */
    public ChannelInfo [] getFailInfos() {
        return this.FailInfos;
    }

    /**
     * Set The information list of channels that failed to be deleted.
     * @param FailInfos The information list of channels that failed to be deleted.
     */
    public void setFailInfos(ChannelInfo [] FailInfos) {
        this.FailInfos = FailInfos;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SuccessInfos.", this.SuccessInfos);
        this.setParamArrayObj(map, prefix + "FailInfos.", this.FailInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

