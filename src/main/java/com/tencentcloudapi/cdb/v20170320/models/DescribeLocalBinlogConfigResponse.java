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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalBinlogConfigResponse extends AbstractModel{

    /**
    * Binlog retention policy of the instance.
    */
    @SerializedName("LocalBinlogConfig")
    @Expose
    private LocalBinlogConfig LocalBinlogConfig;

    /**
    * Default binlog retention policy in the region.
    */
    @SerializedName("LocalBinlogConfigDefault")
    @Expose
    private LocalBinlogConfigDefault LocalBinlogConfigDefault;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Binlog retention policy of the instance. 
     * @return LocalBinlogConfig Binlog retention policy of the instance.
     */
    public LocalBinlogConfig getLocalBinlogConfig() {
        return this.LocalBinlogConfig;
    }

    /**
     * Set Binlog retention policy of the instance.
     * @param LocalBinlogConfig Binlog retention policy of the instance.
     */
    public void setLocalBinlogConfig(LocalBinlogConfig LocalBinlogConfig) {
        this.LocalBinlogConfig = LocalBinlogConfig;
    }

    /**
     * Get Default binlog retention policy in the region. 
     * @return LocalBinlogConfigDefault Default binlog retention policy in the region.
     */
    public LocalBinlogConfigDefault getLocalBinlogConfigDefault() {
        return this.LocalBinlogConfigDefault;
    }

    /**
     * Set Default binlog retention policy in the region.
     * @param LocalBinlogConfigDefault Default binlog retention policy in the region.
     */
    public void setLocalBinlogConfigDefault(LocalBinlogConfigDefault LocalBinlogConfigDefault) {
        this.LocalBinlogConfigDefault = LocalBinlogConfigDefault;
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

    public DescribeLocalBinlogConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLocalBinlogConfigResponse(DescribeLocalBinlogConfigResponse source) {
        if (source.LocalBinlogConfig != null) {
            this.LocalBinlogConfig = new LocalBinlogConfig(source.LocalBinlogConfig);
        }
        if (source.LocalBinlogConfigDefault != null) {
            this.LocalBinlogConfigDefault = new LocalBinlogConfigDefault(source.LocalBinlogConfigDefault);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LocalBinlogConfig.", this.LocalBinlogConfig);
        this.setParamObj(map, prefix + "LocalBinlogConfigDefault.", this.LocalBinlogConfigDefault);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

