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

public class DeleteStreamPackageChannelsResponse extends AbstractModel{

    /**
    * List of the information of successfully deleted channels
    */
    @SerializedName("SuccessInfos")
    @Expose
    private ChannelInfo [] SuccessInfos;

    /**
    * List of the information of the channels that failed to be deleted
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
     * Get List of the information of successfully deleted channels 
     * @return SuccessInfos List of the information of successfully deleted channels
     */
    public ChannelInfo [] getSuccessInfos() {
        return this.SuccessInfos;
    }

    /**
     * Set List of the information of successfully deleted channels
     * @param SuccessInfos List of the information of successfully deleted channels
     */
    public void setSuccessInfos(ChannelInfo [] SuccessInfos) {
        this.SuccessInfos = SuccessInfos;
    }

    /**
     * Get List of the information of the channels that failed to be deleted 
     * @return FailInfos List of the information of the channels that failed to be deleted
     */
    public ChannelInfo [] getFailInfos() {
        return this.FailInfos;
    }

    /**
     * Set List of the information of the channels that failed to be deleted
     * @param FailInfos List of the information of the channels that failed to be deleted
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

    public DeleteStreamPackageChannelsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteStreamPackageChannelsResponse(DeleteStreamPackageChannelsResponse source) {
        if (source.SuccessInfos != null) {
            this.SuccessInfos = new ChannelInfo[source.SuccessInfos.length];
            for (int i = 0; i < source.SuccessInfos.length; i++) {
                this.SuccessInfos[i] = new ChannelInfo(source.SuccessInfos[i]);
            }
        }
        if (source.FailInfos != null) {
            this.FailInfos = new ChannelInfo[source.FailInfos.length];
            for (int i = 0; i < source.FailInfos.length; i++) {
                this.FailInfos[i] = new ChannelInfo(source.FailInfos[i]);
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
        this.setParamArrayObj(map, prefix + "SuccessInfos.", this.SuccessInfos);
        this.setParamArrayObj(map, prefix + "FailInfos.", this.FailInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

