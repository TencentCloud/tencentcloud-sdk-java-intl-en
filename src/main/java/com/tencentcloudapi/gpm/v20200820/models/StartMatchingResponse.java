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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartMatchingResponse extends AbstractModel{

    /**
    * Error code
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * MatchTicket ID. Up to 128 characters are allowed.
    */
    @SerializedName("MatchTicketId")
    @Expose
    private String MatchTicketId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Error code 
     * @return ErrCode Error code
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
     * @param ErrCode Error code
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get MatchTicket ID. Up to 128 characters are allowed. 
     * @return MatchTicketId MatchTicket ID. Up to 128 characters are allowed.
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set MatchTicket ID. Up to 128 characters are allowed.
     * @param MatchTicketId MatchTicket ID. Up to 128 characters are allowed.
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
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
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

