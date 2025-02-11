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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryCustomerBillingQuotaRequest extends AbstractModel {

    /**
    * Event id, used to tag the request event, usually a random number.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Source of the request.
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
     * Get Event id, used to tag the request event, usually a random number. 
     * @return EventId Event id, used to tag the request event, usually a random number.
     * @deprecated
     */
    @Deprecated
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event id, used to tag the request event, usually a random number.
     * @param EventId Event id, used to tag the request event, usually a random number.
     * @deprecated
     */
    @Deprecated
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Source of the request. 
     * @return ComponentName Source of the request.
     * @deprecated
     */
    @Deprecated
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set Source of the request.
     * @param ComponentName Source of the request.
     * @deprecated
     */
    @Deprecated
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    public QueryCustomerBillingQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryCustomerBillingQuotaRequest(QueryCustomerBillingQuotaRequest source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.ComponentName != null) {
            this.ComponentName = new String(source.ComponentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);

    }
}

