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

public class DescribeMatchingProgressRequest extends AbstractModel{

    /**
    * List of MatchTicket IDs. It can contain up to 12 IDs.
    */
    @SerializedName("MatchTicketIds")
    @Expose
    private MTicket [] MatchTicketIds;

    /**
     * Get List of MatchTicket IDs. It can contain up to 12 IDs. 
     * @return MatchTicketIds List of MatchTicket IDs. It can contain up to 12 IDs.
     */
    public MTicket [] getMatchTicketIds() {
        return this.MatchTicketIds;
    }

    /**
     * Set List of MatchTicket IDs. It can contain up to 12 IDs.
     * @param MatchTicketIds List of MatchTicket IDs. It can contain up to 12 IDs.
     */
    public void setMatchTicketIds(MTicket [] MatchTicketIds) {
        this.MatchTicketIds = MatchTicketIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MatchTicketIds.", this.MatchTicketIds);

    }
}

