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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDosAttackEventDetailResponse extends AbstractModel{

    /**
    * DDoS attack event details
    */
    @SerializedName("Data")
    @Expose
    private DDosAttackEventDetailData Data;

    /**
    * Status. 1: failed; 0: succeeded
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Returned message
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DDoS attack event details 
     * @return Data DDoS attack event details
     */
    public DDosAttackEventDetailData getData() {
        return this.Data;
    }

    /**
     * Set DDoS attack event details
     * @param Data DDoS attack event details
     */
    public void setData(DDosAttackEventDetailData Data) {
        this.Data = Data;
    }

    /**
     * Get Status. 1: failed; 0: succeeded 
     * @return Status Status. 1: failed; 0: succeeded
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 1: failed; 0: succeeded
     * @param Status Status. 1: failed; 0: succeeded
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Returned message 
     * @return Msg Returned message
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set Returned message
     * @param Msg Returned message
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public DescribeDDosAttackEventDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDDosAttackEventDetailResponse(DescribeDDosAttackEventDetailResponse source) {
        if (source.Data != null) {
            this.Data = new DDosAttackEventDetailData(source.Data);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

