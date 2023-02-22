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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftRecord extends AbstractModel{

    /**
    * The session ID.
    */
    @SerializedName("Sid")
    @Expose
    private String Sid;

    /**
    * The recording start time, which is a Unix timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The recording end time, which is a Unix timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get The session ID. 
     * @return Sid The session ID.
     */
    public String getSid() {
        return this.Sid;
    }

    /**
     * Set The session ID.
     * @param Sid The session ID.
     */
    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    /**
     * Get The recording start time, which is a Unix timestamp. 
     * @return StartTime The recording start time, which is a Unix timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The recording start time, which is a Unix timestamp.
     * @param StartTime The recording start time, which is a Unix timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The recording end time, which is a Unix timestamp. 
     * @return EndTime The recording end time, which is a Unix timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The recording end time, which is a Unix timestamp.
     * @param EndTime The recording end time, which is a Unix timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public TimeShiftRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftRecord(TimeShiftRecord source) {
        if (source.Sid != null) {
            this.Sid = new String(source.Sid);
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
        this.setParamSimple(map, prefix + "Sid", this.Sid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

