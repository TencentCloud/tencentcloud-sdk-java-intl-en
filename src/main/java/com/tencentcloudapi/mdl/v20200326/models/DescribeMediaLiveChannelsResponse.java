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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaLiveChannelsResponse extends AbstractModel{

    /**
    * Channel list information.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Infos")
    @Expose
    private ChannelInfo [] Infos;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Channel list information.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Infos Channel list information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ChannelInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * Set Channel list information.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Infos Channel list information.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInfos(ChannelInfo [] Infos) {
        this.Infos = Infos;
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
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

