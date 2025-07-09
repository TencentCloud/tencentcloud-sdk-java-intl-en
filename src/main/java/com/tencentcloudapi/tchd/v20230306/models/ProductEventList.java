/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProductEventList extends AbstractModel {

    /**
    * Detailed event information.
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("EventList")
    @Expose
    private EventDetail [] EventList;

    /**
     * Get Detailed event information.
Note: this field may return null, indicating that no valid value is obtained. 
     * @return EventList Detailed event information.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public EventDetail [] getEventList() {
        return this.EventList;
    }

    /**
     * Set Detailed event information.
Note: this field may return null, indicating that no valid value is obtained.
     * @param EventList Detailed event information.
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setEventList(EventDetail [] EventList) {
        this.EventList = EventList;
    }

    public ProductEventList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProductEventList(ProductEventList source) {
        if (source.EventList != null) {
            this.EventList = new EventDetail[source.EventList.length];
            for (int i = 0; i < source.EventList.length; i++) {
                this.EventList[i] = new EventDetail(source.EventList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EventList.", this.EventList);

    }
}

