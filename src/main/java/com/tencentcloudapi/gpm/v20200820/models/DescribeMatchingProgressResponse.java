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

public class DescribeMatchingProgressResponse extends AbstractModel{

    /**
    * MatchTicket list
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("MatchTickets")
    @Expose
    private MatchTicket [] MatchTickets;

    /**
    * Error code
Note: this field may return `null`, indicating that no valid value is obtained.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get MatchTicket list
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return MatchTickets MatchTicket list
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public MatchTicket [] getMatchTickets() {
        return this.MatchTickets;
    }

    /**
     * Set MatchTicket list
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param MatchTickets MatchTicket list
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setMatchTickets(MatchTicket [] MatchTickets) {
        this.MatchTickets = MatchTickets;
    }

    /**
     * Get Error code
Note: this field may return `null`, indicating that no valid value is obtained. 
     * @return ErrCode Error code
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code
Note: this field may return `null`, indicating that no valid value is obtained.
     * @param ErrCode Error code
Note: this field may return `null`, indicating that no valid value is obtained.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
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

    public DescribeMatchingProgressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMatchingProgressResponse(DescribeMatchingProgressResponse source) {
        if (source.MatchTickets != null) {
            this.MatchTickets = new MatchTicket[source.MatchTickets.length];
            for (int i = 0; i < source.MatchTickets.length; i++) {
                this.MatchTickets[i] = new MatchTicket(source.MatchTickets[i]);
            }
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchTickets.", this.MatchTickets);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

