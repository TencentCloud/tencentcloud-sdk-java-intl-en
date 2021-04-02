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

public class CancelMatchingRequest extends AbstractModel{

    /**
    * MatchCode
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * The MatchTicket ID of the matchmaking to cancel
    */
    @SerializedName("MatchTicketId")
    @Expose
    private String MatchTicketId;

    /**
     * Get MatchCode 
     * @return MatchCode MatchCode
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set MatchCode
     * @param MatchCode MatchCode
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get The MatchTicket ID of the matchmaking to cancel 
     * @return MatchTicketId The MatchTicket ID of the matchmaking to cancel
     */
    public String getMatchTicketId() {
        return this.MatchTicketId;
    }

    /**
     * Set The MatchTicket ID of the matchmaking to cancel
     * @param MatchTicketId The MatchTicket ID of the matchmaking to cancel
     */
    public void setMatchTicketId(String MatchTicketId) {
        this.MatchTicketId = MatchTicketId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "MatchTicketId", this.MatchTicketId);

    }
}

