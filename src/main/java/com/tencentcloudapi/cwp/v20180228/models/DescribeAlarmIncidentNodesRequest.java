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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmIncidentNodesRequest extends AbstractModel {

    /**
    * Machine UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Alarm VID
    */
    @SerializedName("AlarmVid")
    @Expose
    private String AlarmVid;

    /**
    * Alarm time
    */
    @SerializedName("AlarmTime")
    @Expose
    private Long AlarmTime;

    /**
    * Alarm source table ID
    */
    @SerializedName("TableId")
    @Expose
    private Long TableId;

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
     * Get Alarm VID 
     * @return AlarmVid Alarm VID
     */
    public String getAlarmVid() {
        return this.AlarmVid;
    }

    /**
     * Set Alarm VID
     * @param AlarmVid Alarm VID
     */
    public void setAlarmVid(String AlarmVid) {
        this.AlarmVid = AlarmVid;
    }

    /**
     * Get Alarm time 
     * @return AlarmTime Alarm time
     */
    public Long getAlarmTime() {
        return this.AlarmTime;
    }

    /**
     * Set Alarm time
     * @param AlarmTime Alarm time
     */
    public void setAlarmTime(Long AlarmTime) {
        this.AlarmTime = AlarmTime;
    }

    /**
     * Get Alarm source table ID 
     * @return TableId Alarm source table ID
     */
    public Long getTableId() {
        return this.TableId;
    }

    /**
     * Set Alarm source table ID
     * @param TableId Alarm source table ID
     */
    public void setTableId(Long TableId) {
        this.TableId = TableId;
    }

    public DescribeAlarmIncidentNodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmIncidentNodesRequest(DescribeAlarmIncidentNodesRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.AlarmVid != null) {
            this.AlarmVid = new String(source.AlarmVid);
        }
        if (source.AlarmTime != null) {
            this.AlarmTime = new Long(source.AlarmTime);
        }
        if (source.TableId != null) {
            this.TableId = new Long(source.TableId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "AlarmVid", this.AlarmVid);
        this.setParamSimple(map, prefix + "AlarmTime", this.AlarmTime);
        this.setParamSimple(map, prefix + "TableId", this.TableId);

    }
}

