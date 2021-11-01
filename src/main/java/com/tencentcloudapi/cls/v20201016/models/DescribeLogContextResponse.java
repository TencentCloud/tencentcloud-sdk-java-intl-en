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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogContextResponse extends AbstractModel{

    /**
    * Log context information set
    */
    @SerializedName("LogContextInfos")
    @Expose
    private LogContextInfo [] LogContextInfos;

    /**
    * Whether the previous logs have been returned
    */
    @SerializedName("PrevOver")
    @Expose
    private Boolean PrevOver;

    /**
    * Whether the next logs have been returned
    */
    @SerializedName("NextOver")
    @Expose
    private Boolean NextOver;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Log context information set 
     * @return LogContextInfos Log context information set
     */
    public LogContextInfo [] getLogContextInfos() {
        return this.LogContextInfos;
    }

    /**
     * Set Log context information set
     * @param LogContextInfos Log context information set
     */
    public void setLogContextInfos(LogContextInfo [] LogContextInfos) {
        this.LogContextInfos = LogContextInfos;
    }

    /**
     * Get Whether the previous logs have been returned 
     * @return PrevOver Whether the previous logs have been returned
     */
    public Boolean getPrevOver() {
        return this.PrevOver;
    }

    /**
     * Set Whether the previous logs have been returned
     * @param PrevOver Whether the previous logs have been returned
     */
    public void setPrevOver(Boolean PrevOver) {
        this.PrevOver = PrevOver;
    }

    /**
     * Get Whether the next logs have been returned 
     * @return NextOver Whether the next logs have been returned
     */
    public Boolean getNextOver() {
        return this.NextOver;
    }

    /**
     * Set Whether the next logs have been returned
     * @param NextOver Whether the next logs have been returned
     */
    public void setNextOver(Boolean NextOver) {
        this.NextOver = NextOver;
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

    public DescribeLogContextResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogContextResponse(DescribeLogContextResponse source) {
        if (source.LogContextInfos != null) {
            this.LogContextInfos = new LogContextInfo[source.LogContextInfos.length];
            for (int i = 0; i < source.LogContextInfos.length; i++) {
                this.LogContextInfos[i] = new LogContextInfo(source.LogContextInfos[i]);
            }
        }
        if (source.PrevOver != null) {
            this.PrevOver = new Boolean(source.PrevOver);
        }
        if (source.NextOver != null) {
            this.NextOver = new Boolean(source.NextOver);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LogContextInfos.", this.LogContextInfos);
        this.setParamSimple(map, prefix + "PrevOver", this.PrevOver);
        this.setParamSimple(map, prefix + "NextOver", this.NextOver);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

