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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmVertexIdRequest extends AbstractModel {

    /**
    * Machine UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Start timestamp
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Machine UUID 
     * @return Uuid Machine UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Machine UUID
     * @param Uuid Machine UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Start timestamp 
     * @return StartTime Start timestamp
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp
     * @param StartTime Start timestamp
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp 
     * @return EndTime End timestamp
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp
     * @param EndTime End timestamp
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeAlarmVertexIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmVertexIdRequest(DescribeAlarmVertexIdRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

