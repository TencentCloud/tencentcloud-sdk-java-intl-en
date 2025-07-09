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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecDateStat extends AbstractModel {

    /**
    * Statistics Date
    */
    @SerializedName("StatDate")
    @Expose
    private String StatDate;

    /**
    * Number of Alerts
    */
    @SerializedName("AlarmCnt")
    @Expose
    private Long AlarmCnt;

    /**
    * Number of blocked processes
    */
    @SerializedName("PipelineCnt")
    @Expose
    private Long PipelineCnt;

    /**
     * Get Statistics Date 
     * @return StatDate Statistics Date
     */
    public String getStatDate() {
        return this.StatDate;
    }

    /**
     * Set Statistics Date
     * @param StatDate Statistics Date
     */
    public void setStatDate(String StatDate) {
        this.StatDate = StatDate;
    }

    /**
     * Get Number of Alerts 
     * @return AlarmCnt Number of Alerts
     */
    public Long getAlarmCnt() {
        return this.AlarmCnt;
    }

    /**
     * Set Number of Alerts
     * @param AlarmCnt Number of Alerts
     */
    public void setAlarmCnt(Long AlarmCnt) {
        this.AlarmCnt = AlarmCnt;
    }

    /**
     * Get Number of blocked processes 
     * @return PipelineCnt Number of blocked processes
     */
    public Long getPipelineCnt() {
        return this.PipelineCnt;
    }

    /**
     * Set Number of blocked processes
     * @param PipelineCnt Number of blocked processes
     */
    public void setPipelineCnt(Long PipelineCnt) {
        this.PipelineCnt = PipelineCnt;
    }

    public RuleExecDateStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecDateStat(RuleExecDateStat source) {
        if (source.StatDate != null) {
            this.StatDate = new String(source.StatDate);
        }
        if (source.AlarmCnt != null) {
            this.AlarmCnt = new Long(source.AlarmCnt);
        }
        if (source.PipelineCnt != null) {
            this.PipelineCnt = new Long(source.PipelineCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatDate", this.StatDate);
        this.setParamSimple(map, prefix + "AlarmCnt", this.AlarmCnt);
        this.setParamSimple(map, prefix + "PipelineCnt", this.PipelineCnt);

    }
}

