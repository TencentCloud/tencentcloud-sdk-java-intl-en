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

public class PipelineOutputStatistics extends AbstractModel{

    /**
    * Timestamp.
In seconds, indicating data time.
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * Output bandwidth in bps.
    */
    @SerializedName("NetworkOut")
    @Expose
    private Long NetworkOut;

    /**
     * Get Timestamp.
In seconds, indicating data time. 
     * @return Timestamp Timestamp.
In seconds, indicating data time.
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set Timestamp.
In seconds, indicating data time.
     * @param Timestamp Timestamp.
In seconds, indicating data time.
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get Output bandwidth in bps. 
     * @return NetworkOut Output bandwidth in bps.
     */
    public Long getNetworkOut() {
        return this.NetworkOut;
    }

    /**
     * Set Output bandwidth in bps.
     * @param NetworkOut Output bandwidth in bps.
     */
    public void setNetworkOut(Long NetworkOut) {
        this.NetworkOut = NetworkOut;
    }

    public PipelineOutputStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipelineOutputStatistics(PipelineOutputStatistics source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.NetworkOut != null) {
            this.NetworkOut = new Long(source.NetworkOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "NetworkOut", this.NetworkOut);

    }
}

